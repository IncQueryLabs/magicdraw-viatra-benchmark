package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

import org.eclipse.collections.api.set.MutableSet;
import org.eclipse.collections.impl.factory.Sets;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.base.api.IndexingLevel;
import org.eclipse.viatra.query.runtime.base.api.NavigationHelper;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EClassUnscopedTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.metrics.TimeMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

public class MatcherInitPhase extends AtomicPhase {
	
		private Iterable<IQuerySpecification<?>> querySpecifications;
		private boolean setIndex;	
		private String caseName;
		
		public MatcherInitPhase(String phaseName, String caseName, Iterable<IQuerySpecification<?>> querySpecification, boolean setIndex) {
			super(phaseName);
			this.querySpecifications = querySpecification;
			this.setIndex = setIndex;	
			this.caseName = caseName;	
		}
		
		public void execute(DataToken token, PhaseResult phaseResult) {
			QueryMatcherToken dataToken = (QueryMatcherToken)token;
			// Time and memory are measured
			TimeMetric timer = new TimeMetric("Time");
			MemoryMetric prememory = new MemoryMetric("PreMemory");
			MemoryMetric memory = new MemoryMetric("Memory");
			prememory.measure();
			
			ViatraQueryLoggingUtil.getDefaultLogger().info("Measuring " + caseName + "...");
			System.out.println("Measuring " + caseName + "...");
			timer.startMeasure();
			
			// Setting the indexes if needed  (decreases traversal time in case of local search)
			if (setIndex) {
				TimeMetric indexingTimer = new TimeMetric("IndexingTime");
				indexingTimer.startMeasure();
				for(IQuerySpecification<?> spec : querySpecifications) {
					this.setIndex(spec, dataToken.getEngine());
				}
				indexingTimer.stopMeasure();
				phaseResult.addMetrics(indexingTimer);
			}
			for(IQuerySpecification<?> spec : querySpecifications) {
				dataToken.addMatcher(spec.getMatcher(dataToken.getEngine()));
			}
			
			timer.stopMeasure();
			memory.measure();
			
			ScalarMetric memoryDelta = new ScalarMetric("MemoryDelta");
			
	        memoryDelta.setValue(Math.max(Long.parseLong(memory.getValue())-Long.parseLong(prememory.getValue()), 1));
	        
			phaseResult.addMetrics(timer, prememory, memory, memoryDelta);
		}
		
		/**
		 * Registers TypeConstraint to the "UnderlyingEMFIndex" which can accelerate the local search traversal time.
		 * @throws InvocationTargetException 
		 */
		private void setIndex(IQuerySpecification<?> specification, AdvancedViatraQueryEngine engine) {
			NavigationHelper index = EMFScope.extractUnderlyingEMFIndex(engine);
			try {
				index.coalesceTraversals(new Callable<Void>() {
					public Void call() throws Exception {
						Set<EClass> classes = new HashSet<EClass>();
						Set<EDataType> dataTypes = new HashSet<EDataType>();
						Set<EStructuralFeature> features = new HashSet<EStructuralFeature>();
						
						MutableSet<PQuery> queries =  Sets.mutable.withAll(specification.getInternalQueryRepresentation().getAllReferredQueries());
						queries.add(specification.getInternalQueryRepresentation());
						for (PQuery query : queries) {
							for (PBody body : query.getDisjunctBodies().getBodies()) {
					            for (PConstraint constraint : body.getConstraints()) {
					                if (constraint instanceof TypeConstraint) {
					                    IInputKey supplierKey = ((TypeConstraint)constraint).getSupplierKey();
					                    if (supplierKey instanceof EClassTransitiveInstancesKey) {
					                    	EClass eClass = ((EClassTransitiveInstancesKey)supplierKey).getEmfKey();
					                    	classes.add(eClass);
					                    }
					                    else if (supplierKey instanceof EClassUnscopedTransitiveInstancesKey) {
					                    	EClass eClass = ((EClassUnscopedTransitiveInstancesKey)supplierKey).getEmfKey();
					                    	classes.add(eClass);
					                    }
					                    else if (supplierKey instanceof EDataTypeInSlotsKey) {
					                    	EDataType eDataType = ((EDataTypeInSlotsKey)supplierKey).getEmfKey();
					                    	dataTypes.add(eDataType);
					                    }
					                    else if (supplierKey instanceof EStructuralFeatureInstancesKey) {
					                    	EStructuralFeature eStructuralFeature = ((EStructuralFeatureInstancesKey)supplierKey).getEmfKey();
					                    	features.add(eStructuralFeature);
					                    }
					                }
					            }
					        }
						}
						index.registerEClasses(classes, IndexingLevel.FULL);
						index.registerEDataTypes(dataTypes, IndexingLevel.FULL);
						index.registerEStructuralFeatures(features, IndexingLevel.FULL);

						return null;
					}			
				});
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	
}
