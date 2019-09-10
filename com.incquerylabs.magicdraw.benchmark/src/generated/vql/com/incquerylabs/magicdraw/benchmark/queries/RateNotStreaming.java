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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.Rate;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern rateNotStreaming(rate : Parameter) {
 *         	find sysml.Rate(rate, _);
 *         	Parameter.isStream(rate, false);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RateNotStreaming extends BaseGeneratedEMFQuerySpecification<RateNotStreaming.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.rateNotStreaming pattern,
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
    private Parameter fRate;
    
    private static List<String> parameterNames = makeImmutableList("rate");
    
    private Match(final Parameter pRate) {
      this.fRate = pRate;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "rate": return this.fRate;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fRate;
          default: return null;
      }
    }
    
    public Parameter getRate() {
      return this.fRate;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("rate".equals(parameterName) ) {
          this.fRate = (Parameter) newValue;
          return true;
      }
      return false;
    }
    
    public void setRate(final Parameter pRate) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRate = pRate;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.rateNotStreaming";
    }
    
    @Override
    public List<String> parameterNames() {
      return RateNotStreaming.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fRate};
    }
    
    @Override
    public RateNotStreaming.Match toImmutable() {
      return isMutable() ? newMatch(fRate) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"rate\"=" + prettyPrintValue(fRate));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fRate);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RateNotStreaming.Match)) {
          RateNotStreaming.Match other = (RateNotStreaming.Match) obj;
          return Objects.equals(fRate, other.fRate);
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
    public RateNotStreaming specification() {
      return RateNotStreaming.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RateNotStreaming.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RateNotStreaming.Match newMutableMatch(final Parameter pRate) {
      return new Mutable(pRate);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RateNotStreaming.Match newMatch(final Parameter pRate) {
      return new Immutable(pRate);
    }
    
    private static final class Mutable extends RateNotStreaming.Match {
      Mutable(final Parameter pRate) {
        super(pRate);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RateNotStreaming.Match {
      Immutable(final Parameter pRate) {
        super(pRate);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.rateNotStreaming pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern rateNotStreaming(rate : Parameter) {
   * 	find sysml.Rate(rate, _);
   * 	Parameter.isStream(rate, false);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RateNotStreaming
   * 
   */
  public static class Matcher extends BaseMatcher<RateNotStreaming.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RateNotStreaming.Matcher on(final ViatraQueryEngine engine) {
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
    public static RateNotStreaming.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_RATE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RateNotStreaming.Matcher.class);
    
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
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RateNotStreaming.Match> getAllMatches(final Parameter pRate) {
      return rawStreamAllMatches(new Object[]{pRate}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RateNotStreaming.Match> streamAllMatches(final Parameter pRate) {
      return rawStreamAllMatches(new Object[]{pRate});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RateNotStreaming.Match> getOneArbitraryMatch(final Parameter pRate) {
      return rawGetOneArbitraryMatch(new Object[]{pRate});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Parameter pRate) {
      return rawHasMatch(new Object[]{pRate});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Parameter pRate) {
      return rawCountMatches(new Object[]{pRate});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Parameter pRate, final Consumer<? super RateNotStreaming.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRate}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRate the fixed value of pattern parameter rate, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RateNotStreaming.Match newMatch(final Parameter pRate) {
      return RateNotStreaming.Match.newMatch(pRate);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rate.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Parameter> rawStreamAllValuesOfrate(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RATE, parameters).map(Parameter.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rate.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Parameter> getAllValuesOfrate() {
      return rawStreamAllValuesOfrate(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rate.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Parameter> streamAllValuesOfrate() {
      return rawStreamAllValuesOfrate(emptyArray());
    }
    
    @Override
    protected RateNotStreaming.Match tupleToMatch(final Tuple t) {
      try {
          return RateNotStreaming.Match.newMatch((Parameter) t.get(POSITION_RATE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RateNotStreaming.Match arrayToMatch(final Object[] match) {
      try {
          return RateNotStreaming.Match.newMatch((Parameter) match[POSITION_RATE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RateNotStreaming.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RateNotStreaming.Match.newMutableMatch((Parameter) match[POSITION_RATE]);
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
    public static IQuerySpecification<RateNotStreaming.Matcher> querySpecification() {
      return RateNotStreaming.instance();
    }
  }
  
  private RateNotStreaming() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RateNotStreaming instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RateNotStreaming.Matcher instantiate(final ViatraQueryEngine engine) {
    return RateNotStreaming.Matcher.on(engine);
  }
  
  @Override
  public RateNotStreaming.Matcher instantiate() {
    return RateNotStreaming.Matcher.create();
  }
  
  @Override
  public RateNotStreaming.Match newEmptyMatch() {
    return RateNotStreaming.Match.newEmptyMatch();
  }
  
  @Override
  public RateNotStreaming.Match newMatch(final Object... parameters) {
    return RateNotStreaming.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RateNotStreaming} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RateNotStreaming#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RateNotStreaming INSTANCE = new RateNotStreaming();
    
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
    private static final RateNotStreaming.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_rate = new PParameter("rate", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_rate);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.rateNotStreaming";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("rate");
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
          PVariable var_rate = body.getOrCreateVariableByName("rate");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rate), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_rate, parameter_rate)
          ));
          // 	find sysml.Rate(rate, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_rate, var___0_), Rate.instance().getInternalQueryRepresentation());
          // 	Parameter.isStream(rate, false)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, false);
          new TypeConstraint(body, Tuples.flatTupleOf(var_rate), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rate, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter", "isStream")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Boolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return false;
  }
}
