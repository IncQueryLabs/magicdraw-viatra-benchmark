/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
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
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern optionalLowerNotZero(parameter : Parameter) {
 *         	find sysml.Optional(parameter, _);
 *         	Parameter.lowerValue(parameter, lower);
 *         	LiteralInteger.value(lower, lowerValue);
 *         	check(lowerValue != 0);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class OptionalLowerNotZero extends BaseGeneratedEMFQuerySpecification<OptionalLowerNotZero.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.optionalLowerNotZero pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Parameter fParameter;
    
    private static List<String> parameterNames = makeImmutableList("parameter");
    
    private Match(final Parameter pParameter) {
      this.fParameter = pParameter;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("parameter".equals(parameterName)) return this.fParameter;
      return null;
    }
    
    public Parameter getParameter() {
      return this.fParameter;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("parameter".equals(parameterName) ) {
          this.fParameter = (Parameter) newValue;
          return true;
      }
      return false;
    }
    
    public void setParameter(final Parameter pParameter) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParameter = pParameter;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.optionalLowerNotZero";
    }
    
    @Override
    public List<String> parameterNames() {
      return OptionalLowerNotZero.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fParameter};
    }
    
    @Override
    public OptionalLowerNotZero.Match toImmutable() {
      return isMutable() ? newMatch(fParameter) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"parameter\"=" + prettyPrintValue(fParameter));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fParameter);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof OptionalLowerNotZero.Match)) {
          OptionalLowerNotZero.Match other = (OptionalLowerNotZero.Match) obj;
          return Objects.equals(fParameter, other.fParameter);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public OptionalLowerNotZero specification() {
      return OptionalLowerNotZero.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static OptionalLowerNotZero.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static OptionalLowerNotZero.Match newMutableMatch(final Parameter pParameter) {
      return new Mutable(pParameter);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static OptionalLowerNotZero.Match newMatch(final Parameter pParameter) {
      return new Immutable(pParameter);
    }
    
    private static final class Mutable extends OptionalLowerNotZero.Match {
      Mutable(final Parameter pParameter) {
        super(pParameter);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends OptionalLowerNotZero.Match {
      Immutable(final Parameter pParameter) {
        super(pParameter);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.optionalLowerNotZero pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern optionalLowerNotZero(parameter : Parameter) {
   * 	find sysml.Optional(parameter, _);
   * 	Parameter.lowerValue(parameter, lower);
   * 	LiteralInteger.value(lower, lowerValue);
   * 	check(lowerValue != 0);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see OptionalLowerNotZero
   * 
   */
  public static class Matcher extends BaseMatcher<OptionalLowerNotZero.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static OptionalLowerNotZero.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static OptionalLowerNotZero.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PARAMETER = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OptionalLowerNotZero.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<OptionalLowerNotZero.Match> getAllMatches(final Parameter pParameter) {
      return rawStreamAllMatches(new Object[]{pParameter}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<OptionalLowerNotZero.Match> streamAllMatches(final Parameter pParameter) {
      return rawStreamAllMatches(new Object[]{pParameter});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<OptionalLowerNotZero.Match> getOneArbitraryMatch(final Parameter pParameter) {
      return rawGetOneArbitraryMatch(new Object[]{pParameter});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Parameter pParameter) {
      return rawHasMatch(new Object[]{pParameter});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Parameter pParameter) {
      return rawCountMatches(new Object[]{pParameter});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Parameter pParameter, final Consumer<? super OptionalLowerNotZero.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pParameter}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParameter the fixed value of pattern parameter parameter, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public OptionalLowerNotZero.Match newMatch(final Parameter pParameter) {
      return OptionalLowerNotZero.Match.newMatch(pParameter);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Parameter> rawStreamAllValuesOfparameter(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARAMETER, parameters).map(Parameter.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Parameter> getAllValuesOfparameter() {
      return rawStreamAllValuesOfparameter(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parameter.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Parameter> streamAllValuesOfparameter() {
      return rawStreamAllValuesOfparameter(emptyArray());
    }
    
    @Override
    protected OptionalLowerNotZero.Match tupleToMatch(final Tuple t) {
      try {
          return OptionalLowerNotZero.Match.newMatch((Parameter) t.get(POSITION_PARAMETER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected OptionalLowerNotZero.Match arrayToMatch(final Object[] match) {
      try {
          return OptionalLowerNotZero.Match.newMatch((Parameter) match[POSITION_PARAMETER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected OptionalLowerNotZero.Match arrayToMatchMutable(final Object[] match) {
      try {
          return OptionalLowerNotZero.Match.newMutableMatch((Parameter) match[POSITION_PARAMETER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<OptionalLowerNotZero.Matcher> querySpecification() {
      return OptionalLowerNotZero.instance();
    }
  }
  
  private OptionalLowerNotZero() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static OptionalLowerNotZero instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected OptionalLowerNotZero.Matcher instantiate(final ViatraQueryEngine engine) {
    return OptionalLowerNotZero.Matcher.on(engine);
  }
  
  @Override
  public OptionalLowerNotZero.Matcher instantiate() {
    return OptionalLowerNotZero.Matcher.create();
  }
  
  @Override
  public OptionalLowerNotZero.Match newEmptyMatch() {
    return OptionalLowerNotZero.Match.newEmptyMatch();
  }
  
  @Override
  public OptionalLowerNotZero.Match newMatch(final Object... parameters) {
    return OptionalLowerNotZero.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.OptionalLowerNotZero (visibility: PUBLIC, simpleName: OptionalLowerNotZero, identifier: com.incquerylabs.magicdraw.benchmark.queries.OptionalLowerNotZero, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.OptionalLowerNotZero (visibility: PUBLIC, simpleName: OptionalLowerNotZero, identifier: com.incquerylabs.magicdraw.benchmark.queries.OptionalLowerNotZero, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final OptionalLowerNotZero INSTANCE = new OptionalLowerNotZero();
    
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
    private static final OptionalLowerNotZero.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_parameter = new PParameter("parameter", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_parameter);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.optionalLowerNotZero";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parameter");
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
          PVariable var_parameter = body.getOrCreateVariableByName("parameter");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_lower = body.getOrCreateVariableByName("lower");
          PVariable var_lowerValue = body.getOrCreateVariableByName("lowerValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parameter, parameter_parameter)
          ));
          // 	find sysml.Optional(parameter, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_parameter, var___0_), sysml.Optional.instance().getInternalQueryRepresentation());
          // 	Parameter.lowerValue(parameter, lower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parameter), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parameter, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_lower);
          // 	LiteralInteger.value(lower, lowerValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_lower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_lower, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Integer")));
          new Equality(body, var__virtual_1_, var_lowerValue);
          // 	check(lowerValue != 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern optionalLowerNotZero";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("lowerValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer lowerValue = (Integer) provider.getValue("lowerValue");
                  return evaluateExpression_1_1(lowerValue);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer lowerValue) {
    return ((lowerValue).intValue() != 0);
  }
}
