/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.NonStreaming;
import sysml.Streaming;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern activityStreamingNoNStreaming(activity : Activity) {
 *         	find sysml.streaming(activity, _);
 *         	find sysml.nonStreaming(activity, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ActivityStreamingNoNStreaming extends BaseGeneratedEMFQuerySpecification<ActivityStreamingNoNStreaming.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.activityStreamingNoNStreaming pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("activity");
    
    private Match(final Activity pActivity) {
      this.fActivity = pActivity;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "activity": return this.fActivity;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fActivity;
          default: return null;
      }
    }
    
    public Activity getActivity() {
      return this.fActivity;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("activity".equals(parameterName) ) {
          this.fActivity = (Activity) newValue;
          return true;
      }
      return false;
    }
    
    public void setActivity(final Activity pActivity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActivity = pActivity;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.activityStreamingNoNStreaming";
    }
    
    @Override
    public List<String> parameterNames() {
      return ActivityStreamingNoNStreaming.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fActivity};
    }
    
    @Override
    public ActivityStreamingNoNStreaming.Match toImmutable() {
      return isMutable() ? newMatch(fActivity) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"activity\"=" + prettyPrintValue(fActivity));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fActivity);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ActivityStreamingNoNStreaming.Match)) {
          ActivityStreamingNoNStreaming.Match other = (ActivityStreamingNoNStreaming.Match) obj;
          return Objects.equals(fActivity, other.fActivity);
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
    public ActivityStreamingNoNStreaming specification() {
      return ActivityStreamingNoNStreaming.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ActivityStreamingNoNStreaming.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ActivityStreamingNoNStreaming.Match newMutableMatch(final Activity pActivity) {
      return new Mutable(pActivity);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ActivityStreamingNoNStreaming.Match newMatch(final Activity pActivity) {
      return new Immutable(pActivity);
    }
    
    private static final class Mutable extends ActivityStreamingNoNStreaming.Match {
      Mutable(final Activity pActivity) {
        super(pActivity);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ActivityStreamingNoNStreaming.Match {
      Immutable(final Activity pActivity) {
        super(pActivity);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.activityStreamingNoNStreaming pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern activityStreamingNoNStreaming(activity : Activity) {
   * 	find sysml.streaming(activity, _);
   * 	find sysml.nonStreaming(activity, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ActivityStreamingNoNStreaming
   * 
   */
  public static class Matcher extends BaseMatcher<ActivityStreamingNoNStreaming.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ActivityStreamingNoNStreaming.Matcher on(final ViatraQueryEngine engine) {
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
    public static ActivityStreamingNoNStreaming.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTIVITY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ActivityStreamingNoNStreaming.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ActivityStreamingNoNStreaming.Match> getAllMatches(final Activity pActivity) {
      return rawStreamAllMatches(new Object[]{pActivity}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ActivityStreamingNoNStreaming.Match> streamAllMatches(final Activity pActivity) {
      return rawStreamAllMatches(new Object[]{pActivity});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ActivityStreamingNoNStreaming.Match> getOneArbitraryMatch(final Activity pActivity) {
      return rawGetOneArbitraryMatch(new Object[]{pActivity});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Activity pActivity) {
      return rawHasMatch(new Object[]{pActivity});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Activity pActivity) {
      return rawCountMatches(new Object[]{pActivity});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Activity pActivity, final Consumer<? super ActivityStreamingNoNStreaming.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pActivity}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivity the fixed value of pattern parameter activity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ActivityStreamingNoNStreaming.Match newMatch(final Activity pActivity) {
      return ActivityStreamingNoNStreaming.Match.newMatch(pActivity);
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
    
    @Override
    protected ActivityStreamingNoNStreaming.Match tupleToMatch(final Tuple t) {
      try {
          return ActivityStreamingNoNStreaming.Match.newMatch((Activity) t.get(POSITION_ACTIVITY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActivityStreamingNoNStreaming.Match arrayToMatch(final Object[] match) {
      try {
          return ActivityStreamingNoNStreaming.Match.newMatch((Activity) match[POSITION_ACTIVITY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActivityStreamingNoNStreaming.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ActivityStreamingNoNStreaming.Match.newMutableMatch((Activity) match[POSITION_ACTIVITY]);
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
    public static IQuerySpecification<ActivityStreamingNoNStreaming.Matcher> querySpecification() {
      return ActivityStreamingNoNStreaming.instance();
    }
  }
  
  private ActivityStreamingNoNStreaming() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ActivityStreamingNoNStreaming instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ActivityStreamingNoNStreaming.Matcher instantiate(final ViatraQueryEngine engine) {
    return ActivityStreamingNoNStreaming.Matcher.on(engine);
  }
  
  @Override
  public ActivityStreamingNoNStreaming.Matcher instantiate() {
    return ActivityStreamingNoNStreaming.Matcher.create();
  }
  
  @Override
  public ActivityStreamingNoNStreaming.Match newEmptyMatch() {
    return ActivityStreamingNoNStreaming.Match.newEmptyMatch();
  }
  
  @Override
  public ActivityStreamingNoNStreaming.Match newMatch(final Object... parameters) {
    return ActivityStreamingNoNStreaming.Match.newMatch((com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ActivityStreamingNoNStreaming} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ActivityStreamingNoNStreaming#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ActivityStreamingNoNStreaming INSTANCE = new ActivityStreamingNoNStreaming();
    
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
    private static final ActivityStreamingNoNStreaming.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_activity = new PParameter("activity", "com.nomagic.uml2.ext.magicdraw.activities.mdfundamentalactivities.Activity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_activity);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.activityStreamingNoNStreaming";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("activity");
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
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Activity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_activity, parameter_activity)
          ));
          // 	find sysml.streaming(activity, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_activity, var___0_), Streaming.instance().getInternalQueryRepresentation());
          // 	find sysml.nonStreaming(activity, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_activity, var___1_), NonStreaming.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
