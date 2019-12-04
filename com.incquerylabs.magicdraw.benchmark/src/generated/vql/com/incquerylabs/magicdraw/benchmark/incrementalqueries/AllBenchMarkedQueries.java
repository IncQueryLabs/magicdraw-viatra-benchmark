/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.AlphabeticalDependencies;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.BlocksOrRequirementsOrConstraints;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.CircularDependencies;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.LoopTransitionWithTriggerEffectEventNoGuard;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitionPointingOutOfCompState;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitiveSubstatesWithCheck3;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern allBenchMarkedQueries(param : NamedElement) {
 *         	find blocksOrRequirementsOrConstraints(param);
 *         } or {
 *         	find transitiveSubstatesWithCheck3(param, _);
 *         } or {
 *         	find alphabeticalDependencies(param, _);
 *         } or {
 *         	find circularDependencies(param);
 *         } or {
 *         	find loopTransitionWithTriggerEffectEventNoGuard(param, _, _, _, _);
 *         } or {
 *         	find transitionPointingOutOfCompState(param, _, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AllBenchMarkedQueries extends BaseGeneratedEMFQuerySpecification<AllBenchMarkedQueries.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.allBenchMarkedQueries pattern,
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
    private NamedElement fParam;
    
    private static List<String> parameterNames = makeImmutableList("param");
    
    private Match(final NamedElement pParam) {
      this.fParam = pParam;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "param": return this.fParam;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fParam;
          default: return null;
      }
    }
    
    public NamedElement getParam() {
      return this.fParam;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("param".equals(parameterName) ) {
          this.fParam = (NamedElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setParam(final NamedElement pParam) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParam = pParam;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.allBenchMarkedQueries";
    }
    
    @Override
    public List<String> parameterNames() {
      return AllBenchMarkedQueries.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fParam};
    }
    
    @Override
    public AllBenchMarkedQueries.Match toImmutable() {
      return isMutable() ? newMatch(fParam) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"param\"=" + prettyPrintValue(fParam));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fParam);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AllBenchMarkedQueries.Match)) {
          AllBenchMarkedQueries.Match other = (AllBenchMarkedQueries.Match) obj;
          return Objects.equals(fParam, other.fParam);
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
    public AllBenchMarkedQueries specification() {
      return AllBenchMarkedQueries.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AllBenchMarkedQueries.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AllBenchMarkedQueries.Match newMutableMatch(final NamedElement pParam) {
      return new Mutable(pParam);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AllBenchMarkedQueries.Match newMatch(final NamedElement pParam) {
      return new Immutable(pParam);
    }
    
    private static final class Mutable extends AllBenchMarkedQueries.Match {
      Mutable(final NamedElement pParam) {
        super(pParam);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AllBenchMarkedQueries.Match {
      Immutable(final NamedElement pParam) {
        super(pParam);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.incrementalqueries.allBenchMarkedQueries pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern allBenchMarkedQueries(param : NamedElement) {
   * 	find blocksOrRequirementsOrConstraints(param);
   * } or {
   * 	find transitiveSubstatesWithCheck3(param, _);
   * } or {
   * 	find alphabeticalDependencies(param, _);
   * } or {
   * 	find circularDependencies(param);
   * } or {
   * 	find loopTransitionWithTriggerEffectEventNoGuard(param, _, _, _, _);
   * } or {
   * 	find transitionPointingOutOfCompState(param, _, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AllBenchMarkedQueries
   * 
   */
  public static class Matcher extends BaseMatcher<AllBenchMarkedQueries.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AllBenchMarkedQueries.Matcher on(final ViatraQueryEngine engine) {
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
    public static AllBenchMarkedQueries.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PARAM = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllBenchMarkedQueries.Matcher.class);
    
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
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AllBenchMarkedQueries.Match> getAllMatches(final NamedElement pParam) {
      return rawStreamAllMatches(new Object[]{pParam}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AllBenchMarkedQueries.Match> streamAllMatches(final NamedElement pParam) {
      return rawStreamAllMatches(new Object[]{pParam});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AllBenchMarkedQueries.Match> getOneArbitraryMatch(final NamedElement pParam) {
      return rawGetOneArbitraryMatch(new Object[]{pParam});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pParam) {
      return rawHasMatch(new Object[]{pParam});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pParam) {
      return rawCountMatches(new Object[]{pParam});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pParam, final Consumer<? super AllBenchMarkedQueries.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pParam}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParam the fixed value of pattern parameter param, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AllBenchMarkedQueries.Match newMatch(final NamedElement pParam) {
      return AllBenchMarkedQueries.Match.newMatch(pParam);
    }
    
    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfparam(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARAM, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfparam() {
      return rawStreamAllValuesOfparam(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for param.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfparam() {
      return rawStreamAllValuesOfparam(emptyArray());
    }
    
    @Override
    protected AllBenchMarkedQueries.Match tupleToMatch(final Tuple t) {
      try {
          return AllBenchMarkedQueries.Match.newMatch((NamedElement) t.get(POSITION_PARAM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllBenchMarkedQueries.Match arrayToMatch(final Object[] match) {
      try {
          return AllBenchMarkedQueries.Match.newMatch((NamedElement) match[POSITION_PARAM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllBenchMarkedQueries.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AllBenchMarkedQueries.Match.newMutableMatch((NamedElement) match[POSITION_PARAM]);
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
    public static IQuerySpecification<AllBenchMarkedQueries.Matcher> querySpecification() {
      return AllBenchMarkedQueries.instance();
    }
  }
  
  private AllBenchMarkedQueries() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AllBenchMarkedQueries instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllBenchMarkedQueries.Matcher instantiate(final ViatraQueryEngine engine) {
    return AllBenchMarkedQueries.Matcher.on(engine);
  }
  
  @Override
  public AllBenchMarkedQueries.Matcher instantiate() {
    return AllBenchMarkedQueries.Matcher.create();
  }
  
  @Override
  public AllBenchMarkedQueries.Match newEmptyMatch() {
    return AllBenchMarkedQueries.Match.newEmptyMatch();
  }
  
  @Override
  public AllBenchMarkedQueries.Match newMatch(final Object... parameters) {
    return AllBenchMarkedQueries.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AllBenchMarkedQueries} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AllBenchMarkedQueries#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AllBenchMarkedQueries INSTANCE = new AllBenchMarkedQueries();
    
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
    private static final AllBenchMarkedQueries.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_param = new PParameter("param", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_param);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.incrementalqueries.allBenchMarkedQueries";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("param");
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
          PVariable var_param = body.getOrCreateVariableByName("param");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	find blocksOrRequirementsOrConstraints(param)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param), BlocksOrRequirementsOrConstraints.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	find transitiveSubstatesWithCheck3(param, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param, var___0_), TransitiveSubstatesWithCheck3.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	find alphabeticalDependencies(param, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param, var___0_), AlphabeticalDependencies.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_param = body.getOrCreateVariableByName("param");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	find circularDependencies(param)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param), CircularDependencies.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	find loopTransitionWithTriggerEffectEventNoGuard(param, _, _, _, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param, var___0_, var___1_, var___2_, var___3_), LoopTransitionWithTriggerEffectEventNoGuard.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_param = body.getOrCreateVariableByName("param");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_param), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_param, parameter_param)
          ));
          // 	find transitionPointingOutOfCompState(param, _, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_param, var___0_, var___1_), TransitionPointingOutOfCompState.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
