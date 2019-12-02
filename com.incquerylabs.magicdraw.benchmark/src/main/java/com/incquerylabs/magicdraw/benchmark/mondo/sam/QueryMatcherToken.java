package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions;
import org.eclipse.viatra.query.runtime.base.api.filters.IBaseIndexFeatureFilter;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;

import com.nomagic.magicdraw.core.Application;

import eu.mondo.sam.core.DataToken;

public class QueryMatcherToken implements DataToken {

	private AdvancedViatraQueryEngine engine;	
	private Collection<ViatraQueryMatcher<? extends IPatternMatch>> matchers = new HashSet<>();
	
	public void initEngine(QueryEvaluationHint engineDefaultHint) {
		if (engine != null) {
			engine.dispose();
		}
		this.engine = createEngine(engineDefaultHint);		
	}
	
	public AdvancedViatraQueryEngine createEngine(QueryEvaluationHint engineDefaultHint)  {
		BaseIndexOptions baseIndexOptions = new BaseIndexOptions().withFeatureFilterConfiguration(new IBaseIndexFeatureFilter() {
					public boolean isFiltered(EStructuralFeature arg0) {
						if (arg0 instanceof EReference && ((EReference)arg0).isContainment()) {
							return arg0.getName().contains("_from_");
						}
						return false;
					}
				}).withStrictNotificationMode(false);
				
		if (engineDefaultHint != null) {
			ViatraQueryEngineOptions engineOptions = ViatraQueryEngineOptions.defineOptions().withDefaultHint(engineDefaultHint).build();
			
			return AdvancedViatraQueryEngine.createUnmanagedEngine(
					new EMFScope(Application.getInstance().getProject().getModel(), baseIndexOptions), engineOptions);			
		} else {
			return AdvancedViatraQueryEngine.createUnmanagedEngine(
					new EMFScope(Application.getInstance().getProject().getModel(), baseIndexOptions));
		} 
	}
	
	public AdvancedViatraQueryEngine getEngine() {
		return engine;
	}
	
	public void addMatcher(ViatraQueryMatcher<? extends IPatternMatch> matcher) {
		matchers.add(matcher);
	}
	
	public void removeMatcher(ViatraQueryMatcher<? extends IPatternMatch> matcher) {
		matchers.remove(matcher);
	}
	
	public Collection<ViatraQueryMatcher<? extends IPatternMatch>> getMatchers() {
		return matchers;
	}
	
	public void init() {
		// no op
	}
	
	public void destroy() {
		if (engine != null) {
			engine.dispose();
		}
	}	
	
}
