package com.incquerylabs.magicdraw.benchmark.mondo.sam

import com.incquerylabs.magicdraw.benchmark.EngineImpl
import eu.mondo.sam.core.phases.SequencePhase
import eu.mondo.sam.core.results.CaseDescriptor
import eu.mondo.sam.core.scenarios.BenchmarkScenario
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint
import java.util.Collection

class SingleQueryScenario extends BenchmarkScenario {
	
	Collection<IQuerySpecification<?>> querySpecifications
	EngineImpl engineImpl
	String caseName
	boolean setIndex
	QueryEvaluationHint engineDefaultHints
	
	new(String caseName, Collection<IQuerySpecification<?>> querySpecifications, EngineImpl engineImpl, QueryEvaluationHint engineDefaultHints, boolean setIndex, int runIndex, String toolName) {
		this.caseName = caseName
		this.querySpecifications = querySpecifications
		this.engineImpl = engineImpl
		this.engineDefaultHints = engineDefaultHints
		this.setIndex = setIndex
		this.runIndex = runIndex
		this.tool = toolName;
	}
		
	override build() {
		// This phase will contain a series of phases each responsible for a matcher init/result set retrieval measurement
		val rootPhase = new SequencePhase
		// In case of local search, the traversal time can be reduced 
		// Local search has to be set, and the user must explicitly give a boolean flag (setIndex in ctor) set to true
		val indexNeedsSetting = (engineImpl == EngineImpl.LOCAL_SEARCH && this.setIndex)
		
		// A phase responsible for a matcher init/result set retrieval measurement
		val measurePhase = new SequencePhase
		measurePhase.addPhases(
			new InitPhase(caseName + "InitPhase", engineDefaultHints),
			new MatcherInitPhase("MatcherInitPhase", caseName, querySpecifications, indexNeedsSetting), 
			new ResultSetRetrievalPhase("ResultSetRetrievalPhase")
		)
		// Adding it to the root phase
		rootPhase.addPhases(measurePhase)		
		
		this.rootPhase = rootPhase
	}
	
	override getCaseDescriptor() {
		val descriptor = new CaseDescriptor => [
			it.caseName = this.caseName
			it.size = this.size
			it.runIndex = this.runIndex
			it.scenario = this.getName
			it.tool = this.toolName
		]
		return descriptor
	}
	
	def getName() {
		return "SingleQueryScenario"
	}
	
	/**
	 * Returns the measurement setting (Rete, local search, etc.) based on the fields of the object. 
	 */
	private def getToolName() {
		return tool;	
	}
	
}