/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.Probability;
import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge;
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
 *         pattern probabilityAllOutgoingEdges(activityEdge : ActivityEdge) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.Probability(activityEdge, _);
 *         	ActivityEdge.target(activityEdge, target);
 *         	ActivityNode.incoming(target, edge);
 *         	neg find com.incquerylabs.magicdraw.benchmark.queries.library.Probability(edge, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ProbabilityAllOutgoingEdges extends BaseGeneratedEMFQuerySpecification<ProbabilityAllOutgoingEdges.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.probabilityAllOutgoingEdges pattern,
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
    private ActivityEdge fActivityEdge;
    
    private static List<String> parameterNames = makeImmutableList("activityEdge");
    
    private Match(final ActivityEdge pActivityEdge) {
      this.fActivityEdge = pActivityEdge;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "activityEdge": return this.fActivityEdge;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fActivityEdge;
          default: return null;
      }
    }
    
    public ActivityEdge getActivityEdge() {
      return this.fActivityEdge;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("activityEdge".equals(parameterName) ) {
          this.fActivityEdge = (ActivityEdge) newValue;
          return true;
      }
      return false;
    }
    
    public void setActivityEdge(final ActivityEdge pActivityEdge) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActivityEdge = pActivityEdge;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.probabilityAllOutgoingEdges";
    }
    
    @Override
    public List<String> parameterNames() {
      return ProbabilityAllOutgoingEdges.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fActivityEdge};
    }
    
    @Override
    public ProbabilityAllOutgoingEdges.Match toImmutable() {
      return isMutable() ? newMatch(fActivityEdge) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"activityEdge\"=" + prettyPrintValue(fActivityEdge));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fActivityEdge);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ProbabilityAllOutgoingEdges.Match)) {
          ProbabilityAllOutgoingEdges.Match other = (ProbabilityAllOutgoingEdges.Match) obj;
          return Objects.equals(fActivityEdge, other.fActivityEdge);
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
    public ProbabilityAllOutgoingEdges specification() {
      return ProbabilityAllOutgoingEdges.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ProbabilityAllOutgoingEdges.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ProbabilityAllOutgoingEdges.Match newMutableMatch(final ActivityEdge pActivityEdge) {
      return new Mutable(pActivityEdge);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ProbabilityAllOutgoingEdges.Match newMatch(final ActivityEdge pActivityEdge) {
      return new Immutable(pActivityEdge);
    }
    
    private static final class Mutable extends ProbabilityAllOutgoingEdges.Match {
      Mutable(final ActivityEdge pActivityEdge) {
        super(pActivityEdge);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ProbabilityAllOutgoingEdges.Match {
      Immutable(final ActivityEdge pActivityEdge) {
        super(pActivityEdge);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.probabilityAllOutgoingEdges pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern probabilityAllOutgoingEdges(activityEdge : ActivityEdge) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.Probability(activityEdge, _);
   * 	ActivityEdge.target(activityEdge, target);
   * 	ActivityNode.incoming(target, edge);
   * 	neg find com.incquerylabs.magicdraw.benchmark.queries.library.Probability(edge, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ProbabilityAllOutgoingEdges
   * 
   */
  public static class Matcher extends BaseMatcher<ProbabilityAllOutgoingEdges.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ProbabilityAllOutgoingEdges.Matcher on(final ViatraQueryEngine engine) {
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
    public static ProbabilityAllOutgoingEdges.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTIVITYEDGE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ProbabilityAllOutgoingEdges.Matcher.class);
    
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
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ProbabilityAllOutgoingEdges.Match> getAllMatches(final ActivityEdge pActivityEdge) {
      return rawStreamAllMatches(new Object[]{pActivityEdge}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ProbabilityAllOutgoingEdges.Match> streamAllMatches(final ActivityEdge pActivityEdge) {
      return rawStreamAllMatches(new Object[]{pActivityEdge});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ProbabilityAllOutgoingEdges.Match> getOneArbitraryMatch(final ActivityEdge pActivityEdge) {
      return rawGetOneArbitraryMatch(new Object[]{pActivityEdge});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ActivityEdge pActivityEdge) {
      return rawHasMatch(new Object[]{pActivityEdge});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ActivityEdge pActivityEdge) {
      return rawCountMatches(new Object[]{pActivityEdge});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ActivityEdge pActivityEdge, final Consumer<? super ProbabilityAllOutgoingEdges.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pActivityEdge}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivityEdge the fixed value of pattern parameter activityEdge, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ProbabilityAllOutgoingEdges.Match newMatch(final ActivityEdge pActivityEdge) {
      return ProbabilityAllOutgoingEdges.Match.newMatch(pActivityEdge);
    }
    
    /**
     * Retrieve the set of values that occur in matches for activityEdge.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ActivityEdge> rawStreamAllValuesOfactivityEdge(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTIVITYEDGE, parameters).map(ActivityEdge.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for activityEdge.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ActivityEdge> getAllValuesOfactivityEdge() {
      return rawStreamAllValuesOfactivityEdge(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for activityEdge.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ActivityEdge> streamAllValuesOfactivityEdge() {
      return rawStreamAllValuesOfactivityEdge(emptyArray());
    }
    
    @Override
    protected ProbabilityAllOutgoingEdges.Match tupleToMatch(final Tuple t) {
      try {
          return ProbabilityAllOutgoingEdges.Match.newMatch((ActivityEdge) t.get(POSITION_ACTIVITYEDGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ProbabilityAllOutgoingEdges.Match arrayToMatch(final Object[] match) {
      try {
          return ProbabilityAllOutgoingEdges.Match.newMatch((ActivityEdge) match[POSITION_ACTIVITYEDGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ProbabilityAllOutgoingEdges.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ProbabilityAllOutgoingEdges.Match.newMutableMatch((ActivityEdge) match[POSITION_ACTIVITYEDGE]);
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
    public static IQuerySpecification<ProbabilityAllOutgoingEdges.Matcher> querySpecification() {
      return ProbabilityAllOutgoingEdges.instance();
    }
  }
  
  private ProbabilityAllOutgoingEdges() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ProbabilityAllOutgoingEdges instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ProbabilityAllOutgoingEdges.Matcher instantiate(final ViatraQueryEngine engine) {
    return ProbabilityAllOutgoingEdges.Matcher.on(engine);
  }
  
  @Override
  public ProbabilityAllOutgoingEdges.Matcher instantiate() {
    return ProbabilityAllOutgoingEdges.Matcher.create();
  }
  
  @Override
  public ProbabilityAllOutgoingEdges.Match newEmptyMatch() {
    return ProbabilityAllOutgoingEdges.Match.newEmptyMatch();
  }
  
  @Override
  public ProbabilityAllOutgoingEdges.Match newMatch(final Object... parameters) {
    return ProbabilityAllOutgoingEdges.Match.newMatch((com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ProbabilityAllOutgoingEdges} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ProbabilityAllOutgoingEdges#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ProbabilityAllOutgoingEdges INSTANCE = new ProbabilityAllOutgoingEdges();
    
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
    private static final ProbabilityAllOutgoingEdges.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_activityEdge = new PParameter("activityEdge", "com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ActivityEdge", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityEdge")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_activityEdge);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.probabilityAllOutgoingEdges";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("activityEdge");
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
          PVariable var_activityEdge = body.getOrCreateVariableByName("activityEdge");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_target = body.getOrCreateVariableByName("target");
          PVariable var_edge = body.getOrCreateVariableByName("edge");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityEdge), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityEdge")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_activityEdge, parameter_activityEdge)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.Probability(activityEdge, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_activityEdge, var___0_), Probability.instance().getInternalQueryRepresentation());
          // 	ActivityEdge.target(activityEdge, target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityEdge), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityEdge")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityEdge, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityEdge", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityNode")));
          new Equality(body, var__virtual_0_, var_target);
          // 	ActivityNode.incoming(target, edge)
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityNode")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_target, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityNode", "incoming")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ActivityEdge")));
          new Equality(body, var__virtual_1_, var_edge);
          // 	neg find com.incquerylabs.magicdraw.benchmark.queries.library.Probability(edge, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_edge, var___1_), Probability.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}