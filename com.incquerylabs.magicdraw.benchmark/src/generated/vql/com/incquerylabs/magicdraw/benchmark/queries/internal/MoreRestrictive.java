/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

import com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal;
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

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern moreRestrictive(property : Property){
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
 *         	Property.lowerValue(property, propLower);
 *         	MultiplicityElement.lowerValue(principal, princLower);
 *         	LiteralInteger.value(propLower, propLowerValue);
 *         	LiteralInteger.value(princLower, princLowerValue);
 *         	check(propLowerValue {@literal >} princLowerValue);
 *         } or {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
 *         	Property.upperValue(property, propUpper);
 *         	MultiplicityElement.upperValue(principal, princUpper);
 *         	LiteralUnlimitedNatural.value(propUpper, propUpperValue);
 *         	LiteralUnlimitedNatural.value(princUpper, princUpperValue);
 *         	check (propUpperValue {@literal >}= 0);
 *         	check(
 *         		propUpperValue {@literal <} princUpperValue ||
 *         		-1 == princUpperValue
 *         	);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class MoreRestrictive extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private MoreRestrictive() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MoreRestrictive instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link MoreRestrictive} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link MoreRestrictive#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MoreRestrictive INSTANCE = new MoreRestrictive();
    
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
    private static final MoreRestrictive.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_property = new PParameter("property", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_property);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.moreRestrictive";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("property");
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
          PVariable var_property = body.getOrCreateVariableByName("property");
          PVariable var_principal = body.getOrCreateVariableByName("principal");
          PVariable var_propLower = body.getOrCreateVariableByName("propLower");
          PVariable var_princLower = body.getOrCreateVariableByName("princLower");
          PVariable var_propLowerValue = body.getOrCreateVariableByName("propLowerValue");
          PVariable var_princLowerValue = body.getOrCreateVariableByName("princLowerValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_property, parameter_property)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var_principal), AdjunctProperty_principal.instance().getInternalQueryRepresentation());
          // 	Property.lowerValue(property, propLower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_propLower);
          // 	MultiplicityElement.lowerValue(principal, princLower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_1_, var_princLower);
          // 	LiteralInteger.value(propLower, propLowerValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_propLower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_propLower, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Integer")));
          new Equality(body, var__virtual_2_, var_propLowerValue);
          // 	LiteralInteger.value(princLower, princLowerValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_princLower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_princLower, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Integer")));
          new Equality(body, var__virtual_3_, var_princLowerValue);
          // 	check(propLowerValue > princLowerValue)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern moreRestrictive";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("princLowerValue", "propLowerValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer princLowerValue = (Integer) provider.getValue("princLowerValue");
                  Integer propLowerValue = (Integer) provider.getValue("propLowerValue");
                  return evaluateExpression_1_1(princLowerValue, propLowerValue);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_property = body.getOrCreateVariableByName("property");
          PVariable var_principal = body.getOrCreateVariableByName("principal");
          PVariable var_propUpper = body.getOrCreateVariableByName("propUpper");
          PVariable var_princUpper = body.getOrCreateVariableByName("princUpper");
          PVariable var_propUpperValue = body.getOrCreateVariableByName("propUpperValue");
          PVariable var_princUpperValue = body.getOrCreateVariableByName("princUpperValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_property, parameter_property)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var_principal), AdjunctProperty_principal.instance().getInternalQueryRepresentation());
          // 	Property.upperValue(property, propUpper)
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "upperValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_propUpper);
          // 	MultiplicityElement.upperValue(principal, princUpper)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "upperValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_1_, var_princUpper);
          // 	LiteralUnlimitedNatural.value(propUpper, propUpperValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_propUpper), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_propUpper, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_2_, var_propUpperValue);
          // 	LiteralUnlimitedNatural.value(princUpper, princUpperValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_princUpper), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_princUpper, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_3_, var_princUpperValue);
          // 	check (propUpperValue >= 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern moreRestrictive";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("propUpperValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer propUpperValue = (Integer) provider.getValue("propUpperValue");
                  return evaluateExpression_2_1(propUpperValue);
              }
          },  null); 
          // 	check(		propUpperValue < princUpperValue ||		-1 == princUpperValue	)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern moreRestrictive";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("princUpperValue", "propUpperValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer princUpperValue = (Integer) provider.getValue("princUpperValue");
                  Integer propUpperValue = (Integer) provider.getValue("propUpperValue");
                  return evaluateExpression_2_2(princUpperValue, propUpperValue);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer princLowerValue, final Integer propLowerValue) {
    boolean _greaterThan = (propLowerValue.compareTo(princLowerValue) > 0);
    return _greaterThan;
  }
  
  private static boolean evaluateExpression_2_1(final Integer propUpperValue) {
    return ((propUpperValue).intValue() >= 0);
  }
  
  private static boolean evaluateExpression_2_2(final Integer princUpperValue, final Integer propUpperValue) {
    return ((propUpperValue.compareTo(princUpperValue) < 0) || 
      ((-1) == (princUpperValue).intValue()));
  }
}
