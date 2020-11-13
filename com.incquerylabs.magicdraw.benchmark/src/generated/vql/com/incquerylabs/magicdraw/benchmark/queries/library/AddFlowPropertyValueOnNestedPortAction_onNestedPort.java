/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/SysMLLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.AddFlowPropertyValueOnNestedPortAction;
import com.incquerylabs.magicdraw.benchmark.queries.library.TaggedValue;
import com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.AddStructuralFeatureValueAction;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
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
 *         //Pattern that queries the 'onNestedPort' attribute of elements with the stereotype 'AddFlowPropertyValueOnNestedPortAction'.
 *         pattern AddFlowPropertyValueOnNestedPortAction_onNestedPort(Element : AddStructuralFeatureValueAction, Value: Port) {
 *         	find AddFlowPropertyValueOnNestedPortAction(Element, stereotype);
 *         	find taggedValue(Element, stereotype, "onNestedPort", taggedValue);
 *         	ElementTaggedValue.value(taggedValue, Value);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AddFlowPropertyValueOnNestedPortAction_onNestedPort extends BaseGeneratedEMFQuerySpecification<AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.AddFlowPropertyValueOnNestedPortAction_onNestedPort pattern,
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
    private AddStructuralFeatureValueAction fElement;
    
    private Port fValue;
    
    private static List<String> parameterNames = makeImmutableList("Element", "Value");
    
    private Match(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      this.fElement = pElement;
      this.fValue = pValue;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Element": return this.fElement;
          case "Value": return this.fValue;
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
    
    public AddStructuralFeatureValueAction getElement() {
      return this.fElement;
    }
    
    public Port getValue() {
      return this.fValue;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Element".equals(parameterName) ) {
          this.fElement = (AddStructuralFeatureValueAction) newValue;
          return true;
      }
      if ("Value".equals(parameterName) ) {
          this.fValue = (Port) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final AddStructuralFeatureValueAction pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setValue(final Port pValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValue = pValue;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.AddFlowPropertyValueOnNestedPortAction_onNestedPort";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fValue};
    }
    
    @Override
    public AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fValue) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"Value\"=" + prettyPrintValue(fValue));
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
      if ((obj instanceof AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match)) {
          AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match other = (AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match) obj;
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
    public AddFlowPropertyValueOnNestedPortAction_onNestedPort specification() {
      return AddFlowPropertyValueOnNestedPortAction_onNestedPort.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match newMutableMatch(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return new Mutable(pElement, pValue);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match newMatch(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return new Immutable(pElement, pValue);
    }
    
    private static final class Mutable extends AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match {
      Mutable(final AddStructuralFeatureValueAction pElement, final Port pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match {
      Immutable(final AddStructuralFeatureValueAction pElement, final Port pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.AddFlowPropertyValueOnNestedPortAction_onNestedPort pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Pattern that queries the 'onNestedPort' attribute of elements with the stereotype 'AddFlowPropertyValueOnNestedPortAction'.
   * pattern AddFlowPropertyValueOnNestedPortAction_onNestedPort(Element : AddStructuralFeatureValueAction, Value: Port) {
   * 	find AddFlowPropertyValueOnNestedPortAction(Element, stereotype);
   * 	find taggedValue(Element, stereotype, "onNestedPort", taggedValue);
   * 	ElementTaggedValue.value(taggedValue, Value);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AddFlowPropertyValueOnNestedPortAction_onNestedPort
   * 
   */
  public static class Matcher extends BaseMatcher<AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_VALUE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher.class);
    
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
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match> getAllMatches(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return rawStreamAllMatches(new Object[]{pElement, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match> streamAllMatches(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return rawStreamAllMatches(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match> getOneArbitraryMatch(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return rawHasMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return rawCountMatches(new Object[]{pElement, pValue});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final AddStructuralFeatureValueAction pElement, final Port pValue, final Consumer<? super AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pValue}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match newMatch(final AddStructuralFeatureValueAction pElement, final Port pValue) {
      return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.newMatch(pElement, pValue);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<AddStructuralFeatureValueAction> rawStreamAllValuesOfElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(AddStructuralFeatureValueAction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AddStructuralFeatureValueAction> getAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<AddStructuralFeatureValueAction> streamAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<AddStructuralFeatureValueAction> streamAllValuesOfElement(final AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<AddStructuralFeatureValueAction> streamAllValuesOfElement(final Port pValue) {
      return rawStreamAllValuesOfElement(new Object[]{null, pValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AddStructuralFeatureValueAction> getAllValuesOfElement(final AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AddStructuralFeatureValueAction> getAllValuesOfElement(final Port pValue) {
      return rawStreamAllValuesOfElement(new Object[]{null, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfValue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUE, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfValue() {
      return rawStreamAllValuesOfValue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfValue() {
      return rawStreamAllValuesOfValue(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfValue(final AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match partialMatch) {
      return rawStreamAllValuesOfValue(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfValue(final AddStructuralFeatureValueAction pElement) {
      return rawStreamAllValuesOfValue(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfValue(final AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match partialMatch) {
      return rawStreamAllValuesOfValue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfValue(final AddStructuralFeatureValueAction pElement) {
      return rawStreamAllValuesOfValue(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match tupleToMatch(final Tuple t) {
      try {
          return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.newMatch((AddStructuralFeatureValueAction) t.get(POSITION_ELEMENT), (Port) t.get(POSITION_VALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match arrayToMatch(final Object[] match) {
      try {
          return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.newMatch((AddStructuralFeatureValueAction) match[POSITION_ELEMENT], (Port) match[POSITION_VALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.newMutableMatch((AddStructuralFeatureValueAction) match[POSITION_ELEMENT], (Port) match[POSITION_VALUE]);
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
    public static IQuerySpecification<AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher> querySpecification() {
      return AddFlowPropertyValueOnNestedPortAction_onNestedPort.instance();
    }
  }
  
  private AddFlowPropertyValueOnNestedPortAction_onNestedPort() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddFlowPropertyValueOnNestedPortAction_onNestedPort instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher.on(engine);
  }
  
  @Override
  public AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher instantiate() {
    return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Matcher.create();
  }
  
  @Override
  public AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match newEmptyMatch() {
    return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.newEmptyMatch();
  }
  
  @Override
  public AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match newMatch(final Object... parameters) {
    return AddFlowPropertyValueOnNestedPortAction_onNestedPort.Match.newMatch((com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.AddStructuralFeatureValueAction) parameters[0], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AddFlowPropertyValueOnNestedPortAction_onNestedPort} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AddFlowPropertyValueOnNestedPortAction_onNestedPort#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AddFlowPropertyValueOnNestedPortAction_onNestedPort INSTANCE = new AddFlowPropertyValueOnNestedPortAction_onNestedPort();
    
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
    private static final AddFlowPropertyValueOnNestedPortAction_onNestedPort.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Element = new PParameter("Element", "com.nomagic.uml2.ext.magicdraw.actions.mdintermediateactions.AddStructuralFeatureValueAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "AddStructuralFeatureValueAction")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Value = new PParameter("Value", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Port")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Element, parameter_Value);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.AddFlowPropertyValueOnNestedPortAction_onNestedPort";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Element","Value");
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
          PVariable var_Element = body.getOrCreateVariableByName("Element");
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          PVariable var_stereotype = body.getOrCreateVariableByName("stereotype");
          PVariable var_taggedValue = body.getOrCreateVariableByName("taggedValue");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "AddStructuralFeatureValueAction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Value), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Port")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Element, parameter_Element),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	find AddFlowPropertyValueOnNestedPortAction(Element, stereotype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Element, var_stereotype), AddFlowPropertyValueOnNestedPortAction.instance().getInternalQueryRepresentation());
          // 	find taggedValue(Element, stereotype, "onNestedPort", taggedValue)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "onNestedPort");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Element, var_stereotype, var__virtual_0_, var_taggedValue), TaggedValue.instance().getInternalQueryRepresentation());
          // 	ElementTaggedValue.value(taggedValue, Value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_taggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ElementTaggedValue")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_taggedValue, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ElementTaggedValue", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")));
          new Equality(body, var__virtual_1_, var_Value);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
