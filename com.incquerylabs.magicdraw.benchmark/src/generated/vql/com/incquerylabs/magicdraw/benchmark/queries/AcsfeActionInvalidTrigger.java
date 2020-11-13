/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.TriggerEventIsChangeStructuralFeatureEvent;
import com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         pattern acsfeActionInvalidTrigger(action : AcceptEventAction) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction(action, _);
 *         	AcceptEventAction.trigger(action, trigger);
 *         	neg find triggerEventIsChangeStructuralFeatureEvent(trigger);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AcsfeActionInvalidTrigger extends BaseGeneratedEMFQuerySpecification<AcsfeActionInvalidTrigger.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.acsfeActionInvalidTrigger pattern,
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
    private AcceptEventAction fAction;
    
    private static List<String> parameterNames = makeImmutableList("action");
    
    private Match(final AcceptEventAction pAction) {
      this.fAction = pAction;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "action": return this.fAction;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAction;
          default: return null;
      }
    }
    
    public AcceptEventAction getAction() {
      return this.fAction;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("action".equals(parameterName) ) {
          this.fAction = (AcceptEventAction) newValue;
          return true;
      }
      return false;
    }
    
    public void setAction(final AcceptEventAction pAction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAction = pAction;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.acsfeActionInvalidTrigger";
    }
    
    @Override
    public List<String> parameterNames() {
      return AcsfeActionInvalidTrigger.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAction};
    }
    
    @Override
    public AcsfeActionInvalidTrigger.Match toImmutable() {
      return isMutable() ? newMatch(fAction) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"action\"=" + prettyPrintValue(fAction));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAction);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AcsfeActionInvalidTrigger.Match)) {
          AcsfeActionInvalidTrigger.Match other = (AcsfeActionInvalidTrigger.Match) obj;
          return Objects.equals(fAction, other.fAction);
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
    public AcsfeActionInvalidTrigger specification() {
      return AcsfeActionInvalidTrigger.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AcsfeActionInvalidTrigger.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AcsfeActionInvalidTrigger.Match newMutableMatch(final AcceptEventAction pAction) {
      return new Mutable(pAction);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AcsfeActionInvalidTrigger.Match newMatch(final AcceptEventAction pAction) {
      return new Immutable(pAction);
    }
    
    private static final class Mutable extends AcsfeActionInvalidTrigger.Match {
      Mutable(final AcceptEventAction pAction) {
        super(pAction);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AcsfeActionInvalidTrigger.Match {
      Immutable(final AcceptEventAction pAction) {
        super(pAction);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.acsfeActionInvalidTrigger pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern acsfeActionInvalidTrigger(action : AcceptEventAction) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction(action, _);
   * 	AcceptEventAction.trigger(action, trigger);
   * 	neg find triggerEventIsChangeStructuralFeatureEvent(trigger);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AcsfeActionInvalidTrigger
   * 
   */
  public static class Matcher extends BaseMatcher<AcsfeActionInvalidTrigger.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AcsfeActionInvalidTrigger.Matcher on(final ViatraQueryEngine engine) {
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
    public static AcsfeActionInvalidTrigger.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AcsfeActionInvalidTrigger.Matcher.class);
    
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
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AcsfeActionInvalidTrigger.Match> getAllMatches(final AcceptEventAction pAction) {
      return rawStreamAllMatches(new Object[]{pAction}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AcsfeActionInvalidTrigger.Match> streamAllMatches(final AcceptEventAction pAction) {
      return rawStreamAllMatches(new Object[]{pAction});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AcsfeActionInvalidTrigger.Match> getOneArbitraryMatch(final AcceptEventAction pAction) {
      return rawGetOneArbitraryMatch(new Object[]{pAction});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final AcceptEventAction pAction) {
      return rawHasMatch(new Object[]{pAction});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final AcceptEventAction pAction) {
      return rawCountMatches(new Object[]{pAction});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final AcceptEventAction pAction, final Consumer<? super AcsfeActionInvalidTrigger.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAction}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AcsfeActionInvalidTrigger.Match newMatch(final AcceptEventAction pAction) {
      return AcsfeActionInvalidTrigger.Match.newMatch(pAction);
    }
    
    /**
     * Retrieve the set of values that occur in matches for action.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<AcceptEventAction> rawStreamAllValuesOfaction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTION, parameters).map(AcceptEventAction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for action.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AcceptEventAction> getAllValuesOfaction() {
      return rawStreamAllValuesOfaction(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for action.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<AcceptEventAction> streamAllValuesOfaction() {
      return rawStreamAllValuesOfaction(emptyArray());
    }
    
    @Override
    protected AcsfeActionInvalidTrigger.Match tupleToMatch(final Tuple t) {
      try {
          return AcsfeActionInvalidTrigger.Match.newMatch((AcceptEventAction) t.get(POSITION_ACTION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AcsfeActionInvalidTrigger.Match arrayToMatch(final Object[] match) {
      try {
          return AcsfeActionInvalidTrigger.Match.newMatch((AcceptEventAction) match[POSITION_ACTION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AcsfeActionInvalidTrigger.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AcsfeActionInvalidTrigger.Match.newMutableMatch((AcceptEventAction) match[POSITION_ACTION]);
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
    public static IQuerySpecification<AcsfeActionInvalidTrigger.Matcher> querySpecification() {
      return AcsfeActionInvalidTrigger.instance();
    }
  }
  
  private AcsfeActionInvalidTrigger() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AcsfeActionInvalidTrigger instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AcsfeActionInvalidTrigger.Matcher instantiate(final ViatraQueryEngine engine) {
    return AcsfeActionInvalidTrigger.Matcher.on(engine);
  }
  
  @Override
  public AcsfeActionInvalidTrigger.Matcher instantiate() {
    return AcsfeActionInvalidTrigger.Matcher.create();
  }
  
  @Override
  public AcsfeActionInvalidTrigger.Match newEmptyMatch() {
    return AcsfeActionInvalidTrigger.Match.newEmptyMatch();
  }
  
  @Override
  public AcsfeActionInvalidTrigger.Match newMatch(final Object... parameters) {
    return AcsfeActionInvalidTrigger.Match.newMatch((com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AcsfeActionInvalidTrigger} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AcsfeActionInvalidTrigger#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AcsfeActionInvalidTrigger INSTANCE = new AcsfeActionInvalidTrigger();
    
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
    private static final AcsfeActionInvalidTrigger.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_action = new PParameter("action", "com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "AcceptEventAction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_action);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.acsfeActionInvalidTrigger";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("action");
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
          PVariable var_action = body.getOrCreateVariableByName("action");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_trigger = body.getOrCreateVariableByName("trigger");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "AcceptEventAction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_action, parameter_action)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AcceptChangeStructuralFeatureEventAction(action, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_action, var___0_), AcceptChangeStructuralFeatureEventAction.instance().getInternalQueryRepresentation());
          // 	AcceptEventAction.trigger(action, trigger)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "AcceptEventAction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "AcceptEventAction", "trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Trigger")));
          new Equality(body, var__virtual_0_, var_trigger);
          // 	neg find triggerEventIsChangeStructuralFeatureEvent(trigger)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_trigger), TriggerEventIsChangeStructuralFeatureEvent.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
