/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.ItemFlow;
import com.incquerylabs.magicdraw.benchmark.queries.library.updm.ResourceInteraction;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow;
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
 *         UPDM Standard:       Version 2.1.1
 *           Compliance Level:  UPDM L1
 *           UPDM Element:      ResourceInteraction
 *          
 *         pattern resourceInteractionNotItemFlow(informationFlow : InformationFlow) {
 *             find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ResourceInteraction(informationFlow, _);
 *             neg find com.incquerylabs.magicdraw.benchmark.queries.library.ItemFlow(informationFlow, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ResourceInteractionNotItemFlow extends BaseGeneratedEMFQuerySpecification<ResourceInteractionNotItemFlow.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.resourceInteractionNotItemFlow pattern,
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
    private InformationFlow fInformationFlow;
    
    private static List<String> parameterNames = makeImmutableList("informationFlow");
    
    private Match(final InformationFlow pInformationFlow) {
      this.fInformationFlow = pInformationFlow;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "informationFlow": return this.fInformationFlow;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fInformationFlow;
          default: return null;
      }
    }
    
    public InformationFlow getInformationFlow() {
      return this.fInformationFlow;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("informationFlow".equals(parameterName) ) {
          this.fInformationFlow = (InformationFlow) newValue;
          return true;
      }
      return false;
    }
    
    public void setInformationFlow(final InformationFlow pInformationFlow) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInformationFlow = pInformationFlow;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.resourceInteractionNotItemFlow";
    }
    
    @Override
    public List<String> parameterNames() {
      return ResourceInteractionNotItemFlow.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInformationFlow};
    }
    
    @Override
    public ResourceInteractionNotItemFlow.Match toImmutable() {
      return isMutable() ? newMatch(fInformationFlow) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"informationFlow\"=" + prettyPrintValue(fInformationFlow));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fInformationFlow);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ResourceInteractionNotItemFlow.Match)) {
          ResourceInteractionNotItemFlow.Match other = (ResourceInteractionNotItemFlow.Match) obj;
          return Objects.equals(fInformationFlow, other.fInformationFlow);
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
    public ResourceInteractionNotItemFlow specification() {
      return ResourceInteractionNotItemFlow.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ResourceInteractionNotItemFlow.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ResourceInteractionNotItemFlow.Match newMutableMatch(final InformationFlow pInformationFlow) {
      return new Mutable(pInformationFlow);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ResourceInteractionNotItemFlow.Match newMatch(final InformationFlow pInformationFlow) {
      return new Immutable(pInformationFlow);
    }
    
    private static final class Mutable extends ResourceInteractionNotItemFlow.Match {
      Mutable(final InformationFlow pInformationFlow) {
        super(pInformationFlow);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ResourceInteractionNotItemFlow.Match {
      Immutable(final InformationFlow pInformationFlow) {
        super(pInformationFlow);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.resourceInteractionNotItemFlow pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * UPDM Standard:       Version 2.1.1
   *   Compliance Level:  UPDM L1
   *   UPDM Element:      ResourceInteraction
   *  
   * pattern resourceInteractionNotItemFlow(informationFlow : InformationFlow) {
   *     find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ResourceInteraction(informationFlow, _);
   *     neg find com.incquerylabs.magicdraw.benchmark.queries.library.ItemFlow(informationFlow, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ResourceInteractionNotItemFlow
   * 
   */
  public static class Matcher extends BaseMatcher<ResourceInteractionNotItemFlow.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ResourceInteractionNotItemFlow.Matcher on(final ViatraQueryEngine engine) {
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
    public static ResourceInteractionNotItemFlow.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_INFORMATIONFLOW = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ResourceInteractionNotItemFlow.Matcher.class);
    
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
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ResourceInteractionNotItemFlow.Match> getAllMatches(final InformationFlow pInformationFlow) {
      return rawStreamAllMatches(new Object[]{pInformationFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ResourceInteractionNotItemFlow.Match> streamAllMatches(final InformationFlow pInformationFlow) {
      return rawStreamAllMatches(new Object[]{pInformationFlow});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ResourceInteractionNotItemFlow.Match> getOneArbitraryMatch(final InformationFlow pInformationFlow) {
      return rawGetOneArbitraryMatch(new Object[]{pInformationFlow});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final InformationFlow pInformationFlow) {
      return rawHasMatch(new Object[]{pInformationFlow});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final InformationFlow pInformationFlow) {
      return rawCountMatches(new Object[]{pInformationFlow});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final InformationFlow pInformationFlow, final Consumer<? super ResourceInteractionNotItemFlow.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInformationFlow}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInformationFlow the fixed value of pattern parameter informationFlow, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ResourceInteractionNotItemFlow.Match newMatch(final InformationFlow pInformationFlow) {
      return ResourceInteractionNotItemFlow.Match.newMatch(pInformationFlow);
    }
    
    /**
     * Retrieve the set of values that occur in matches for informationFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InformationFlow> rawStreamAllValuesOfinformationFlow(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INFORMATIONFLOW, parameters).map(InformationFlow.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for informationFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InformationFlow> getAllValuesOfinformationFlow() {
      return rawStreamAllValuesOfinformationFlow(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for informationFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InformationFlow> streamAllValuesOfinformationFlow() {
      return rawStreamAllValuesOfinformationFlow(emptyArray());
    }
    
    @Override
    protected ResourceInteractionNotItemFlow.Match tupleToMatch(final Tuple t) {
      try {
          return ResourceInteractionNotItemFlow.Match.newMatch((InformationFlow) t.get(POSITION_INFORMATIONFLOW));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResourceInteractionNotItemFlow.Match arrayToMatch(final Object[] match) {
      try {
          return ResourceInteractionNotItemFlow.Match.newMatch((InformationFlow) match[POSITION_INFORMATIONFLOW]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResourceInteractionNotItemFlow.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ResourceInteractionNotItemFlow.Match.newMutableMatch((InformationFlow) match[POSITION_INFORMATIONFLOW]);
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
    public static IQuerySpecification<ResourceInteractionNotItemFlow.Matcher> querySpecification() {
      return ResourceInteractionNotItemFlow.instance();
    }
  }
  
  private ResourceInteractionNotItemFlow() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ResourceInteractionNotItemFlow instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ResourceInteractionNotItemFlow.Matcher instantiate(final ViatraQueryEngine engine) {
    return ResourceInteractionNotItemFlow.Matcher.on(engine);
  }
  
  @Override
  public ResourceInteractionNotItemFlow.Matcher instantiate() {
    return ResourceInteractionNotItemFlow.Matcher.create();
  }
  
  @Override
  public ResourceInteractionNotItemFlow.Match newEmptyMatch() {
    return ResourceInteractionNotItemFlow.Match.newEmptyMatch();
  }
  
  @Override
  public ResourceInteractionNotItemFlow.Match newMatch(final Object... parameters) {
    return ResourceInteractionNotItemFlow.Match.newMatch((com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ResourceInteractionNotItemFlow} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ResourceInteractionNotItemFlow#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ResourceInteractionNotItemFlow INSTANCE = new ResourceInteractionNotItemFlow();
    
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
    private static final ResourceInteractionNotItemFlow.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_informationFlow = new PParameter("informationFlow", "com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_informationFlow);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.resourceInteractionNotItemFlow";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("informationFlow");
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
          PVariable var_informationFlow = body.getOrCreateVariableByName("informationFlow");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_informationFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_informationFlow, parameter_informationFlow)
          ));
          //     find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ResourceInteraction(informationFlow, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_informationFlow, var___0_), ResourceInteraction.instance().getInternalQueryRepresentation());
          //     neg find com.incquerylabs.magicdraw.benchmark.queries.library.ItemFlow(informationFlow, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_informationFlow, var___1_), ItemFlow.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
