/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty;
import com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
 *         pattern adjunctPropertyIncorrectMultiplicity(property : Property){
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
 *         	ObjectNode(principal);
 *         	Property.lowerValue(property, lower);
 *         	LiteralInteger.value(lower, lowerValue);
 *         	check(lowerValue != 0);
 *         } or {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
 *         	ObjectNode(principal);
 *         	Property.upperValue(property, propertyUpper);
 *         	ObjectNode.upperBound(principal, principalUpper);
 *         	
 *         	LiteralUnlimitedNatural.value(propertyUpper, propertyUpperValue);
 *         	LiteralUnlimitedNatural.value(principalUpper, principalUpperValue);
 *         	check (propertyUpperValue {@literal >}= 0);
 *         	check(
 *         		principalUpperValue == -1 ||
 *         		propertyUpperValue {@literal <} principalUpperValue
 *         	);
 *         
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AdjunctPropertyIncorrectMultiplicity extends BaseGeneratedEMFQuerySpecification<AdjunctPropertyIncorrectMultiplicity.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyIncorrectMultiplicity pattern,
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
    private Property fProperty;
    
    private static List<String> parameterNames = makeImmutableList("property");
    
    private Match(final Property pProperty) {
      this.fProperty = pProperty;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "property": return this.fProperty;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fProperty;
          default: return null;
      }
    }
    
    public Property getProperty() {
      return this.fProperty;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("property".equals(parameterName) ) {
          this.fProperty = (Property) newValue;
          return true;
      }
      return false;
    }
    
    public void setProperty(final Property pProperty) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProperty = pProperty;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyIncorrectMultiplicity";
    }
    
    @Override
    public List<String> parameterNames() {
      return AdjunctPropertyIncorrectMultiplicity.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProperty};
    }
    
    @Override
    public AdjunctPropertyIncorrectMultiplicity.Match toImmutable() {
      return isMutable() ? newMatch(fProperty) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"property\"=" + prettyPrintValue(fProperty));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fProperty);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AdjunctPropertyIncorrectMultiplicity.Match)) {
          AdjunctPropertyIncorrectMultiplicity.Match other = (AdjunctPropertyIncorrectMultiplicity.Match) obj;
          return Objects.equals(fProperty, other.fProperty);
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
    public AdjunctPropertyIncorrectMultiplicity specification() {
      return AdjunctPropertyIncorrectMultiplicity.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AdjunctPropertyIncorrectMultiplicity.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AdjunctPropertyIncorrectMultiplicity.Match newMutableMatch(final Property pProperty) {
      return new Mutable(pProperty);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AdjunctPropertyIncorrectMultiplicity.Match newMatch(final Property pProperty) {
      return new Immutable(pProperty);
    }
    
    private static final class Mutable extends AdjunctPropertyIncorrectMultiplicity.Match {
      Mutable(final Property pProperty) {
        super(pProperty);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AdjunctPropertyIncorrectMultiplicity.Match {
      Immutable(final Property pProperty) {
        super(pProperty);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyIncorrectMultiplicity pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern adjunctPropertyIncorrectMultiplicity(property : Property){
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
   * 	ObjectNode(principal);
   * 	Property.lowerValue(property, lower);
   * 	LiteralInteger.value(lower, lowerValue);
   * 	check(lowerValue != 0);
   * } or {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
   * 	ObjectNode(principal);
   * 	Property.upperValue(property, propertyUpper);
   * 	ObjectNode.upperBound(principal, principalUpper);
   * 	
   * 	LiteralUnlimitedNatural.value(propertyUpper, propertyUpperValue);
   * 	LiteralUnlimitedNatural.value(principalUpper, principalUpperValue);
   * 	check (propertyUpperValue {@literal >}= 0);
   * 	check(
   * 		principalUpperValue == -1 ||
   * 		propertyUpperValue {@literal <} principalUpperValue
   * 	);
   * 
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AdjunctPropertyIncorrectMultiplicity
   * 
   */
  public static class Matcher extends BaseMatcher<AdjunctPropertyIncorrectMultiplicity.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AdjunctPropertyIncorrectMultiplicity.Matcher on(final ViatraQueryEngine engine) {
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
    public static AdjunctPropertyIncorrectMultiplicity.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROPERTY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AdjunctPropertyIncorrectMultiplicity.Matcher.class);
    
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
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AdjunctPropertyIncorrectMultiplicity.Match> getAllMatches(final Property pProperty) {
      return rawStreamAllMatches(new Object[]{pProperty}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AdjunctPropertyIncorrectMultiplicity.Match> streamAllMatches(final Property pProperty) {
      return rawStreamAllMatches(new Object[]{pProperty});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AdjunctPropertyIncorrectMultiplicity.Match> getOneArbitraryMatch(final Property pProperty) {
      return rawGetOneArbitraryMatch(new Object[]{pProperty});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pProperty) {
      return rawHasMatch(new Object[]{pProperty});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pProperty) {
      return rawCountMatches(new Object[]{pProperty});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pProperty, final Consumer<? super AdjunctPropertyIncorrectMultiplicity.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pProperty}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AdjunctPropertyIncorrectMultiplicity.Match newMatch(final Property pProperty) {
      return AdjunctPropertyIncorrectMultiplicity.Match.newMatch(pProperty);
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfproperty(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROPERTY, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfproperty() {
      return rawStreamAllValuesOfproperty(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfproperty() {
      return rawStreamAllValuesOfproperty(emptyArray());
    }
    
    @Override
    protected AdjunctPropertyIncorrectMultiplicity.Match tupleToMatch(final Tuple t) {
      try {
          return AdjunctPropertyIncorrectMultiplicity.Match.newMatch((Property) t.get(POSITION_PROPERTY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AdjunctPropertyIncorrectMultiplicity.Match arrayToMatch(final Object[] match) {
      try {
          return AdjunctPropertyIncorrectMultiplicity.Match.newMatch((Property) match[POSITION_PROPERTY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AdjunctPropertyIncorrectMultiplicity.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AdjunctPropertyIncorrectMultiplicity.Match.newMutableMatch((Property) match[POSITION_PROPERTY]);
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
    public static IQuerySpecification<AdjunctPropertyIncorrectMultiplicity.Matcher> querySpecification() {
      return AdjunctPropertyIncorrectMultiplicity.instance();
    }
  }
  
  private AdjunctPropertyIncorrectMultiplicity() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AdjunctPropertyIncorrectMultiplicity instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AdjunctPropertyIncorrectMultiplicity.Matcher instantiate(final ViatraQueryEngine engine) {
    return AdjunctPropertyIncorrectMultiplicity.Matcher.on(engine);
  }
  
  @Override
  public AdjunctPropertyIncorrectMultiplicity.Matcher instantiate() {
    return AdjunctPropertyIncorrectMultiplicity.Matcher.create();
  }
  
  @Override
  public AdjunctPropertyIncorrectMultiplicity.Match newEmptyMatch() {
    return AdjunctPropertyIncorrectMultiplicity.Match.newEmptyMatch();
  }
  
  @Override
  public AdjunctPropertyIncorrectMultiplicity.Match newMatch(final Object... parameters) {
    return AdjunctPropertyIncorrectMultiplicity.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AdjunctPropertyIncorrectMultiplicity} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AdjunctPropertyIncorrectMultiplicity#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AdjunctPropertyIncorrectMultiplicity INSTANCE = new AdjunctPropertyIncorrectMultiplicity();
    
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
    private static final AdjunctPropertyIncorrectMultiplicity.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_property = new PParameter("property", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_property);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyIncorrectMultiplicity";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("property");
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
          PVariable var_property = body.getOrCreateVariableByName("property");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_principal = body.getOrCreateVariableByName("principal");
          PVariable var_lower = body.getOrCreateVariableByName("lower");
          PVariable var_lowerValue = body.getOrCreateVariableByName("lowerValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_property, parameter_property)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var___0_), AdjunctProperty.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var_principal), AdjunctProperty_principal.instance().getInternalQueryRepresentation());
          // 	ObjectNode(principal)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ObjectNode")));
          // 	Property.lowerValue(property, lower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_lower);
          // 	LiteralInteger.value(lower, lowerValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_lower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "LiteralInteger")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_lower, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Integer")));
          new Equality(body, var__virtual_1_, var_lowerValue);
          // 	check(lowerValue != 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern adjunctPropertyIncorrectMultiplicity";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("lowerValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer lowerValue = (Integer) provider.getValue("lowerValue");
                  return evaluateExpression_1_1(lowerValue);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_property = body.getOrCreateVariableByName("property");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_principal = body.getOrCreateVariableByName("principal");
          PVariable var_propertyUpper = body.getOrCreateVariableByName("propertyUpper");
          PVariable var_principalUpper = body.getOrCreateVariableByName("principalUpper");
          PVariable var_propertyUpperValue = body.getOrCreateVariableByName("propertyUpperValue");
          PVariable var_principalUpperValue = body.getOrCreateVariableByName("principalUpperValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_property, parameter_property)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var___0_), AdjunctProperty.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var_principal), AdjunctProperty_principal.instance().getInternalQueryRepresentation());
          // 	ObjectNode(principal)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ObjectNode")));
          // 	Property.upperValue(property, propertyUpper)
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "MultiplicityElement", "upperValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_propertyUpper);
          // 	ObjectNode.upperBound(principal, principalUpper)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ObjectNode")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ObjectNode", "upperBound")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ValueSpecification")));
          new Equality(body, var__virtual_1_, var_principalUpper);
          // 		LiteralUnlimitedNatural.value(propertyUpper, propertyUpperValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_propertyUpper), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_propertyUpper, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_2_, var_propertyUpperValue);
          // 	LiteralUnlimitedNatural.value(principalUpper, principalUpperValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principalUpper), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "LiteralUnlimitedNatural")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_principalUpper, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "LiteralUnlimitedNatural", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "UnlimitedNatural")));
          new Equality(body, var__virtual_3_, var_principalUpperValue);
          // 	check (propertyUpperValue >= 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern adjunctPropertyIncorrectMultiplicity";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("propertyUpperValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer propertyUpperValue = (Integer) provider.getValue("propertyUpperValue");
                  return evaluateExpression_2_1(propertyUpperValue);
              }
          },  null); 
          // 	check(		principalUpperValue == -1 ||		propertyUpperValue < principalUpperValue	)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern adjunctPropertyIncorrectMultiplicity";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("principalUpperValue", "propertyUpperValue");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer principalUpperValue = (Integer) provider.getValue("principalUpperValue");
                  Integer propertyUpperValue = (Integer) provider.getValue("propertyUpperValue");
                  return evaluateExpression_2_2(principalUpperValue, propertyUpperValue);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer lowerValue) {
    return ((lowerValue).intValue() != 0);
  }
  
  private static boolean evaluateExpression_2_1(final Integer propertyUpperValue) {
    return ((propertyUpperValue).intValue() >= 0);
  }
  
  private static boolean evaluateExpression_2_2(final Integer principalUpperValue, final Integer propertyUpperValue) {
    return (((principalUpperValue).intValue() == (-1)) || 
      (propertyUpperValue.compareTo(principalUpperValue) < 0));
  }
}
