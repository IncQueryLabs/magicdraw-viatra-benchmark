/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

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
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         Simple pattern for transitive closures.
 *          
 *         incremental pattern parentState(state : State, parentState : State) {
 *         	State.region(parentState, subregion);
 *         	Region.subvertex(subregion, state);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ParentState extends BaseGeneratedEMFQuerySpecification<ParentState.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.parentState pattern,
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
    
    private State fParentState;
    
    private static List<String> parameterNames = makeImmutableList("state", "parentState");
    
    private Match(final State pState, final State pParentState) {
      this.fState = pState;
      this.fParentState = pParentState;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "state": return this.fState;
          case "parentState": return this.fParentState;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fState;
          case 1: return this.fParentState;
          default: return null;
      }
    }
    
    public State getState() {
      return this.fState;
    }
    
    public State getParentState() {
      return this.fParentState;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("state".equals(parameterName) ) {
          this.fState = (State) newValue;
          return true;
      }
      if ("parentState".equals(parameterName) ) {
          this.fParentState = (State) newValue;
          return true;
      }
      return false;
    }
    
    public void setState(final State pState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fState = pState;
    }
    
    public void setParentState(final State pParentState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParentState = pParentState;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.parentState";
    }
    
    @Override
    public List<String> parameterNames() {
      return ParentState.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fState, fParentState};
    }
    
    @Override
    public ParentState.Match toImmutable() {
      return isMutable() ? newMatch(fState, fParentState) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"state\"=" + prettyPrintValue(fState) + ", ");
      result.append("\"parentState\"=" + prettyPrintValue(fParentState));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fState, fParentState);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ParentState.Match)) {
          ParentState.Match other = (ParentState.Match) obj;
          return Objects.equals(fState, other.fState) && Objects.equals(fParentState, other.fParentState);
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
    public ParentState specification() {
      return ParentState.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ParentState.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ParentState.Match newMutableMatch(final State pState, final State pParentState) {
      return new Mutable(pState, pParentState);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ParentState.Match newMatch(final State pState, final State pParentState) {
      return new Immutable(pState, pParentState);
    }
    
    private static final class Mutable extends ParentState.Match {
      Mutable(final State pState, final State pParentState) {
        super(pState, pParentState);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ParentState.Match {
      Immutable(final State pState, final State pParentState) {
        super(pState, pParentState);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.parentState pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Simple pattern for transitive closures.
   *  
   * incremental pattern parentState(state : State, parentState : State) {
   * 	State.region(parentState, subregion);
   * 	Region.subvertex(subregion, state);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ParentState
   * 
   */
  public static class Matcher extends BaseMatcher<ParentState.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ParentState.Matcher on(final ViatraQueryEngine engine) {
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
    public static ParentState.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_STATE = 0;
    
    private static final int POSITION_PARENTSTATE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ParentState.Matcher.class);
    
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
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ParentState.Match> getAllMatches(final State pState, final State pParentState) {
      return rawStreamAllMatches(new Object[]{pState, pParentState}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ParentState.Match> streamAllMatches(final State pState, final State pParentState) {
      return rawStreamAllMatches(new Object[]{pState, pParentState});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ParentState.Match> getOneArbitraryMatch(final State pState, final State pParentState) {
      return rawGetOneArbitraryMatch(new Object[]{pState, pParentState});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pState, final State pParentState) {
      return rawHasMatch(new Object[]{pState, pParentState});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pState, final State pParentState) {
      return rawCountMatches(new Object[]{pState, pParentState});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pState, final State pParentState, final Consumer<? super ParentState.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pState, pParentState}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pParentState the fixed value of pattern parameter parentState, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ParentState.Match newMatch(final State pState, final State pParentState) {
      return ParentState.Match.newMatch(pState, pParentState);
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
    public Stream<State> streamAllValuesOfstate(final ParentState.Match partialMatch) {
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
    public Stream<State> streamAllValuesOfstate(final State pParentState) {
      return rawStreamAllValuesOfstate(new Object[]{null, pParentState});
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final ParentState.Match partialMatch) {
      return rawStreamAllValuesOfstate(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final State pParentState) {
      return rawStreamAllValuesOfstate(new Object[]{null, pParentState}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<State> rawStreamAllValuesOfparentState(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARENTSTATE, parameters).map(State.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfparentState() {
      return rawStreamAllValuesOfparentState(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfparentState() {
      return rawStreamAllValuesOfparentState(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfparentState(final ParentState.Match partialMatch) {
      return rawStreamAllValuesOfparentState(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfparentState(final State pState) {
      return rawStreamAllValuesOfparentState(new Object[]{pState, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfparentState(final ParentState.Match partialMatch) {
      return rawStreamAllValuesOfparentState(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parentState.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfparentState(final State pState) {
      return rawStreamAllValuesOfparentState(new Object[]{pState, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ParentState.Match tupleToMatch(final Tuple t) {
      try {
          return ParentState.Match.newMatch((State) t.get(POSITION_STATE), (State) t.get(POSITION_PARENTSTATE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ParentState.Match arrayToMatch(final Object[] match) {
      try {
          return ParentState.Match.newMatch((State) match[POSITION_STATE], (State) match[POSITION_PARENTSTATE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ParentState.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ParentState.Match.newMutableMatch((State) match[POSITION_STATE], (State) match[POSITION_PARENTSTATE]);
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
    public static IQuerySpecification<ParentState.Matcher> querySpecification() {
      return ParentState.instance();
    }
  }
  
  private ParentState() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ParentState instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ParentState.Matcher instantiate(final ViatraQueryEngine engine) {
    return ParentState.Matcher.on(engine);
  }
  
  @Override
  public ParentState.Matcher instantiate() {
    return ParentState.Matcher.create();
  }
  
  @Override
  public ParentState.Match newEmptyMatch() {
    return ParentState.Match.newEmptyMatch();
  }
  
  @Override
  public ParentState.Match newMatch(final Object... parameters) {
    return ParentState.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0], (com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ParentState} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ParentState#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ParentState INSTANCE = new ParentState();
    
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
    private static final ParentState.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_state = new PParameter("state", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_parentState = new PParameter("parentState", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_state, parameter_parentState);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.parentState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state","parentState");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.DEFAULT_CACHING));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_state = body.getOrCreateVariableByName("state");
          PVariable var_parentState = body.getOrCreateVariableByName("parentState");
          PVariable var_subregion = body.getOrCreateVariableByName("subregion");
          new TypeConstraint(body, Tuples.flatTupleOf(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_state, parameter_state),
             new ExportedParameter(body, var_parentState, parameter_parentState)
          ));
          // 	State.region(parentState, subregion)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parentState, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State", "region")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Region")));
          new Equality(body, var__virtual_0_, var_subregion);
          // 	Region.subvertex(subregion, state)
          new TypeConstraint(body, Tuples.flatTupleOf(var_subregion), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Region")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_subregion, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Region", "subvertex")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Vertex")));
          new Equality(body, var__virtual_1_, var_state);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
