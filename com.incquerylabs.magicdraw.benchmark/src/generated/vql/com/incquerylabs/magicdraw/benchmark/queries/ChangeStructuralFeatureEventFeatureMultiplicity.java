/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent;
import com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent_structuralFeature;
import com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.ChangeEvent;
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
 *         pattern
 *         changeStructuralFeatureEventFeatureMultiplicity(changeEvent : ChangeEvent) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent(changeEvent, _);
 *         	size == count find
 *         	com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent_structuralFeature(changeEvent, _);
 *         	check(size != 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ChangeStructuralFeatureEventFeatureMultiplicity extends BaseGeneratedEMFQuerySpecification<ChangeStructuralFeatureEventFeatureMultiplicity.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.changeStructuralFeatureEventFeatureMultiplicity pattern,
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
    private ChangeEvent fChangeEvent;
    
    private static List<String> parameterNames = makeImmutableList("changeEvent");
    
    private Match(final ChangeEvent pChangeEvent) {
      this.fChangeEvent = pChangeEvent;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "changeEvent": return this.fChangeEvent;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fChangeEvent;
          default: return null;
      }
    }
    
    public ChangeEvent getChangeEvent() {
      return this.fChangeEvent;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("changeEvent".equals(parameterName) ) {
          this.fChangeEvent = (ChangeEvent) newValue;
          return true;
      }
      return false;
    }
    
    public void setChangeEvent(final ChangeEvent pChangeEvent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fChangeEvent = pChangeEvent;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.changeStructuralFeatureEventFeatureMultiplicity";
    }
    
    @Override
    public List<String> parameterNames() {
      return ChangeStructuralFeatureEventFeatureMultiplicity.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fChangeEvent};
    }
    
    @Override
    public ChangeStructuralFeatureEventFeatureMultiplicity.Match toImmutable() {
      return isMutable() ? newMatch(fChangeEvent) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"changeEvent\"=" + prettyPrintValue(fChangeEvent));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fChangeEvent);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ChangeStructuralFeatureEventFeatureMultiplicity.Match)) {
          ChangeStructuralFeatureEventFeatureMultiplicity.Match other = (ChangeStructuralFeatureEventFeatureMultiplicity.Match) obj;
          return Objects.equals(fChangeEvent, other.fChangeEvent);
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
    public ChangeStructuralFeatureEventFeatureMultiplicity specification() {
      return ChangeStructuralFeatureEventFeatureMultiplicity.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ChangeStructuralFeatureEventFeatureMultiplicity.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ChangeStructuralFeatureEventFeatureMultiplicity.Match newMutableMatch(final ChangeEvent pChangeEvent) {
      return new Mutable(pChangeEvent);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ChangeStructuralFeatureEventFeatureMultiplicity.Match newMatch(final ChangeEvent pChangeEvent) {
      return new Immutable(pChangeEvent);
    }
    
    private static final class Mutable extends ChangeStructuralFeatureEventFeatureMultiplicity.Match {
      Mutable(final ChangeEvent pChangeEvent) {
        super(pChangeEvent);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ChangeStructuralFeatureEventFeatureMultiplicity.Match {
      Immutable(final ChangeEvent pChangeEvent) {
        super(pChangeEvent);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.changeStructuralFeatureEventFeatureMultiplicity pattern,
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
   * changeStructuralFeatureEventFeatureMultiplicity(changeEvent : ChangeEvent) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent(changeEvent, _);
   * 	size == count find
   * 	com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent_structuralFeature(changeEvent, _);
   * 	check(size != 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ChangeStructuralFeatureEventFeatureMultiplicity
   * 
   */
  public static class Matcher extends BaseMatcher<ChangeStructuralFeatureEventFeatureMultiplicity.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ChangeStructuralFeatureEventFeatureMultiplicity.Matcher on(final ViatraQueryEngine engine) {
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
    public static ChangeStructuralFeatureEventFeatureMultiplicity.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CHANGEEVENT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ChangeStructuralFeatureEventFeatureMultiplicity.Matcher.class);
    
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
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ChangeStructuralFeatureEventFeatureMultiplicity.Match> getAllMatches(final ChangeEvent pChangeEvent) {
      return rawStreamAllMatches(new Object[]{pChangeEvent}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ChangeStructuralFeatureEventFeatureMultiplicity.Match> streamAllMatches(final ChangeEvent pChangeEvent) {
      return rawStreamAllMatches(new Object[]{pChangeEvent});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ChangeStructuralFeatureEventFeatureMultiplicity.Match> getOneArbitraryMatch(final ChangeEvent pChangeEvent) {
      return rawGetOneArbitraryMatch(new Object[]{pChangeEvent});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ChangeEvent pChangeEvent) {
      return rawHasMatch(new Object[]{pChangeEvent});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ChangeEvent pChangeEvent) {
      return rawCountMatches(new Object[]{pChangeEvent});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ChangeEvent pChangeEvent, final Consumer<? super ChangeStructuralFeatureEventFeatureMultiplicity.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pChangeEvent}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pChangeEvent the fixed value of pattern parameter changeEvent, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ChangeStructuralFeatureEventFeatureMultiplicity.Match newMatch(final ChangeEvent pChangeEvent) {
      return ChangeStructuralFeatureEventFeatureMultiplicity.Match.newMatch(pChangeEvent);
    }
    
    /**
     * Retrieve the set of values that occur in matches for changeEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ChangeEvent> rawStreamAllValuesOfchangeEvent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CHANGEEVENT, parameters).map(ChangeEvent.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for changeEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ChangeEvent> getAllValuesOfchangeEvent() {
      return rawStreamAllValuesOfchangeEvent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for changeEvent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ChangeEvent> streamAllValuesOfchangeEvent() {
      return rawStreamAllValuesOfchangeEvent(emptyArray());
    }
    
    @Override
    protected ChangeStructuralFeatureEventFeatureMultiplicity.Match tupleToMatch(final Tuple t) {
      try {
          return ChangeStructuralFeatureEventFeatureMultiplicity.Match.newMatch((ChangeEvent) t.get(POSITION_CHANGEEVENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeStructuralFeatureEventFeatureMultiplicity.Match arrayToMatch(final Object[] match) {
      try {
          return ChangeStructuralFeatureEventFeatureMultiplicity.Match.newMatch((ChangeEvent) match[POSITION_CHANGEEVENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeStructuralFeatureEventFeatureMultiplicity.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ChangeStructuralFeatureEventFeatureMultiplicity.Match.newMutableMatch((ChangeEvent) match[POSITION_CHANGEEVENT]);
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
    public static IQuerySpecification<ChangeStructuralFeatureEventFeatureMultiplicity.Matcher> querySpecification() {
      return ChangeStructuralFeatureEventFeatureMultiplicity.instance();
    }
  }
  
  private ChangeStructuralFeatureEventFeatureMultiplicity() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ChangeStructuralFeatureEventFeatureMultiplicity instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChangeStructuralFeatureEventFeatureMultiplicity.Matcher instantiate(final ViatraQueryEngine engine) {
    return ChangeStructuralFeatureEventFeatureMultiplicity.Matcher.on(engine);
  }
  
  @Override
  public ChangeStructuralFeatureEventFeatureMultiplicity.Matcher instantiate() {
    return ChangeStructuralFeatureEventFeatureMultiplicity.Matcher.create();
  }
  
  @Override
  public ChangeStructuralFeatureEventFeatureMultiplicity.Match newEmptyMatch() {
    return ChangeStructuralFeatureEventFeatureMultiplicity.Match.newEmptyMatch();
  }
  
  @Override
  public ChangeStructuralFeatureEventFeatureMultiplicity.Match newMatch(final Object... parameters) {
    return ChangeStructuralFeatureEventFeatureMultiplicity.Match.newMatch((com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.ChangeEvent) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ChangeStructuralFeatureEventFeatureMultiplicity} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ChangeStructuralFeatureEventFeatureMultiplicity#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ChangeStructuralFeatureEventFeatureMultiplicity INSTANCE = new ChangeStructuralFeatureEventFeatureMultiplicity();
    
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
    private static final ChangeStructuralFeatureEventFeatureMultiplicity.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_changeEvent = new PParameter("changeEvent", "com.nomagic.uml2.ext.magicdraw.commonbehaviors.mdcommunications.ChangeEvent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ChangeEvent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_changeEvent);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.changeStructuralFeatureEventFeatureMultiplicity";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("changeEvent");
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
          PVariable var_changeEvent = body.getOrCreateVariableByName("changeEvent");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_size = body.getOrCreateVariableByName("size");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_changeEvent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ChangeEvent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_changeEvent, parameter_changeEvent)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent(changeEvent, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_changeEvent, var___0_), ChangeStructuralFeatureEvent.instance().getInternalQueryRepresentation());
          // 	size == count find	com.incquerylabs.magicdraw.benchmark.queries.library.ChangeStructuralFeatureEvent_structuralFeature(changeEvent, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_changeEvent, var___1_), ChangeStructuralFeatureEvent_structuralFeature.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_size, var__virtual_0_);
          // 	check(size != 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern changeStructuralFeatureEventFeatureMultiplicity";
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
