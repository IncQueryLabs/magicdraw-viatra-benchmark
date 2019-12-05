/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/updm/UPDM_Library.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library.updm;

import com.incquerylabs.magicdraw.benchmark.queries.library.SlotValue;
import com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         Pattern that queries the 'startBoundaryType' attribute of elements with the stereotype 'ActualProjectMilestoneRole'.
 *          
 *           Parameters:
 *           element: 'Slot' object with the stereotype 'ActualProjectMilestoneRole'.
 *           value : Element : A value of the attribute 'startBoundaryType'.
 *          
 *         pattern ActualProjectMilestoneRole_startBoundaryType(element : Slot, value : Element) {
 *         	find ActualProjectMilestoneRole(element, domainStereotypeInstance);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.slotValue(domainStereotypeInstance, "startBoundaryType", valuespec);
 *         	ElementValue.element(valuespec, value);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ActualProjectMilestoneRole_startBoundaryType extends BaseGeneratedEMFQuerySpecification<ActualProjectMilestoneRole_startBoundaryType.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole_startBoundaryType pattern,
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
    
    private Element fValue;
    
    private static List<String> parameterNames = makeImmutableList("element", "value");
    
    private Match(final Slot pElement, final Element pValue) {
      this.fElement = pElement;
      this.fValue = pValue;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "element": return this.fElement;
          case "value": return this.fValue;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          case 1: return this.fValue;
          default: return null;
      }
    }
    
    public Slot getElement() {
      return this.fElement;
    }
    
    public Element getValue() {
      return this.fValue;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (Slot) newValue;
          return true;
      }
      if ("value".equals(parameterName) ) {
          this.fValue = (Element) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Slot pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setValue(final Element pValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValue = pValue;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole_startBoundaryType";
    }
    
    @Override
    public List<String> parameterNames() {
      return ActualProjectMilestoneRole_startBoundaryType.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fValue};
    }
    
    @Override
    public ActualProjectMilestoneRole_startBoundaryType.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fValue) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"value\"=" + prettyPrintValue(fValue));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fValue);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ActualProjectMilestoneRole_startBoundaryType.Match)) {
          ActualProjectMilestoneRole_startBoundaryType.Match other = (ActualProjectMilestoneRole_startBoundaryType.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fValue, other.fValue);
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
    public ActualProjectMilestoneRole_startBoundaryType specification() {
      return ActualProjectMilestoneRole_startBoundaryType.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ActualProjectMilestoneRole_startBoundaryType.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ActualProjectMilestoneRole_startBoundaryType.Match newMutableMatch(final Slot pElement, final Element pValue) {
      return new Mutable(pElement, pValue);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ActualProjectMilestoneRole_startBoundaryType.Match newMatch(final Slot pElement, final Element pValue) {
      return new Immutable(pElement, pValue);
    }
    
    private static final class Mutable extends ActualProjectMilestoneRole_startBoundaryType.Match {
      Mutable(final Slot pElement, final Element pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ActualProjectMilestoneRole_startBoundaryType.Match {
      Immutable(final Slot pElement, final Element pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole_startBoundaryType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Pattern that queries the 'startBoundaryType' attribute of elements with the stereotype 'ActualProjectMilestoneRole'.
   *  
   *   Parameters:
   *   element: 'Slot' object with the stereotype 'ActualProjectMilestoneRole'.
   *   value : Element : A value of the attribute 'startBoundaryType'.
   *  
   * pattern ActualProjectMilestoneRole_startBoundaryType(element : Slot, value : Element) {
   * 	find ActualProjectMilestoneRole(element, domainStereotypeInstance);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.slotValue(domainStereotypeInstance, "startBoundaryType", valuespec);
   * 	ElementValue.element(valuespec, value);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ActualProjectMilestoneRole_startBoundaryType
   * 
   */
  public static class Matcher extends BaseMatcher<ActualProjectMilestoneRole_startBoundaryType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ActualProjectMilestoneRole_startBoundaryType.Matcher on(final ViatraQueryEngine engine) {
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
    public static ActualProjectMilestoneRole_startBoundaryType.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_VALUE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ActualProjectMilestoneRole_startBoundaryType.Matcher.class);
    
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
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ActualProjectMilestoneRole_startBoundaryType.Match> getAllMatches(final Slot pElement, final Element pValue) {
      return rawStreamAllMatches(new Object[]{pElement, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ActualProjectMilestoneRole_startBoundaryType.Match> streamAllMatches(final Slot pElement, final Element pValue) {
      return rawStreamAllMatches(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ActualProjectMilestoneRole_startBoundaryType.Match> getOneArbitraryMatch(final Slot pElement, final Element pValue) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Slot pElement, final Element pValue) {
      return rawHasMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Slot pElement, final Element pValue) {
      return rawCountMatches(new Object[]{pElement, pValue});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Slot pElement, final Element pValue, final Consumer<? super ActualProjectMilestoneRole_startBoundaryType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pValue}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValue the fixed value of pattern parameter value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ActualProjectMilestoneRole_startBoundaryType.Match newMatch(final Slot pElement, final Element pValue) {
      return ActualProjectMilestoneRole_startBoundaryType.Match.newMatch(pElement, pValue);
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
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Slot> streamAllValuesOfelement(final ActualProjectMilestoneRole_startBoundaryType.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Slot> streamAllValuesOfelement(final Element pValue) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Slot> getAllValuesOfelement(final ActualProjectMilestoneRole_startBoundaryType.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Slot> getAllValuesOfelement(final Element pValue) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Element> rawStreamAllValuesOfvalue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUE, parameters).map(Element.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfvalue() {
      return rawStreamAllValuesOfvalue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfvalue() {
      return rawStreamAllValuesOfvalue(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfvalue(final ActualProjectMilestoneRole_startBoundaryType.Match partialMatch) {
      return rawStreamAllValuesOfvalue(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfvalue(final Slot pElement) {
      return rawStreamAllValuesOfvalue(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfvalue(final ActualProjectMilestoneRole_startBoundaryType.Match partialMatch) {
      return rawStreamAllValuesOfvalue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfvalue(final Slot pElement) {
      return rawStreamAllValuesOfvalue(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ActualProjectMilestoneRole_startBoundaryType.Match tupleToMatch(final Tuple t) {
      try {
          return ActualProjectMilestoneRole_startBoundaryType.Match.newMatch((Slot) t.get(POSITION_ELEMENT), (Element) t.get(POSITION_VALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActualProjectMilestoneRole_startBoundaryType.Match arrayToMatch(final Object[] match) {
      try {
          return ActualProjectMilestoneRole_startBoundaryType.Match.newMatch((Slot) match[POSITION_ELEMENT], (Element) match[POSITION_VALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ActualProjectMilestoneRole_startBoundaryType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ActualProjectMilestoneRole_startBoundaryType.Match.newMutableMatch((Slot) match[POSITION_ELEMENT], (Element) match[POSITION_VALUE]);
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
    public static IQuerySpecification<ActualProjectMilestoneRole_startBoundaryType.Matcher> querySpecification() {
      return ActualProjectMilestoneRole_startBoundaryType.instance();
    }
  }
  
  private ActualProjectMilestoneRole_startBoundaryType() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ActualProjectMilestoneRole_startBoundaryType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ActualProjectMilestoneRole_startBoundaryType.Matcher instantiate(final ViatraQueryEngine engine) {
    return ActualProjectMilestoneRole_startBoundaryType.Matcher.on(engine);
  }
  
  @Override
  public ActualProjectMilestoneRole_startBoundaryType.Matcher instantiate() {
    return ActualProjectMilestoneRole_startBoundaryType.Matcher.create();
  }
  
  @Override
  public ActualProjectMilestoneRole_startBoundaryType.Match newEmptyMatch() {
    return ActualProjectMilestoneRole_startBoundaryType.Match.newEmptyMatch();
  }
  
  @Override
  public ActualProjectMilestoneRole_startBoundaryType.Match newMatch(final Object... parameters) {
    return ActualProjectMilestoneRole_startBoundaryType.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ActualProjectMilestoneRole_startBoundaryType} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ActualProjectMilestoneRole_startBoundaryType#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ActualProjectMilestoneRole_startBoundaryType INSTANCE = new ActualProjectMilestoneRole_startBoundaryType();
    
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
    private static final ActualProjectMilestoneRole_startBoundaryType.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")), PParameterDirection.INOUT);
    
    private final PParameter parameter_value = new PParameter("value", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_value);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.updm.ActualProjectMilestoneRole_startBoundaryType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","value");
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
          PVariable var_value = body.getOrCreateVariableByName("value");
          PVariable var_domainStereotypeInstance = body.getOrCreateVariableByName("domainStereotypeInstance");
          PVariable var_valuespec = body.getOrCreateVariableByName("valuespec");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Slot")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_value), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_value, parameter_value)
          ));
          // 	find ActualProjectMilestoneRole(element, domainStereotypeInstance)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_domainStereotypeInstance), ActualProjectMilestoneRole.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.slotValue(domainStereotypeInstance, "startBoundaryType", valuespec)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "startBoundaryType");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_domainStereotypeInstance, var__virtual_0_, var_valuespec), SlotValue.instance().getInternalQueryRepresentation());
          // 	ElementValue.element(valuespec, value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ElementValue")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ElementValue", "element")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Element")));
          new Equality(body, var__virtual_1_, var_value);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
