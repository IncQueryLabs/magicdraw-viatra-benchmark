package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import com.incquerylabs.magicdraw.benchmark.mondo.sam.QueryMatcherToken;
import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;

/**
 * Creates the Viatra query engine in the DataToken based on the arguments received in its ctor.
 */
@SuppressWarnings("all")
public class InitPhase extends AtomicPhase {
  private QueryEvaluationHint engineDefaultHint;
  
  public InitPhase(final String phaseName, final QueryEvaluationHint engineDefaultHint) {
    super(phaseName);
    this.engineDefaultHint = engineDefaultHint;
  }
  
  @Override
  public void execute(final DataToken token, final PhaseResult phaseResult) {
    final QueryMatcherToken dataToken = ((QueryMatcherToken) token);
    dataToken.initEngine(this.engineDefaultHint);
  }
}
