/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitiveSubstates;
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
 *         Reusing a transitive closure pattern with the count aggregator.
 *          
 *         pattern numberOfTransitiveSubstates(state : State, transitiveSubstateCount : java ^java.lang.Integer) {
 *         	transitiveSubstateCount == count find transitiveSubstates(state, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NumberOfTransitiveSubstates extends BaseGeneratedEMFQuerySpecification<NumberOfTransitiveSubstates.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfTransitiveSubstates pattern,
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
    
    private Integer fTransitiveSubstateCount;
    
    private static List<String> parameterNames = makeImmutableList("state", "transitiveSubstateCount");
    
    private Match(final State pState, final Integer pTransitiveSubstateCount) {
      this.fState = pState;
      this.fTransitiveSubstateCount = pTransitiveSubstateCount;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "state": return this.fState;
          case "transitiveSubstateCount": return this.fTransitiveSubstateCount;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fState;
          case 1: return this.fTransitiveSubstateCount;
          default: return null;
      }
    }
    
    public State getState() {
      return this.fState;
    }
    
    public Integer getTransitiveSubstateCount() {
      return this.fTransitiveSubstateCount;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("state".equals(parameterName) ) {
          this.fState = (State) newValue;
          return true;
      }
      if ("transitiveSubstateCount".equals(parameterName) ) {
          this.fTransitiveSubstateCount = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setState(final State pState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fState = pState;
    }
    
    public void setTransitiveSubstateCount(final Integer pTransitiveSubstateCount) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTransitiveSubstateCount = pTransitiveSubstateCount;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfTransitiveSubstates";
    }
    
    @Override
    public List<String> parameterNames() {
      return NumberOfTransitiveSubstates.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fState, fTransitiveSubstateCount};
    }
    
    @Override
    public NumberOfTransitiveSubstates.Match toImmutable() {
      return isMutable() ? newMatch(fState, fTransitiveSubstateCount) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"state\"=" + prettyPrintValue(fState) + ", ");
      result.append("\"transitiveSubstateCount\"=" + prettyPrintValue(fTransitiveSubstateCount));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fState, fTransitiveSubstateCount);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NumberOfTransitiveSubstates.Match)) {
          NumberOfTransitiveSubstates.Match other = (NumberOfTransitiveSubstates.Match) obj;
          return Objects.equals(fState, other.fState) && Objects.equals(fTransitiveSubstateCount, other.fTransitiveSubstateCount);
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
    public NumberOfTransitiveSubstates specification() {
      return NumberOfTransitiveSubstates.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NumberOfTransitiveSubstates.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NumberOfTransitiveSubstates.Match newMutableMatch(final State pState, final Integer pTransitiveSubstateCount) {
      return new Mutable(pState, pTransitiveSubstateCount);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NumberOfTransitiveSubstates.Match newMatch(final State pState, final Integer pTransitiveSubstateCount) {
      return new Immutable(pState, pTransitiveSubstateCount);
    }
    
    private static final class Mutable extends NumberOfTransitiveSubstates.Match {
      Mutable(final State pState, final Integer pTransitiveSubstateCount) {
        super(pState, pTransitiveSubstateCount);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NumberOfTransitiveSubstates.Match {
      Immutable(final State pState, final Integer pTransitiveSubstateCount) {
        super(pState, pTransitiveSubstateCount);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfTransitiveSubstates pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Reusing a transitive closure pattern with the count aggregator.
   *  
   * pattern numberOfTransitiveSubstates(state : State, transitiveSubstateCount : java ^java.lang.Integer) {
   * 	transitiveSubstateCount == count find transitiveSubstates(state, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NumberOfTransitiveSubstates
   * 
   */
  public static class Matcher extends BaseMatcher<NumberOfTransitiveSubstates.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NumberOfTransitiveSubstates.Matcher on(final ViatraQueryEngine engine) {
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
    public static NumberOfTransitiveSubstates.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_STATE = 0;
    
    private static final int POSITION_TRANSITIVESUBSTATECOUNT = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NumberOfTransitiveSubstates.Matcher.class);
    
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
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NumberOfTransitiveSubstates.Match> getAllMatches(final State pState, final Integer pTransitiveSubstateCount) {
      return rawStreamAllMatches(new Object[]{pState, pTransitiveSubstateCount}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NumberOfTransitiveSubstates.Match> streamAllMatches(final State pState, final Integer pTransitiveSubstateCount) {
      return rawStreamAllMatches(new Object[]{pState, pTransitiveSubstateCount});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NumberOfTransitiveSubstates.Match> getOneArbitraryMatch(final State pState, final Integer pTransitiveSubstateCount) {
      return rawGetOneArbitraryMatch(new Object[]{pState, pTransitiveSubstateCount});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pState, final Integer pTransitiveSubstateCount) {
      return rawHasMatch(new Object[]{pState, pTransitiveSubstateCount});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pState, final Integer pTransitiveSubstateCount) {
      return rawCountMatches(new Object[]{pState, pTransitiveSubstateCount});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pState, final Integer pTransitiveSubstateCount, final Consumer<? super NumberOfTransitiveSubstates.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pState, pTransitiveSubstateCount}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransitiveSubstateCount the fixed value of pattern parameter transitiveSubstateCount, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NumberOfTransitiveSubstates.Match newMatch(final State pState, final Integer pTransitiveSubstateCount) {
      return NumberOfTransitiveSubstates.Match.newMatch(pState, pTransitiveSubstateCount);
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
    public Stream<State> streamAllValuesOfstate(final NumberOfTransitiveSubstates.Match partialMatch) {
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
    public Stream<State> streamAllValuesOfstate(final Integer pTransitiveSubstateCount) {
      return rawStreamAllValuesOfstate(new Object[]{null, pTransitiveSubstateCount});
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final NumberOfTransitiveSubstates.Match partialMatch) {
      return rawStreamAllValuesOfstate(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final Integer pTransitiveSubstateCount) {
      return rawStreamAllValuesOfstate(new Object[]{null, pTransitiveSubstateCount}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOftransitiveSubstateCount(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRANSITIVESUBSTATECOUNT, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOftransitiveSubstateCount() {
      return rawStreamAllValuesOftransitiveSubstateCount(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOftransitiveSubstateCount() {
      return rawStreamAllValuesOftransitiveSubstateCount(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOftransitiveSubstateCount(final NumberOfTransitiveSubstates.Match partialMatch) {
      return rawStreamAllValuesOftransitiveSubstateCount(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOftransitiveSubstateCount(final State pState) {
      return rawStreamAllValuesOftransitiveSubstateCount(new Object[]{pState, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOftransitiveSubstateCount(final NumberOfTransitiveSubstates.Match partialMatch) {
      return rawStreamAllValuesOftransitiveSubstateCount(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transitiveSubstateCount.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOftransitiveSubstateCount(final State pState) {
      return rawStreamAllValuesOftransitiveSubstateCount(new Object[]{pState, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected NumberOfTransitiveSubstates.Match tupleToMatch(final Tuple t) {
      try {
          return NumberOfTransitiveSubstates.Match.newMatch((State) t.get(POSITION_STATE), (Integer) t.get(POSITION_TRANSITIVESUBSTATECOUNT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NumberOfTransitiveSubstates.Match arrayToMatch(final Object[] match) {
      try {
          return NumberOfTransitiveSubstates.Match.newMatch((State) match[POSITION_STATE], (Integer) match[POSITION_TRANSITIVESUBSTATECOUNT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NumberOfTransitiveSubstates.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NumberOfTransitiveSubstates.Match.newMutableMatch((State) match[POSITION_STATE], (Integer) match[POSITION_TRANSITIVESUBSTATECOUNT]);
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
    public static IQuerySpecification<NumberOfTransitiveSubstates.Matcher> querySpecification() {
      return NumberOfTransitiveSubstates.instance();
    }
  }
  
  private NumberOfTransitiveSubstates() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NumberOfTransitiveSubstates instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NumberOfTransitiveSubstates.Matcher instantiate(final ViatraQueryEngine engine) {
    return NumberOfTransitiveSubstates.Matcher.on(engine);
  }
  
  @Override
  public NumberOfTransitiveSubstates.Matcher instantiate() {
    return NumberOfTransitiveSubstates.Matcher.create();
  }
  
  @Override
  public NumberOfTransitiveSubstates.Match newEmptyMatch() {
    return NumberOfTransitiveSubstates.Match.newEmptyMatch();
  }
  
  @Override
  public NumberOfTransitiveSubstates.Match newMatch(final Object... parameters) {
    return NumberOfTransitiveSubstates.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NumberOfTransitiveSubstates} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NumberOfTransitiveSubstates#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NumberOfTransitiveSubstates INSTANCE = new NumberOfTransitiveSubstates();
    
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
    private static final NumberOfTransitiveSubstates.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_state = new PParameter("state", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_transitiveSubstateCount = new PParameter("transitiveSubstateCount", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_state, parameter_transitiveSubstateCount);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.numberOfTransitiveSubstates";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state","transitiveSubstateCount");
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
          PVariable var_transitiveSubstateCount = body.getOrCreateVariableByName("transitiveSubstateCount");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_transitiveSubstateCount), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_state, parameter_state),
             new ExportedParameter(body, var_transitiveSubstateCount, parameter_transitiveSubstateCount)
          ));
          // 	transitiveSubstateCount == count find transitiveSubstates(state, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_state, var___0_), TransitiveSubstates.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_transitiveSubstateCount, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
