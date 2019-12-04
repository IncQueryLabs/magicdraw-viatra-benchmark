/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty;
import com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
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
 *         pattern adjunctPropertyWrongName(property : Property) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
 *         	NamedElement.name(principal, name);
 *         	neg Property.name(property, name);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AdjunctPropertyWrongName extends BaseGeneratedEMFQuerySpecification<AdjunctPropertyWrongName.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyWrongName pattern,
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
      return "com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyWrongName";
    }
    
    @Override
    public List<String> parameterNames() {
      return AdjunctPropertyWrongName.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProperty};
    }
    
    @Override
    public AdjunctPropertyWrongName.Match toImmutable() {
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
      if ((obj instanceof AdjunctPropertyWrongName.Match)) {
          AdjunctPropertyWrongName.Match other = (AdjunctPropertyWrongName.Match) obj;
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
    public AdjunctPropertyWrongName specification() {
      return AdjunctPropertyWrongName.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AdjunctPropertyWrongName.Match newEmptyMatch() {
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
    public static AdjunctPropertyWrongName.Match newMutableMatch(final Property pProperty) {
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
    public static AdjunctPropertyWrongName.Match newMatch(final Property pProperty) {
      return new Immutable(pProperty);
    }
    
    private static final class Mutable extends AdjunctPropertyWrongName.Match {
      Mutable(final Property pProperty) {
        super(pProperty);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AdjunctPropertyWrongName.Match {
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
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyWrongName pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern adjunctPropertyWrongName(property : Property) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal);
   * 	NamedElement.name(principal, name);
   * 	neg Property.name(property, name);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AdjunctPropertyWrongName
   * 
   */
  public static class Matcher extends BaseMatcher<AdjunctPropertyWrongName.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AdjunctPropertyWrongName.Matcher on(final ViatraQueryEngine engine) {
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
    public static AdjunctPropertyWrongName.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROPERTY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AdjunctPropertyWrongName.Matcher.class);
    
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
    public Collection<AdjunctPropertyWrongName.Match> getAllMatches(final Property pProperty) {
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
    public Stream<AdjunctPropertyWrongName.Match> streamAllMatches(final Property pProperty) {
      return rawStreamAllMatches(new Object[]{pProperty});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AdjunctPropertyWrongName.Match> getOneArbitraryMatch(final Property pProperty) {
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
    public boolean forOneArbitraryMatch(final Property pProperty, final Consumer<? super AdjunctPropertyWrongName.Match> processor) {
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
    public AdjunctPropertyWrongName.Match newMatch(final Property pProperty) {
      return AdjunctPropertyWrongName.Match.newMatch(pProperty);
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
    protected AdjunctPropertyWrongName.Match tupleToMatch(final Tuple t) {
      try {
          return AdjunctPropertyWrongName.Match.newMatch((Property) t.get(POSITION_PROPERTY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AdjunctPropertyWrongName.Match arrayToMatch(final Object[] match) {
      try {
          return AdjunctPropertyWrongName.Match.newMatch((Property) match[POSITION_PROPERTY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AdjunctPropertyWrongName.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AdjunctPropertyWrongName.Match.newMutableMatch((Property) match[POSITION_PROPERTY]);
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
    public static IQuerySpecification<AdjunctPropertyWrongName.Matcher> querySpecification() {
      return AdjunctPropertyWrongName.instance();
    }
  }
  
  private AdjunctPropertyWrongName() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AdjunctPropertyWrongName instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AdjunctPropertyWrongName.Matcher instantiate(final ViatraQueryEngine engine) {
    return AdjunctPropertyWrongName.Matcher.on(engine);
  }
  
  @Override
  public AdjunctPropertyWrongName.Matcher instantiate() {
    return AdjunctPropertyWrongName.Matcher.create();
  }
  
  @Override
  public AdjunctPropertyWrongName.Match newEmptyMatch() {
    return AdjunctPropertyWrongName.Match.newEmptyMatch();
  }
  
  @Override
  public AdjunctPropertyWrongName.Match newMatch(final Object... parameters) {
    return AdjunctPropertyWrongName.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AdjunctPropertyWrongName} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AdjunctPropertyWrongName#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AdjunctPropertyWrongName INSTANCE = new AdjunctPropertyWrongName();
    
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
    private static final AdjunctPropertyWrongName.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_property = new PParameter("property", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_property);
    
    private class Embedded_1_Property_name extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Property_name() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Property_name";
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
        //  Property.name(property, name)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.adjunctPropertyWrongName";
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
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_property, parameter_property)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty(property, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var___0_), AdjunctProperty.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AdjunctProperty_principal(property, principal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var_principal), AdjunctProperty_principal.instance().getInternalQueryRepresentation());
          // 	NamedElement.name(principal, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_principal, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_0_, var_name);
          // 	neg Property.name(property, name)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_property, var_name), new AdjunctPropertyWrongName.GeneratedPQuery.Embedded_1_Property_name());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
