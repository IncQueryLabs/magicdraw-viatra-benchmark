/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.CorrectActPartNode;
import com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.ActivityPartition;
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
import sysml.AllocateActivityPartition;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern
 *         allocateActivityPartitionActionsOnClientEnds(activityPartition : ActivityPartition) {
 *         	find sysml.AllocateActivityPartition(activityPartition, _);
 *         	ActivityPartition.node(activityPartition, node);
 *         	Action(node);
 *         	neg find correctActPartNode(activityPartition, node);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AllocateActivityPartitionActionsOnClientEnds extends BaseGeneratedEMFQuerySpecification<AllocateActivityPartitionActionsOnClientEnds.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.allocateActivityPartitionActionsOnClientEnds pattern,
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
    private ActivityPartition fActivityPartition;
    
    private static List<String> parameterNames = makeImmutableList("activityPartition");
    
    private Match(final ActivityPartition pActivityPartition) {
      this.fActivityPartition = pActivityPartition;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "activityPartition": return this.fActivityPartition;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fActivityPartition;
          default: return null;
      }
    }
    
    public ActivityPartition getActivityPartition() {
      return this.fActivityPartition;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("activityPartition".equals(parameterName) ) {
          this.fActivityPartition = (ActivityPartition) newValue;
          return true;
      }
      return false;
    }
    
    public void setActivityPartition(final ActivityPartition pActivityPartition) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fActivityPartition = pActivityPartition;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.allocateActivityPartitionActionsOnClientEnds";
    }
    
    @Override
    public List<String> parameterNames() {
      return AllocateActivityPartitionActionsOnClientEnds.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fActivityPartition};
    }
    
    @Override
    public AllocateActivityPartitionActionsOnClientEnds.Match toImmutable() {
      return isMutable() ? newMatch(fActivityPartition) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"activityPartition\"=" + prettyPrintValue(fActivityPartition));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fActivityPartition);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AllocateActivityPartitionActionsOnClientEnds.Match)) {
          AllocateActivityPartitionActionsOnClientEnds.Match other = (AllocateActivityPartitionActionsOnClientEnds.Match) obj;
          return Objects.equals(fActivityPartition, other.fActivityPartition);
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
    public AllocateActivityPartitionActionsOnClientEnds specification() {
      return AllocateActivityPartitionActionsOnClientEnds.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AllocateActivityPartitionActionsOnClientEnds.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AllocateActivityPartitionActionsOnClientEnds.Match newMutableMatch(final ActivityPartition pActivityPartition) {
      return new Mutable(pActivityPartition);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AllocateActivityPartitionActionsOnClientEnds.Match newMatch(final ActivityPartition pActivityPartition) {
      return new Immutable(pActivityPartition);
    }
    
    private static final class Mutable extends AllocateActivityPartitionActionsOnClientEnds.Match {
      Mutable(final ActivityPartition pActivityPartition) {
        super(pActivityPartition);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AllocateActivityPartitionActionsOnClientEnds.Match {
      Immutable(final ActivityPartition pActivityPartition) {
        super(pActivityPartition);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.allocateActivityPartitionActionsOnClientEnds pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern
   * allocateActivityPartitionActionsOnClientEnds(activityPartition : ActivityPartition) {
   * 	find sysml.AllocateActivityPartition(activityPartition, _);
   * 	ActivityPartition.node(activityPartition, node);
   * 	Action(node);
   * 	neg find correctActPartNode(activityPartition, node);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AllocateActivityPartitionActionsOnClientEnds
   * 
   */
  public static class Matcher extends BaseMatcher<AllocateActivityPartitionActionsOnClientEnds.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AllocateActivityPartitionActionsOnClientEnds.Matcher on(final ViatraQueryEngine engine) {
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
    public static AllocateActivityPartitionActionsOnClientEnds.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTIVITYPARTITION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllocateActivityPartitionActionsOnClientEnds.Matcher.class);
    
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
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AllocateActivityPartitionActionsOnClientEnds.Match> getAllMatches(final ActivityPartition pActivityPartition) {
      return rawStreamAllMatches(new Object[]{pActivityPartition}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AllocateActivityPartitionActionsOnClientEnds.Match> streamAllMatches(final ActivityPartition pActivityPartition) {
      return rawStreamAllMatches(new Object[]{pActivityPartition});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AllocateActivityPartitionActionsOnClientEnds.Match> getOneArbitraryMatch(final ActivityPartition pActivityPartition) {
      return rawGetOneArbitraryMatch(new Object[]{pActivityPartition});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ActivityPartition pActivityPartition) {
      return rawHasMatch(new Object[]{pActivityPartition});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ActivityPartition pActivityPartition) {
      return rawCountMatches(new Object[]{pActivityPartition});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ActivityPartition pActivityPartition, final Consumer<? super AllocateActivityPartitionActionsOnClientEnds.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pActivityPartition}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pActivityPartition the fixed value of pattern parameter activityPartition, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AllocateActivityPartitionActionsOnClientEnds.Match newMatch(final ActivityPartition pActivityPartition) {
      return AllocateActivityPartitionActionsOnClientEnds.Match.newMatch(pActivityPartition);
    }
    
    /**
     * Retrieve the set of values that occur in matches for activityPartition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ActivityPartition> rawStreamAllValuesOfactivityPartition(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTIVITYPARTITION, parameters).map(ActivityPartition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for activityPartition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ActivityPartition> getAllValuesOfactivityPartition() {
      return rawStreamAllValuesOfactivityPartition(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for activityPartition.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ActivityPartition> streamAllValuesOfactivityPartition() {
      return rawStreamAllValuesOfactivityPartition(emptyArray());
    }
    
    @Override
    protected AllocateActivityPartitionActionsOnClientEnds.Match tupleToMatch(final Tuple t) {
      try {
          return AllocateActivityPartitionActionsOnClientEnds.Match.newMatch((ActivityPartition) t.get(POSITION_ACTIVITYPARTITION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllocateActivityPartitionActionsOnClientEnds.Match arrayToMatch(final Object[] match) {
      try {
          return AllocateActivityPartitionActionsOnClientEnds.Match.newMatch((ActivityPartition) match[POSITION_ACTIVITYPARTITION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllocateActivityPartitionActionsOnClientEnds.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AllocateActivityPartitionActionsOnClientEnds.Match.newMutableMatch((ActivityPartition) match[POSITION_ACTIVITYPARTITION]);
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
    public static IQuerySpecification<AllocateActivityPartitionActionsOnClientEnds.Matcher> querySpecification() {
      return AllocateActivityPartitionActionsOnClientEnds.instance();
    }
  }
  
  private AllocateActivityPartitionActionsOnClientEnds() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AllocateActivityPartitionActionsOnClientEnds instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllocateActivityPartitionActionsOnClientEnds.Matcher instantiate(final ViatraQueryEngine engine) {
    return AllocateActivityPartitionActionsOnClientEnds.Matcher.on(engine);
  }
  
  @Override
  public AllocateActivityPartitionActionsOnClientEnds.Matcher instantiate() {
    return AllocateActivityPartitionActionsOnClientEnds.Matcher.create();
  }
  
  @Override
  public AllocateActivityPartitionActionsOnClientEnds.Match newEmptyMatch() {
    return AllocateActivityPartitionActionsOnClientEnds.Match.newEmptyMatch();
  }
  
  @Override
  public AllocateActivityPartitionActionsOnClientEnds.Match newMatch(final Object... parameters) {
    return AllocateActivityPartitionActionsOnClientEnds.Match.newMatch((com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.ActivityPartition) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AllocateActivityPartitionActionsOnClientEnds} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AllocateActivityPartitionActionsOnClientEnds#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AllocateActivityPartitionActionsOnClientEnds INSTANCE = new AllocateActivityPartitionActionsOnClientEnds();
    
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
    private static final AllocateActivityPartitionActionsOnClientEnds.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_activityPartition = new PParameter("activityPartition", "com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.ActivityPartition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityPartition")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_activityPartition);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.allocateActivityPartitionActionsOnClientEnds";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("activityPartition");
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
          PVariable var_activityPartition = body.getOrCreateVariableByName("activityPartition");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_node = body.getOrCreateVariableByName("node");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityPartition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityPartition")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_activityPartition, parameter_activityPartition)
          ));
          // 	find sysml.AllocateActivityPartition(activityPartition, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_activityPartition, var___0_), AllocateActivityPartition.instance().getInternalQueryRepresentation());
          // 	ActivityPartition.node(activityPartition, node)
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityPartition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityPartition")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_activityPartition, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityPartition", "node")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityNode")));
          new Equality(body, var__virtual_0_, var_node);
          // 	Action(node)
          new TypeConstraint(body, Tuples.flatTupleOf(var_node), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Action")));
          // 	neg find correctActPartNode(activityPartition, node)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_activityPartition, var_node), CorrectActPartNode.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
