package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import com.google.common.base.Objects;
import com.incquerylabs.magicdraw.benchmark.EngineImpl;
import com.incquerylabs.magicdraw.benchmark.mondo.sam.InitPhase;
import com.incquerylabs.magicdraw.benchmark.mondo.sam.MatcherInitPhase;
import com.incquerylabs.magicdraw.benchmark.mondo.sam.ResultSetRetrievalPhase;
import eu.mondo.sam.core.phases.SequencePhase;
import eu.mondo.sam.core.results.CaseDescriptor;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;
import java.util.Collection;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SingleQueryScenario extends BenchmarkScenario {
  private Collection<IQuerySpecification<?>> querySpecifications;
  
  private EngineImpl engineImpl;
  
  private String caseName;
  
  private boolean setIndex;
  
  private QueryEvaluationHint engineDefaultHints;
  
  public SingleQueryScenario(final String caseName, final Collection<IQuerySpecification<?>> querySpecifications, final EngineImpl engineImpl, final QueryEvaluationHint engineDefaultHints, final boolean setIndex, final int runIndex, final String toolName) {
    this.caseName = caseName;
    this.querySpecifications = querySpecifications;
    this.engineImpl = engineImpl;
    this.engineDefaultHints = engineDefaultHints;
    this.setIndex = setIndex;
    this.runIndex = runIndex;
    this.tool = toolName;
  }
  
  @Override
  public void build() {
    final SequencePhase rootPhase = new SequencePhase();
    final boolean indexNeedsSetting = (Objects.equal(this.engineImpl, EngineImpl.LOCAL_SEARCH) && this.setIndex);
    final SequencePhase measurePhase = new SequencePhase();
    InitPhase _initPhase = new InitPhase((this.caseName + "InitPhase"), this.engineDefaultHints);
    MatcherInitPhase _matcherInitPhase = new MatcherInitPhase("MatcherInitPhase", this.caseName, this.querySpecifications, indexNeedsSetting);
    ResultSetRetrievalPhase _resultSetRetrievalPhase = new ResultSetRetrievalPhase("ResultSetRetrievalPhase");
    measurePhase.addPhases(_initPhase, _matcherInitPhase, _resultSetRetrievalPhase);
    rootPhase.addPhases(measurePhase);
    this.rootPhase = rootPhase;
  }
  
  @Override
  public CaseDescriptor getCaseDescriptor() {
    CaseDescriptor _caseDescriptor = new CaseDescriptor();
    final Procedure1<CaseDescriptor> _function = (CaseDescriptor it) -> {
      it.setCaseName(this.caseName);
      it.setSize(this.size);
      it.setRunIndex(this.runIndex);
      it.setScenario(this.getName());
      it.setTool(this.getToolName());
    };
    final CaseDescriptor descriptor = ObjectExtensions.<CaseDescriptor>operator_doubleArrow(_caseDescriptor, _function);
    return descriptor;
  }
  
  public String getName() {
    return "SingleQueryScenario";
  }
  
  /**
   * Returns the measurement setting (Rete, local search, etc.) based on the fields of the object.
   */
  private String getToolName() {
    return this.tool;
  }
}
