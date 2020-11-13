/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/SysMLLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.TaggedValue;
import com.incquerylabs.magicdraw.benchmark.queries.library.View;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
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
 *         //Pattern that queries the 'stakeholder' attribute of elements with the stereotype 'View'.
 *         pattern View_stakeholder(Element : PackageableElement, Value: Classifier) {
 *         	find View(Element, stereotype);
 *         	find taggedValue(Element, stereotype, "stakeholder", taggedValue);
 *         	ElementTaggedValue.value(taggedValue, Value);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class View_stakeholder extends BaseGeneratedEMFQuerySpecification<View_stakeholder.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.View_stakeholder pattern,
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
    private PackageableElement fElement;
    
    private Classifier fValue;
    
    private static List<String> parameterNames = makeImmutableList("Element", "Value");
    
    private Match(final PackageableElement pElement, final Classifier pValue) {
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
    
    public PackageableElement getElement() {
      return this.fElement;
    }
    
    public Classifier getValue() {
      return this.fValue;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Element".equals(parameterName) ) {
          this.fElement = (PackageableElement) newValue;
          return true;
      }
      if ("Value".equals(parameterName) ) {
          this.fValue = (Classifier) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final PackageableElement pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setValue(final Classifier pValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValue = pValue;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.View_stakeholder";
    }
    
    @Override
    public List<String> parameterNames() {
      return View_stakeholder.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fValue};
    }
    
    @Override
    public View_stakeholder.Match toImmutable() {
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
      if ((obj instanceof View_stakeholder.Match)) {
          View_stakeholder.Match other = (View_stakeholder.Match) obj;
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
    public View_stakeholder specification() {
      return View_stakeholder.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static View_stakeholder.Match newEmptyMatch() {
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
    public static View_stakeholder.Match newMutableMatch(final PackageableElement pElement, final Classifier pValue) {
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
    public static View_stakeholder.Match newMatch(final PackageableElement pElement, final Classifier pValue) {
      return new Immutable(pElement, pValue);
    }
    
    private static final class Mutable extends View_stakeholder.Match {
      Mutable(final PackageableElement pElement, final Classifier pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends View_stakeholder.Match {
      Immutable(final PackageableElement pElement, final Classifier pValue) {
        super(pElement, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.View_stakeholder pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Pattern that queries the 'stakeholder' attribute of elements with the stereotype 'View'.
   * pattern View_stakeholder(Element : PackageableElement, Value: Classifier) {
   * 	find View(Element, stereotype);
   * 	find taggedValue(Element, stereotype, "stakeholder", taggedValue);
   * 	ElementTaggedValue.value(taggedValue, Value);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see View_stakeholder
   * 
   */
  public static class Matcher extends BaseMatcher<View_stakeholder.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static View_stakeholder.Matcher on(final ViatraQueryEngine engine) {
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
    public static View_stakeholder.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_VALUE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(View_stakeholder.Matcher.class);
    
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
    public Collection<View_stakeholder.Match> getAllMatches(final PackageableElement pElement, final Classifier pValue) {
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
    public Stream<View_stakeholder.Match> streamAllMatches(final PackageableElement pElement, final Classifier pValue) {
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
    public Optional<View_stakeholder.Match> getOneArbitraryMatch(final PackageableElement pElement, final Classifier pValue) {
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
    public boolean hasMatch(final PackageableElement pElement, final Classifier pValue) {
      return rawHasMatch(new Object[]{pElement, pValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final PackageableElement pElement, final Classifier pValue) {
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
    public boolean forOneArbitraryMatch(final PackageableElement pElement, final Classifier pValue, final Consumer<? super View_stakeholder.Match> processor) {
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
    public View_stakeholder.Match newMatch(final PackageableElement pElement, final Classifier pValue) {
      return View_stakeholder.Match.newMatch(pElement, pValue);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<PackageableElement> rawStreamAllValuesOfElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(PackageableElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PackageableElement> getAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<PackageableElement> streamAllValuesOfElement() {
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
    public Stream<PackageableElement> streamAllValuesOfElement(final View_stakeholder.Match partialMatch) {
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
    public Stream<PackageableElement> streamAllValuesOfElement(final Classifier pValue) {
      return rawStreamAllValuesOfElement(new Object[]{null, pValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PackageableElement> getAllValuesOfElement(final View_stakeholder.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<PackageableElement> getAllValuesOfElement(final Classifier pValue) {
      return rawStreamAllValuesOfElement(new Object[]{null, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfValue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUE, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfValue() {
      return rawStreamAllValuesOfValue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfValue() {
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
    public Stream<Classifier> streamAllValuesOfValue(final View_stakeholder.Match partialMatch) {
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
    public Stream<Classifier> streamAllValuesOfValue(final PackageableElement pElement) {
      return rawStreamAllValuesOfValue(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfValue(final View_stakeholder.Match partialMatch) {
      return rawStreamAllValuesOfValue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfValue(final PackageableElement pElement) {
      return rawStreamAllValuesOfValue(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected View_stakeholder.Match tupleToMatch(final Tuple t) {
      try {
          return View_stakeholder.Match.newMatch((PackageableElement) t.get(POSITION_ELEMENT), (Classifier) t.get(POSITION_VALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected View_stakeholder.Match arrayToMatch(final Object[] match) {
      try {
          return View_stakeholder.Match.newMatch((PackageableElement) match[POSITION_ELEMENT], (Classifier) match[POSITION_VALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected View_stakeholder.Match arrayToMatchMutable(final Object[] match) {
      try {
          return View_stakeholder.Match.newMutableMatch((PackageableElement) match[POSITION_ELEMENT], (Classifier) match[POSITION_VALUE]);
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
    public static IQuerySpecification<View_stakeholder.Matcher> querySpecification() {
      return View_stakeholder.instance();
    }
  }
  
  private View_stakeholder() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static View_stakeholder instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected View_stakeholder.Matcher instantiate(final ViatraQueryEngine engine) {
    return View_stakeholder.Matcher.on(engine);
  }
  
  @Override
  public View_stakeholder.Matcher instantiate() {
    return View_stakeholder.Matcher.create();
  }
  
  @Override
  public View_stakeholder.Match newEmptyMatch() {
    return View_stakeholder.Match.newEmptyMatch();
  }
  
  @Override
  public View_stakeholder.Match newMatch(final Object... parameters) {
    return View_stakeholder.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link View_stakeholder} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link View_stakeholder#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final View_stakeholder INSTANCE = new View_stakeholder();
    
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
    private static final View_stakeholder.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Element = new PParameter("Element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "PackageableElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Value = new PParameter("Value", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Element, parameter_Value);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.View_stakeholder";
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "PackageableElement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Value), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Element, parameter_Element),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	find View(Element, stereotype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Element, var_stereotype), View.instance().getInternalQueryRepresentation());
          // 	find taggedValue(Element, stereotype, "stakeholder", taggedValue)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "stakeholder");
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
