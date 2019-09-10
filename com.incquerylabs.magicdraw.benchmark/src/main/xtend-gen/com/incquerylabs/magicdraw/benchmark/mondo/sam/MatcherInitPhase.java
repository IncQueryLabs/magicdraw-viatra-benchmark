package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import com.google.common.collect.ImmutableSet;
import com.incquerylabs.magicdraw.benchmark.mondo.sam.QueryMatcherToken;
import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.metrics.TimeMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
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
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class MatcherInitPhase extends AtomicPhase {
  private Collection<IQuerySpecification<?>> querySpecifications;
  
  private boolean setIndex;
  
  private String caseName;
  
  public MatcherInitPhase(final String phaseName, final String caseName, final Collection<IQuerySpecification<?>> querySpecification, final boolean setIndex) {
    super(phaseName);
    this.querySpecifications = querySpecification;
    this.setIndex = setIndex;
    this.caseName = caseName;
  }
  
  @Override
  public void execute(final DataToken token, final PhaseResult phaseResult) {
    final QueryMatcherToken dataToken = ((QueryMatcherToken) token);
    final TimeMetric timer = new TimeMetric("Time");
    final MemoryMetric prememory = new MemoryMetric("PreMemory");
    final MemoryMetric memory = new MemoryMetric("Memory");
    prememory.measure();
    ViatraQueryLoggingUtil.getDefaultLogger().info((("Measuring " + this.caseName) + "..."));
    InputOutput.<String>println((("Measuring " + this.caseName) + "..."));
    timer.startMeasure();
    if (this.setIndex) {
      final TimeMetric indexingTimer = new TimeMetric("IndexingTime");
      indexingTimer.startMeasure();
      for (final IQuerySpecification<?> spec : this.querySpecifications) {
        this.setIndex(spec, dataToken.getEngine());
      }
      indexingTimer.stopMeasure();
      phaseResult.addMetrics(indexingTimer);
    }
    for (final IQuerySpecification<?> spec_1 : this.querySpecifications) {
      dataToken.addMatcher(spec_1.getMatcher(dataToken.getEngine()));
    }
    timer.stopMeasure();
    memory.measure();
    final ScalarMetric memoryDelta = new ScalarMetric("MemoryDelta");
    long _parseLong = Long.parseLong(memory.getValue());
    long _parseLong_1 = Long.parseLong(prememory.getValue());
    long _minus = (_parseLong - _parseLong_1);
    memoryDelta.setValue(Math.max(_minus, 1));
    phaseResult.addMetrics(timer, prememory, memory, memoryDelta);
  }
  
  /**
   * Registers TypeConstraint to the "UnderlyingEMFIndex" which can accelerate the local search traversal time.
   */
  private void setIndex(final IQuerySpecification<?> specification, final AdvancedViatraQueryEngine engine) {
    try {
      final NavigationHelper index = EMFScope.extractUnderlyingEMFIndex(engine);
      index.<Void>coalesceTraversals(new Callable<Void>() {
        @Override
        public Void call() throws Exception {
          final Set<EClass> classes = new HashSet<EClass>();
          final Set<EDataType> dataTypes = new HashSet<EDataType>();
          final Set<EStructuralFeature> features = new HashSet<EStructuralFeature>();
          final ImmutableSet<PQuery> queries = ImmutableSet.<PQuery>builder().addAll(specification.getInternalQueryRepresentation().getAllReferredQueries()).add(specification.getInternalQueryRepresentation()).build();
          for (final PQuery query : queries) {
            Set<PBody> _bodies = query.getDisjunctBodies().getBodies();
            for (final PBody body : _bodies) {
              Set<PConstraint> _constraints = body.getConstraints();
              for (final PConstraint constraint : _constraints) {
                if ((constraint instanceof TypeConstraint)) {
                  final IInputKey supplierKey = ((TypeConstraint) constraint).getSupplierKey();
                  if ((supplierKey instanceof EClassTransitiveInstancesKey)) {
                    final EClass eClass = ((EClassTransitiveInstancesKey) supplierKey).getEmfKey();
                    classes.add(eClass);
                  } else {
                    if ((supplierKey instanceof EClassUnscopedTransitiveInstancesKey)) {
                      final EClass eClass_1 = ((EClassUnscopedTransitiveInstancesKey) supplierKey).getEmfKey();
                      classes.add(eClass_1);
                    } else {
                      if ((supplierKey instanceof EDataTypeInSlotsKey)) {
                        final EDataType eDataType = ((EDataTypeInSlotsKey) supplierKey).getEmfKey();
                        dataTypes.add(eDataType);
                      } else {
                        if ((supplierKey instanceof EStructuralFeatureInstancesKey)) {
                          final EStructuralFeature eStructuralFeature = ((EStructuralFeatureInstancesKey) supplierKey).getEmfKey();
                          features.add(eStructuralFeature);
                        }
                      }
                    }
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
