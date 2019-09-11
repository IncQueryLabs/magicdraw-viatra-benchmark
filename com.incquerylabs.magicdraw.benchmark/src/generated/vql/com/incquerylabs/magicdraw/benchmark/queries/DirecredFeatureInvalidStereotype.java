/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.NotFlowProperty;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature;
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
import sysml.DirectedFeature;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern direcredFeatureInvalidStereotype(feature : Feature) {
 *         	find sysml.DirectedFeature(feature, _);
 *         	neg BehavioralFeature(feature);
 *         	neg find notFlowProperty(feature);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DirecredFeatureInvalidStereotype extends BaseGeneratedEMFQuerySpecification<DirecredFeatureInvalidStereotype.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.direcredFeatureInvalidStereotype pattern,
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
    private Feature fFeature;
    
    private static List<String> parameterNames = makeImmutableList("feature");
    
    private Match(final Feature pFeature) {
      this.fFeature = pFeature;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "feature": return this.fFeature;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFeature;
          default: return null;
      }
    }
    
    public Feature getFeature() {
      return this.fFeature;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("feature".equals(parameterName) ) {
          this.fFeature = (Feature) newValue;
          return true;
      }
      return false;
    }
    
    public void setFeature(final Feature pFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFeature = pFeature;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.direcredFeatureInvalidStereotype";
    }
    
    @Override
    public List<String> parameterNames() {
      return DirecredFeatureInvalidStereotype.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fFeature};
    }
    
    @Override
    public DirecredFeatureInvalidStereotype.Match toImmutable() {
      return isMutable() ? newMatch(fFeature) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"feature\"=" + prettyPrintValue(fFeature));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fFeature);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DirecredFeatureInvalidStereotype.Match)) {
          DirecredFeatureInvalidStereotype.Match other = (DirecredFeatureInvalidStereotype.Match) obj;
          return Objects.equals(fFeature, other.fFeature);
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
    public DirecredFeatureInvalidStereotype specification() {
      return DirecredFeatureInvalidStereotype.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DirecredFeatureInvalidStereotype.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DirecredFeatureInvalidStereotype.Match newMutableMatch(final Feature pFeature) {
      return new Mutable(pFeature);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DirecredFeatureInvalidStereotype.Match newMatch(final Feature pFeature) {
      return new Immutable(pFeature);
    }
    
    private static final class Mutable extends DirecredFeatureInvalidStereotype.Match {
      Mutable(final Feature pFeature) {
        super(pFeature);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DirecredFeatureInvalidStereotype.Match {
      Immutable(final Feature pFeature) {
        super(pFeature);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.direcredFeatureInvalidStereotype pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern direcredFeatureInvalidStereotype(feature : Feature) {
   * 	find sysml.DirectedFeature(feature, _);
   * 	neg BehavioralFeature(feature);
   * 	neg find notFlowProperty(feature);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DirecredFeatureInvalidStereotype
   * 
   */
  public static class Matcher extends BaseMatcher<DirecredFeatureInvalidStereotype.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DirecredFeatureInvalidStereotype.Matcher on(final ViatraQueryEngine engine) {
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
    public static DirecredFeatureInvalidStereotype.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_FEATURE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DirecredFeatureInvalidStereotype.Matcher.class);
    
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
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DirecredFeatureInvalidStereotype.Match> getAllMatches(final Feature pFeature) {
      return rawStreamAllMatches(new Object[]{pFeature}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DirecredFeatureInvalidStereotype.Match> streamAllMatches(final Feature pFeature) {
      return rawStreamAllMatches(new Object[]{pFeature});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DirecredFeatureInvalidStereotype.Match> getOneArbitraryMatch(final Feature pFeature) {
      return rawGetOneArbitraryMatch(new Object[]{pFeature});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Feature pFeature) {
      return rawHasMatch(new Object[]{pFeature});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Feature pFeature) {
      return rawCountMatches(new Object[]{pFeature});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Feature pFeature, final Consumer<? super DirecredFeatureInvalidStereotype.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFeature}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFeature the fixed value of pattern parameter feature, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DirecredFeatureInvalidStereotype.Match newMatch(final Feature pFeature) {
      return DirecredFeatureInvalidStereotype.Match.newMatch(pFeature);
    }
    
    /**
     * Retrieve the set of values that occur in matches for feature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Feature> rawStreamAllValuesOffeature(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FEATURE, parameters).map(Feature.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for feature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Feature> getAllValuesOffeature() {
      return rawStreamAllValuesOffeature(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for feature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Feature> streamAllValuesOffeature() {
      return rawStreamAllValuesOffeature(emptyArray());
    }
    
    @Override
    protected DirecredFeatureInvalidStereotype.Match tupleToMatch(final Tuple t) {
      try {
          return DirecredFeatureInvalidStereotype.Match.newMatch((Feature) t.get(POSITION_FEATURE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DirecredFeatureInvalidStereotype.Match arrayToMatch(final Object[] match) {
      try {
          return DirecredFeatureInvalidStereotype.Match.newMatch((Feature) match[POSITION_FEATURE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DirecredFeatureInvalidStereotype.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DirecredFeatureInvalidStereotype.Match.newMutableMatch((Feature) match[POSITION_FEATURE]);
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
    public static IQuerySpecification<DirecredFeatureInvalidStereotype.Matcher> querySpecification() {
      return DirecredFeatureInvalidStereotype.instance();
    }
  }
  
  private DirecredFeatureInvalidStereotype() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DirecredFeatureInvalidStereotype instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DirecredFeatureInvalidStereotype.Matcher instantiate(final ViatraQueryEngine engine) {
    return DirecredFeatureInvalidStereotype.Matcher.on(engine);
  }
  
  @Override
  public DirecredFeatureInvalidStereotype.Matcher instantiate() {
    return DirecredFeatureInvalidStereotype.Matcher.create();
  }
  
  @Override
  public DirecredFeatureInvalidStereotype.Match newEmptyMatch() {
    return DirecredFeatureInvalidStereotype.Match.newEmptyMatch();
  }
  
  @Override
  public DirecredFeatureInvalidStereotype.Match newMatch(final Object... parameters) {
    return DirecredFeatureInvalidStereotype.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DirecredFeatureInvalidStereotype} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link DirecredFeatureInvalidStereotype#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DirecredFeatureInvalidStereotype INSTANCE = new DirecredFeatureInvalidStereotype();
    
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
    private static final DirecredFeatureInvalidStereotype.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_feature = new PParameter("feature", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Feature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Feature")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_feature);
    
    private class Embedded_1_BehavioralFeature extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.BehavioralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "BehavioralFeature")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0);
      
      public Embedded_1_BehavioralFeature() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_BehavioralFeature";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0)
        ));
        //  BehavioralFeature(feature)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "BehavioralFeature")));
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.direcredFeatureInvalidStereotype";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("feature");
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
          PVariable var_feature = body.getOrCreateVariableByName("feature");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_feature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Feature")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_feature, parameter_feature)
          ));
          // 	find sysml.DirectedFeature(feature, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_feature, var___0_), DirectedFeature.instance().getInternalQueryRepresentation());
          // 	neg BehavioralFeature(feature)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_feature), new DirecredFeatureInvalidStereotype.GeneratedPQuery.Embedded_1_BehavioralFeature());
          // 	neg find notFlowProperty(feature)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_feature), NotFlowProperty.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
