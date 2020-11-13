/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.Allocate;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern allocateNotSingleClient(abstraction : Abstraction) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.Allocate(abstraction, _);
 *         	clients == count Abstraction.client(abstraction, _);
 *         	check(clients != 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AllocateNotSingleClient extends BaseGeneratedEMFQuerySpecification<AllocateNotSingleClient.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.allocateNotSingleClient pattern,
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
    private Abstraction fAbstraction;
    
    private static List<String> parameterNames = makeImmutableList("abstraction");
    
    private Match(final Abstraction pAbstraction) {
      this.fAbstraction = pAbstraction;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "abstraction": return this.fAbstraction;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAbstraction;
          default: return null;
      }
    }
    
    public Abstraction getAbstraction() {
      return this.fAbstraction;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("abstraction".equals(parameterName) ) {
          this.fAbstraction = (Abstraction) newValue;
          return true;
      }
      return false;
    }
    
    public void setAbstraction(final Abstraction pAbstraction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAbstraction = pAbstraction;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.allocateNotSingleClient";
    }
    
    @Override
    public List<String> parameterNames() {
      return AllocateNotSingleClient.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAbstraction};
    }
    
    @Override
    public AllocateNotSingleClient.Match toImmutable() {
      return isMutable() ? newMatch(fAbstraction) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"abstraction\"=" + prettyPrintValue(fAbstraction));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAbstraction);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AllocateNotSingleClient.Match)) {
          AllocateNotSingleClient.Match other = (AllocateNotSingleClient.Match) obj;
          return Objects.equals(fAbstraction, other.fAbstraction);
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
    public AllocateNotSingleClient specification() {
      return AllocateNotSingleClient.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AllocateNotSingleClient.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AllocateNotSingleClient.Match newMutableMatch(final Abstraction pAbstraction) {
      return new Mutable(pAbstraction);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AllocateNotSingleClient.Match newMatch(final Abstraction pAbstraction) {
      return new Immutable(pAbstraction);
    }
    
    private static final class Mutable extends AllocateNotSingleClient.Match {
      Mutable(final Abstraction pAbstraction) {
        super(pAbstraction);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AllocateNotSingleClient.Match {
      Immutable(final Abstraction pAbstraction) {
        super(pAbstraction);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.allocateNotSingleClient pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern allocateNotSingleClient(abstraction : Abstraction) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.Allocate(abstraction, _);
   * 	clients == count Abstraction.client(abstraction, _);
   * 	check(clients != 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AllocateNotSingleClient
   * 
   */
  public static class Matcher extends BaseMatcher<AllocateNotSingleClient.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AllocateNotSingleClient.Matcher on(final ViatraQueryEngine engine) {
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
    public static AllocateNotSingleClient.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ABSTRACTION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllocateNotSingleClient.Matcher.class);
    
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
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AllocateNotSingleClient.Match> getAllMatches(final Abstraction pAbstraction) {
      return rawStreamAllMatches(new Object[]{pAbstraction}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AllocateNotSingleClient.Match> streamAllMatches(final Abstraction pAbstraction) {
      return rawStreamAllMatches(new Object[]{pAbstraction});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AllocateNotSingleClient.Match> getOneArbitraryMatch(final Abstraction pAbstraction) {
      return rawGetOneArbitraryMatch(new Object[]{pAbstraction});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Abstraction pAbstraction) {
      return rawHasMatch(new Object[]{pAbstraction});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Abstraction pAbstraction) {
      return rawCountMatches(new Object[]{pAbstraction});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Abstraction pAbstraction, final Consumer<? super AllocateNotSingleClient.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAbstraction}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AllocateNotSingleClient.Match newMatch(final Abstraction pAbstraction) {
      return AllocateNotSingleClient.Match.newMatch(pAbstraction);
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Abstraction> rawStreamAllValuesOfabstraction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ABSTRACTION, parameters).map(Abstraction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOfabstraction() {
      return rawStreamAllValuesOfabstraction(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOfabstraction() {
      return rawStreamAllValuesOfabstraction(emptyArray());
    }
    
    @Override
    protected AllocateNotSingleClient.Match tupleToMatch(final Tuple t) {
      try {
          return AllocateNotSingleClient.Match.newMatch((Abstraction) t.get(POSITION_ABSTRACTION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllocateNotSingleClient.Match arrayToMatch(final Object[] match) {
      try {
          return AllocateNotSingleClient.Match.newMatch((Abstraction) match[POSITION_ABSTRACTION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllocateNotSingleClient.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AllocateNotSingleClient.Match.newMutableMatch((Abstraction) match[POSITION_ABSTRACTION]);
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
    public static IQuerySpecification<AllocateNotSingleClient.Matcher> querySpecification() {
      return AllocateNotSingleClient.instance();
    }
  }
  
  private AllocateNotSingleClient() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AllocateNotSingleClient instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllocateNotSingleClient.Matcher instantiate(final ViatraQueryEngine engine) {
    return AllocateNotSingleClient.Matcher.on(engine);
  }
  
  @Override
  public AllocateNotSingleClient.Matcher instantiate() {
    return AllocateNotSingleClient.Matcher.create();
  }
  
  @Override
  public AllocateNotSingleClient.Match newEmptyMatch() {
    return AllocateNotSingleClient.Match.newEmptyMatch();
  }
  
  @Override
  public AllocateNotSingleClient.Match newMatch(final Object... parameters) {
    return AllocateNotSingleClient.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AllocateNotSingleClient} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AllocateNotSingleClient#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AllocateNotSingleClient INSTANCE = new AllocateNotSingleClient();
    
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
    private static final AllocateNotSingleClient.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_abstraction = new PParameter("abstraction", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Abstraction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_abstraction);
    
    private class Embedded_1_Abstraction_client extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Abstraction")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Abstraction_client() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Abstraction_client";
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
        //  Abstraction.client(abstraction, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Abstraction")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Dependency", "client")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.allocateNotSingleClient";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("abstraction");
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
          PVariable var_abstraction = body.getOrCreateVariableByName("abstraction");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_clients = body.getOrCreateVariableByName("clients");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_abstraction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Abstraction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_abstraction, parameter_abstraction)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.Allocate(abstraction, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_abstraction, var___0_), Allocate.instance().getInternalQueryRepresentation());
          // 	clients == count Abstraction.client(abstraction, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_abstraction, var___1_), new AllocateNotSingleClient.GeneratedPQuery.Embedded_1_Abstraction_client(), var__virtual_0_);
          new Equality(body, var_clients, var__virtual_0_);
          // 	check(clients != 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern allocateNotSingleClient";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("clients");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer clients = (Integer) provider.getValue("clients");
                  return evaluateExpression_1_1(clients);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer clients) {
    return ((clients).intValue() != 1);
  }
}
