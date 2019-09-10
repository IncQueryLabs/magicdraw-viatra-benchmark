package com.incquerylabs.magicdraw.benchmark.mondo.sam;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import eu.mondo.sam.core.DataToken;
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

/**
 * Contains an AdvancedViatraQueryEngine and a ViatraQueryMatcher.
 */
@SuppressWarnings("all")
public class QueryMatcherToken implements DataToken {
  private AdvancedViatraQueryEngine engine;
  
  private Collection<ViatraQueryMatcher<? extends IPatternMatch>> matchers = new HashSet<ViatraQueryMatcher<? extends IPatternMatch>>();
  
  public AdvancedViatraQueryEngine initEngine(final QueryEvaluationHint engineDefaultHint) {
    AdvancedViatraQueryEngine _xblockexpression = null;
    {
      if ((this.engine != null)) {
        this.engine.dispose();
      }
      _xblockexpression = this.engine = this.createEngine(engineDefaultHint);
    }
    return _xblockexpression;
  }
  
  public AdvancedViatraQueryEngine createEngine(final QueryEvaluationHint engineDefaultHint) {
    BaseIndexOptions _baseIndexOptions = new BaseIndexOptions();
    final BaseIndexOptions baseIndexOptions = _baseIndexOptions.withFeatureFilterConfiguration(new IBaseIndexFeatureFilter() {
      @Override
      public boolean isFiltered(final EStructuralFeature arg0) {
        if (((arg0 instanceof EReference) && ((EReference) arg0).isContainment())) {
          return arg0.getName().contains("_from_");
        }
        return false;
      }
    }).withStrictNotificationMode(false);
    if ((engineDefaultHint != null)) {
      final ViatraQueryEngineOptions engineOptions = ViatraQueryEngineOptions.defineOptions().withDefaultHint(engineDefaultHint).build();
      Model _model = Application.getInstance().getProject().getModel();
      EMFScope _eMFScope = new EMFScope(_model, baseIndexOptions);
      return AdvancedViatraQueryEngine.createUnmanagedEngine(_eMFScope, engineOptions);
    } else {
      Model _model_1 = Application.getInstance().getProject().getModel();
      EMFScope _eMFScope_1 = new EMFScope(_model_1, baseIndexOptions);
      return AdvancedViatraQueryEngine.createUnmanagedEngine(_eMFScope_1);
    }
  }
  
  public AdvancedViatraQueryEngine getEngine() {
    return this.engine;
  }
  
  public boolean addMatcher(final ViatraQueryMatcher<? extends IPatternMatch> matcher) {
    return this.matchers.add(matcher);
  }
  
  public boolean removeMatcher(final ViatraQueryMatcher<? extends IPatternMatch> matcher) {
    return this.matchers.remove(matcher);
  }
  
  public Collection<ViatraQueryMatcher<? extends IPatternMatch>> getMatchers() {
    return this.matchers;
  }
  
  @Override
  public void init() {
  }
  
  @Override
  public void destroy() {
    if ((this.engine != null)) {
      this.engine.dispose();
    }
  }
}
