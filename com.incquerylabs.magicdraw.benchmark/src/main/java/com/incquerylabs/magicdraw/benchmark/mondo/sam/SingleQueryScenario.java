package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;

import com.incquerylabs.magicdraw.benchmark.EngineImpl;

import eu.mondo.sam.core.phases.SequencePhase;
import eu.mondo.sam.core.results.CaseDescriptor;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

public class SingleQueryScenario extends BenchmarkScenario {

	private Iterable<IQuerySpecification<?>> querySpecifications;
	private EngineImpl engineImpl;
	private String caseName;
	private boolean setIndex;
	private QueryEvaluationHint engineDefaultHints;

	public SingleQueryScenario(String caseName, Iterable<IQuerySpecification<?>> querySpecifications,
			EngineImpl engineImpl, QueryEvaluationHint engineDefaultHints, boolean setIndex, int runIndex,
			String toolName) {
		this.caseName = caseName;
		this.querySpecifications = querySpecifications;
		this.engineImpl = engineImpl;
		this.engineDefaultHints = engineDefaultHints;
		this.setIndex = setIndex;
		this.runIndex = runIndex;
		this.tool = toolName;
	}

	public void build() {
		// This phase will contain a series of phases each responsible for a matcher init/result set retrieval measurement
		SequencePhase rootPhase = new SequencePhase();
		// In case of local search, the traversal time can be reduced 
		// Local search has to be set, and the user must explicitly give a boolean flag (setIndex in ctor) set to true
		boolean indexNeedsSetting = (engineImpl.equals(EngineImpl.LOCAL_SEARCH) && this.setIndex);
		
		// A phase responsible for a matcher init/result set retrieval measurement
				SequencePhase measurePhase = new SequencePhase();
		measurePhase.addPhases(
			new InitPhase(caseName + "InitPhase", engineDefaultHints),
			new MatcherInitPhase("MatcherInitPhase", caseName, querySpecifications, indexNeedsSetting), 
			new ResultSetRetrievalPhase("ResultSetRetrievalPhase")
		);
		// Adding it to the root phase
		rootPhase.addPhases(measurePhase);		
		
		this.rootPhase = rootPhase;
	}

	public CaseDescriptor getCaseDescriptor() {
		CaseDescriptor descriptor = new CaseDescriptor();
		descriptor.setCaseName(this.caseName);
		descriptor.setSize(this.size);
		descriptor.setRunIndex(this.runIndex);
		descriptor.setScenario(this.getName());
		descriptor.setTool(this.getToolName());
		return descriptor;
	}

	public String getName() {
		return "SingleQueryScenario";
	}

	/**
	 * Returns the measurement setting (Rete, local search, etc.) based on the
	 * fields of the object.
	 */
	private String getToolName() {
		return tool;
	}
}
