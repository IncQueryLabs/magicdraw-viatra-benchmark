/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

import com.incquerylabs.magicdraw.benchmark.queries.internal.RepresentsSupplier;
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
import sysml.Allocate;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern
 *         correctActPartNode(activityPartition : ActivityPartition, action : Action) {
 *         	find sysml.Allocate(allocs, _);
 *         	Abstraction.client(allocs, action);
 *         	find representsSupplier(allocs, activityPartition);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class CorrectActPartNode extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private CorrectActPartNode() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CorrectActPartNode instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CorrectActPartNode} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link CorrectActPartNode#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CorrectActPartNode INSTANCE = new CorrectActPartNode();
    
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
    private static final CorrectActPartNode.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_activityPartition = new PParameter("activityPartition", "com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.ActivityPartition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityPartition")), PParameterDirection.INOUT);
    
    private final PParameter parameter_action = new PParameter("action", "com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.Action", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Action")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_activityPartition, parameter_action);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.correctActPartNode";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("activityPartition","action");
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
          PVariable var_activityPartition = body.getOrCreateVariableByName("activityPartition");
          PVariable var_action = body.getOrCreateVariableByName("action");
          PVariable var_allocs = body.getOrCreateVariableByName("allocs");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityPartition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityPartition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Action")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_activityPartition, parameter_activityPartition),
             new ExportedParameter(body, var_action, parameter_action)
          ));
          // 	find sysml.Allocate(allocs, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_allocs, var___0_), Allocate.instance().getInternalQueryRepresentation());
          // 	Abstraction.client(allocs, action)
          new TypeConstraint(body, Tuples.flatTupleOf(var_allocs), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_allocs, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "client")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new Equality(body, var__virtual_0_, var_action);
          // 	find representsSupplier(allocs, activityPartition)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_allocs, var_activityPartition), RepresentsSupplier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
