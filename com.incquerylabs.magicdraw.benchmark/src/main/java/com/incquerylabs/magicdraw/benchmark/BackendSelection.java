package com.incquerylabs.magicdraw.benchmark;

import java.util.Objects;

import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints;
import org.eclipse.viatra.query.runtime.localsearch.planner.cost.IConstraintEvaluationContext;
import org.eclipse.viatra.query.runtime.localsearch.planner.cost.impl.IndexerBasedConstraintCostFunction;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IQueryReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.ParentState;
import com.incquerylabs.magicdraw.benchmark.queries.APerformanceQueries;
import com.incquerylabs.magicdraw.benchmark.queries.IncomingTransitions;
import com.incquerylabs.magicdraw.benchmark.queries.TransitiveSubstatesWithCheck3;

public enum BackendSelection {

	RETE,
	LOCALSEARCH,
	LOCAL_SEARCH_HINTS_CONDITION_FIRST,
	LOCAL_SEARCH_HINTS_TC_FIRST,
	HYBRID;
	
	public Iterable<IQuerySpecification<?>> findQueries(BenchmarkParameters parameters) throws ViatraQueryException {
		switch(this) {
		case RETE:
		case LOCALSEARCH:
		case LOCAL_SEARCH_HINTS_CONDITION_FIRST:
		case LOCAL_SEARCH_HINTS_TC_FIRST:
		case HYBRID:
			return findQueries(APerformanceQueries.instance(), parameters.getQueryName(), parameters);
		default:
			throw new InvalidBenchmarkParameterizationException("Unexpected backend configuration " + this);
		}
	}
	
	public EngineImpl getEngineImplementation() {
		if (this == RETE) {
			return EngineImpl.RETE;
		} else {
			return EngineImpl.LOCAL_SEARCH;
		}
	}
	
	public boolean isPreindexingRequired() {
		return getEngineImplementation() == EngineImpl.LOCAL_SEARCH;
	}
	
	
	public String getToolName() {
		switch(this) {
		case LOCALSEARCH:
			return "LocalSearch";
		case LOCAL_SEARCH_HINTS_CONDITION_FIRST:
			return "LocalSearch_ConditionFirstHint";
		case LOCAL_SEARCH_HINTS_TC_FIRST:
			return "LocalSearch_TCFirstHint";
		case RETE:
			return "Rete";
		case HYBRID:
			return "Hybrid";
		default:
			throw new InvalidBenchmarkParameterizationException("Unexpected backend configuration " + this);
		}
	}
	
	public QueryEvaluationHint getEngineDefaultHints() throws ViatraQueryException {
		switch (this) {
		case LOCALSEARCH:
		case HYBRID:
			return LocalSearchHints.getDefault().build();
		case LOCAL_SEARCH_HINTS_TC_FIRST:
			return createMinimalCostCallHint(IncomingTransitions.instance());
		case LOCAL_SEARCH_HINTS_CONDITION_FIRST:
			return createMinimalCostCallHint(ParentState.instance());
		default:
			return null;
		}
	}
	
	private QueryEvaluationHint createMinimalCostCallHint(IQuerySpecification<?> query) {
		return LocalSearchHints.getDefault().setCostFunction(new IndexerBasedConstraintCostFunction() {
			@Override
			public double calculateCost(PConstraint constraint, IConstraintEvaluationContext input) {
				try {
				if (constraint instanceof IQueryReference) {
					PQuery referredQuery = ((IQueryReference)constraint).getReferredQuery();
					if (Objects.equals(query.getInternalQueryRepresentation(), referredQuery)) {
						return 1.0d; 
					}
				}
				return super.calculateCost(constraint, input);
				} catch (Exception e) { e.printStackTrace(); return 0;}
			}
		}).build();
	}
	
	public boolean canHandleParameters(BenchmarkParameters parameters) throws ViatraQueryException {
		switch(this) {
		case LOCAL_SEARCH_HINTS_CONDITION_FIRST:
		case LOCAL_SEARCH_HINTS_TC_FIRST:
			return (parameters.getQueryName().equals(getName(TransitiveSubstatesWithCheck3.instance())));
		default:
			return true;
		}
	}
	
	private Iterable<IQuerySpecification<?>> findQueries(IQueryGroup querySpecifications, String queryName, BenchmarkParameters parameters) throws ViatraQueryException {
		return Lists.immutable.of(findQueryBySimpleName(querySpecifications, queryName));
	}
	
	private IQuerySpecification<?> findQueryBySimpleName(IQueryGroup querySpecifications, String queryName) throws ViatraQueryException {
		return querySpecifications.getSpecifications().stream().filter(spec -> Objects.deepEquals(getName(spec), queryName)).findAny()
				.orElseThrow(() -> new InvalidBenchmarkParameterizationException("Query " + queryName + " not found "));
	}
	
	/**
	 * Returns the simple (not fully qualified) name of a query.
	 */
	private String getName(IQuerySpecification<?> querySpecification) {
		return querySpecification.getFullyQualifiedName().substring(querySpecification.getFullyQualifiedName().lastIndexOf(".") + 1);
	}
}
