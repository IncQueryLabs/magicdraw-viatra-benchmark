/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.RedefinedBoundReferenceProperty;
import com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity;
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
 *         pattern endPathMiultiplicityNotRedefiniton(endPathMultiplicity : Property) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _);
 *         	neg Property.redefinedProperty(endPathMultiplicity, _);
 *         } or {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _);
 *         	neg find redefinedBoundReferenceProperty(endPathMultiplicity, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndPathMiultiplicityNotRedefiniton extends BaseGeneratedEMFQuerySpecification<EndPathMiultiplicityNotRedefiniton.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNotRedefiniton pattern,
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
    private Property fEndPathMultiplicity;
    
    private static List<String> parameterNames = makeImmutableList("endPathMultiplicity");
    
    private Match(final Property pEndPathMultiplicity) {
      this.fEndPathMultiplicity = pEndPathMultiplicity;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "endPathMultiplicity": return this.fEndPathMultiplicity;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEndPathMultiplicity;
          default: return null;
      }
    }
    
    public Property getEndPathMultiplicity() {
      return this.fEndPathMultiplicity;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("endPathMultiplicity".equals(parameterName) ) {
          this.fEndPathMultiplicity = (Property) newValue;
          return true;
      }
      return false;
    }
    
    public void setEndPathMultiplicity(final Property pEndPathMultiplicity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEndPathMultiplicity = pEndPathMultiplicity;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNotRedefiniton";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndPathMiultiplicityNotRedefiniton.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEndPathMultiplicity};
    }
    
    @Override
    public EndPathMiultiplicityNotRedefiniton.Match toImmutable() {
      return isMutable() ? newMatch(fEndPathMultiplicity) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"endPathMultiplicity\"=" + prettyPrintValue(fEndPathMultiplicity));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEndPathMultiplicity);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndPathMiultiplicityNotRedefiniton.Match)) {
          EndPathMiultiplicityNotRedefiniton.Match other = (EndPathMiultiplicityNotRedefiniton.Match) obj;
          return Objects.equals(fEndPathMultiplicity, other.fEndPathMultiplicity);
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
    public EndPathMiultiplicityNotRedefiniton specification() {
      return EndPathMiultiplicityNotRedefiniton.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndPathMiultiplicityNotRedefiniton.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndPathMiultiplicityNotRedefiniton.Match newMutableMatch(final Property pEndPathMultiplicity) {
      return new Mutable(pEndPathMultiplicity);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndPathMiultiplicityNotRedefiniton.Match newMatch(final Property pEndPathMultiplicity) {
      return new Immutable(pEndPathMultiplicity);
    }
    
    private static final class Mutable extends EndPathMiultiplicityNotRedefiniton.Match {
      Mutable(final Property pEndPathMultiplicity) {
        super(pEndPathMultiplicity);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndPathMiultiplicityNotRedefiniton.Match {
      Immutable(final Property pEndPathMultiplicity) {
        super(pEndPathMultiplicity);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNotRedefiniton pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern endPathMiultiplicityNotRedefiniton(endPathMultiplicity : Property) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _);
   * 	neg Property.redefinedProperty(endPathMultiplicity, _);
   * } or {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _);
   * 	neg find redefinedBoundReferenceProperty(endPathMultiplicity, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndPathMiultiplicityNotRedefiniton
   * 
   */
  public static class Matcher extends BaseMatcher<EndPathMiultiplicityNotRedefiniton.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndPathMiultiplicityNotRedefiniton.Matcher on(final ViatraQueryEngine engine) {
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
    public static EndPathMiultiplicityNotRedefiniton.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ENDPATHMULTIPLICITY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndPathMiultiplicityNotRedefiniton.Matcher.class);
    
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
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndPathMiultiplicityNotRedefiniton.Match> getAllMatches(final Property pEndPathMultiplicity) {
      return rawStreamAllMatches(new Object[]{pEndPathMultiplicity}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndPathMiultiplicityNotRedefiniton.Match> streamAllMatches(final Property pEndPathMultiplicity) {
      return rawStreamAllMatches(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndPathMiultiplicityNotRedefiniton.Match> getOneArbitraryMatch(final Property pEndPathMultiplicity) {
      return rawGetOneArbitraryMatch(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pEndPathMultiplicity) {
      return rawHasMatch(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pEndPathMultiplicity) {
      return rawCountMatches(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pEndPathMultiplicity, final Consumer<? super EndPathMiultiplicityNotRedefiniton.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEndPathMultiplicity}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndPathMiultiplicityNotRedefiniton.Match newMatch(final Property pEndPathMultiplicity) {
      return EndPathMiultiplicityNotRedefiniton.Match.newMatch(pEndPathMultiplicity);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endPathMultiplicity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfendPathMultiplicity(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDPATHMULTIPLICITY, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endPathMultiplicity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfendPathMultiplicity() {
      return rawStreamAllValuesOfendPathMultiplicity(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endPathMultiplicity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfendPathMultiplicity() {
      return rawStreamAllValuesOfendPathMultiplicity(emptyArray());
    }
    
    @Override
    protected EndPathMiultiplicityNotRedefiniton.Match tupleToMatch(final Tuple t) {
      try {
          return EndPathMiultiplicityNotRedefiniton.Match.newMatch((Property) t.get(POSITION_ENDPATHMULTIPLICITY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndPathMiultiplicityNotRedefiniton.Match arrayToMatch(final Object[] match) {
      try {
          return EndPathMiultiplicityNotRedefiniton.Match.newMatch((Property) match[POSITION_ENDPATHMULTIPLICITY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndPathMiultiplicityNotRedefiniton.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndPathMiultiplicityNotRedefiniton.Match.newMutableMatch((Property) match[POSITION_ENDPATHMULTIPLICITY]);
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
    public static IQuerySpecification<EndPathMiultiplicityNotRedefiniton.Matcher> querySpecification() {
      return EndPathMiultiplicityNotRedefiniton.instance();
    }
  }
  
  private EndPathMiultiplicityNotRedefiniton() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndPathMiultiplicityNotRedefiniton instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndPathMiultiplicityNotRedefiniton.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndPathMiultiplicityNotRedefiniton.Matcher.on(engine);
  }
  
  @Override
  public EndPathMiultiplicityNotRedefiniton.Matcher instantiate() {
    return EndPathMiultiplicityNotRedefiniton.Matcher.create();
  }
  
  @Override
  public EndPathMiultiplicityNotRedefiniton.Match newEmptyMatch() {
    return EndPathMiultiplicityNotRedefiniton.Match.newEmptyMatch();
  }
  
  @Override
  public EndPathMiultiplicityNotRedefiniton.Match newMatch(final Object... parameters) {
    return EndPathMiultiplicityNotRedefiniton.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EndPathMiultiplicityNotRedefiniton} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EndPathMiultiplicityNotRedefiniton#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndPathMiultiplicityNotRedefiniton INSTANCE = new EndPathMiultiplicityNotRedefiniton();
    
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
    private static final EndPathMiultiplicityNotRedefiniton.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_endPathMultiplicity = new PParameter("endPathMultiplicity", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_endPathMultiplicity);
    
    private class Embedded_1_Property_redefinedProperty extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Property_redefinedProperty() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Property_redefinedProperty";
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
        //  Property.redefinedProperty(endPathMultiplicity, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property", "redefinedProperty")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNotRedefiniton";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("endPathMultiplicity");
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
          PVariable var_endPathMultiplicity = body.getOrCreateVariableByName("endPathMultiplicity");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_endPathMultiplicity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_endPathMultiplicity, parameter_endPathMultiplicity)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_endPathMultiplicity, var___0_), EndPathMultiplicity.instance().getInternalQueryRepresentation());
          // 	neg Property.redefinedProperty(endPathMultiplicity, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_endPathMultiplicity, var___1_), new EndPathMiultiplicityNotRedefiniton.GeneratedPQuery.Embedded_1_Property_redefinedProperty());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_endPathMultiplicity = body.getOrCreateVariableByName("endPathMultiplicity");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_endPathMultiplicity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_endPathMultiplicity, parameter_endPathMultiplicity)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_endPathMultiplicity, var___0_), EndPathMultiplicity.instance().getInternalQueryRepresentation());
          // 	neg find redefinedBoundReferenceProperty(endPathMultiplicity, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_endPathMultiplicity, var___1_), RedefinedBoundReferenceProperty.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
