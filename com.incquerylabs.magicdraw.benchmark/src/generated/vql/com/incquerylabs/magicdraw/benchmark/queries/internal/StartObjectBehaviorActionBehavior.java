/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

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
 *         private pattern
 *         StartObjectBehaviorActionBehavior(action : StartObjectBehaviorAction, behavior : Behavior) {
 *         	StartObjectBehaviorAction.object(action, object);
 *         	InputPin.type(object, behavior);
 *         } or {
 *         	StartObjectBehaviorAction.object(action, object);
 *         	InputPin.type(object, type);
 *         	BehavioredClassifier(type);
 *         	BehavioredClassifier.classifierBehavior(type, behavior);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class StartObjectBehaviorActionBehavior extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private StartObjectBehaviorActionBehavior() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static StartObjectBehaviorActionBehavior instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link StartObjectBehaviorActionBehavior} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link StartObjectBehaviorActionBehavior#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final StartObjectBehaviorActionBehavior INSTANCE = new StartObjectBehaviorActionBehavior();
    
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
    private static final StartObjectBehaviorActionBehavior.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_action = new PParameter("action", "com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.StartObjectBehaviorAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction")), PParameterDirection.INOUT);
    
    private final PParameter parameter_behavior = new PParameter("behavior", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdbasicbehaviors.Behavior", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Behavior")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_action, parameter_behavior);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.StartObjectBehaviorActionBehavior";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("action","behavior");
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
          PVariable var_behavior = body.getOrCreateVariableByName("behavior");
          PVariable var_object = body.getOrCreateVariableByName("object");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_behavior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Behavior")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_action, parameter_action),
             new ExportedParameter(body, var_behavior, parameter_behavior)
          ));
          // 	StartObjectBehaviorAction.object(action, object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction", "object")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InputPin")));
          new Equality(body, var__virtual_0_, var_object);
          // 	InputPin.type(object, behavior)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InputPin")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_object, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_1_, var_behavior);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_action = body.getOrCreateVariableByName("action");
          PVariable var_behavior = body.getOrCreateVariableByName("behavior");
          PVariable var_object = body.getOrCreateVariableByName("object");
          PVariable var_type = body.getOrCreateVariableByName("type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_behavior), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Behavior")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_action, parameter_action),
             new ExportedParameter(body, var_behavior, parameter_behavior)
          ));
          // 	StartObjectBehaviorAction.object(action, object)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StartObjectBehaviorAction", "object")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InputPin")));
          new Equality(body, var__virtual_0_, var_object);
          // 	InputPin.type(object, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InputPin")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_object, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_1_, var_type);
          // 	BehavioredClassifier(type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "BehavioredClassifier")));
          // 	BehavioredClassifier.classifierBehavior(type, behavior)
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "BehavioredClassifier")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_type, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "BehavioredClassifier", "classifierBehavior")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Behavior")));
          new Equality(body, var__virtual_2_, var_behavior);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
