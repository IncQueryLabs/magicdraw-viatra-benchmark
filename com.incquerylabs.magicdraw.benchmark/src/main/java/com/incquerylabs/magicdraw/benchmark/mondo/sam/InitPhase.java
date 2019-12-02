package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

public class InitPhase extends AtomicPhase {

	private QueryEvaluationHint engineDefaultHint;

	public InitPhase(String phaseName, QueryEvaluationHint engineDefaultHint) {
		super(phaseName);
		this.engineDefaultHint = engineDefaultHint;
	}

	@Override
	public void execute(DataToken token, PhaseResult result) {
		((QueryMatcherToken)token).initEngine(engineDefaultHint);		
	}

}
