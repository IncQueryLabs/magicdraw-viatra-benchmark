/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.NumberOfTransitiveSubstates;
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
import org.eclipse.viatra.query.runtime.matchers.aggregators.max;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         Reusing a transitive closure and count aggregator pattern with the max aggregator.
 *          
 *         pattern stateWithMostSubstates(state : State) {
 *             // the number of substates of this state
 *             find numberOfTransitiveSubstates(state, count);
 *             // is the maximum from all states
 *         	count == max find numberOfTransitiveSubstates(_, #substateCount);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class StateWithMostSubstates extends BaseGeneratedEMFQuerySpecification<StateWithMostSubstates.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.stateWithMostSubstates pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("state");
    
    private Match(final State pState) {
      this.fState = pState;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "state": return this.fState;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fState;
          default: return null;
      }
    }
    
    public State getState() {
      return this.fState;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("state".equals(parameterName) ) {
          this.fState = (State) newValue;
          return true;
      }
      return false;
    }
    
    public void setState(final State pState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fState = pState;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.stateWithMostSubstates";
    }
    
    @Override
    public List<String> parameterNames() {
      return StateWithMostSubstates.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fState};
    }
    
    @Override
    public StateWithMostSubstates.Match toImmutable() {
      return isMutable() ? newMatch(fState) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"state\"=" + prettyPrintValue(fState));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fState);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof StateWithMostSubstates.Match)) {
          StateWithMostSubstates.Match other = (StateWithMostSubstates.Match) obj;
          return Objects.equals(fState, other.fState);
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
    public StateWithMostSubstates specification() {
      return StateWithMostSubstates.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static StateWithMostSubstates.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static StateWithMostSubstates.Match newMutableMatch(final State pState) {
      return new Mutable(pState);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static StateWithMostSubstates.Match newMatch(final State pState) {
      return new Immutable(pState);
    }
    
    private static final class Mutable extends StateWithMostSubstates.Match {
      Mutable(final State pState) {
        super(pState);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends StateWithMostSubstates.Match {
      Immutable(final State pState) {
        super(pState);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.stateWithMostSubstates pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Reusing a transitive closure and count aggregator pattern with the max aggregator.
   *  
   * pattern stateWithMostSubstates(state : State) {
   *     // the number of substates of this state
   *     find numberOfTransitiveSubstates(state, count);
   *     // is the maximum from all states
   * 	count == max find numberOfTransitiveSubstates(_, #substateCount);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see StateWithMostSubstates
   * 
   */
  public static class Matcher extends BaseMatcher<StateWithMostSubstates.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static StateWithMostSubstates.Matcher on(final ViatraQueryEngine engine) {
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
    public static StateWithMostSubstates.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_STATE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StateWithMostSubstates.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<StateWithMostSubstates.Match> getAllMatches(final State pState) {
      return rawStreamAllMatches(new Object[]{pState}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<StateWithMostSubstates.Match> streamAllMatches(final State pState) {
      return rawStreamAllMatches(new Object[]{pState});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<StateWithMostSubstates.Match> getOneArbitraryMatch(final State pState) {
      return rawGetOneArbitraryMatch(new Object[]{pState});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pState) {
      return rawHasMatch(new Object[]{pState});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pState) {
      return rawCountMatches(new Object[]{pState});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pState, final Consumer<? super StateWithMostSubstates.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pState}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public StateWithMostSubstates.Match newMatch(final State pState) {
      return StateWithMostSubstates.Match.newMatch(pState);
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
    
    @Override
    protected StateWithMostSubstates.Match tupleToMatch(final Tuple t) {
      try {
          return StateWithMostSubstates.Match.newMatch((State) t.get(POSITION_STATE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StateWithMostSubstates.Match arrayToMatch(final Object[] match) {
      try {
          return StateWithMostSubstates.Match.newMatch((State) match[POSITION_STATE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StateWithMostSubstates.Match arrayToMatchMutable(final Object[] match) {
      try {
          return StateWithMostSubstates.Match.newMutableMatch((State) match[POSITION_STATE]);
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
    public static IQuerySpecification<StateWithMostSubstates.Matcher> querySpecification() {
      return StateWithMostSubstates.instance();
    }
  }
  
  private StateWithMostSubstates() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static StateWithMostSubstates instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StateWithMostSubstates.Matcher instantiate(final ViatraQueryEngine engine) {
    return StateWithMostSubstates.Matcher.on(engine);
  }
  
  @Override
  public StateWithMostSubstates.Matcher instantiate() {
    return StateWithMostSubstates.Matcher.create();
  }
  
  @Override
  public StateWithMostSubstates.Match newEmptyMatch() {
    return StateWithMostSubstates.Match.newEmptyMatch();
  }
  
  @Override
  public StateWithMostSubstates.Match newMatch(final Object... parameters) {
    return StateWithMostSubstates.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link StateWithMostSubstates} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link StateWithMostSubstates#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final StateWithMostSubstates INSTANCE = new StateWithMostSubstates();
    
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
    private static final StateWithMostSubstates.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_state = new PParameter("state", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_state);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.stateWithMostSubstates";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state");
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
          PVariable var_count = body.getOrCreateVariableByName("count");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var__substateCount = body.getOrCreateVariableByName("#substateCount");
          new TypeConstraint(body, Tuples.flatTupleOf(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_state, parameter_state)
          ));
          //     // the number of substates of this state    find numberOfTransitiveSubstates(state, count)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_state, var_count), NumberOfTransitiveSubstates.instance().getInternalQueryRepresentation());
          //     // is the maximum from all states	count == max find numberOfTransitiveSubstates(_, #substateCount)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new AggregatorConstraint(new max().getAggregatorLogic(Integer.class), body, Tuples.flatTupleOf(var___0_, var__substateCount), NumberOfTransitiveSubstates.instance().getInternalQueryRepresentation(), var__virtual_0_, 1);
          new Equality(body, var_count, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
