/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.BoundReference_1_bindingconnector_end;
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
import sysml.BoundReference;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern boundReferenceNotConnectorEnd(boundReference : Property) {
 *         	find sysml.BoundReference(boundReference, _);
 *         	neg find BoundReference_1_bindingconnector_end(boundReference);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BoundReferenceNotConnectorEnd extends BaseGeneratedEMFQuerySpecification<BoundReferenceNotConnectorEnd.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.boundReferenceNotConnectorEnd pattern,
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
    private Property fBoundReference;
    
    private static List<String> parameterNames = makeImmutableList("boundReference");
    
    private Match(final Property pBoundReference) {
      this.fBoundReference = pBoundReference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("boundReference".equals(parameterName)) return this.fBoundReference;
      return null;
    }
    
    public Property getBoundReference() {
      return this.fBoundReference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("boundReference".equals(parameterName) ) {
          this.fBoundReference = (Property) newValue;
          return true;
      }
      return false;
    }
    
    public void setBoundReference(final Property pBoundReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fBoundReference = pBoundReference;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.boundReferenceNotConnectorEnd";
    }
    
    @Override
    public List<String> parameterNames() {
      return BoundReferenceNotConnectorEnd.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fBoundReference};
    }
    
    @Override
    public BoundReferenceNotConnectorEnd.Match toImmutable() {
      return isMutable() ? newMatch(fBoundReference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"boundReference\"=" + prettyPrintValue(fBoundReference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fBoundReference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BoundReferenceNotConnectorEnd.Match)) {
          BoundReferenceNotConnectorEnd.Match other = (BoundReferenceNotConnectorEnd.Match) obj;
          return Objects.equals(fBoundReference, other.fBoundReference);
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
    public BoundReferenceNotConnectorEnd specification() {
      return BoundReferenceNotConnectorEnd.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BoundReferenceNotConnectorEnd.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BoundReferenceNotConnectorEnd.Match newMutableMatch(final Property pBoundReference) {
      return new Mutable(pBoundReference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BoundReferenceNotConnectorEnd.Match newMatch(final Property pBoundReference) {
      return new Immutable(pBoundReference);
    }
    
    private static final class Mutable extends BoundReferenceNotConnectorEnd.Match {
      Mutable(final Property pBoundReference) {
        super(pBoundReference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends BoundReferenceNotConnectorEnd.Match {
      Immutable(final Property pBoundReference) {
        super(pBoundReference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.boundReferenceNotConnectorEnd pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern boundReferenceNotConnectorEnd(boundReference : Property) {
   * 	find sysml.BoundReference(boundReference, _);
   * 	neg find BoundReference_1_bindingconnector_end(boundReference);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BoundReferenceNotConnectorEnd
   * 
   */
  public static class Matcher extends BaseMatcher<BoundReferenceNotConnectorEnd.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BoundReferenceNotConnectorEnd.Matcher on(final ViatraQueryEngine engine) {
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
    public static BoundReferenceNotConnectorEnd.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_BOUNDREFERENCE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BoundReferenceNotConnectorEnd.Matcher.class);
    
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
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BoundReferenceNotConnectorEnd.Match> getAllMatches(final Property pBoundReference) {
      return rawStreamAllMatches(new Object[]{pBoundReference}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BoundReferenceNotConnectorEnd.Match> streamAllMatches(final Property pBoundReference) {
      return rawStreamAllMatches(new Object[]{pBoundReference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BoundReferenceNotConnectorEnd.Match> getOneArbitraryMatch(final Property pBoundReference) {
      return rawGetOneArbitraryMatch(new Object[]{pBoundReference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pBoundReference) {
      return rawHasMatch(new Object[]{pBoundReference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pBoundReference) {
      return rawCountMatches(new Object[]{pBoundReference});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pBoundReference, final Consumer<? super BoundReferenceNotConnectorEnd.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pBoundReference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pBoundReference the fixed value of pattern parameter boundReference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BoundReferenceNotConnectorEnd.Match newMatch(final Property pBoundReference) {
      return BoundReferenceNotConnectorEnd.Match.newMatch(pBoundReference);
    }
    
    /**
     * Retrieve the set of values that occur in matches for boundReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfboundReference(final Object[] parameters) {
      return rawStreamAllValues(POSITION_BOUNDREFERENCE, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for boundReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfboundReference() {
      return rawStreamAllValuesOfboundReference(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for boundReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfboundReference() {
      return rawStreamAllValuesOfboundReference(emptyArray());
    }
    
    @Override
    protected BoundReferenceNotConnectorEnd.Match tupleToMatch(final Tuple t) {
      try {
          return BoundReferenceNotConnectorEnd.Match.newMatch((Property) t.get(POSITION_BOUNDREFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BoundReferenceNotConnectorEnd.Match arrayToMatch(final Object[] match) {
      try {
          return BoundReferenceNotConnectorEnd.Match.newMatch((Property) match[POSITION_BOUNDREFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BoundReferenceNotConnectorEnd.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BoundReferenceNotConnectorEnd.Match.newMutableMatch((Property) match[POSITION_BOUNDREFERENCE]);
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
    public static IQuerySpecification<BoundReferenceNotConnectorEnd.Matcher> querySpecification() {
      return BoundReferenceNotConnectorEnd.instance();
    }
  }
  
  private BoundReferenceNotConnectorEnd() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BoundReferenceNotConnectorEnd instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected BoundReferenceNotConnectorEnd.Matcher instantiate(final ViatraQueryEngine engine) {
    return BoundReferenceNotConnectorEnd.Matcher.on(engine);
  }
  
  @Override
  public BoundReferenceNotConnectorEnd.Matcher instantiate() {
    return BoundReferenceNotConnectorEnd.Matcher.create();
  }
  
  @Override
  public BoundReferenceNotConnectorEnd.Match newEmptyMatch() {
    return BoundReferenceNotConnectorEnd.Match.newEmptyMatch();
  }
  
  @Override
  public BoundReferenceNotConnectorEnd.Match newMatch(final Object... parameters) {
    return BoundReferenceNotConnectorEnd.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotConnectorEnd (visibility: PUBLIC, simpleName: BoundReferenceNotConnectorEnd, identifier: com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotConnectorEnd, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotConnectorEnd (visibility: PUBLIC, simpleName: BoundReferenceNotConnectorEnd, identifier: com.incquerylabs.magicdraw.benchmark.queries.BoundReferenceNotConnectorEnd, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BoundReferenceNotConnectorEnd INSTANCE = new BoundReferenceNotConnectorEnd();
    
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
    private static final BoundReferenceNotConnectorEnd.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_boundReference = new PParameter("boundReference", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_boundReference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.boundReferenceNotConnectorEnd";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("boundReference");
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
          PVariable var_boundReference = body.getOrCreateVariableByName("boundReference");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_boundReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_boundReference, parameter_boundReference)
          ));
          // 	find sysml.BoundReference(boundReference, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_boundReference, var___0_), BoundReference.instance().getInternalQueryRepresentation());
          // 	neg find BoundReference_1_bindingconnector_end(boundReference)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_boundReference), BoundReference_1_bindingconnector_end.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
