/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
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
import sysml.Conform;
import sysml.Viewpoint;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern conformGeneralNotViewpoint(conform : Generalization) {
 *         	find sysml.Conform(conform, _);
 *         	Generalization.general(conform, general);
 *         	neg find sysml.Viewpoint(general, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConformGeneralNotViewpoint extends BaseGeneratedEMFQuerySpecification<ConformGeneralNotViewpoint.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.conformGeneralNotViewpoint pattern,
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
    private Generalization fConform;
    
    private static List<String> parameterNames = makeImmutableList("conform");
    
    private Match(final Generalization pConform) {
      this.fConform = pConform;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("conform".equals(parameterName)) return this.fConform;
      return null;
    }
    
    public Generalization getConform() {
      return this.fConform;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("conform".equals(parameterName) ) {
          this.fConform = (Generalization) newValue;
          return true;
      }
      return false;
    }
    
    public void setConform(final Generalization pConform) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConform = pConform;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.conformGeneralNotViewpoint";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConformGeneralNotViewpoint.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fConform};
    }
    
    @Override
    public ConformGeneralNotViewpoint.Match toImmutable() {
      return isMutable() ? newMatch(fConform) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"conform\"=" + prettyPrintValue(fConform));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fConform);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConformGeneralNotViewpoint.Match)) {
          ConformGeneralNotViewpoint.Match other = (ConformGeneralNotViewpoint.Match) obj;
          return Objects.equals(fConform, other.fConform);
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
    public ConformGeneralNotViewpoint specification() {
      return ConformGeneralNotViewpoint.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConformGeneralNotViewpoint.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConformGeneralNotViewpoint.Match newMutableMatch(final Generalization pConform) {
      return new Mutable(pConform);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConformGeneralNotViewpoint.Match newMatch(final Generalization pConform) {
      return new Immutable(pConform);
    }
    
    private static final class Mutable extends ConformGeneralNotViewpoint.Match {
      Mutable(final Generalization pConform) {
        super(pConform);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConformGeneralNotViewpoint.Match {
      Immutable(final Generalization pConform) {
        super(pConform);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.conformGeneralNotViewpoint pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern conformGeneralNotViewpoint(conform : Generalization) {
   * 	find sysml.Conform(conform, _);
   * 	Generalization.general(conform, general);
   * 	neg find sysml.Viewpoint(general, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConformGeneralNotViewpoint
   * 
   */
  public static class Matcher extends BaseMatcher<ConformGeneralNotViewpoint.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConformGeneralNotViewpoint.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConformGeneralNotViewpoint.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONFORM = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConformGeneralNotViewpoint.Matcher.class);
    
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
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConformGeneralNotViewpoint.Match> getAllMatches(final Generalization pConform) {
      return rawStreamAllMatches(new Object[]{pConform}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConformGeneralNotViewpoint.Match> streamAllMatches(final Generalization pConform) {
      return rawStreamAllMatches(new Object[]{pConform});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConformGeneralNotViewpoint.Match> getOneArbitraryMatch(final Generalization pConform) {
      return rawGetOneArbitraryMatch(new Object[]{pConform});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Generalization pConform) {
      return rawHasMatch(new Object[]{pConform});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Generalization pConform) {
      return rawCountMatches(new Object[]{pConform});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Generalization pConform, final Consumer<? super ConformGeneralNotViewpoint.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pConform}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConform the fixed value of pattern parameter conform, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConformGeneralNotViewpoint.Match newMatch(final Generalization pConform) {
      return ConformGeneralNotViewpoint.Match.newMatch(pConform);
    }
    
    /**
     * Retrieve the set of values that occur in matches for conform.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Generalization> rawStreamAllValuesOfconform(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CONFORM, parameters).map(Generalization.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for conform.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Generalization> getAllValuesOfconform() {
      return rawStreamAllValuesOfconform(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for conform.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Generalization> streamAllValuesOfconform() {
      return rawStreamAllValuesOfconform(emptyArray());
    }
    
    @Override
    protected ConformGeneralNotViewpoint.Match tupleToMatch(final Tuple t) {
      try {
          return ConformGeneralNotViewpoint.Match.newMatch((Generalization) t.get(POSITION_CONFORM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConformGeneralNotViewpoint.Match arrayToMatch(final Object[] match) {
      try {
          return ConformGeneralNotViewpoint.Match.newMatch((Generalization) match[POSITION_CONFORM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConformGeneralNotViewpoint.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConformGeneralNotViewpoint.Match.newMutableMatch((Generalization) match[POSITION_CONFORM]);
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
    public static IQuerySpecification<ConformGeneralNotViewpoint.Matcher> querySpecification() {
      return ConformGeneralNotViewpoint.instance();
    }
  }
  
  private ConformGeneralNotViewpoint() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConformGeneralNotViewpoint instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConformGeneralNotViewpoint.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConformGeneralNotViewpoint.Matcher.on(engine);
  }
  
  @Override
  public ConformGeneralNotViewpoint.Matcher instantiate() {
    return ConformGeneralNotViewpoint.Matcher.create();
  }
  
  @Override
  public ConformGeneralNotViewpoint.Match newEmptyMatch() {
    return ConformGeneralNotViewpoint.Match.newEmptyMatch();
  }
  
  @Override
  public ConformGeneralNotViewpoint.Match newMatch(final Object... parameters) {
    return ConformGeneralNotViewpoint.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.ConformGeneralNotViewpoint (visibility: PUBLIC, simpleName: ConformGeneralNotViewpoint, identifier: com.incquerylabs.magicdraw.benchmark.queries.ConformGeneralNotViewpoint, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.ConformGeneralNotViewpoint (visibility: PUBLIC, simpleName: ConformGeneralNotViewpoint, identifier: com.incquerylabs.magicdraw.benchmark.queries.ConformGeneralNotViewpoint, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConformGeneralNotViewpoint INSTANCE = new ConformGeneralNotViewpoint();
    
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
    private static final ConformGeneralNotViewpoint.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_conform = new PParameter("conform", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_conform);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.conformGeneralNotViewpoint";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("conform");
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
          PVariable var_conform = body.getOrCreateVariableByName("conform");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_general = body.getOrCreateVariableByName("general");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_conform), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_conform, parameter_conform)
          ));
          // 	find sysml.Conform(conform, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_conform, var___0_), Conform.instance().getInternalQueryRepresentation());
          // 	Generalization.general(conform, general)
          new TypeConstraint(body, Tuples.flatTupleOf(var_conform), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_conform, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization", "general")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          new Equality(body, var__virtual_0_, var_general);
          // 	neg find sysml.Viewpoint(general, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_general, var___1_), Viewpoint.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
