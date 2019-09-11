/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface;
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
import sysml.FlowSpecification;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern flowSpecificationDeprecated(flowSpec : Interface) {
 *         	find sysml.FlowSpecification(flowSpec, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FlowSpecificationDeprecated extends BaseGeneratedEMFQuerySpecification<FlowSpecificationDeprecated.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.flowSpecificationDeprecated pattern,
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
    private Interface fFlowSpec;
    
    private static List<String> parameterNames = makeImmutableList("flowSpec");
    
    private Match(final Interface pFlowSpec) {
      this.fFlowSpec = pFlowSpec;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "flowSpec": return this.fFlowSpec;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFlowSpec;
          default: return null;
      }
    }
    
    public Interface getFlowSpec() {
      return this.fFlowSpec;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("flowSpec".equals(parameterName) ) {
          this.fFlowSpec = (Interface) newValue;
          return true;
      }
      return false;
    }
    
    public void setFlowSpec(final Interface pFlowSpec) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFlowSpec = pFlowSpec;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.flowSpecificationDeprecated";
    }
    
    @Override
    public List<String> parameterNames() {
      return FlowSpecificationDeprecated.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fFlowSpec};
    }
    
    @Override
    public FlowSpecificationDeprecated.Match toImmutable() {
      return isMutable() ? newMatch(fFlowSpec) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"flowSpec\"=" + prettyPrintValue(fFlowSpec));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fFlowSpec);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FlowSpecificationDeprecated.Match)) {
          FlowSpecificationDeprecated.Match other = (FlowSpecificationDeprecated.Match) obj;
          return Objects.equals(fFlowSpec, other.fFlowSpec);
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
    public FlowSpecificationDeprecated specification() {
      return FlowSpecificationDeprecated.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FlowSpecificationDeprecated.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FlowSpecificationDeprecated.Match newMutableMatch(final Interface pFlowSpec) {
      return new Mutable(pFlowSpec);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FlowSpecificationDeprecated.Match newMatch(final Interface pFlowSpec) {
      return new Immutable(pFlowSpec);
    }
    
    private static final class Mutable extends FlowSpecificationDeprecated.Match {
      Mutable(final Interface pFlowSpec) {
        super(pFlowSpec);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends FlowSpecificationDeprecated.Match {
      Immutable(final Interface pFlowSpec) {
        super(pFlowSpec);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.flowSpecificationDeprecated pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern flowSpecificationDeprecated(flowSpec : Interface) {
   * 	find sysml.FlowSpecification(flowSpec, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FlowSpecificationDeprecated
   * 
   */
  public static class Matcher extends BaseMatcher<FlowSpecificationDeprecated.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FlowSpecificationDeprecated.Matcher on(final ViatraQueryEngine engine) {
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
    public static FlowSpecificationDeprecated.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_FLOWSPEC = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FlowSpecificationDeprecated.Matcher.class);
    
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
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FlowSpecificationDeprecated.Match> getAllMatches(final Interface pFlowSpec) {
      return rawStreamAllMatches(new Object[]{pFlowSpec}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FlowSpecificationDeprecated.Match> streamAllMatches(final Interface pFlowSpec) {
      return rawStreamAllMatches(new Object[]{pFlowSpec});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FlowSpecificationDeprecated.Match> getOneArbitraryMatch(final Interface pFlowSpec) {
      return rawGetOneArbitraryMatch(new Object[]{pFlowSpec});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Interface pFlowSpec) {
      return rawHasMatch(new Object[]{pFlowSpec});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Interface pFlowSpec) {
      return rawCountMatches(new Object[]{pFlowSpec});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Interface pFlowSpec, final Consumer<? super FlowSpecificationDeprecated.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFlowSpec}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFlowSpec the fixed value of pattern parameter flowSpec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FlowSpecificationDeprecated.Match newMatch(final Interface pFlowSpec) {
      return FlowSpecificationDeprecated.Match.newMatch(pFlowSpec);
    }
    
    /**
     * Retrieve the set of values that occur in matches for flowSpec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Interface> rawStreamAllValuesOfflowSpec(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FLOWSPEC, parameters).map(Interface.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for flowSpec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Interface> getAllValuesOfflowSpec() {
      return rawStreamAllValuesOfflowSpec(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for flowSpec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Interface> streamAllValuesOfflowSpec() {
      return rawStreamAllValuesOfflowSpec(emptyArray());
    }
    
    @Override
    protected FlowSpecificationDeprecated.Match tupleToMatch(final Tuple t) {
      try {
          return FlowSpecificationDeprecated.Match.newMatch((Interface) t.get(POSITION_FLOWSPEC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FlowSpecificationDeprecated.Match arrayToMatch(final Object[] match) {
      try {
          return FlowSpecificationDeprecated.Match.newMatch((Interface) match[POSITION_FLOWSPEC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FlowSpecificationDeprecated.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FlowSpecificationDeprecated.Match.newMutableMatch((Interface) match[POSITION_FLOWSPEC]);
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
    public static IQuerySpecification<FlowSpecificationDeprecated.Matcher> querySpecification() {
      return FlowSpecificationDeprecated.instance();
    }
  }
  
  private FlowSpecificationDeprecated() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FlowSpecificationDeprecated instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected FlowSpecificationDeprecated.Matcher instantiate(final ViatraQueryEngine engine) {
    return FlowSpecificationDeprecated.Matcher.on(engine);
  }
  
  @Override
  public FlowSpecificationDeprecated.Matcher instantiate() {
    return FlowSpecificationDeprecated.Matcher.create();
  }
  
  @Override
  public FlowSpecificationDeprecated.Match newEmptyMatch() {
    return FlowSpecificationDeprecated.Match.newEmptyMatch();
  }
  
  @Override
  public FlowSpecificationDeprecated.Match newMatch(final Object... parameters) {
    return FlowSpecificationDeprecated.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link FlowSpecificationDeprecated} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FlowSpecificationDeprecated#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FlowSpecificationDeprecated INSTANCE = new FlowSpecificationDeprecated();
    
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
    private static final FlowSpecificationDeprecated.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_flowSpec = new PParameter("flowSpec", "com.nomagic.uml2.ext.magicdraw.classes.mdinterfaces.Interface", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Interface")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_flowSpec);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.flowSpecificationDeprecated";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("flowSpec");
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
          PVariable var_flowSpec = body.getOrCreateVariableByName("flowSpec");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_flowSpec), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Interface")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_flowSpec, parameter_flowSpec)
          ));
          // 	find sysml.FlowSpecification(flowSpec, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_flowSpec, var___0_), FlowSpecification.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
