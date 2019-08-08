/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.internal;

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
 *         greaterThanOrEqual(op1 : LiteralUnlimitedNatural, op2 : LiteralUnlimitedNatural) {
 *         	LiteralUnlimitedNatural.value(op1, value1);
 *         	LiteralUnlimitedNatural.value(op2, value2);
 *         	check(value1 {@literal <} 0);
 *         } or {
 *         	LiteralUnlimitedNatural.value(op1, value1);
 *         	LiteralUnlimitedNatural.value(op2, value2);
 *         	check(value2 {@literal >}= 0);
 *         	check(value1 {@literal >}= value2);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class GreaterThanOrEqual extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private GreaterThanOrEqual() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static GreaterThanOrEqual instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.internal.GreaterThanOrEqual (visibility: PUBLIC, simpleName: GreaterThanOrEqual, identifier: com.incquerylabs.magicdraw.benchmark.queries.internal.GreaterThanOrEqual, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.internal.GreaterThanOrEqual (visibility: PUBLIC, simpleName: GreaterThanOrEqual, identifier: com.incquerylabs.magicdraw.benchmark.queries.internal.GreaterThanOrEqual, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final GreaterThanOrEqual INSTANCE = new GreaterThanOrEqual();
    
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
    private static final GreaterThanOrEqual.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_op1 = new PParameter("op1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")), PParameterDirection.INOUT);
    
    private final PParameter parameter_op2 = new PParameter("op2", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_op1, parameter_op2);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.greaterThanOrEqual";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("op1","op2");
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
          PVariable var_op1 = body.getOrCreateVariableByName("op1");
          PVariable var_op2 = body.getOrCreateVariableByName("op2");
          PVariable var_value1 = body.getOrCreateVariableByName("value1");
          PVariable var_value2 = body.getOrCreateVariableByName("value2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_op1, parameter_op1),
             new ExportedParameter(body, var_op2, parameter_op2)
          ));
          // 	LiteralUnlimitedNatural.value(op1, value1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_0_, var_value1);
          // 	LiteralUnlimitedNatural.value(op2, value2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_1_, var_value2);
          // 	check(value1 < 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern greaterThanOrEqual";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("value1");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer value1 = (Integer) provider.getValue("value1");
                  return evaluateExpression_1_1(value1);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_op1 = body.getOrCreateVariableByName("op1");
          PVariable var_op2 = body.getOrCreateVariableByName("op2");
          PVariable var_value1 = body.getOrCreateVariableByName("value1");
          PVariable var_value2 = body.getOrCreateVariableByName("value2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_op2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_op1, parameter_op1),
             new ExportedParameter(body, var_op2, parameter_op2)
          ));
          // 	LiteralUnlimitedNatural.value(op1, value1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_0_, var_value1);
          // 	LiteralUnlimitedNatural.value(op2, value2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_op2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_op2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_1_, var_value2);
          // 	check(value2 >= 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern greaterThanOrEqual";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("value2");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer value2 = (Integer) provider.getValue("value2");
                  return evaluateExpression_2_1(value2);
              }
          },  null); 
          // 	check(value1 >= value2)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern greaterThanOrEqual";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("value1", "value2");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer value1 = (Integer) provider.getValue("value1");
                  Integer value2 = (Integer) provider.getValue("value2");
                  return evaluateExpression_2_2(value1, value2);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer value1) {
    return ((value1).intValue() < 0);
  }
  
  private static boolean evaluateExpression_2_1(final Integer value2) {
    return ((value2).intValue() >= 0);
  }
  
  private static boolean evaluateExpression_2_2(final Integer value1, final Integer value2) {
    boolean _greaterEqualsThan = (value1.compareTo(value2) >= 0);
    return _greaterEqualsThan;
  }
}
