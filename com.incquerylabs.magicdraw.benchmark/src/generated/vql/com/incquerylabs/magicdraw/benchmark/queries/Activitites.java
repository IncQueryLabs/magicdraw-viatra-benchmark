/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/WarmUpQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger;
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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         pattern activitites(activity : Activity, event : Event, eventName : java ^java.lang.String, trigger : Trigger) {
 *         	Activity.event(activity, event);
 *         	Event.name(event, eventName);
 *         	Event._triggerOfEvent(event, trigger);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Activitites extends BaseGeneratedEMFQuerySpecification<Activitites.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.activitites pattern,
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
    private Activity fActivity;
    
    private Event fEvent;
    
    private String fEventName;
    
    private Trigger fTrigger;
    
    private static List<String> parameterNames = makeImmutableList("activity", "event", "eventName", "trigger");
    
    private Match(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      this.fActivity = pActivity;
      this.fEvent = pEvent;
      this.fEventName = pEventName;
      this.fTrigger = pTrigger;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("activity".equals(parameterName)) return this.fActivity;
      if ("event".equals(parameterName)) return this.fEvent;
      if ("eventName".equals(parameterName)) return this.fEventName;
      if ("trigger".equals(parameterName)) return this.fTrigger;
      return null;
    }
    
    public Activity getActivity() {
      return this.fActivity;
    }
    
    public Event getEvent() {
      return this.fEvent;
    }
    
    public String getEventName() {
      return this.fEventName;
    }
    
    public Trigger getTrigger() {
      return this.fTrigger;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("activity".equals(parameterName) ) {
          this.fActivity = (Activity) newValue;
          return true;
      }
      if ("event".equals(parameterName) ) {
          this.fEvent = (Event) newValue;
          return true;
      }
      if ("eventName".equals(parameterName) ) {
          this.fEventName = (String) newValue;
          return true;
      }
      if ("trigger".equals(parameterName) ) {
          this.fTrigger = (Trigger) newValue;
          return true;
      }
      return false;
    }
    
    public void setActivity(final Activity pActivity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActivity = pActivity;
    }
    
    public void setEvent(final Event pEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEvent = pEvent;
    }
    
    public void setEventName(final String pEventName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEventName = pEventName;
    }
    
    public void setTrigger(final Trigger pTrigger) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrigger = pTrigger;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.activitites";
    }
    
    @Override
    public List<String> parameterNames() {
      return Activitites.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fActivity, fEvent, fEventName, fTrigger};
    }
    
    @Override
    public Activitites.Match toImmutable() {
      return isMutable() ? newMatch(fActivity, fEvent, fEventName, fTrigger) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"activity\"=" + prettyPrintValue(fActivity) + ", ");
      result.append("\"event\"=" + prettyPrintValue(fEvent) + ", ");
      result.append("\"eventName\"=" + prettyPrintValue(fEventName) + ", ");
      result.append("\"trigger\"=" + prettyPrintValue(fTrigger));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fActivity, fEvent, fEventName, fTrigger);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Activitites.Match)) {
          Activitites.Match other = (Activitites.Match) obj;
          return Objects.equals(fActivity, other.fActivity) && Objects.equals(fEvent, other.fEvent) && Objects.equals(fEventName, other.fEventName) && Objects.equals(fTrigger, other.fTrigger);
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
    public Activitites specification() {
      return Activitites.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Activitites.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Activitites.Match newMutableMatch(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return new Mutable(pActivity, pEvent, pEventName, pTrigger);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Activitites.Match newMatch(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return new Immutable(pActivity, pEvent, pEventName, pTrigger);
    }
    
    private static final class Mutable extends Activitites.Match {
      Mutable(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
        super(pActivity, pEvent, pEventName, pTrigger);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Activitites.Match {
      Immutable(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
        super(pActivity, pEvent, pEventName, pTrigger);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.activitites pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern activitites(activity : Activity, event : Event, eventName : java ^java.lang.String, trigger : Trigger) {
   * 	Activity.event(activity, event);
   * 	Event.name(event, eventName);
   * 	Event._triggerOfEvent(event, trigger);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Activitites
   * 
   */
  public static class Matcher extends BaseMatcher<Activitites.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Activitites.Matcher on(final ViatraQueryEngine engine) {
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
    public static Activitites.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTIVITY = 0;
    
    private static final int POSITION_EVENT = 1;
    
    private static final int POSITION_EVENTNAME = 2;
    
    private static final int POSITION_TRIGGER = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Activitites.Matcher.class);
    
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
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Activitites.Match> getAllMatches(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawStreamAllMatches(new Object[]{pActivity, pEvent, pEventName, pTrigger}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Activitites.Match> streamAllMatches(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawStreamAllMatches(new Object[]{pActivity, pEvent, pEventName, pTrigger});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Activitites.Match> getOneArbitraryMatch(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawGetOneArbitraryMatch(new Object[]{pActivity, pEvent, pEventName, pTrigger});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawHasMatch(new Object[]{pActivity, pEvent, pEventName, pTrigger});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawCountMatches(new Object[]{pActivity, pEvent, pEventName, pTrigger});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger, final Consumer<? super Activitites.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pActivity, pEvent, pEventName, pTrigger}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param pEvent the fixed value of pattern parameter event, or null if not bound.
     * @param pEventName the fixed value of pattern parameter eventName, or null if not bound.
     * @param pTrigger the fixed value of pattern parameter trigger, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Activitites.Match newMatch(final Activity pActivity, final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return Activitites.Match.newMatch(pActivity, pEvent, pEventName, pTrigger);
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Activity> rawStreamAllValuesOfactivity(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTIVITY, parameters).map(Activity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Activity> getAllValuesOfactivity() {
      return rawStreamAllValuesOfactivity(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Activity> streamAllValuesOfactivity() {
      return rawStreamAllValuesOfactivity(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Activity> streamAllValuesOfactivity(final Activitites.Match partialMatch) {
      return rawStreamAllValuesOfactivity(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Activity> streamAllValuesOfactivity(final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawStreamAllValuesOfactivity(new Object[]{null, pEvent, pEventName, pTrigger});
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Activity> getAllValuesOfactivity(final Activitites.Match partialMatch) {
      return rawStreamAllValuesOfactivity(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for activity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Activity> getAllValuesOfactivity(final Event pEvent, final String pEventName, final Trigger pTrigger) {
      return rawStreamAllValuesOfactivity(new Object[]{null, pEvent, pEventName, pTrigger}).collect(Collectors.toSet());
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
    public Stream<Event> streamAllValuesOfevent(final Activitites.Match partialMatch) {
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
    public Stream<Event> streamAllValuesOfevent(final Activity pActivity, final String pEventName, final Trigger pTrigger) {
      return rawStreamAllValuesOfevent(new Object[]{pActivity, null, pEventName, pTrigger});
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent(final Activitites.Match partialMatch) {
      return rawStreamAllValuesOfevent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for event.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Event> getAllValuesOfevent(final Activity pActivity, final String pEventName, final Trigger pTrigger) {
      return rawStreamAllValuesOfevent(new Object[]{pActivity, null, pEventName, pTrigger}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfeventName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EVENTNAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfeventName() {
      return rawStreamAllValuesOfeventName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfeventName() {
      return rawStreamAllValuesOfeventName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfeventName(final Activitites.Match partialMatch) {
      return rawStreamAllValuesOfeventName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfeventName(final Activity pActivity, final Event pEvent, final Trigger pTrigger) {
      return rawStreamAllValuesOfeventName(new Object[]{pActivity, pEvent, null, pTrigger});
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfeventName(final Activitites.Match partialMatch) {
      return rawStreamAllValuesOfeventName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for eventName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfeventName(final Activity pActivity, final Event pEvent, final Trigger pTrigger) {
      return rawStreamAllValuesOfeventName(new Object[]{pActivity, pEvent, null, pTrigger}).collect(Collectors.toSet());
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
    public Stream<Trigger> streamAllValuesOftrigger(final Activitites.Match partialMatch) {
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
    public Stream<Trigger> streamAllValuesOftrigger(final Activity pActivity, final Event pEvent, final String pEventName) {
      return rawStreamAllValuesOftrigger(new Object[]{pActivity, pEvent, pEventName, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trigger> getAllValuesOftrigger(final Activitites.Match partialMatch) {
      return rawStreamAllValuesOftrigger(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trigger.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trigger> getAllValuesOftrigger(final Activity pActivity, final Event pEvent, final String pEventName) {
      return rawStreamAllValuesOftrigger(new Object[]{pActivity, pEvent, pEventName, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Activitites.Match tupleToMatch(final Tuple t) {
      try {
          return Activitites.Match.newMatch((Activity) t.get(POSITION_ACTIVITY), (Event) t.get(POSITION_EVENT), (String) t.get(POSITION_EVENTNAME), (Trigger) t.get(POSITION_TRIGGER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Activitites.Match arrayToMatch(final Object[] match) {
      try {
          return Activitites.Match.newMatch((Activity) match[POSITION_ACTIVITY], (Event) match[POSITION_EVENT], (String) match[POSITION_EVENTNAME], (Trigger) match[POSITION_TRIGGER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Activitites.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Activitites.Match.newMutableMatch((Activity) match[POSITION_ACTIVITY], (Event) match[POSITION_EVENT], (String) match[POSITION_EVENTNAME], (Trigger) match[POSITION_TRIGGER]);
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
    public static IQuerySpecification<Activitites.Matcher> querySpecification() {
      return Activitites.instance();
    }
  }
  
  private Activitites() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Activitites instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Activitites.Matcher instantiate(final ViatraQueryEngine engine) {
    return Activitites.Matcher.on(engine);
  }
  
  @Override
  public Activitites.Matcher instantiate() {
    return Activitites.Matcher.create();
  }
  
  @Override
  public Activitites.Match newEmptyMatch() {
    return Activitites.Match.newEmptyMatch();
  }
  
  @Override
  public Activitites.Match newMatch(final Object... parameters) {
    return Activitites.Match.newMatch((com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity) parameters[0], (com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event) parameters[1], (java.lang.String) parameters[2], (com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.Activitites (visibility: PUBLIC, simpleName: Activitites, identifier: com.incquerylabs.magicdraw.benchmark.queries.Activitites, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.Activitites (visibility: PUBLIC, simpleName: Activitites, identifier: com.incquerylabs.magicdraw.benchmark.queries.Activitites, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Activitites INSTANCE = new Activitites();
    
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
    private static final Activitites.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_activity = new PParameter("activity", "com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_event = new PParameter("event", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Event", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")), PParameterDirection.INOUT);
    
    private final PParameter parameter_eventName = new PParameter("eventName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_trigger = new PParameter("trigger", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.Trigger", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_activity, parameter_event, parameter_eventName, parameter_trigger);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.activitites";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("activity","event","eventName","trigger");
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
          PVariable var_activity = body.getOrCreateVariableByName("activity");
          PVariable var_event = body.getOrCreateVariableByName("event");
          PVariable var_eventName = body.getOrCreateVariableByName("eventName");
          PVariable var_trigger = body.getOrCreateVariableByName("trigger");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_eventName), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_activity, parameter_activity),
             new ExportedParameter(body, var_event, parameter_event),
             new ExportedParameter(body, var_eventName, parameter_eventName),
             new ExportedParameter(body, var_trigger, parameter_trigger)
          ));
          // 	Activity.event(activity, event)
          new TypeConstraint(body, Tuples.flatTupleOf(var_activity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Behavior", "event")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          new Equality(body, var__virtual_0_, var_event);
          // 	Event.name(event, eventName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_event, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_1_, var_eventName);
          // 	Event._triggerOfEvent(event, trigger)
          new TypeConstraint(body, Tuples.flatTupleOf(var_event), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_event, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event", "_triggerOfEvent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          new Equality(body, var__virtual_2_, var_trigger);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
