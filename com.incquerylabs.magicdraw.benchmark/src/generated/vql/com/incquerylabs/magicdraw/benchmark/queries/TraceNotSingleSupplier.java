/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import sysml.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern traceNotSingleSupplier(trace : Abstraction) {
 *         	find sysml.Trace(trace, _);
 *         	size == count Abstraction.supplier(trace, _);
 *         	check(size != 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TraceNotSingleSupplier extends BaseGeneratedEMFQuerySpecification<TraceNotSingleSupplier.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.traceNotSingleSupplier pattern,
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
    private Abstraction fTrace;
    
    private static List<String> parameterNames = makeImmutableList("trace");
    
    private Match(final Abstraction pTrace) {
      this.fTrace = pTrace;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "trace": return this.fTrace;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTrace;
          default: return null;
      }
    }
    
    public Abstraction getTrace() {
      return this.fTrace;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("trace".equals(parameterName) ) {
          this.fTrace = (Abstraction) newValue;
          return true;
      }
      return false;
    }
    
    public void setTrace(final Abstraction pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.traceNotSingleSupplier";
    }
    
    @Override
    public List<String> parameterNames() {
      return TraceNotSingleSupplier.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTrace};
    }
    
    @Override
    public TraceNotSingleSupplier.Match toImmutable() {
      return isMutable() ? newMatch(fTrace) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"trace\"=" + prettyPrintValue(fTrace));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTrace);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TraceNotSingleSupplier.Match)) {
          TraceNotSingleSupplier.Match other = (TraceNotSingleSupplier.Match) obj;
          return Objects.equals(fTrace, other.fTrace);
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
    public TraceNotSingleSupplier specification() {
      return TraceNotSingleSupplier.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TraceNotSingleSupplier.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TraceNotSingleSupplier.Match newMutableMatch(final Abstraction pTrace) {
      return new Mutable(pTrace);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TraceNotSingleSupplier.Match newMatch(final Abstraction pTrace) {
      return new Immutable(pTrace);
    }
    
    private static final class Mutable extends TraceNotSingleSupplier.Match {
      Mutable(final Abstraction pTrace) {
        super(pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TraceNotSingleSupplier.Match {
      Immutable(final Abstraction pTrace) {
        super(pTrace);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.traceNotSingleSupplier pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern traceNotSingleSupplier(trace : Abstraction) {
   * 	find sysml.Trace(trace, _);
   * 	size == count Abstraction.supplier(trace, _);
   * 	check(size != 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TraceNotSingleSupplier
   * 
   */
  public static class Matcher extends BaseMatcher<TraceNotSingleSupplier.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TraceNotSingleSupplier.Matcher on(final ViatraQueryEngine engine) {
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
    public static TraceNotSingleSupplier.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TRACE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TraceNotSingleSupplier.Matcher.class);
    
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
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TraceNotSingleSupplier.Match> getAllMatches(final Abstraction pTrace) {
      return rawStreamAllMatches(new Object[]{pTrace}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TraceNotSingleSupplier.Match> streamAllMatches(final Abstraction pTrace) {
      return rawStreamAllMatches(new Object[]{pTrace});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TraceNotSingleSupplier.Match> getOneArbitraryMatch(final Abstraction pTrace) {
      return rawGetOneArbitraryMatch(new Object[]{pTrace});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Abstraction pTrace) {
      return rawHasMatch(new Object[]{pTrace});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Abstraction pTrace) {
      return rawCountMatches(new Object[]{pTrace});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Abstraction pTrace, final Consumer<? super TraceNotSingleSupplier.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTrace}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TraceNotSingleSupplier.Match newMatch(final Abstraction pTrace) {
      return TraceNotSingleSupplier.Match.newMatch(pTrace);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Abstraction> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(Abstraction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }
    
    @Override
    protected TraceNotSingleSupplier.Match tupleToMatch(final Tuple t) {
      try {
          return TraceNotSingleSupplier.Match.newMatch((Abstraction) t.get(POSITION_TRACE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TraceNotSingleSupplier.Match arrayToMatch(final Object[] match) {
      try {
          return TraceNotSingleSupplier.Match.newMatch((Abstraction) match[POSITION_TRACE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TraceNotSingleSupplier.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TraceNotSingleSupplier.Match.newMutableMatch((Abstraction) match[POSITION_TRACE]);
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
    public static IQuerySpecification<TraceNotSingleSupplier.Matcher> querySpecification() {
      return TraceNotSingleSupplier.instance();
    }
  }
  
  private TraceNotSingleSupplier() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TraceNotSingleSupplier instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TraceNotSingleSupplier.Matcher instantiate(final ViatraQueryEngine engine) {
    return TraceNotSingleSupplier.Matcher.on(engine);
  }
  
  @Override
  public TraceNotSingleSupplier.Matcher instantiate() {
    return TraceNotSingleSupplier.Matcher.create();
  }
  
  @Override
  public TraceNotSingleSupplier.Match newEmptyMatch() {
    return TraceNotSingleSupplier.Match.newEmptyMatch();
  }
  
  @Override
  public TraceNotSingleSupplier.Match newMatch(final Object... parameters) {
    return TraceNotSingleSupplier.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TraceNotSingleSupplier} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TraceNotSingleSupplier#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TraceNotSingleSupplier INSTANCE = new TraceNotSingleSupplier();
    
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
    private static final TraceNotSingleSupplier.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_trace = new PParameter("trace", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_trace);
    
    private class Embedded_1_Abstraction_supplier extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Abstraction_supplier() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Abstraction_supplier";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  Abstraction.supplier(trace, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "supplier")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.traceNotSingleSupplier";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace");
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
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_size = body.getOrCreateVariableByName("size");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_trace, parameter_trace)
          ));
          // 	find sysml.Trace(trace, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_trace, var___0_), Trace.instance().getInternalQueryRepresentation());
          // 	size == count Abstraction.supplier(trace, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_trace, var___1_), new TraceNotSingleSupplier.GeneratedPQuery.Embedded_1_Abstraction_supplier(), var__virtual_0_);
          new Equality(body, var_size, var__virtual_0_);
          // 	check(size != 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern traceNotSingleSupplier";
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
