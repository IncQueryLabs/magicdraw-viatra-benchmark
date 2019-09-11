/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.Probability;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern probabilityInvalidStereotype(probability : NamedElement) {
 *         	ActivityEdge(probability);
 *         	find sysml.Probability(probability, _);
 *         	ActivityEdge.source(probability, source);
 *         	neg DecisionNode(source);
 *         } or {
 *         	ParameterSet(probability);
 *         	find sysml.Probability(probability, _);
 *         	ParameterSet.parameter(probability, parameter);
 *         	neg Parameter.direction(parameter, ::^out);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ProbabilityInvalidStereotype extends BaseGeneratedEMFQuerySpecification<ProbabilityInvalidStereotype.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.probabilityInvalidStereotype pattern,
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
    private NamedElement fProbability;
    
    private static List<String> parameterNames = makeImmutableList("probability");
    
    private Match(final NamedElement pProbability) {
      this.fProbability = pProbability;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "probability": return this.fProbability;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fProbability;
          default: return null;
      }
    }
    
    public NamedElement getProbability() {
      return this.fProbability;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("probability".equals(parameterName) ) {
          this.fProbability = (NamedElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setProbability(final NamedElement pProbability) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProbability = pProbability;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.probabilityInvalidStereotype";
    }
    
    @Override
    public List<String> parameterNames() {
      return ProbabilityInvalidStereotype.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProbability};
    }
    
    @Override
    public ProbabilityInvalidStereotype.Match toImmutable() {
      return isMutable() ? newMatch(fProbability) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"probability\"=" + prettyPrintValue(fProbability));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fProbability);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ProbabilityInvalidStereotype.Match)) {
          ProbabilityInvalidStereotype.Match other = (ProbabilityInvalidStereotype.Match) obj;
          return Objects.equals(fProbability, other.fProbability);
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
    public ProbabilityInvalidStereotype specification() {
      return ProbabilityInvalidStereotype.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ProbabilityInvalidStereotype.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ProbabilityInvalidStereotype.Match newMutableMatch(final NamedElement pProbability) {
      return new Mutable(pProbability);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ProbabilityInvalidStereotype.Match newMatch(final NamedElement pProbability) {
      return new Immutable(pProbability);
    }
    
    private static final class Mutable extends ProbabilityInvalidStereotype.Match {
      Mutable(final NamedElement pProbability) {
        super(pProbability);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ProbabilityInvalidStereotype.Match {
      Immutable(final NamedElement pProbability) {
        super(pProbability);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.probabilityInvalidStereotype pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern probabilityInvalidStereotype(probability : NamedElement) {
   * 	ActivityEdge(probability);
   * 	find sysml.Probability(probability, _);
   * 	ActivityEdge.source(probability, source);
   * 	neg DecisionNode(source);
   * } or {
   * 	ParameterSet(probability);
   * 	find sysml.Probability(probability, _);
   * 	ParameterSet.parameter(probability, parameter);
   * 	neg Parameter.direction(parameter, ::^out);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ProbabilityInvalidStereotype
   * 
   */
  public static class Matcher extends BaseMatcher<ProbabilityInvalidStereotype.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ProbabilityInvalidStereotype.Matcher on(final ViatraQueryEngine engine) {
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
    public static ProbabilityInvalidStereotype.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROBABILITY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ProbabilityInvalidStereotype.Matcher.class);
    
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
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ProbabilityInvalidStereotype.Match> getAllMatches(final NamedElement pProbability) {
      return rawStreamAllMatches(new Object[]{pProbability}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ProbabilityInvalidStereotype.Match> streamAllMatches(final NamedElement pProbability) {
      return rawStreamAllMatches(new Object[]{pProbability});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ProbabilityInvalidStereotype.Match> getOneArbitraryMatch(final NamedElement pProbability) {
      return rawGetOneArbitraryMatch(new Object[]{pProbability});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pProbability) {
      return rawHasMatch(new Object[]{pProbability});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pProbability) {
      return rawCountMatches(new Object[]{pProbability});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pProbability, final Consumer<? super ProbabilityInvalidStereotype.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pProbability}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProbability the fixed value of pattern parameter probability, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ProbabilityInvalidStereotype.Match newMatch(final NamedElement pProbability) {
      return ProbabilityInvalidStereotype.Match.newMatch(pProbability);
    }
    
    /**
     * Retrieve the set of values that occur in matches for probability.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfprobability(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROBABILITY, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for probability.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfprobability() {
      return rawStreamAllValuesOfprobability(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for probability.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfprobability() {
      return rawStreamAllValuesOfprobability(emptyArray());
    }
    
    @Override
    protected ProbabilityInvalidStereotype.Match tupleToMatch(final Tuple t) {
      try {
          return ProbabilityInvalidStereotype.Match.newMatch((NamedElement) t.get(POSITION_PROBABILITY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ProbabilityInvalidStereotype.Match arrayToMatch(final Object[] match) {
      try {
          return ProbabilityInvalidStereotype.Match.newMatch((NamedElement) match[POSITION_PROBABILITY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ProbabilityInvalidStereotype.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ProbabilityInvalidStereotype.Match.newMutableMatch((NamedElement) match[POSITION_PROBABILITY]);
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
    public static IQuerySpecification<ProbabilityInvalidStereotype.Matcher> querySpecification() {
      return ProbabilityInvalidStereotype.instance();
    }
  }
  
  private ProbabilityInvalidStereotype() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ProbabilityInvalidStereotype instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ProbabilityInvalidStereotype.Matcher instantiate(final ViatraQueryEngine engine) {
    return ProbabilityInvalidStereotype.Matcher.on(engine);
  }
  
  @Override
  public ProbabilityInvalidStereotype.Matcher instantiate() {
    return ProbabilityInvalidStereotype.Matcher.create();
  }
  
  @Override
  public ProbabilityInvalidStereotype.Match newEmptyMatch() {
    return ProbabilityInvalidStereotype.Match.newEmptyMatch();
  }
  
  @Override
  public ProbabilityInvalidStereotype.Match newMatch(final Object... parameters) {
    return ProbabilityInvalidStereotype.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ProbabilityInvalidStereotype} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ProbabilityInvalidStereotype#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ProbabilityInvalidStereotype INSTANCE = new ProbabilityInvalidStereotype();
    
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
    private static final ProbabilityInvalidStereotype.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_probability = new PParameter("probability", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_probability);
    
    private class Embedded_1_DecisionNode extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.activities.mdintermediateactivities.DecisionNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "DecisionNode")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0);
      
      public Embedded_1_DecisionNode() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_2_DecisionNode";
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
        //  DecisionNode(source)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "DecisionNode")));
        return Collections.singleton(body);
      }
    }
    
    private class Embedded_2_Parameter_direction extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKind", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ParameterDirectionKind")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_2_Parameter_direction() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_2_Parameter_direction";
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
        //  Parameter.direction(parameter, ::^out)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter", "direction")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ParameterDirectionKind")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.probabilityInvalidStereotype";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("probability");
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
          PVariable var_probability = body.getOrCreateVariableByName("probability");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_source = body.getOrCreateVariableByName("source");
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_probability, parameter_probability)
          ));
          // 	ActivityEdge(probability)
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityEdge")));
          // 	find sysml.Probability(probability, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_probability, var___0_), Probability.instance().getInternalQueryRepresentation());
          // 	ActivityEdge.source(probability, source)
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityEdge")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityEdge", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ActivityNode")));
          new Equality(body, var__virtual_0_, var_source);
          // 	neg DecisionNode(source)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_source), new ProbabilityInvalidStereotype.GeneratedPQuery.Embedded_1_DecisionNode());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_probability = body.getOrCreateVariableByName("probability");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_parameter = body.getOrCreateVariableByName("parameter");
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_probability, parameter_probability)
          ));
          // 	ParameterSet(probability)
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ParameterSet")));
          // 	find sysml.Probability(probability, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_probability, var___0_), Probability.instance().getInternalQueryRepresentation());
          // 	ParameterSet.parameter(probability, parameter)
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ParameterSet")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_probability, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ParameterSet", "parameter")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Parameter")));
          new Equality(body, var__virtual_0_, var_parameter);
          // 	neg Parameter.direction(parameter, ::^out)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ParameterDirectionKindEnum.get("out"));
          new NegativePatternCall(body, Tuples.flatTupleOf(var_parameter, var__virtual_1_), new ProbabilityInvalidStereotype.GeneratedPQuery.Embedded_2_Parameter_direction());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
