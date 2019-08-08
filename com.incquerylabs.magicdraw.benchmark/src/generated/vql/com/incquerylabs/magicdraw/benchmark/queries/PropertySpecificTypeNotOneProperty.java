/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
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
import sysml.PropertySpecificType;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern propertySpecificTypeNotOneProperty(classifier : Classifier) {
 *         	find sysml.PropertySpecificType(classifier, _);
 *         	number == count Property.type(_, classifier);
 *         	check(number != 1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PropertySpecificTypeNotOneProperty extends BaseGeneratedEMFQuerySpecification<PropertySpecificTypeNotOneProperty.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.propertySpecificTypeNotOneProperty pattern,
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
      if ("classifier".equals(parameterName)) return this.fClassifier;
      return null;
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
      return "com.incquerylabs.magicdraw.benchmark.queries.propertySpecificTypeNotOneProperty";
    }
    
    @Override
    public List<String> parameterNames() {
      return PropertySpecificTypeNotOneProperty.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier};
    }
    
    @Override
    public PropertySpecificTypeNotOneProperty.Match toImmutable() {
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
      if ((obj instanceof PropertySpecificTypeNotOneProperty.Match)) {
          PropertySpecificTypeNotOneProperty.Match other = (PropertySpecificTypeNotOneProperty.Match) obj;
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
    public PropertySpecificTypeNotOneProperty specification() {
      return PropertySpecificTypeNotOneProperty.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PropertySpecificTypeNotOneProperty.Match newEmptyMatch() {
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
    public static PropertySpecificTypeNotOneProperty.Match newMutableMatch(final Classifier pClassifier) {
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
    public static PropertySpecificTypeNotOneProperty.Match newMatch(final Classifier pClassifier) {
      return new Immutable(pClassifier);
    }
    
    private static final class Mutable extends PropertySpecificTypeNotOneProperty.Match {
      Mutable(final Classifier pClassifier) {
        super(pClassifier);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PropertySpecificTypeNotOneProperty.Match {
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
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.propertySpecificTypeNotOneProperty pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern propertySpecificTypeNotOneProperty(classifier : Classifier) {
   * 	find sysml.PropertySpecificType(classifier, _);
   * 	number == count Property.type(_, classifier);
   * 	check(number != 1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PropertySpecificTypeNotOneProperty
   * 
   */
  public static class Matcher extends BaseMatcher<PropertySpecificTypeNotOneProperty.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PropertySpecificTypeNotOneProperty.Matcher on(final ViatraQueryEngine engine) {
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
    public static PropertySpecificTypeNotOneProperty.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CLASSIFIER = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PropertySpecificTypeNotOneProperty.Matcher.class);
    
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
    public Collection<PropertySpecificTypeNotOneProperty.Match> getAllMatches(final Classifier pClassifier) {
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
    public Stream<PropertySpecificTypeNotOneProperty.Match> streamAllMatches(final Classifier pClassifier) {
      return rawStreamAllMatches(new Object[]{pClassifier});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PropertySpecificTypeNotOneProperty.Match> getOneArbitraryMatch(final Classifier pClassifier) {
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
    public boolean forOneArbitraryMatch(final Classifier pClassifier, final Consumer<? super PropertySpecificTypeNotOneProperty.Match> processor) {
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
    public PropertySpecificTypeNotOneProperty.Match newMatch(final Classifier pClassifier) {
      return PropertySpecificTypeNotOneProperty.Match.newMatch(pClassifier);
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
    protected PropertySpecificTypeNotOneProperty.Match tupleToMatch(final Tuple t) {
      try {
          return PropertySpecificTypeNotOneProperty.Match.newMatch((Classifier) t.get(POSITION_CLASSIFIER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PropertySpecificTypeNotOneProperty.Match arrayToMatch(final Object[] match) {
      try {
          return PropertySpecificTypeNotOneProperty.Match.newMatch((Classifier) match[POSITION_CLASSIFIER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PropertySpecificTypeNotOneProperty.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PropertySpecificTypeNotOneProperty.Match.newMutableMatch((Classifier) match[POSITION_CLASSIFIER]);
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
    public static IQuerySpecification<PropertySpecificTypeNotOneProperty.Matcher> querySpecification() {
      return PropertySpecificTypeNotOneProperty.instance();
    }
  }
  
  private PropertySpecificTypeNotOneProperty() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PropertySpecificTypeNotOneProperty instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PropertySpecificTypeNotOneProperty.Matcher instantiate(final ViatraQueryEngine engine) {
    return PropertySpecificTypeNotOneProperty.Matcher.on(engine);
  }
  
  @Override
  public PropertySpecificTypeNotOneProperty.Matcher instantiate() {
    return PropertySpecificTypeNotOneProperty.Matcher.create();
  }
  
  @Override
  public PropertySpecificTypeNotOneProperty.Match newEmptyMatch() {
    return PropertySpecificTypeNotOneProperty.Match.newEmptyMatch();
  }
  
  @Override
  public PropertySpecificTypeNotOneProperty.Match newMatch(final Object... parameters) {
    return PropertySpecificTypeNotOneProperty.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.PropertySpecificTypeNotOneProperty (visibility: PUBLIC, simpleName: PropertySpecificTypeNotOneProperty, identifier: com.incquerylabs.magicdraw.benchmark.queries.PropertySpecificTypeNotOneProperty, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.PropertySpecificTypeNotOneProperty (visibility: PUBLIC, simpleName: PropertySpecificTypeNotOneProperty, identifier: com.incquerylabs.magicdraw.benchmark.queries.PropertySpecificTypeNotOneProperty, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PropertySpecificTypeNotOneProperty INSTANCE = new PropertySpecificTypeNotOneProperty();
    
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
    private static final PropertySpecificTypeNotOneProperty.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_classifier = new PParameter("classifier", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_classifier);
    
    private class EmbeddedQuery2119653299 extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public EmbeddedQuery2119653299() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$2119653299";
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
        //  Property.type(_, classifier)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.propertySpecificTypeNotOneProperty";
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
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_number = body.getOrCreateVariableByName("number");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_classifier)
          ));
          // 	find sysml.PropertySpecificType(classifier, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_classifier, var___0_), PropertySpecificType.instance().getInternalQueryRepresentation());
          // 	number == count Property.type(_, classifier)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___1_, var_classifier), new PropertySpecificTypeNotOneProperty.GeneratedPQuery.EmbeddedQuery2119653299(), var__virtual_0_);
          new Equality(body, var_number, var__virtual_0_);
          // 	check(number != 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern propertySpecificTypeNotOneProperty";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("number");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer number = (Integer) provider.getValue("number");
                  return evaluateExpression_1_1(number);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer number) {
    return ((number).intValue() != 1);
  }
}
