/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProject;
import com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
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
 *         UPDM Standard:       Version 2.1.1
 *           Compliance Level:   UPDM L0
 *           UPDM Element:     ActualProjectMilestoneRole
 *           UPDM Constraint Id:  ActualProjectMilestoneRole.owningInstance
 *          
 *         
 *         pattern ActualProjectMilestoneRole_owningInstance(element : Slot) {
 *             find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole(element, _);
 *             Slot.owningInstance(element, owningInstance);
 *             neg find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProject(owningInstance, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ActualProjectMilestoneRole_owningInstance extends BaseGeneratedEMFQuerySpecification<ActualProjectMilestoneRole_owningInstance.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_owningInstance pattern,
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
    private Slot fElement;
    
    private static List<String> parameterNames = makeImmutableList("element");
    
    private Match(final Slot pElement) {
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
    
    public Slot getElement() {
      return this.fElement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (Slot) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Slot pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_owningInstance";
    }
    
    @Override
    public List<String> parameterNames() {
      return ActualProjectMilestoneRole_owningInstance.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement};
    }
    
    @Override
    public ActualProjectMilestoneRole_owningInstance.Match toImmutable() {
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
      if ((obj instanceof ActualProjectMilestoneRole_owningInstance.Match)) {
          ActualProjectMilestoneRole_owningInstance.Match other = (ActualProjectMilestoneRole_owningInstance.Match) obj;
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
    public ActualProjectMilestoneRole_owningInstance specification() {
      return ActualProjectMilestoneRole_owningInstance.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ActualProjectMilestoneRole_owningInstance.Match newEmptyMatch() {
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
    public static ActualProjectMilestoneRole_owningInstance.Match newMutableMatch(final Slot pElement) {
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
    public static ActualProjectMilestoneRole_owningInstance.Match newMatch(final Slot pElement) {
      return new Immutable(pElement);
    }
    
    private static final class Mutable extends ActualProjectMilestoneRole_owningInstance.Match {
      Mutable(final Slot pElement) {
        super(pElement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ActualProjectMilestoneRole_owningInstance.Match {
      Immutable(final Slot pElement) {
        super(pElement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_owningInstance pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * UPDM Standard:       Version 2.1.1
   *   Compliance Level:   UPDM L0
   *   UPDM Element:     ActualProjectMilestoneRole
   *   UPDM Constraint Id:  ActualProjectMilestoneRole.owningInstance
   *  
   * 
   * pattern ActualProjectMilestoneRole_owningInstance(element : Slot) {
   *     find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole(element, _);
   *     Slot.owningInstance(element, owningInstance);
   *     neg find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProject(owningInstance, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ActualProjectMilestoneRole_owningInstance
   * 
   */
  public static class Matcher extends BaseMatcher<ActualProjectMilestoneRole_owningInstance.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ActualProjectMilestoneRole_owningInstance.Matcher on(final ViatraQueryEngine engine) {
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
    public static ActualProjectMilestoneRole_owningInstance.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ActualProjectMilestoneRole_owningInstance.Matcher.class);
    
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
    public Collection<ActualProjectMilestoneRole_owningInstance.Match> getAllMatches(final Slot pElement) {
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
    public Stream<ActualProjectMilestoneRole_owningInstance.Match> streamAllMatches(final Slot pElement) {
      return rawStreamAllMatches(new Object[]{pElement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ActualProjectMilestoneRole_owningInstance.Match> getOneArbitraryMatch(final Slot pElement) {
      return rawGetOneArbitraryMatch(new Object[]{pElement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Slot pElement) {
      return rawHasMatch(new Object[]{pElement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Slot pElement) {
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
    public boolean forOneArbitraryMatch(final Slot pElement, final Consumer<? super ActualProjectMilestoneRole_owningInstance.Match> processor) {
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
    public ActualProjectMilestoneRole_owningInstance.Match newMatch(final Slot pElement) {
      return ActualProjectMilestoneRole_owningInstance.Match.newMatch(pElement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Slot> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(Slot.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Slot> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Slot> streamAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray());
    }
    
    @Override
    protected ActualProjectMilestoneRole_owningInstance.Match tupleToMatch(final Tuple t) {
      try {
          return ActualProjectMilestoneRole_owningInstance.Match.newMatch((Slot) t.get(POSITION_ELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActualProjectMilestoneRole_owningInstance.Match arrayToMatch(final Object[] match) {
      try {
          return ActualProjectMilestoneRole_owningInstance.Match.newMatch((Slot) match[POSITION_ELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActualProjectMilestoneRole_owningInstance.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ActualProjectMilestoneRole_owningInstance.Match.newMutableMatch((Slot) match[POSITION_ELEMENT]);
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
    public static IQuerySpecification<ActualProjectMilestoneRole_owningInstance.Matcher> querySpecification() {
      return ActualProjectMilestoneRole_owningInstance.instance();
    }
  }
  
  private ActualProjectMilestoneRole_owningInstance() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ActualProjectMilestoneRole_owningInstance instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ActualProjectMilestoneRole_owningInstance.Matcher instantiate(final ViatraQueryEngine engine) {
    return ActualProjectMilestoneRole_owningInstance.Matcher.on(engine);
  }
  
  @Override
  public ActualProjectMilestoneRole_owningInstance.Matcher instantiate() {
    return ActualProjectMilestoneRole_owningInstance.Matcher.create();
  }
  
  @Override
  public ActualProjectMilestoneRole_owningInstance.Match newEmptyMatch() {
    return ActualProjectMilestoneRole_owningInstance.Match.newEmptyMatch();
  }
  
  @Override
  public ActualProjectMilestoneRole_owningInstance.Match newMatch(final Object... parameters) {
    return ActualProjectMilestoneRole_owningInstance.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ActualProjectMilestoneRole_owningInstance} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ActualProjectMilestoneRole_owningInstance#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ActualProjectMilestoneRole_owningInstance INSTANCE = new ActualProjectMilestoneRole_owningInstance();
    
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
    private static final ActualProjectMilestoneRole_owningInstance.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.ActualProjectMilestoneRole_owningInstance";
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
          PVariable var_owningInstance = body.getOrCreateVariableByName("owningInstance");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element)
          ));
          //     find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole(element, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var___0_), ActualProjectMilestoneRole.instance().getInternalQueryRepresentation());
          //     Slot.owningInstance(element, owningInstance)
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot", "owningInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InstanceSpecification")));
          new Equality(body, var__virtual_0_, var_owningInstance);
          //     neg find com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProject(owningInstance, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_owningInstance, var___1_), ActualProject.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
