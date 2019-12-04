/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
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
 *         pattern requirementIdNotUnique(req : NamedElement) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(req, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id(req, id);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(req2, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id(req2, id);
 *         	req != req2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RequirementIdNotUnique extends BaseGeneratedEMFQuerySpecification<RequirementIdNotUnique.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.requirementIdNotUnique pattern,
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
    private NamedElement fReq;
    
    private static List<String> parameterNames = makeImmutableList("req");
    
    private Match(final NamedElement pReq) {
      this.fReq = pReq;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "req": return this.fReq;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fReq;
          default: return null;
      }
    }
    
    public NamedElement getReq() {
      return this.fReq;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("req".equals(parameterName) ) {
          this.fReq = (NamedElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setReq(final NamedElement pReq) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReq = pReq;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.requirementIdNotUnique";
    }
    
    @Override
    public List<String> parameterNames() {
      return RequirementIdNotUnique.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReq};
    }
    
    @Override
    public RequirementIdNotUnique.Match toImmutable() {
      return isMutable() ? newMatch(fReq) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"req\"=" + prettyPrintValue(fReq));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fReq);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RequirementIdNotUnique.Match)) {
          RequirementIdNotUnique.Match other = (RequirementIdNotUnique.Match) obj;
          return Objects.equals(fReq, other.fReq);
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
    public RequirementIdNotUnique specification() {
      return RequirementIdNotUnique.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RequirementIdNotUnique.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RequirementIdNotUnique.Match newMutableMatch(final NamedElement pReq) {
      return new Mutable(pReq);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RequirementIdNotUnique.Match newMatch(final NamedElement pReq) {
      return new Immutable(pReq);
    }
    
    private static final class Mutable extends RequirementIdNotUnique.Match {
      Mutable(final NamedElement pReq) {
        super(pReq);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RequirementIdNotUnique.Match {
      Immutable(final NamedElement pReq) {
        super(pReq);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.requirementIdNotUnique pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern requirementIdNotUnique(req : NamedElement) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(req, _);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id(req, id);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(req2, _);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id(req2, id);
   * 	req != req2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RequirementIdNotUnique
   * 
   */
  public static class Matcher extends BaseMatcher<RequirementIdNotUnique.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RequirementIdNotUnique.Matcher on(final ViatraQueryEngine engine) {
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
    public static RequirementIdNotUnique.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_REQ = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RequirementIdNotUnique.Matcher.class);
    
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
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RequirementIdNotUnique.Match> getAllMatches(final NamedElement pReq) {
      return rawStreamAllMatches(new Object[]{pReq}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RequirementIdNotUnique.Match> streamAllMatches(final NamedElement pReq) {
      return rawStreamAllMatches(new Object[]{pReq});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RequirementIdNotUnique.Match> getOneArbitraryMatch(final NamedElement pReq) {
      return rawGetOneArbitraryMatch(new Object[]{pReq});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pReq) {
      return rawHasMatch(new Object[]{pReq});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pReq) {
      return rawCountMatches(new Object[]{pReq});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pReq, final Consumer<? super RequirementIdNotUnique.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReq}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReq the fixed value of pattern parameter req, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RequirementIdNotUnique.Match newMatch(final NamedElement pReq) {
      return RequirementIdNotUnique.Match.newMatch(pReq);
    }
    
    /**
     * Retrieve the set of values that occur in matches for req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfreq(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REQ, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfreq() {
      return rawStreamAllValuesOfreq(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfreq() {
      return rawStreamAllValuesOfreq(emptyArray());
    }
    
    @Override
    protected RequirementIdNotUnique.Match tupleToMatch(final Tuple t) {
      try {
          return RequirementIdNotUnique.Match.newMatch((NamedElement) t.get(POSITION_REQ));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RequirementIdNotUnique.Match arrayToMatch(final Object[] match) {
      try {
          return RequirementIdNotUnique.Match.newMatch((NamedElement) match[POSITION_REQ]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RequirementIdNotUnique.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RequirementIdNotUnique.Match.newMutableMatch((NamedElement) match[POSITION_REQ]);
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
    public static IQuerySpecification<RequirementIdNotUnique.Matcher> querySpecification() {
      return RequirementIdNotUnique.instance();
    }
  }
  
  private RequirementIdNotUnique() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RequirementIdNotUnique instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RequirementIdNotUnique.Matcher instantiate(final ViatraQueryEngine engine) {
    return RequirementIdNotUnique.Matcher.on(engine);
  }
  
  @Override
  public RequirementIdNotUnique.Matcher instantiate() {
    return RequirementIdNotUnique.Matcher.create();
  }
  
  @Override
  public RequirementIdNotUnique.Match newEmptyMatch() {
    return RequirementIdNotUnique.Match.newEmptyMatch();
  }
  
  @Override
  public RequirementIdNotUnique.Match newMatch(final Object... parameters) {
    return RequirementIdNotUnique.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RequirementIdNotUnique} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RequirementIdNotUnique#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RequirementIdNotUnique INSTANCE = new RequirementIdNotUnique();
    
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
    private static final RequirementIdNotUnique.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_req = new PParameter("req", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_req);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.requirementIdNotUnique";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("req");
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
          PVariable var_req = body.getOrCreateVariableByName("req");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_id = body.getOrCreateVariableByName("id");
          PVariable var_req2 = body.getOrCreateVariableByName("req2");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_req, parameter_req)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(req, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_req, var___0_), AbstractRequirement.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id(req, id)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_req, var_id), AbstractRequirement_Id.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(req2, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_req2, var___1_), AbstractRequirement.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement_Id(req2, id)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_req2, var_id), AbstractRequirement_Id.instance().getInternalQueryRepresentation());
          // 	req != req2
          new Inequality(body, var_req, var_req2);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
