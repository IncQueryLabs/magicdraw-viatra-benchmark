package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchBackend;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchGenericBackendFactory;
import org.eclipse.viatra.query.runtime.localsearch.profiler.LocalSearchProfilerAdapter;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackend;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.metrics.TimeMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

public class ResultSetRetrievalPhase extends AtomicPhase {
	
	public ResultSetRetrievalPhase(String phaseName) {
		super(phaseName);
	}
	
	public void execute(DataToken token, PhaseResult phaseResult) {
		Logger logger = Logger.getLogger("com.incquerylabs.magicdraw.benchmark");
		QueryMatcherToken myToken = (QueryMatcherToken)token;

		// Time and memory are measured
		TimeMetric timer = new TimeMetric("Time");
		
		IQueryBackend queryBackend = myToken.getEngine().getQueryBackend(LocalSearchGenericBackendFactory.INSTANCE);
				LocalSearchProfilerAdapter profiler = new LocalSearchProfilerAdapter();
		if(queryBackend instanceof LocalSearchBackend){
			((LocalSearchBackend)queryBackend).addAdapter(profiler);	
		}
		
		
		timer.startMeasure();
		
				
		Collection<IPatternMatch> matches = new ArrayList<>();
		for (ViatraQueryMatcher<?> matcher : myToken.getMatchers()) {
			matches.addAll(matcher.getAllMatches());
		}
		
		timer.stopMeasure();
		
		ScalarMetric matchSetSize = new ScalarMetric("MatchSetSize");
		matchSetSize.setValue(matches.size());
		
		phaseResult.addMetrics(timer, matchSetSize);
		
		if(queryBackend instanceof LocalSearchBackend){
			logger.info(profiler);
		} 		
	}	
	
}
