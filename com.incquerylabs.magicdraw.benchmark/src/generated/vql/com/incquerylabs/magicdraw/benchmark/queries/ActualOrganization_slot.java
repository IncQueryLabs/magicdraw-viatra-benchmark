/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganization;
import com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganizationRole;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         UAF Standard:       Version 1.0
 *           UAF Element:     ActualOrganization
 *           UAF Constraint Id:  ActualOrganization.slot
 *          
 *         pattern ActualOrganization_slot(element : InstanceSpecification) {
 *             find com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganization(element, _);
 *             InstanceSpecification.slot(element, slot);
 *             neg find com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganizationRole(slot, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ActualOrganization_slot extends BaseGeneratedEMFQuerySpecification<ActualOrganization_slot.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_slot pattern,
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
    private InstanceSpecification fElement;
    
    private static List<String> parameterNames = makeImmutableList("element");
    
    private Match(final InstanceSpecification pElement) {
      this.fElement = pElement;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "element": return this.fElement;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          default: return null;
      }
    }
    
    public InstanceSpecification getElement() {
      return this.fElement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (InstanceSpecification) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final InstanceSpecification pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_slot";
    }
    
    @Override
    public List<String> parameterNames() {
      return ActualOrganization_slot.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement};
    }
    
    @Override
    public ActualOrganization_slot.Match toImmutable() {
      return isMutable() ? newMatch(fElement) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ActualOrganization_slot.Match)) {
          ActualOrganization_slot.Match other = (ActualOrganization_slot.Match) obj;
          return Objects.equals(fElement, other.fElement);
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
    public ActualOrganization_slot specification() {
      return ActualOrganization_slot.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ActualOrganization_slot.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ActualOrganization_slot.Match newMutableMatch(final InstanceSpecification pElement) {
      return new Mutable(pElement);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ActualOrganization_slot.Match newMatch(final InstanceSpecification pElement) {
      return new Immutable(pElement);
    }
    
    private static final class Mutable extends ActualOrganization_slot.Match {
      Mutable(final InstanceSpecification pElement) {
        super(pElement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ActualOrganization_slot.Match {
      Immutable(final InstanceSpecification pElement) {
        super(pElement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_slot pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * UAF Standard:       Version 1.0
   *   UAF Element:     ActualOrganization
   *   UAF Constraint Id:  ActualOrganization.slot
   *  
   * pattern ActualOrganization_slot(element : InstanceSpecification) {
   *     find com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganization(element, _);
   *     InstanceSpecification.slot(element, slot);
   *     neg find com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganizationRole(slot, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ActualOrganization_slot
   * 
   */
  public static class Matcher extends BaseMatcher<ActualOrganization_slot.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ActualOrganization_slot.Matcher on(final ViatraQueryEngine engine) {
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
    public static ActualOrganization_slot.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ActualOrganization_slot.Matcher.class);
    
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
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ActualOrganization_slot.Match> getAllMatches(final InstanceSpecification pElement) {
      return rawStreamAllMatches(new Object[]{pElement}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ActualOrganization_slot.Match> streamAllMatches(final InstanceSpecification pElement) {
      return rawStreamAllMatches(new Object[]{pElement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ActualOrganization_slot.Match> getOneArbitraryMatch(final InstanceSpecification pElement) {
      return rawGetOneArbitraryMatch(new Object[]{pElement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final InstanceSpecification pElement) {
      return rawHasMatch(new Object[]{pElement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final InstanceSpecification pElement) {
      return rawCountMatches(new Object[]{pElement});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final InstanceSpecification pElement, final Consumer<? super ActualOrganization_slot.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ActualOrganization_slot.Match newMatch(final InstanceSpecification pElement) {
      return ActualOrganization_slot.Match.newMatch(pElement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InstanceSpecification> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(InstanceSpecification.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InstanceSpecification> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InstanceSpecification> streamAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray());
    }
    
    @Override
    protected ActualOrganization_slot.Match tupleToMatch(final Tuple t) {
      try {
          return ActualOrganization_slot.Match.newMatch((InstanceSpecification) t.get(POSITION_ELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActualOrganization_slot.Match arrayToMatch(final Object[] match) {
      try {
          return ActualOrganization_slot.Match.newMatch((InstanceSpecification) match[POSITION_ELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActualOrganization_slot.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ActualOrganization_slot.Match.newMutableMatch((InstanceSpecification) match[POSITION_ELEMENT]);
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
    public static IQuerySpecification<ActualOrganization_slot.Matcher> querySpecification() {
      return ActualOrganization_slot.instance();
    }
  }
  
  private ActualOrganization_slot() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ActualOrganization_slot instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ActualOrganization_slot.Matcher instantiate(final ViatraQueryEngine engine) {
    return ActualOrganization_slot.Matcher.on(engine);
  }
  
  @Override
  public ActualOrganization_slot.Matcher instantiate() {
    return ActualOrganization_slot.Matcher.create();
  }
  
  @Override
  public ActualOrganization_slot.Match newEmptyMatch() {
    return ActualOrganization_slot.Match.newEmptyMatch();
  }
  
  @Override
  public ActualOrganization_slot.Match newMatch(final Object... parameters) {
    return ActualOrganization_slot.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ActualOrganization_slot} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ActualOrganization_slot#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ActualOrganization_slot INSTANCE = new ActualOrganization_slot();
    
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
    private static final ActualOrganization_slot.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.ActualOrganization_slot";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element");
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
          PVariable var_element = body.getOrCreateVariableByName("element");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_slot = body.getOrCreateVariableByName("slot");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element)
          ));
          //     find com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganization(element, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var___0_), ActualOrganization.instance().getInternalQueryRepresentation());
          //     InstanceSpecification.slot(element, slot)
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification", "slot")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          new Equality(body, var__virtual_0_, var_slot);
          //     neg find com.incquerylabs.magicdraw.benchmark.queries.library.ActualOrganizationRole(slot, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_slot, var___1_), ActualOrganizationRole.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
