/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/WarmUpQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdpowertypes.GeneralizationSet;
import com.nomagic.uml2.ext.magicdraw.mdusecases.Actor;
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
 *         pattern actorGeneralization(actor : Actor, generalActor : GeneralizationSet) {
 *         	Actor.generalization.generalizationSet(actor, generalActor);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ActorGeneralization extends BaseGeneratedEMFQuerySpecification<ActorGeneralization.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.actorGeneralization pattern,
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
    private Actor fActor;
    
    private GeneralizationSet fGeneralActor;
    
    private static List<String> parameterNames = makeImmutableList("actor", "generalActor");
    
    private Match(final Actor pActor, final GeneralizationSet pGeneralActor) {
      this.fActor = pActor;
      this.fGeneralActor = pGeneralActor;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "actor": return this.fActor;
          case "generalActor": return this.fGeneralActor;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fActor;
          case 1: return this.fGeneralActor;
          default: return null;
      }
    }
    
    public Actor getActor() {
      return this.fActor;
    }
    
    public GeneralizationSet getGeneralActor() {
      return this.fGeneralActor;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("actor".equals(parameterName) ) {
          this.fActor = (Actor) newValue;
          return true;
      }
      if ("generalActor".equals(parameterName) ) {
          this.fGeneralActor = (GeneralizationSet) newValue;
          return true;
      }
      return false;
    }
    
    public void setActor(final Actor pActor) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActor = pActor;
    }
    
    public void setGeneralActor(final GeneralizationSet pGeneralActor) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGeneralActor = pGeneralActor;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.actorGeneralization";
    }
    
    @Override
    public List<String> parameterNames() {
      return ActorGeneralization.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fActor, fGeneralActor};
    }
    
    @Override
    public ActorGeneralization.Match toImmutable() {
      return isMutable() ? newMatch(fActor, fGeneralActor) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"actor\"=" + prettyPrintValue(fActor) + ", ");
      result.append("\"generalActor\"=" + prettyPrintValue(fGeneralActor));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fActor, fGeneralActor);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ActorGeneralization.Match)) {
          ActorGeneralization.Match other = (ActorGeneralization.Match) obj;
          return Objects.equals(fActor, other.fActor) && Objects.equals(fGeneralActor, other.fGeneralActor);
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
    public ActorGeneralization specification() {
      return ActorGeneralization.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ActorGeneralization.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ActorGeneralization.Match newMutableMatch(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return new Mutable(pActor, pGeneralActor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ActorGeneralization.Match newMatch(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return new Immutable(pActor, pGeneralActor);
    }
    
    private static final class Mutable extends ActorGeneralization.Match {
      Mutable(final Actor pActor, final GeneralizationSet pGeneralActor) {
        super(pActor, pGeneralActor);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ActorGeneralization.Match {
      Immutable(final Actor pActor, final GeneralizationSet pGeneralActor) {
        super(pActor, pGeneralActor);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.actorGeneralization pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern actorGeneralization(actor : Actor, generalActor : GeneralizationSet) {
   * 	Actor.generalization.generalizationSet(actor, generalActor);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ActorGeneralization
   * 
   */
  public static class Matcher extends BaseMatcher<ActorGeneralization.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ActorGeneralization.Matcher on(final ViatraQueryEngine engine) {
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
    public static ActorGeneralization.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTOR = 0;
    
    private static final int POSITION_GENERALACTOR = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ActorGeneralization.Matcher.class);
    
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
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ActorGeneralization.Match> getAllMatches(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return rawStreamAllMatches(new Object[]{pActor, pGeneralActor}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ActorGeneralization.Match> streamAllMatches(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return rawStreamAllMatches(new Object[]{pActor, pGeneralActor});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ActorGeneralization.Match> getOneArbitraryMatch(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return rawGetOneArbitraryMatch(new Object[]{pActor, pGeneralActor});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return rawHasMatch(new Object[]{pActor, pGeneralActor});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return rawCountMatches(new Object[]{pActor, pGeneralActor});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Actor pActor, final GeneralizationSet pGeneralActor, final Consumer<? super ActorGeneralization.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pActor, pGeneralActor}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActor the fixed value of pattern parameter actor, or null if not bound.
     * @param pGeneralActor the fixed value of pattern parameter generalActor, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ActorGeneralization.Match newMatch(final Actor pActor, final GeneralizationSet pGeneralActor) {
      return ActorGeneralization.Match.newMatch(pActor, pGeneralActor);
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Actor> rawStreamAllValuesOfactor(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTOR, parameters).map(Actor.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Actor> getAllValuesOfactor() {
      return rawStreamAllValuesOfactor(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Actor> streamAllValuesOfactor() {
      return rawStreamAllValuesOfactor(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Actor> streamAllValuesOfactor(final ActorGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfactor(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Actor> streamAllValuesOfactor(final GeneralizationSet pGeneralActor) {
      return rawStreamAllValuesOfactor(new Object[]{null, pGeneralActor});
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Actor> getAllValuesOfactor(final ActorGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfactor(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for actor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Actor> getAllValuesOfactor(final GeneralizationSet pGeneralActor) {
      return rawStreamAllValuesOfactor(new Object[]{null, pGeneralActor}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<GeneralizationSet> rawStreamAllValuesOfgeneralActor(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GENERALACTOR, parameters).map(GeneralizationSet.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<GeneralizationSet> getAllValuesOfgeneralActor() {
      return rawStreamAllValuesOfgeneralActor(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<GeneralizationSet> streamAllValuesOfgeneralActor() {
      return rawStreamAllValuesOfgeneralActor(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<GeneralizationSet> streamAllValuesOfgeneralActor(final ActorGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfgeneralActor(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<GeneralizationSet> streamAllValuesOfgeneralActor(final Actor pActor) {
      return rawStreamAllValuesOfgeneralActor(new Object[]{pActor, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<GeneralizationSet> getAllValuesOfgeneralActor(final ActorGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfgeneralActor(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for generalActor.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<GeneralizationSet> getAllValuesOfgeneralActor(final Actor pActor) {
      return rawStreamAllValuesOfgeneralActor(new Object[]{pActor, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ActorGeneralization.Match tupleToMatch(final Tuple t) {
      try {
          return ActorGeneralization.Match.newMatch((Actor) t.get(POSITION_ACTOR), (GeneralizationSet) t.get(POSITION_GENERALACTOR));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActorGeneralization.Match arrayToMatch(final Object[] match) {
      try {
          return ActorGeneralization.Match.newMatch((Actor) match[POSITION_ACTOR], (GeneralizationSet) match[POSITION_GENERALACTOR]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActorGeneralization.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ActorGeneralization.Match.newMutableMatch((Actor) match[POSITION_ACTOR], (GeneralizationSet) match[POSITION_GENERALACTOR]);
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
    public static IQuerySpecification<ActorGeneralization.Matcher> querySpecification() {
      return ActorGeneralization.instance();
    }
  }
  
  private ActorGeneralization() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ActorGeneralization instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ActorGeneralization.Matcher instantiate(final ViatraQueryEngine engine) {
    return ActorGeneralization.Matcher.on(engine);
  }
  
  @Override
  public ActorGeneralization.Matcher instantiate() {
    return ActorGeneralization.Matcher.create();
  }
  
  @Override
  public ActorGeneralization.Match newEmptyMatch() {
    return ActorGeneralization.Match.newEmptyMatch();
  }
  
  @Override
  public ActorGeneralization.Match newMatch(final Object... parameters) {
    return ActorGeneralization.Match.newMatch((com.nomagic.uml2.ext.magicdraw.mdusecases.Actor) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdpowertypes.GeneralizationSet) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ActorGeneralization} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ActorGeneralization#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ActorGeneralization INSTANCE = new ActorGeneralization();
    
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
    private static final ActorGeneralization.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_actor = new PParameter("actor", "com.nomagic.uml2.ext.magicdraw.mdusecases.Actor", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Actor")), PParameterDirection.INOUT);
    
    private final PParameter parameter_generalActor = new PParameter("generalActor", "com.nomagic.uml2.ext.magicdraw.classes.mdpowertypes.GeneralizationSet", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "GeneralizationSet")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_actor, parameter_generalActor);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.actorGeneralization";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("actor","generalActor");
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
          PVariable var_actor = body.getOrCreateVariableByName("actor");
          PVariable var_generalActor = body.getOrCreateVariableByName("generalActor");
          new TypeConstraint(body, Tuples.flatTupleOf(var_actor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Actor")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_generalActor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "GeneralizationSet")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_actor, parameter_actor),
             new ExportedParameter(body, var_generalActor, parameter_generalActor)
          ));
          // 	Actor.generalization.generalizationSet(actor, generalActor)
          new TypeConstraint(body, Tuples.flatTupleOf(var_actor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Actor")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_actor, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier", "generalization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Generalization")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Generalization", "generalizationSet")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "GeneralizationSet")));
          new Equality(body, var__virtual_1_, var_generalActor);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
