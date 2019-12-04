/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.HasCreateOperationamedView;
import com.incquerylabs.magicdraw.benchmark.queries.library.Viewpoint;
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
 *         pattern viewpointNoCreate(viewpoint : Class) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.Viewpoint(viewpoint, _);
 *         	neg find hasCreateOperationamedView(viewpoint);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ViewpointNoCreate extends BaseGeneratedEMFQuerySpecification<ViewpointNoCreate.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.viewpointNoCreate pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fViewpoint;
    
    private static List<String> parameterNames = makeImmutableList("viewpoint");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      this.fViewpoint = pViewpoint;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "viewpoint": return this.fViewpoint;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fViewpoint;
          default: return null;
      }
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getViewpoint() {
      return this.fViewpoint;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("viewpoint".equals(parameterName) ) {
          this.fViewpoint = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setViewpoint(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fViewpoint = pViewpoint;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.viewpointNoCreate";
    }
    
    @Override
    public List<String> parameterNames() {
      return ViewpointNoCreate.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fViewpoint};
    }
    
    @Override
    public ViewpointNoCreate.Match toImmutable() {
      return isMutable() ? newMatch(fViewpoint) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"viewpoint\"=" + prettyPrintValue(fViewpoint));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fViewpoint);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ViewpointNoCreate.Match)) {
          ViewpointNoCreate.Match other = (ViewpointNoCreate.Match) obj;
          return Objects.equals(fViewpoint, other.fViewpoint);
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
    public ViewpointNoCreate specification() {
      return ViewpointNoCreate.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ViewpointNoCreate.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ViewpointNoCreate.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return new Mutable(pViewpoint);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ViewpointNoCreate.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return new Immutable(pViewpoint);
    }
    
    private static final class Mutable extends ViewpointNoCreate.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
        super(pViewpoint);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ViewpointNoCreate.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
        super(pViewpoint);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.viewpointNoCreate pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern viewpointNoCreate(viewpoint : Class) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.Viewpoint(viewpoint, _);
   * 	neg find hasCreateOperationamedView(viewpoint);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ViewpointNoCreate
   * 
   */
  public static class Matcher extends BaseMatcher<ViewpointNoCreate.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ViewpointNoCreate.Matcher on(final ViatraQueryEngine engine) {
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
    public static ViewpointNoCreate.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_VIEWPOINT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ViewpointNoCreate.Matcher.class);
    
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
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ViewpointNoCreate.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return rawStreamAllMatches(new Object[]{pViewpoint}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ViewpointNoCreate.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return rawStreamAllMatches(new Object[]{pViewpoint});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ViewpointNoCreate.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return rawGetOneArbitraryMatch(new Object[]{pViewpoint});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return rawHasMatch(new Object[]{pViewpoint});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return rawCountMatches(new Object[]{pViewpoint});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint, final Consumer<? super ViewpointNoCreate.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pViewpoint}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pViewpoint the fixed value of pattern parameter viewpoint, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ViewpointNoCreate.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pViewpoint) {
      return ViewpointNoCreate.Match.newMatch(pViewpoint);
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewpoint.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfviewpoint(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VIEWPOINT, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewpoint.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfviewpoint() {
      return rawStreamAllValuesOfviewpoint(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for viewpoint.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfviewpoint() {
      return rawStreamAllValuesOfviewpoint(emptyArray());
    }
    
    @Override
    protected ViewpointNoCreate.Match tupleToMatch(final Tuple t) {
      try {
          return ViewpointNoCreate.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_VIEWPOINT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ViewpointNoCreate.Match arrayToMatch(final Object[] match) {
      try {
          return ViewpointNoCreate.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_VIEWPOINT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ViewpointNoCreate.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ViewpointNoCreate.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_VIEWPOINT]);
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
    public static IQuerySpecification<ViewpointNoCreate.Matcher> querySpecification() {
      return ViewpointNoCreate.instance();
    }
  }
  
  private ViewpointNoCreate() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ViewpointNoCreate instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ViewpointNoCreate.Matcher instantiate(final ViatraQueryEngine engine) {
    return ViewpointNoCreate.Matcher.on(engine);
  }
  
  @Override
  public ViewpointNoCreate.Matcher instantiate() {
    return ViewpointNoCreate.Matcher.create();
  }
  
  @Override
  public ViewpointNoCreate.Match newEmptyMatch() {
    return ViewpointNoCreate.Match.newEmptyMatch();
  }
  
  @Override
  public ViewpointNoCreate.Match newMatch(final Object... parameters) {
    return ViewpointNoCreate.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ViewpointNoCreate} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ViewpointNoCreate#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ViewpointNoCreate INSTANCE = new ViewpointNoCreate();
    
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
    private static final ViewpointNoCreate.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_viewpoint = new PParameter("viewpoint", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_viewpoint);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.viewpointNoCreate";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("viewpoint");
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
          PVariable var_viewpoint = body.getOrCreateVariableByName("viewpoint");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_viewpoint), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_viewpoint, parameter_viewpoint)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.Viewpoint(viewpoint, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_viewpoint, var___0_), Viewpoint.instance().getInternalQueryRepresentation());
          // 	neg find hasCreateOperationamedView(viewpoint)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_viewpoint), HasCreateOperationamedView.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}