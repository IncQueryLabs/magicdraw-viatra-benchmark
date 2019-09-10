package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import com.incquerylabs.magicdraw.benchmark.mondo.sam.QueryMatcherToken;
import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.metrics.TimeMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchBackend;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchGenericBackendFactory;
import org.eclipse.viatra.query.runtime.localsearch.profiler.LocalSearchProfilerAdapter;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackend;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ResultSetRetrievalPhase extends AtomicPhase {
  public ResultSetRetrievalPhase(final String phaseName) {
    super(phaseName);
  }
  
  @Override
  public void execute(final DataToken token, final PhaseResult phaseResult) {
    final Logger logger = Logger.getLogger("com.incquerylabs.magicdraw.benchmark");
    final QueryMatcherToken myToken = ((QueryMatcherToken) token);
    final TimeMetric timer = new TimeMetric("Time");
    final IQueryBackend queryBackend = myToken.getEngine().getQueryBackend(LocalSearchGenericBackendFactory.INSTANCE);
    final LocalSearchProfilerAdapter profiler = new LocalSearchProfilerAdapter();
    if ((queryBackend instanceof LocalSearchBackend)) {
      ((LocalSearchBackend)queryBackend).addAdapter(profiler);
    }
    timer.startMeasure();
    final Function1<ViatraQueryMatcher<? extends IPatternMatch>, Collection<? extends IPatternMatch>> _function = (ViatraQueryMatcher<? extends IPatternMatch> x) -> {
      return x.getAllMatches();
    };
    final Iterable<Collection<? extends IPatternMatch>> matches = IterableExtensions.<ViatraQueryMatcher<? extends IPatternMatch>, Collection<? extends IPatternMatch>>map(myToken.getMatchers(), _function);
    timer.stopMeasure();
    final ScalarMetric matchSetSize = new ScalarMetric("MatchSetSize");
    matchSetSize.setValue(0);
    for (final Collection<? extends IPatternMatch> matchSet : matches) {
      long _parseLong = Long.parseLong(matchSetSize.getValue());
      int _size = matchSet.size();
      long _plus = (_parseLong + _size);
      matchSetSize.setValue(_plus);
    }
    phaseResult.addMetrics(timer, matchSetSize);
    if ((queryBackend instanceof LocalSearchBackend)) {
      logger.info(profiler);
    }
  }
}
