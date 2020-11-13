/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.General;
import com.incquerylabs.magicdraw.benchmark.queries.library.ValueType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
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
 *         pattern valueTypeSpecializatonNotValueType(classifier : Classifier) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(valueType, _);
 *         	find general(classifier, valueType);
 *         	neg find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(classifier, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ValueTypeSpecializatonNotValueType extends BaseGeneratedEMFQuerySpecification<ValueTypeSpecializatonNotValueType.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.valueTypeSpecializatonNotValueType pattern,
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
    private Classifier fClassifier;
    
    private static List<String> parameterNames = makeImmutableList("classifier");
    
    private Match(final Classifier pClassifier) {
      this.fClassifier = pClassifier;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "classifier": return this.fClassifier;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fClassifier;
          default: return null;
      }
    }
    
    public Classifier getClassifier() {
      return this.fClassifier;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("classifier".equals(parameterName) ) {
          this.fClassifier = (Classifier) newValue;
          return true;
      }
      return false;
    }
    
    public void setClassifier(final Classifier pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.valueTypeSpecializatonNotValueType";
    }
    
    @Override
    public List<String> parameterNames() {
      return ValueTypeSpecializatonNotValueType.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier};
    }
    
    @Override
    public ValueTypeSpecializatonNotValueType.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"classifier\"=" + prettyPrintValue(fClassifier));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fClassifier);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ValueTypeSpecializatonNotValueType.Match)) {
          ValueTypeSpecializatonNotValueType.Match other = (ValueTypeSpecializatonNotValueType.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier);
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
    public ValueTypeSpecializatonNotValueType specification() {
      return ValueTypeSpecializatonNotValueType.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ValueTypeSpecializatonNotValueType.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ValueTypeSpecializatonNotValueType.Match newMutableMatch(final Classifier pClassifier) {
      return new Mutable(pClassifier);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ValueTypeSpecializatonNotValueType.Match newMatch(final Classifier pClassifier) {
      return new Immutable(pClassifier);
    }
    
    private static final class Mutable extends ValueTypeSpecializatonNotValueType.Match {
      Mutable(final Classifier pClassifier) {
        super(pClassifier);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ValueTypeSpecializatonNotValueType.Match {
      Immutable(final Classifier pClassifier) {
        super(pClassifier);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.valueTypeSpecializatonNotValueType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern valueTypeSpecializatonNotValueType(classifier : Classifier) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(valueType, _);
   * 	find general(classifier, valueType);
   * 	neg find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(classifier, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ValueTypeSpecializatonNotValueType
   * 
   */
  public static class Matcher extends BaseMatcher<ValueTypeSpecializatonNotValueType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ValueTypeSpecializatonNotValueType.Matcher on(final ViatraQueryEngine engine) {
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
    public static ValueTypeSpecializatonNotValueType.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CLASSIFIER = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ValueTypeSpecializatonNotValueType.Matcher.class);
    
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
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ValueTypeSpecializatonNotValueType.Match> getAllMatches(final Classifier pClassifier) {
      return rawStreamAllMatches(new Object[]{pClassifier}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ValueTypeSpecializatonNotValueType.Match> streamAllMatches(final Classifier pClassifier) {
      return rawStreamAllMatches(new Object[]{pClassifier});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ValueTypeSpecializatonNotValueType.Match> getOneArbitraryMatch(final Classifier pClassifier) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Classifier pClassifier) {
      return rawHasMatch(new Object[]{pClassifier});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Classifier pClassifier) {
      return rawCountMatches(new Object[]{pClassifier});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Classifier pClassifier, final Consumer<? super ValueTypeSpecializatonNotValueType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ValueTypeSpecializatonNotValueType.Match newMatch(final Classifier pClassifier) {
      return ValueTypeSpecializatonNotValueType.Match.newMatch(pClassifier);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfclassifier(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLASSIFIER, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier() {
      return rawStreamAllValuesOfclassifier(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier() {
      return rawStreamAllValuesOfclassifier(emptyArray());
    }
    
    @Override
    protected ValueTypeSpecializatonNotValueType.Match tupleToMatch(final Tuple t) {
      try {
          return ValueTypeSpecializatonNotValueType.Match.newMatch((Classifier) t.get(POSITION_CLASSIFIER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ValueTypeSpecializatonNotValueType.Match arrayToMatch(final Object[] match) {
      try {
          return ValueTypeSpecializatonNotValueType.Match.newMatch((Classifier) match[POSITION_CLASSIFIER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ValueTypeSpecializatonNotValueType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ValueTypeSpecializatonNotValueType.Match.newMutableMatch((Classifier) match[POSITION_CLASSIFIER]);
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
    public static IQuerySpecification<ValueTypeSpecializatonNotValueType.Matcher> querySpecification() {
      return ValueTypeSpecializatonNotValueType.instance();
    }
  }
  
  private ValueTypeSpecializatonNotValueType() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ValueTypeSpecializatonNotValueType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ValueTypeSpecializatonNotValueType.Matcher instantiate(final ViatraQueryEngine engine) {
    return ValueTypeSpecializatonNotValueType.Matcher.on(engine);
  }
  
  @Override
  public ValueTypeSpecializatonNotValueType.Matcher instantiate() {
    return ValueTypeSpecializatonNotValueType.Matcher.create();
  }
  
  @Override
  public ValueTypeSpecializatonNotValueType.Match newEmptyMatch() {
    return ValueTypeSpecializatonNotValueType.Match.newEmptyMatch();
  }
  
  @Override
  public ValueTypeSpecializatonNotValueType.Match newMatch(final Object... parameters) {
    return ValueTypeSpecializatonNotValueType.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ValueTypeSpecializatonNotValueType} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ValueTypeSpecializatonNotValueType#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ValueTypeSpecializatonNotValueType INSTANCE = new ValueTypeSpecializatonNotValueType();
    
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
    private static final ValueTypeSpecializatonNotValueType.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_classifier = new PParameter("classifier", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_classifier);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.valueTypeSpecializatonNotValueType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classifier");
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
          PVariable var_classifier = body.getOrCreateVariableByName("classifier");
          PVariable var_valueType = body.getOrCreateVariableByName("valueType");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_classifier)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(valueType, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_valueType, var___0_), ValueType.instance().getInternalQueryRepresentation());
          // 	find general(classifier, valueType)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_classifier, var_valueType), General.instance().getInternalQueryRepresentation());
          // 	neg find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(classifier, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_classifier, var___1_), ValueType.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
