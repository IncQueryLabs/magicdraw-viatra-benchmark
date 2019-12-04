/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

import com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction;
import com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern resultToCheck(action : AcceptEventAction, event : ChangeEvent, trigger: Trigger, result : OutputPin) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction(action, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent(event, _);
 *         	AcceptEventAction.trigger(action, trigger);
 *         	Trigger.event(trigger, event);
 *         	AcceptEventAction.result(action, result);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class ResultToCheck extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private ResultToCheck() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ResultToCheck instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ResultToCheck} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ResultToCheck#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ResultToCheck INSTANCE = new ResultToCheck();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final ResultToCheck.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_action = new PParameter("action", "com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")), PParameterDirection.INOUT);
    
    private final PParameter parameter_event = new PParameter("event", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.ChangeEvent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ChangeEvent")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trigger = new PParameter("trigger", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")), PParameterDirection.INOUT);
    
    private final PParameter parameter_result = new PParameter("result", "com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.OutputPin", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_action, parameter_event, parameter_trigger, parameter_result);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.resultToCheck";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("action","event","trigger","result");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_action = body.getOrCreateVariableByName("action");
          PVariable var_event = body.getOrCreateVariableByName("event");
          PVariable var_trigger = body.getOrCreateVariableByName("trigger");
          PVariable var_result = body.getOrCreateVariableByName("result");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ChangeEvent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_result), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_action, parameter_action),
             new ExportedParameter(body, var_event, parameter_event),
             new ExportedParameter(body, var_trigger, parameter_trigger),
             new ExportedParameter(body, var_result, parameter_result)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction(action, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_action, var___0_), AcceptChangeStructuralFeatureEventAction.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent(event, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_event, var___1_), ChangeStructuralFeatureEvent.instance().getInternalQueryRepresentation());
          // 	AcceptEventAction.trigger(action, trigger)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction", "trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          new Equality(body, var__virtual_0_, var_trigger);
          // 	Trigger.event(trigger, event)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger", "event")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          new Equality(body, var__virtual_1_, var_event);
          // 	AcceptEventAction.result(action, result)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction", "result")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          new Equality(body, var__virtual_2_, var_result);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
