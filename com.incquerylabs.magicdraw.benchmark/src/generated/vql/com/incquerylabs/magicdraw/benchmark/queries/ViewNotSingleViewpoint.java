/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.ViewConforms;
import com.incquerylabs.magicdraw.benchmark.queries.library.View;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
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
 *         pattern viewNotSingleViewpoint(view : Class) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.View(view, _);
 *         	size == count find viewConforms(view, _);
 *         	check(size != 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ViewNotSingleViewpoint extends BaseGeneratedEMFQuerySpecification<ViewNotSingleViewpoint.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.viewNotSingleViewpoint pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fView;
    
    private static List<String> parameterNames = makeImmutableList("view");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      this.fView = pView;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "view": return this.fView;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fView;
          default: return null;
      }
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getView() {
      return this.fView;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("view".equals(parameterName) ) {
          this.fView = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setView(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fView = pView;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.viewNotSingleViewpoint";
    }
    
    @Override
    public List<String> parameterNames() {
      return ViewNotSingleViewpoint.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fView};
    }
    
    @Override
    public ViewNotSingleViewpoint.Match toImmutable() {
      return isMutable() ? newMatch(fView) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"view\"=" + prettyPrintValue(fView));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fView);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ViewNotSingleViewpoint.Match)) {
          ViewNotSingleViewpoint.Match other = (ViewNotSingleViewpoint.Match) obj;
          return Objects.equals(fView, other.fView);
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
    public ViewNotSingleViewpoint specification() {
      return ViewNotSingleViewpoint.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ViewNotSingleViewpoint.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ViewNotSingleViewpoint.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return new Mutable(pView);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ViewNotSingleViewpoint.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return new Immutable(pView);
    }
    
    private static final class Mutable extends ViewNotSingleViewpoint.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
        super(pView);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ViewNotSingleViewpoint.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
        super(pView);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.viewNotSingleViewpoint pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern viewNotSingleViewpoint(view : Class) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.View(view, _);
   * 	size == count find viewConforms(view, _);
   * 	check(size != 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ViewNotSingleViewpoint
   * 
   */
  public static class Matcher extends BaseMatcher<ViewNotSingleViewpoint.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ViewNotSingleViewpoint.Matcher on(final ViatraQueryEngine engine) {
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
    public static ViewNotSingleViewpoint.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_VIEW = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ViewNotSingleViewpoint.Matcher.class);
    
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
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ViewNotSingleViewpoint.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return rawStreamAllMatches(new Object[]{pView}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ViewNotSingleViewpoint.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return rawStreamAllMatches(new Object[]{pView});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ViewNotSingleViewpoint.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return rawGetOneArbitraryMatch(new Object[]{pView});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return rawHasMatch(new Object[]{pView});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return rawCountMatches(new Object[]{pView});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView, final Consumer<? super ViewNotSingleViewpoint.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pView}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pView the fixed value of pattern parameter view, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ViewNotSingleViewpoint.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pView) {
      return ViewNotSingleViewpoint.Match.newMatch(pView);
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfview(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VIEW, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfview() {
      return rawStreamAllValuesOfview(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for view.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfview() {
      return rawStreamAllValuesOfview(emptyArray());
    }
    
    @Override
    protected ViewNotSingleViewpoint.Match tupleToMatch(final Tuple t) {
      try {
          return ViewNotSingleViewpoint.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_VIEW));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ViewNotSingleViewpoint.Match arrayToMatch(final Object[] match) {
      try {
          return ViewNotSingleViewpoint.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_VIEW]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ViewNotSingleViewpoint.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ViewNotSingleViewpoint.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_VIEW]);
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
    public static IQuerySpecification<ViewNotSingleViewpoint.Matcher> querySpecification() {
      return ViewNotSingleViewpoint.instance();
    }
  }
  
  private ViewNotSingleViewpoint() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ViewNotSingleViewpoint instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ViewNotSingleViewpoint.Matcher instantiate(final ViatraQueryEngine engine) {
    return ViewNotSingleViewpoint.Matcher.on(engine);
  }
  
  @Override
  public ViewNotSingleViewpoint.Matcher instantiate() {
    return ViewNotSingleViewpoint.Matcher.create();
  }
  
  @Override
  public ViewNotSingleViewpoint.Match newEmptyMatch() {
    return ViewNotSingleViewpoint.Match.newEmptyMatch();
  }
  
  @Override
  public ViewNotSingleViewpoint.Match newMatch(final Object... parameters) {
    return ViewNotSingleViewpoint.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ViewNotSingleViewpoint} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ViewNotSingleViewpoint#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ViewNotSingleViewpoint INSTANCE = new ViewNotSingleViewpoint();
    
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
    private static final ViewNotSingleViewpoint.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_view = new PParameter("view", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_view);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.viewNotSingleViewpoint";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("view");
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
          PVariable var_view = body.getOrCreateVariableByName("view");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_size = body.getOrCreateVariableByName("size");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_view), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_view, parameter_view)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.View(view, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_view, var___0_), View.instance().getInternalQueryRepresentation());
          // 	size == count find viewConforms(view, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_view, var___1_), ViewConforms.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_size, var__virtual_0_);
          // 	check(size != 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern viewNotSingleViewpoint";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("size");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer size = (Integer) provider.getValue("size");
                  return evaluateExpression_1_1(size);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer size) {
    return ((size).intValue() != 1);
  }
}
