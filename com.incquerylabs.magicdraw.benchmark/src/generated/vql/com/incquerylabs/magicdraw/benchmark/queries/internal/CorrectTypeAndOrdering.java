/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

import com.incquerylabs.magicdraw.benchmark.queries.internal.GreaterThanOrEqual;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import sysml.ChangeStructuralFeatureEvent_structuralFeature;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern
 *         correctTypeAndOrdering(event : ChangeEvent, result : OutputPin) {
 *         	OutputPin.type(result, type);
 *         	find sysml.ChangeStructuralFeatureEvent_structuralFeature(event, feature);
 *         	StructuralFeature.type(feature, type);
 *         	OutputPin.isOrdered(result, ordered);
 *         	StructuralFeature.isOrdered(feature, ordered);
 *         	OutputPin.lowerValue(result, rLower);
 *         	StructuralFeature.lowerValue(feature, sfLower);
 *         	LiteralInteger.value(rLower, rLowerValue);
 *         	LiteralInteger.value(sfLower, sfLowerValue);
 *         	check(rLowerValue {@literal <}= sfLowerValue);
 *         	OutputPin.upperValue(result, rUpper);
 *         	StructuralFeature.upperValue(feature, sfUpper);
 *         	find greaterThanOrEqual(rUpper, sfUpper);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class CorrectTypeAndOrdering extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private CorrectTypeAndOrdering() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CorrectTypeAndOrdering instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectTypeAndOrdering (visibility: PUBLIC, simpleName: CorrectTypeAndOrdering, identifier: com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectTypeAndOrdering, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectTypeAndOrdering (visibility: PUBLIC, simpleName: CorrectTypeAndOrdering, identifier: com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectTypeAndOrdering, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CorrectTypeAndOrdering INSTANCE = new CorrectTypeAndOrdering();
    
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
    private static final CorrectTypeAndOrdering.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_event = new PParameter("event", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.ChangeEvent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ChangeEvent")), PParameterDirection.INOUT);
    
    private final PParameter parameter_result = new PParameter("result", "com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.OutputPin", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_event, parameter_result);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.correctTypeAndOrdering";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("event","result");
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
          PVariable var_event = body.getOrCreateVariableByName("event");
          PVariable var_result = body.getOrCreateVariableByName("result");
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var_feature = body.getOrCreateVariableByName("feature");
          PVariable var_ordered = body.getOrCreateVariableByName("ordered");
          PVariable var_rLower = body.getOrCreateVariableByName("rLower");
          PVariable var_sfLower = body.getOrCreateVariableByName("sfLower");
          PVariable var_rLowerValue = body.getOrCreateVariableByName("rLowerValue");
          PVariable var_sfLowerValue = body.getOrCreateVariableByName("sfLowerValue");
          PVariable var_rUpper = body.getOrCreateVariableByName("rUpper");
          PVariable var_sfUpper = body.getOrCreateVariableByName("sfUpper");
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ChangeEvent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_result), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_event, parameter_event),
             new ExportedParameter(body, var_result, parameter_result)
          ));
          // 	OutputPin.type(result, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_result), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_result, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_0_, var_type);
          // 	find sysml.ChangeStructuralFeatureEvent_structuralFeature(event, feature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_event, var_feature), ChangeStructuralFeatureEvent_structuralFeature.instance().getInternalQueryRepresentation());
          // 	StructuralFeature.type(feature, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuralFeature")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_1_, var_type);
          // 	OutputPin.isOrdered(result, ordered)
          new TypeConstraint(body, Tuples.flatTupleOf(var_result), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_result, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "isOrdered")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Boolean")));
          new Equality(body, var__virtual_2_, var_ordered);
          // 	StructuralFeature.isOrdered(feature, ordered)
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuralFeature")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "isOrdered")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Boolean")));
          new Equality(body, var__virtual_3_, var_ordered);
          // 	OutputPin.lowerValue(result, rLower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_result), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_result, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_4_, var_rLower);
          // 	StructuralFeature.lowerValue(feature, sfLower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuralFeature")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_5_, var_sfLower);
          // 	LiteralInteger.value(rLower, rLowerValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rLower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rLower, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Integer")));
          new Equality(body, var__virtual_6_, var_rLowerValue);
          // 	LiteralInteger.value(sfLower, sfLowerValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_sfLower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sfLower, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Integer")));
          new Equality(body, var__virtual_7_, var_sfLowerValue);
          // 	check(rLowerValue <= sfLowerValue)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern correctTypeAndOrdering";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("rLowerValue", "sfLowerValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer rLowerValue = (Integer) provider.getValue("rLowerValue");
                  Integer sfLowerValue = (Integer) provider.getValue("sfLowerValue");
                  return evaluateExpression_1_1(rLowerValue, sfLowerValue);
              }
          },  null); 
          // 	OutputPin.upperValue(result, rUpper)
          new TypeConstraint(body, Tuples.flatTupleOf(var_result), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_result, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "upperValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_8_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_8_, var_rUpper);
          // 	StructuralFeature.upperValue(feature, sfUpper)
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuralFeature")));
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "upperValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_9_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_9_, var_sfUpper);
          // 	find greaterThanOrEqual(rUpper, sfUpper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_rUpper, var_sfUpper), GreaterThanOrEqual.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer rLowerValue, final Integer sfLowerValue) {
    boolean _lessEqualsThan = (rLowerValue.compareTo(sfLowerValue) <= 0);
    return _lessEqualsThan;
  }
}