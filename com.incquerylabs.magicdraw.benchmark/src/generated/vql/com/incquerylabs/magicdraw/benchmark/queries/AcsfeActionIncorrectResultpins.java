/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectTypeAndOrdering;
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
import sysml.AcceptChangeStructuralFeatureEventAction;
import sysml.ChangeStructuralFeatureEvent;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern acsfeActionIncorrectResultpins(action : AcceptEventAction) {
 *         	find sysml.AcceptChangeStructuralFeatureEventAction(action, _);
 *         	find sysml.ChangeStructuralFeatureEvent(event, _);
 *         	AcceptEventAction.trigger(action, trigger);
 *         	Trigger.event(trigger, event);
 *         	AcceptEventAction.result(action, result);
 *         	neg find correctTypeAndOrdering(event, result);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AcsfeActionIncorrectResultpins extends BaseGeneratedEMFQuerySpecification<AcsfeActionIncorrectResultpins.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.acsfeActionIncorrectResultpins pattern,
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
      if ("action".equals(parameterName)) return this.fAction;
      return null;
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
      return "com.incquerylabs.magicdraw.benchmark.queries.acsfeActionIncorrectResultpins";
    }
    
    @Override
    public List<String> parameterNames() {
      return AcsfeActionIncorrectResultpins.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAction};
    }
    
    @Override
    public AcsfeActionIncorrectResultpins.Match toImmutable() {
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
      if ((obj instanceof AcsfeActionIncorrectResultpins.Match)) {
          AcsfeActionIncorrectResultpins.Match other = (AcsfeActionIncorrectResultpins.Match) obj;
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
    public AcsfeActionIncorrectResultpins specification() {
      return AcsfeActionIncorrectResultpins.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AcsfeActionIncorrectResultpins.Match newEmptyMatch() {
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
    public static AcsfeActionIncorrectResultpins.Match newMutableMatch(final AcceptEventAction pAction) {
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
    public static AcsfeActionIncorrectResultpins.Match newMatch(final AcceptEventAction pAction) {
      return new Immutable(pAction);
    }
    
    private static final class Mutable extends AcsfeActionIncorrectResultpins.Match {
      Mutable(final AcceptEventAction pAction) {
        super(pAction);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AcsfeActionIncorrectResultpins.Match {
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
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.acsfeActionIncorrectResultpins pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern acsfeActionIncorrectResultpins(action : AcceptEventAction) {
   * 	find sysml.AcceptChangeStructuralFeatureEventAction(action, _);
   * 	find sysml.ChangeStructuralFeatureEvent(event, _);
   * 	AcceptEventAction.trigger(action, trigger);
   * 	Trigger.event(trigger, event);
   * 	AcceptEventAction.result(action, result);
   * 	neg find correctTypeAndOrdering(event, result);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AcsfeActionIncorrectResultpins
   * 
   */
  public static class Matcher extends BaseMatcher<AcsfeActionIncorrectResultpins.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AcsfeActionIncorrectResultpins.Matcher on(final ViatraQueryEngine engine) {
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
    public static AcsfeActionIncorrectResultpins.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AcsfeActionIncorrectResultpins.Matcher.class);
    
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
    public Collection<AcsfeActionIncorrectResultpins.Match> getAllMatches(final AcceptEventAction pAction) {
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
    public Stream<AcsfeActionIncorrectResultpins.Match> streamAllMatches(final AcceptEventAction pAction) {
      return rawStreamAllMatches(new Object[]{pAction});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AcsfeActionIncorrectResultpins.Match> getOneArbitraryMatch(final AcceptEventAction pAction) {
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
    public boolean forOneArbitraryMatch(final AcceptEventAction pAction, final Consumer<? super AcsfeActionIncorrectResultpins.Match> processor) {
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
    public AcsfeActionIncorrectResultpins.Match newMatch(final AcceptEventAction pAction) {
      return AcsfeActionIncorrectResultpins.Match.newMatch(pAction);
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
    protected AcsfeActionIncorrectResultpins.Match tupleToMatch(final Tuple t) {
      try {
          return AcsfeActionIncorrectResultpins.Match.newMatch((AcceptEventAction) t.get(POSITION_ACTION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AcsfeActionIncorrectResultpins.Match arrayToMatch(final Object[] match) {
      try {
          return AcsfeActionIncorrectResultpins.Match.newMatch((AcceptEventAction) match[POSITION_ACTION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AcsfeActionIncorrectResultpins.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AcsfeActionIncorrectResultpins.Match.newMutableMatch((AcceptEventAction) match[POSITION_ACTION]);
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
    public static IQuerySpecification<AcsfeActionIncorrectResultpins.Matcher> querySpecification() {
      return AcsfeActionIncorrectResultpins.instance();
    }
  }
  
  private AcsfeActionIncorrectResultpins() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AcsfeActionIncorrectResultpins instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AcsfeActionIncorrectResultpins.Matcher instantiate(final ViatraQueryEngine engine) {
    return AcsfeActionIncorrectResultpins.Matcher.on(engine);
  }
  
  @Override
  public AcsfeActionIncorrectResultpins.Matcher instantiate() {
    return AcsfeActionIncorrectResultpins.Matcher.create();
  }
  
  @Override
  public AcsfeActionIncorrectResultpins.Match newEmptyMatch() {
    return AcsfeActionIncorrectResultpins.Match.newEmptyMatch();
  }
  
  @Override
  public AcsfeActionIncorrectResultpins.Match newMatch(final Object... parameters) {
    return AcsfeActionIncorrectResultpins.Match.newMatch((com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionIncorrectResultpins (visibility: PUBLIC, simpleName: AcsfeActionIncorrectResultpins, identifier: com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionIncorrectResultpins, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionIncorrectResultpins (visibility: PUBLIC, simpleName: AcsfeActionIncorrectResultpins, identifier: com.incquerylabs.magicdraw.benchmark.queries.AcsfeActionIncorrectResultpins, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AcsfeActionIncorrectResultpins INSTANCE = new AcsfeActionIncorrectResultpins();
    
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
    private static final AcsfeActionIncorrectResultpins.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_action = new PParameter("action", "com.nomagic.uml2.ext.magicdraw.actions.mdcompleteactions.AcceptEventAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_action);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.acsfeActionIncorrectResultpins";
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
          PVariable var_event = body.getOrCreateVariableByName("event");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_trigger = body.getOrCreateVariableByName("trigger");
          PVariable var_result = body.getOrCreateVariableByName("result");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_action, parameter_action)
          ));
          // 	find sysml.AcceptChangeStructuralFeatureEventAction(action, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_action, var___0_), AcceptChangeStructuralFeatureEventAction.instance().getInternalQueryRepresentation());
          // 	find sysml.ChangeStructuralFeatureEvent(event, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_event, var___1_), ChangeStructuralFeatureEvent.instance().getInternalQueryRepresentation());
          // 	AcceptEventAction.trigger(action, trigger)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction", "trigger")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          new Equality(body, var__virtual_0_, var_trigger);
          // 	Trigger.event(trigger, event)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trigger, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Trigger", "event")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Event")));
          new Equality(body, var__virtual_1_, var_event);
          // 	AcceptEventAction.result(action, result)
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AcceptEventAction", "result")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "OutputPin")));
          new Equality(body, var__virtual_2_, var_result);
          // 	neg find correctTypeAndOrdering(event, result)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_event, var_result), CorrectTypeAndOrdering.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
