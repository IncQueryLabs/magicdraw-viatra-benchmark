/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.internal.TransitionWithGuard;
import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         A loop transition that
 *           - Has a trigger
 *           - Has some effect that is an activity
 *           - Has no guard
 *           - defines an event
 *           
 *          
 *         pattern loopTransitionWithTriggerEffectEventNoGuard(state : State, transition : Transition, trigger : Trigger, event : Event, effect : Activity) {
 *         	Transition.source(transition, state);
 *         	Transition.target(transition, state);
 *         	Transition.kind(transition, ::external);
 *         	Transition.trigger(transition, trigger);
 *         	Transition.effect(transition, effect);
 *         	neg find transitionWithGuard(transition, _);
 *         	Trigger.event(trigger, event);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class LoopTransitionWithTriggerEffectEventNoGuard extends BaseGeneratedEMFQuerySpecification<LoopTransitionWithTriggerEffectEventNoGuard.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.loopTransitionWithTriggerEffectEventNoGuard pattern,
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
    
    private Transition fTransition;
    
    private Trigger fTrigger;
    
    private Event fEvent;
    
    private Activity fEffect;
    
    private static List<String> parameterNames = makeImmutableList("state", "transition", "trigger", "event", "effect");
    
    private Match(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      this.fState = pState;
      this.fTransition = pTransition;
      this.fTrigger = pTrigger;
      this.fEvent = pEvent;
      this.fEffect = pEffect;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "state": return this.fState;
          case "transition": return this.fTransition;
          case "trigger": return this.fTrigger;
          case "event": return this.fEvent;
          case "effect": return this.fEffect;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fState;
          case 1: return this.fTransition;
          case 2: return this.fTrigger;
          case 3: return this.fEvent;
          case 4: return this.fEffect;
          default: return null;
      }
    }
    
    public State getState() {
      return this.fState;
    }
    
    public Transition getTransition() {
      return this.fTransition;
    }
    
    public Trigger getTrigger() {
      return this.fTrigger;
    }
    
    public Event getEvent() {
      return this.fEvent;
    }
    
    public Activity getEffect() {
      return this.fEffect;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("state".equals(parameterName) ) {
          this.fState = (State) newValue;
          return true;
      }
      if ("transition".equals(parameterName) ) {
          this.fTransition = (Transition) newValue;
          return true;
      }
      if ("trigger".equals(parameterName) ) {
          this.fTrigger = (Trigger) newValue;
          return true;
      }
      if ("event".equals(parameterName) ) {
          this.fEvent = (Event) newValue;
          return true;
      }
      if ("effect".equals(parameterName) ) {
          this.fEffect = (Activity) newValue;
          return true;
      }
      return false;
    }
    
    public void setState(final State pState) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fState = pState;
    }
    
    public void setTransition(final Transition pTransition) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTransition = pTransition;
    }
    
    public void setTrigger(final Trigger pTrigger) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrigger = pTrigger;
    }
    
    public void setEvent(final Event pEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEvent = pEvent;
    }
    
    public void setEffect(final Activity pEffect) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEffect = pEffect;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.loopTransitionWithTriggerEffectEventNoGuard";
    }
    
    @Override
    public List<String> parameterNames() {
      return LoopTransitionWithTriggerEffectEventNoGuard.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fState, fTransition, fTrigger, fEvent, fEffect};
    }
    
    @Override
    public LoopTransitionWithTriggerEffectEventNoGuard.Match toImmutable() {
      return isMutable() ? newMatch(fState, fTransition, fTrigger, fEvent, fEffect) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"state\"=" + prettyPrintValue(fState) + ", ");
      result.append("\"transition\"=" + prettyPrintValue(fTransition) + ", ");
      result.append("\"trigger\"=" + prettyPrintValue(fTrigger) + ", ");
      result.append("\"event\"=" + prettyPrintValue(fEvent) + ", ");
      result.append("\"effect\"=" + prettyPrintValue(fEffect));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fState, fTransition, fTrigger, fEvent, fEffect);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof LoopTransitionWithTriggerEffectEventNoGuard.Match)) {
          LoopTransitionWithTriggerEffectEventNoGuard.Match other = (LoopTransitionWithTriggerEffectEventNoGuard.Match) obj;
          return Objects.equals(fState, other.fState) && Objects.equals(fTransition, other.fTransition) && Objects.equals(fTrigger, other.fTrigger) && Objects.equals(fEvent, other.fEvent) && Objects.equals(fEffect, other.fEffect);
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
    public LoopTransitionWithTriggerEffectEventNoGuard specification() {
      return LoopTransitionWithTriggerEffectEventNoGuard.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static LoopTransitionWithTriggerEffectEventNoGuard.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static LoopTransitionWithTriggerEffectEventNoGuard.Match newMutableMatch(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return new Mutable(pState, pTransition, pTrigger, pEvent, pEffect);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static LoopTransitionWithTriggerEffectEventNoGuard.Match newMatch(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return new Immutable(pState, pTransition, pTrigger, pEvent, pEffect);
    }
    
    private static final class Mutable extends LoopTransitionWithTriggerEffectEventNoGuard.Match {
      Mutable(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
        super(pState, pTransition, pTrigger, pEvent, pEffect);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends LoopTransitionWithTriggerEffectEventNoGuard.Match {
      Immutable(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
        super(pState, pTransition, pTrigger, pEvent, pEffect);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.loopTransitionWithTriggerEffectEventNoGuard pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * A loop transition that
   *   - Has a trigger
   *   - Has some effect that is an activity
   *   - Has no guard
   *   - defines an event
   *   
   *  
   * pattern loopTransitionWithTriggerEffectEventNoGuard(state : State, transition : Transition, trigger : Trigger, event : Event, effect : Activity) {
   * 	Transition.source(transition, state);
   * 	Transition.target(transition, state);
   * 	Transition.kind(transition, ::external);
   * 	Transition.trigger(transition, trigger);
   * 	Transition.effect(transition, effect);
   * 	neg find transitionWithGuard(transition, _);
   * 	Trigger.event(trigger, event);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see LoopTransitionWithTriggerEffectEventNoGuard
   * 
   */
  public static class Matcher extends BaseMatcher<LoopTransitionWithTriggerEffectEventNoGuard.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static LoopTransitionWithTriggerEffectEventNoGuard.Matcher on(final ViatraQueryEngine engine) {
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
    public static LoopTransitionWithTriggerEffectEventNoGuard.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_STATE = 0;
    
    private static final int POSITION_TRANSITION = 1;
    
    private static final int POSITION_TRIGGER = 2;
    
    private static final int POSITION_EVENT = 3;
    
    private static final int POSITION_EFFECT = 4;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(LoopTransitionWithTriggerEffectEventNoGuard.Matcher.class);
    
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
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<LoopTransitionWithTriggerEffectEventNoGuard.Match> getAllMatches(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawStreamAllMatches(new Object[]{pState, pTransition, pTrigger, pEvent, pEffect}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<LoopTransitionWithTriggerEffectEventNoGuard.Match> streamAllMatches(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawStreamAllMatches(new Object[]{pState, pTransition, pTrigger, pEvent, pEffect});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<LoopTransitionWithTriggerEffectEventNoGuard.Match> getOneArbitraryMatch(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawGetOneArbitraryMatch(new Object[]{pState, pTransition, pTrigger, pEvent, pEffect});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawHasMatch(new Object[]{pState, pTransition, pTrigger, pEvent, pEffect});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawCountMatches(new Object[]{pState, pTransition, pTrigger, pEvent, pEffect});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect, final Consumer<? super LoopTransitionWithTriggerEffectEventNoGuard.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pState, pTransition, pTrigger, pEvent, pEffect}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pState the fixed value of pattern parameter state, or null if not bound.
     * @param pTransition the fixed value of pattern parameter transition, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEffect the fixed value of pattern parameter effect, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public LoopTransitionWithTriggerEffectEventNoGuard.Match newMatch(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return LoopTransitionWithTriggerEffectEventNoGuard.Match.newMatch(pState, pTransition, pTrigger, pEvent, pEffect);
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
    public Stream<State> streamAllValuesOfstate(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
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
    public Stream<State> streamAllValuesOfstate(final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawStreamAllValuesOfstate(new Object[]{null, pTransition, pTrigger, pEvent, pEffect});
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOfstate(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for state.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<State> getAllValuesOfstate(final Transition pTransition, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawStreamAllValuesOfstate(new Object[]{null, pTransition, pTrigger, pEvent, pEffect}).collect(Collectors.toSet());
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
    public Stream<Transition> streamAllValuesOftransition(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
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
    public Stream<Transition> streamAllValuesOftransition(final State pState, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawStreamAllValuesOftransition(new Object[]{pState, null, pTrigger, pEvent, pEffect});
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOftransition(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for transition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOftransition(final State pState, final Trigger pTrigger, final Event pEvent, final Activity pEffect) {
      return rawStreamAllValuesOftransition(new Object[]{pState, null, pTrigger, pEvent, pEffect}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trigger> rawStreamAllValuesOftrigger(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRIGGER, parameters).map(Trigger.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trigger> getAllValuesOftrigger() {
      return rawStreamAllValuesOftrigger(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trigger> streamAllValuesOftrigger() {
      return rawStreamAllValuesOftrigger(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trigger> streamAllValuesOftrigger(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOftrigger(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trigger> streamAllValuesOftrigger(final State pState, final Transition pTransition, final Event pEvent, final Activity pEffect) {
      return rawStreamAllValuesOftrigger(new Object[]{pState, pTransition, null, pEvent, pEffect});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trigger> getAllValuesOftrigger(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOftrigger(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trigger> getAllValuesOftrigger(final State pState, final Transition pTransition, final Event pEvent, final Activity pEffect) {
      return rawStreamAllValuesOftrigger(new Object[]{pState, pTransition, null, pEvent, pEffect}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Event> rawStreamAllValuesOfevent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EVENT, parameters).map(Event.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent() {
      return rawStreamAllValuesOfevent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Event> streamAllValuesOfevent() {
      return rawStreamAllValuesOfevent(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Event> streamAllValuesOfevent(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOfevent(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Event> streamAllValuesOfevent(final State pState, final Transition pTransition, final Trigger pTrigger, final Activity pEffect) {
      return rawStreamAllValuesOfevent(new Object[]{pState, pTransition, pTrigger, null, pEffect});
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOfevent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent(final State pState, final Transition pTransition, final Trigger pTrigger, final Activity pEffect) {
      return rawStreamAllValuesOfevent(new Object[]{pState, pTransition, pTrigger, null, pEffect}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Activity> rawStreamAllValuesOfeffect(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EFFECT, parameters).map(Activity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Activity> getAllValuesOfeffect() {
      return rawStreamAllValuesOfeffect(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Activity> streamAllValuesOfeffect() {
      return rawStreamAllValuesOfeffect(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Activity> streamAllValuesOfeffect(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOfeffect(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Activity> streamAllValuesOfeffect(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent) {
      return rawStreamAllValuesOfeffect(new Object[]{pState, pTransition, pTrigger, pEvent, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Activity> getAllValuesOfeffect(final LoopTransitionWithTriggerEffectEventNoGuard.Match partialMatch) {
      return rawStreamAllValuesOfeffect(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for effect.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Activity> getAllValuesOfeffect(final State pState, final Transition pTransition, final Trigger pTrigger, final Event pEvent) {
      return rawStreamAllValuesOfeffect(new Object[]{pState, pTransition, pTrigger, pEvent, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected LoopTransitionWithTriggerEffectEventNoGuard.Match tupleToMatch(final Tuple t) {
      try {
          return LoopTransitionWithTriggerEffectEventNoGuard.Match.newMatch((State) t.get(POSITION_STATE), (Transition) t.get(POSITION_TRANSITION), (Trigger) t.get(POSITION_TRIGGER), (Event) t.get(POSITION_EVENT), (Activity) t.get(POSITION_EFFECT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected LoopTransitionWithTriggerEffectEventNoGuard.Match arrayToMatch(final Object[] match) {
      try {
          return LoopTransitionWithTriggerEffectEventNoGuard.Match.newMatch((State) match[POSITION_STATE], (Transition) match[POSITION_TRANSITION], (Trigger) match[POSITION_TRIGGER], (Event) match[POSITION_EVENT], (Activity) match[POSITION_EFFECT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected LoopTransitionWithTriggerEffectEventNoGuard.Match arrayToMatchMutable(final Object[] match) {
      try {
          return LoopTransitionWithTriggerEffectEventNoGuard.Match.newMutableMatch((State) match[POSITION_STATE], (Transition) match[POSITION_TRANSITION], (Trigger) match[POSITION_TRIGGER], (Event) match[POSITION_EVENT], (Activity) match[POSITION_EFFECT]);
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
    public static IQuerySpecification<LoopTransitionWithTriggerEffectEventNoGuard.Matcher> querySpecification() {
      return LoopTransitionWithTriggerEffectEventNoGuard.instance();
    }
  }
  
  private LoopTransitionWithTriggerEffectEventNoGuard() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static LoopTransitionWithTriggerEffectEventNoGuard instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected LoopTransitionWithTriggerEffectEventNoGuard.Matcher instantiate(final ViatraQueryEngine engine) {
    return LoopTransitionWithTriggerEffectEventNoGuard.Matcher.on(engine);
  }
  
  @Override
  public LoopTransitionWithTriggerEffectEventNoGuard.Matcher instantiate() {
    return LoopTransitionWithTriggerEffectEventNoGuard.Matcher.create();
  }
  
  @Override
  public LoopTransitionWithTriggerEffectEventNoGuard.Match newEmptyMatch() {
    return LoopTransitionWithTriggerEffectEventNoGuard.Match.newEmptyMatch();
  }
  
  @Override
  public LoopTransitionWithTriggerEffectEventNoGuard.Match newMatch(final Object... parameters) {
    return LoopTransitionWithTriggerEffectEventNoGuard.Match.newMatch((com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State) parameters[0], (com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition) parameters[1], (com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger) parameters[2], (com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event) parameters[3], (com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link LoopTransitionWithTriggerEffectEventNoGuard} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link LoopTransitionWithTriggerEffectEventNoGuard#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final LoopTransitionWithTriggerEffectEventNoGuard INSTANCE = new LoopTransitionWithTriggerEffectEventNoGuard();
    
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
    private static final LoopTransitionWithTriggerEffectEventNoGuard.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_state = new PParameter("state", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")), PParameterDirection.INOUT);
    
    private final PParameter parameter_transition = new PParameter("transition", "com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")), PParameterDirection.INOUT);
    
    private final PParameter parameter_trigger = new PParameter("trigger", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")), PParameterDirection.INOUT);
    
    private final PParameter parameter_event = new PParameter("event", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")), PParameterDirection.INOUT);
    
    private final PParameter parameter_effect = new PParameter("effect", "com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_state, parameter_transition, parameter_trigger, parameter_event, parameter_effect);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.loopTransitionWithTriggerEffectEventNoGuard";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("state","transition","trigger","event","effect");
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
          PVariable var_transition = body.getOrCreateVariableByName("transition");
          PVariable var_trigger = body.getOrCreateVariableByName("trigger");
          PVariable var_event = body.getOrCreateVariableByName("event");
          PVariable var_effect = body.getOrCreateVariableByName("effect");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_state), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "State")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_effect), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_state, parameter_state),
             new ExportedParameter(body, var_transition, parameter_transition),
             new ExportedParameter(body, var_trigger, parameter_trigger),
             new ExportedParameter(body, var_event, parameter_event),
             new ExportedParameter(body, var_effect, parameter_effect)
          ));
          // 	Transition.source(transition, state)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Vertex")));
          new Equality(body, var__virtual_0_, var_state);
          // 	Transition.target(transition, state)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Vertex")));
          new Equality(body, var__virtual_1_, var_state);
          // 	Transition.kind(transition, ::external)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.TransitionKindEnum.get("external"));
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition", "kind")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TransitionKind")));
          new Equality(body, var__virtual_3_, var__virtual_2_);
          // 	Transition.trigger(transition, trigger)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition", "trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          new Equality(body, var__virtual_4_, var_trigger);
          // 	Transition.effect(transition, effect)
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_transition, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Transition", "effect")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Behavior")));
          new Equality(body, var__virtual_5_, var_effect);
          // 	neg find transitionWithGuard(transition, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_transition, var___0_), TransitionWithGuard.instance().getInternalQueryRepresentation());
          // 	Trigger.event(trigger, event)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger", "event")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_6_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          new Equality(body, var__virtual_6_, var_event);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
