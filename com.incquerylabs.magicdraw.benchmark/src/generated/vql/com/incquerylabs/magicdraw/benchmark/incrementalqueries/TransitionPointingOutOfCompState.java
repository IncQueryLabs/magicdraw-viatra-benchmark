/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.ParentState;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Vertex;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         Cartesian product of classes.
 *          
 *         //pattern productOfClasses(lhs : Class, lhsName : java ^java.lang.String, rhs : Class, rhsName : java ^java.lang.String) {
 *         //	Class.name(lhs, lhsName);
 *         //    Class.name(rhs, rhsName);
 *         //}
 *         
 *         
 *           Cartesian product of classes and a filter using a check.
 *          
 *         //private pattern hasLongerName(lhs : Class, rhs : Class) {
 *         //    find productOfClasses(lhs, lhsName, rhs, rhsName);
 *         //    check (lhsName.length {@literal <} rhsName.length); 
 *         //}
 *         
 *         
 *           Selecting an element reusing a Cartesian product.
 *          
 *         //pattern elementWithShortestName(element : Class) {
 *         //	find requirements(element); // If this in not here, we run out of memory
 *         //	neg find hasLongerName(_, element);
 *         //}
 *         
 *         
 *           A transition that connects two states with the following properties
 *           - Source state is a member of a composite state
 *           - Target state is a member of the same state machine, however not contained in a composite state
 *           - Target state has an outgoing transition towards a final state
 *           
 *          
 *         pattern transitionPointingOutOfCompState(source : State, target : Vertex, transition : Transition) {
 *         	Transition.source(transition, source);
 *         	Transition.target(transition, target);
 *         	
 *         	//pattern for target side element
 *         	Vertex.container(target, targetRegion);
 *         	Region.stateMachine(targetRegion, _);
 *         	Vertex.outgoing(target, targetVertexTransition);
 *         	Transition.target(targetVertexTransition, finalState);
 *         	FinalState(finalState);
 *         	
 *         	//Pattern for source side element
 *         	find parentState+(source, sourceParent);
 *         	State.container.stateMachine(sourceParent, _ );
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TransitionPointingOutOfCompState extends BaseGeneratedEMFQuerySpecification<TransitionPointingOutOfCompState.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.transitionPointingOutOfCompState pattern,
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
    private State fSource;
    
    private Vertex fTarget;
    
    private Transition fTransition;
    
    private static List<String> parameterNames = makeImmutableList("source", "target", "transition");
    
    private Match(final State pSource, final Vertex pTarget, final Transition pTransition) {
      this.fSource = pSource;
      this.fTarget = pTarget;
      this.fTransition = pTransition;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "source": return this.fSource;
          case "target": return this.fTarget;
          case "transition": return this.fTransition;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fSource;
          case 1: return this.fTarget;
          case 2: return this.fTransition;
          default: return null;
      }
    }
    
    public State getSource() {
      return this.fSource;
    }
    
    public Vertex getTarget() {
      return this.fTarget;
    }
    
    public Transition getTransition() {
      return this.fTransition;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("source".equals(parameterName) ) {
          this.fSource = (State) newValue;
          return true;
      }
      if ("target".equals(parameterName) ) {
          this.fTarget = (Vertex) newValue;
          return true;
      }
      if ("transition".equals(parameterName) ) {
          this.fTransition = (Transition) newValue;
          return true;
      }
      return false;
    }
    
    public void setSource(final State pSource) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSource = pSource;
    }
    
    public void setTarget(final Vertex pTarget) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTarget = pTarget;
    }
    
    public void setTransition(final Transition pTransition) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTransition = pTransition;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.transitionPointingOutOfCompState";
    }
    
    @Override
    public List<String> parameterNames() {
      return TransitionPointingOutOfCompState.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSource, fTarget, fTransition};
    }
    
    @Override
    public TransitionPointingOutOfCompState.Match toImmutable() {
      return isMutable() ? newMatch(fSource, fTarget, fTransition) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
      result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
      result.append("\"transition\"=" + prettyPrintValue(fTransition));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fSource, fTarget, fTransition);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TransitionPointingOutOfCompState.Match)) {
          TransitionPointingOutOfCompState.Match other = (TransitionPointingOutOfCompState.Match) obj;
          return Objects.equals(fSource, other.fSource) && Objects.equals(fTarget, other.fTarget) && Objects.equals(fTransition, other.fTransition);
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
    public TransitionPointingOutOfCompState specification() {
      return TransitionPointingOutOfCompState.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TransitionPointingOutOfCompState.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TransitionPointingOutOfCompState.Match newMutableMatch(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return new Mutable(pSource, pTarget, pTransition);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TransitionPointingOutOfCompState.Match newMatch(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return new Immutable(pSource, pTarget, pTransition);
    }
    
    private static final class Mutable extends TransitionPointingOutOfCompState.Match {
      Mutable(final State pSource, final Vertex pTarget, final Transition pTransition) {
        super(pSource, pTarget, pTransition);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TransitionPointingOutOfCompState.Match {
      Immutable(final State pSource, final Vertex pTarget, final Transition pTransition) {
        super(pSource, pTarget, pTransition);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.transitionPointingOutOfCompState pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Cartesian product of classes.
   *  
   * //pattern productOfClasses(lhs : Class, lhsName : java ^java.lang.String, rhs : Class, rhsName : java ^java.lang.String) {
   * //	Class.name(lhs, lhsName);
   * //    Class.name(rhs, rhsName);
   * //}
   * 
   * 
   *   Cartesian product of classes and a filter using a check.
   *  
   * //private pattern hasLongerName(lhs : Class, rhs : Class) {
   * //    find productOfClasses(lhs, lhsName, rhs, rhsName);
   * //    check (lhsName.length {@literal <} rhsName.length); 
   * //}
   * 
   * 
   *   Selecting an element reusing a Cartesian product.
   *  
   * //pattern elementWithShortestName(element : Class) {
   * //	find requirements(element); // If this in not here, we run out of memory
   * //	neg find hasLongerName(_, element);
   * //}
   * 
   * 
   *   A transition that connects two states with the following properties
   *   - Source state is a member of a composite state
   *   - Target state is a member of the same state machine, however not contained in a composite state
   *   - Target state has an outgoing transition towards a final state
   *   
   *  
   * pattern transitionPointingOutOfCompState(source : State, target : Vertex, transition : Transition) {
   * 	Transition.source(transition, source);
   * 	Transition.target(transition, target);
   * 	
   * 	//pattern for target side element
   * 	Vertex.container(target, targetRegion);
   * 	Region.stateMachine(targetRegion, _);
   * 	Vertex.outgoing(target, targetVertexTransition);
   * 	Transition.target(targetVertexTransition, finalState);
   * 	FinalState(finalState);
   * 	
   * 	//Pattern for source side element
   * 	find parentState+(source, sourceParent);
   * 	State.container.stateMachine(sourceParent, _ );
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TransitionPointingOutOfCompState
   * 
   */
  public static class Matcher extends BaseMatcher<TransitionPointingOutOfCompState.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TransitionPointingOutOfCompState.Matcher on(final ViatraQueryEngine engine) {
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
    public static TransitionPointingOutOfCompState.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SOURCE = 0;
    
    private static final int POSITION_TARGET = 1;
    
    private static final int POSITION_TRANSITION = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TransitionPointingOutOfCompState.Matcher.class);
    
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
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TransitionPointingOutOfCompState.Match> getAllMatches(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return rawStreamAllMatches(new Object[]{pSource, pTarget, pTransition}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TransitionPointingOutOfCompState.Match> streamAllMatches(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return rawStreamAllMatches(new Object[]{pSource, pTarget, pTransition});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TransitionPointingOutOfCompState.Match> getOneArbitraryMatch(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return rawGetOneArbitraryMatch(new Object[]{pSource, pTarget, pTransition});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return rawHasMatch(new Object[]{pSource, pTarget, pTransition});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return rawCountMatches(new Object[]{pSource, pTarget, pTransition});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pSource, final Vertex pTarget, final Transition pTransition, final Consumer<? super TransitionPointingOutOfCompState.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSource, pTarget, pTransition}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TransitionPointingOutOfCompState.Match newMatch(final State pSource, final Vertex pTarget, final Transition pTransition) {
      return TransitionPointingOutOfCompState.Match.newMatch(pSource, pTarget, pTransition);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<State> rawStreamAllValuesOfsource(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SOURCE, parameters).map(State.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfsource(final TransitionPointingOutOfCompState.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<State> streamAllValuesOfsource(final Vertex pTarget, final Transition pTransition) {
      return rawStreamAllValuesOfsource(new Object[]{null, pTarget, pTransition});
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfsource(final TransitionPointingOutOfCompState.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfsource(final Vertex pTarget, final Transition pTransition) {
      return rawStreamAllValuesOfsource(new Object[]{null, pTarget, pTransition}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Vertex> rawStreamAllValuesOftarget(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGET, parameters).map(Vertex.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOftarget(final TransitionPointingOutOfCompState.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOftarget(final State pSource, final Transition pTransition) {
      return rawStreamAllValuesOftarget(new Object[]{pSource, null, pTransition});
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOftarget(final TransitionPointingOutOfCompState.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOftarget(final State pSource, final Transition pTransition) {
      return rawStreamAllValuesOftarget(new Object[]{pSource, null, pTransition}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Transition> rawStreamAllValuesOftransition(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRANSITION, parameters).map(Transition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition() {
      return rawStreamAllValuesOftransition(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOftransition() {
      return rawStreamAllValuesOftransition(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOftransition(final TransitionPointingOutOfCompState.Match partialMatch) {
      return rawStreamAllValuesOftransition(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOftransition(final State pSource, final Vertex pTarget) {
      return rawStreamAllValuesOftransition(new Object[]{pSource, pTarget, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition(final TransitionPointingOutOfCompState.Match partialMatch) {
      return rawStreamAllValuesOftransition(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition(final State pSource, final Vertex pTarget) {
      return rawStreamAllValuesOftransition(new Object[]{pSource, pTarget, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected TransitionPointingOutOfCompState.Match tupleToMatch(final Tuple t) {
      try {
          return TransitionPointingOutOfCompState.Match.newMatch((State) t.get(POSITION_SOURCE), (Vertex) t.get(POSITION_TARGET), (Transition) t.get(POSITION_TRANSITION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TransitionPointingOutOfCompState.Match arrayToMatch(final Object[] match) {
      try {
          return TransitionPointingOutOfCompState.Match.newMatch((State) match[POSITION_SOURCE], (Vertex) match[POSITION_TARGET], (Transition) match[POSITION_TRANSITION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TransitionPointingOutOfCompState.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TransitionPointingOutOfCompState.Match.newMutableMatch((State) match[POSITION_SOURCE], (Vertex) match[POSITION_TARGET], (Transition) match[POSITION_TRANSITION]);
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
    public static IQuerySpecification<TransitionPointingOutOfCompState.Matcher> querySpecification() {
      return TransitionPointingOutOfCompState.instance();
    }
  }
  
  private TransitionPointingOutOfCompState() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TransitionPointingOutOfCompState instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TransitionPointingOutOfCompState.Matcher instantiate(final ViatraQueryEngine engine) {
    return TransitionPointingOutOfCompState.Matcher.on(engine);
  }
  
  @Override
  public TransitionPointingOutOfCompState.Matcher instantiate() {
    return TransitionPointingOutOfCompState.Matcher.create();
  }
  
  @Override
  public TransitionPointingOutOfCompState.Match newEmptyMatch() {
    return TransitionPointingOutOfCompState.Match.newEmptyMatch();
  }
  
  @Override
  public TransitionPointingOutOfCompState.Match newMatch(final Object... parameters) {
    return TransitionPointingOutOfCompState.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0], (com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Vertex) parameters[1], (com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TransitionPointingOutOfCompState} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TransitionPointingOutOfCompState#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TransitionPointingOutOfCompState INSTANCE = new TransitionPointingOutOfCompState();
    
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
    private static final TransitionPointingOutOfCompState.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_source = new PParameter("source", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_target = new PParameter("target", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Vertex", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")), PParameterDirection.INOUT);
    
    private final PParameter parameter_transition = new PParameter("transition", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_source, parameter_target, parameter_transition);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.transitionPointingOutOfCompState";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("source","target","transition");
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
          PVariable var_source = body.getOrCreateVariableByName("source");
          PVariable var_target = body.getOrCreateVariableByName("target");
          PVariable var_transition = body.getOrCreateVariableByName("transition");
          PVariable var_targetRegion = body.getOrCreateVariableByName("targetRegion");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_targetVertexTransition = body.getOrCreateVariableByName("targetVertexTransition");
          PVariable var_finalState = body.getOrCreateVariableByName("finalState");
          PVariable var_sourceParent = body.getOrCreateVariableByName("sourceParent");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_source, parameter_source),
             new ExportedParameter(body, var_target, parameter_target),
             new ExportedParameter(body, var_transition, parameter_transition)
          ));
          // 	Transition.source(transition, source)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")));
          new Equality(body, var__virtual_0_, var_source);
          // 	Transition.target(transition, target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")));
          new Equality(body, var__virtual_1_, var_target);
          // 		//pattern for target side element	Vertex.container(target, targetRegion)
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_target, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex", "container")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Region")));
          new Equality(body, var__virtual_2_, var_targetRegion);
          // 	Region.stateMachine(targetRegion, _)
          new TypeConstraint(body, Tuples.flatTupleOf(var_targetRegion), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Region")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_targetRegion, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Region", "stateMachine")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "StateMachine")));
          new Equality(body, var__virtual_3_, var___0_);
          // 	Vertex.outgoing(target, targetVertexTransition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_target, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex", "outgoing")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition")));
          new Equality(body, var__virtual_4_, var_targetVertexTransition);
          // 	Transition.target(targetVertexTransition, finalState)
          new TypeConstraint(body, Tuples.flatTupleOf(var_targetVertexTransition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_targetVertexTransition, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Transition", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex")));
          new Equality(body, var__virtual_5_, var_finalState);
          // 	FinalState(finalState)
          new TypeConstraint(body, Tuples.flatTupleOf(var_finalState), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "FinalState")));
          // 		//Pattern for source side element	find parentState+(source, sourceParent)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_source, var_sourceParent), ParentState.instance().getInternalQueryRepresentation());
          // 	State.container.stateMachine(sourceParent, _ )
          new TypeConstraint(body, Tuples.flatTupleOf(var_sourceParent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "State")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_sourceParent, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Vertex", "container")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Region")));
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Region", "stateMachine")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_7_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "StateMachine")));
          new Equality(body, var__virtual_7_, var___1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
