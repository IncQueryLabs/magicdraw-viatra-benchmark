/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.Subregions;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         Reusing a simple pattern with the "count" aggregator.
 *          
 *         pattern numberOfSubregions(state : State, regionCount : java ^java.lang.Integer) {
 *           	regionCount == count find subregions(state, _subregion);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NumberOfSubregions extends BaseGeneratedEMFQuerySpecification<NumberOfSubregions.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfSubregions pattern,
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
    private State fState;
    
    private Integer fRegionCount;
    
    private static List<String> parameterNames = makeImmutableList("state", "regionCount");
    
    private Match(final State pState, final Integer pRegionCount) {
      this.fState = pState;
      this.fRegionCount = pRegionCount;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "state": return this.fState;
          case "regionCount": return this.fRegionCount;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fState;
          case 1: return this.fRegionCount;
          default: return null;
      }
    }
    
    public State getState() {
      return this.fState;
    }
    
    public Integer getRegionCount() {
      return this.fRegionCount;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("state".equals(parameterName) ) {
          this.fState = (State) newValue;
          return true;
      }
      if ("regionCount".equals(parameterName) ) {
          this.fRegionCount = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setState(final State pState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fState = pState;
    }
    
    public void setRegionCount(final Integer pRegionCount) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRegionCount = pRegionCount;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfSubregions";
    }
    
    @Override
    public List<String> parameterNames() {
      return NumberOfSubregions.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fState, fRegionCount};
    }
    
    @Override
    public NumberOfSubregions.Match toImmutable() {
      return isMutable() ? newMatch(fState, fRegionCount) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"state\"=" + prettyPrintValue(fState) + ", ");
      result.append("\"regionCount\"=" + prettyPrintValue(fRegionCount));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fState, fRegionCount);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NumberOfSubregions.Match)) {
          NumberOfSubregions.Match other = (NumberOfSubregions.Match) obj;
          return Objects.equals(fState, other.fState) && Objects.equals(fRegionCount, other.fRegionCount);
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
    public NumberOfSubregions specification() {
      return NumberOfSubregions.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NumberOfSubregions.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NumberOfSubregions.Match newMutableMatch(final State pState, final Integer pRegionCount) {
      return new Mutable(pState, pRegionCount);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NumberOfSubregions.Match newMatch(final State pState, final Integer pRegionCount) {
      return new Immutable(pState, pRegionCount);
    }
    
    private static final class Mutable extends NumberOfSubregions.Match {
      Mutable(final State pState, final Integer pRegionCount) {
        super(pState, pRegionCount);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NumberOfSubregions.Match {
      Immutable(final State pState, final Integer pRegionCount) {
        super(pState, pRegionCount);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfSubregions pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Reusing a simple pattern with the "count" aggregator.
   *  
   * pattern numberOfSubregions(state : State, regionCount : java ^java.lang.Integer) {
   *   	regionCount == count find subregions(state, _subregion);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NumberOfSubregions
   * 
   */
  public static class Matcher extends BaseMatcher<NumberOfSubregions.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NumberOfSubregions.Matcher on(final ViatraQueryEngine engine) {
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
    public static NumberOfSubregions.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_STATE = 0;
    
    private static final int POSITION_REGIONCOUNT = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NumberOfSubregions.Matcher.class);
    
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
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NumberOfSubregions.Match> getAllMatches(final State pState, final Integer pRegionCount) {
      return rawStreamAllMatches(new Object[]{pState, pRegionCount}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NumberOfSubregions.Match> streamAllMatches(final State pState, final Integer pRegionCount) {
      return rawStreamAllMatches(new Object[]{pState, pRegionCount});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NumberOfSubregions.Match> getOneArbitraryMatch(final State pState, final Integer pRegionCount) {
      return rawGetOneArbitraryMatch(new Object[]{pState, pRegionCount});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pState, final Integer pRegionCount) {
      return rawHasMatch(new Object[]{pState, pRegionCount});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pState, final Integer pRegionCount) {
      return rawCountMatches(new Object[]{pState, pRegionCount});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pState, final Integer pRegionCount, final Consumer<? super NumberOfSubregions.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pState, pRegionCount}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pRegionCount the fixed value of pattern parameter regionCount, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NumberOfSubregions.Match newMatch(final State pState, final Integer pRegionCount) {
      return NumberOfSubregions.Match.newMatch(pState, pRegionCount);
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<State> rawStreamAllValuesOfstate(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STATE, parameters).map(State.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate() {
      return rawStreamAllValuesOfstate(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfstate() {
      return rawStreamAllValuesOfstate(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfstate(final NumberOfSubregions.Match partialMatch) {
      return rawStreamAllValuesOfstate(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfstate(final Integer pRegionCount) {
      return rawStreamAllValuesOfstate(new Object[]{null, pRegionCount});
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final NumberOfSubregions.Match partialMatch) {
      return rawStreamAllValuesOfstate(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final Integer pRegionCount) {
      return rawStreamAllValuesOfstate(new Object[]{null, pRegionCount}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOfregionCount(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REGIONCOUNT, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfregionCount() {
      return rawStreamAllValuesOfregionCount(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfregionCount() {
      return rawStreamAllValuesOfregionCount(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfregionCount(final NumberOfSubregions.Match partialMatch) {
      return rawStreamAllValuesOfregionCount(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfregionCount(final State pState) {
      return rawStreamAllValuesOfregionCount(new Object[]{pState, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfregionCount(final NumberOfSubregions.Match partialMatch) {
      return rawStreamAllValuesOfregionCount(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for regionCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfregionCount(final State pState) {
      return rawStreamAllValuesOfregionCount(new Object[]{pState, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected NumberOfSubregions.Match tupleToMatch(final Tuple t) {
      try {
          return NumberOfSubregions.Match.newMatch((State) t.get(POSITION_STATE), (Integer) t.get(POSITION_REGIONCOUNT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NumberOfSubregions.Match arrayToMatch(final Object[] match) {
      try {
          return NumberOfSubregions.Match.newMatch((State) match[POSITION_STATE], (Integer) match[POSITION_REGIONCOUNT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NumberOfSubregions.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NumberOfSubregions.Match.newMutableMatch((State) match[POSITION_STATE], (Integer) match[POSITION_REGIONCOUNT]);
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
    public static IQuerySpecification<NumberOfSubregions.Matcher> querySpecification() {
      return NumberOfSubregions.instance();
    }
  }
  
  private NumberOfSubregions() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NumberOfSubregions instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NumberOfSubregions.Matcher instantiate(final ViatraQueryEngine engine) {
    return NumberOfSubregions.Matcher.on(engine);
  }
  
  @Override
  public NumberOfSubregions.Matcher instantiate() {
    return NumberOfSubregions.Matcher.create();
  }
  
  @Override
  public NumberOfSubregions.Match newEmptyMatch() {
    return NumberOfSubregions.Match.newEmptyMatch();
  }
  
  @Override
  public NumberOfSubregions.Match newMatch(final Object... parameters) {
    return NumberOfSubregions.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NumberOfSubregions} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NumberOfSubregions#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NumberOfSubregions INSTANCE = new NumberOfSubregions();
    
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
    private static final NumberOfSubregions.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_state = new PParameter("state", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_regionCount = new PParameter("regionCount", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_state, parameter_regionCount);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfSubregions";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state","regionCount");
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
          PVariable var_state = body.getOrCreateVariableByName("state");
          PVariable var_regionCount = body.getOrCreateVariableByName("regionCount");
          PVariable var__subregion = body.getOrCreateVariableByName("_subregion");
          new TypeConstraint(body, Tuples.flatTupleOf(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_regionCount), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_state, parameter_state),
             new ExportedParameter(body, var_regionCount, parameter_regionCount)
          ));
          //   	regionCount == count find subregions(state, _subregion)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_state, var__subregion), Subregions.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_regionCount, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
