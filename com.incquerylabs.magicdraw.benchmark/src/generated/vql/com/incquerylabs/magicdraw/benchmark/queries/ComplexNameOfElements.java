/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         Reusing namedElement and eval the names.
 *          
 *         pattern complexNameOfElements(element : NamedElement, complexName : java ^java.lang.String) {
 *         	find namedElement(element, name);
 *         	complexName == eval(name.toFirstUpper + ". "+ name.toFirstLower + "." + name.toUpperCase + "." + name.toLowerCase + "." + name.length); 
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ComplexNameOfElements extends BaseGeneratedEMFQuerySpecification<ComplexNameOfElements.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.complexNameOfElements pattern,
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
    private NamedElement fElement;
    
    private String fComplexName;
    
    private static List<String> parameterNames = makeImmutableList("element", "complexName");
    
    private Match(final NamedElement pElement, final String pComplexName) {
      this.fElement = pElement;
      this.fComplexName = pComplexName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("element".equals(parameterName)) return this.fElement;
      if ("complexName".equals(parameterName)) return this.fComplexName;
      return null;
    }
    
    public NamedElement getElement() {
      return this.fElement;
    }
    
    public String getComplexName() {
      return this.fComplexName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (NamedElement) newValue;
          return true;
      }
      if ("complexName".equals(parameterName) ) {
          this.fComplexName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final NamedElement pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setComplexName(final String pComplexName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fComplexName = pComplexName;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.complexNameOfElements";
    }
    
    @Override
    public List<String> parameterNames() {
      return ComplexNameOfElements.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fComplexName};
    }
    
    @Override
    public ComplexNameOfElements.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fComplexName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"complexName\"=" + prettyPrintValue(fComplexName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fComplexName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ComplexNameOfElements.Match)) {
          ComplexNameOfElements.Match other = (ComplexNameOfElements.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fComplexName, other.fComplexName);
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
    public ComplexNameOfElements specification() {
      return ComplexNameOfElements.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ComplexNameOfElements.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ComplexNameOfElements.Match newMutableMatch(final NamedElement pElement, final String pComplexName) {
      return new Mutable(pElement, pComplexName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ComplexNameOfElements.Match newMatch(final NamedElement pElement, final String pComplexName) {
      return new Immutable(pElement, pComplexName);
    }
    
    private static final class Mutable extends ComplexNameOfElements.Match {
      Mutable(final NamedElement pElement, final String pComplexName) {
        super(pElement, pComplexName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ComplexNameOfElements.Match {
      Immutable(final NamedElement pElement, final String pComplexName) {
        super(pElement, pComplexName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.complexNameOfElements pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Reusing namedElement and eval the names.
   *  
   * pattern complexNameOfElements(element : NamedElement, complexName : java ^java.lang.String) {
   * 	find namedElement(element, name);
   * 	complexName == eval(name.toFirstUpper + ". "+ name.toFirstLower + "." + name.toUpperCase + "." + name.toLowerCase + "." + name.length); 
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ComplexNameOfElements
   * 
   */
  public static class Matcher extends BaseMatcher<ComplexNameOfElements.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ComplexNameOfElements.Matcher on(final ViatraQueryEngine engine) {
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
    public static ComplexNameOfElements.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_COMPLEXNAME = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ComplexNameOfElements.Matcher.class);
    
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
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ComplexNameOfElements.Match> getAllMatches(final NamedElement pElement, final String pComplexName) {
      return rawStreamAllMatches(new Object[]{pElement, pComplexName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ComplexNameOfElements.Match> streamAllMatches(final NamedElement pElement, final String pComplexName) {
      return rawStreamAllMatches(new Object[]{pElement, pComplexName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ComplexNameOfElements.Match> getOneArbitraryMatch(final NamedElement pElement, final String pComplexName) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pComplexName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pElement, final String pComplexName) {
      return rawHasMatch(new Object[]{pElement, pComplexName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pElement, final String pComplexName) {
      return rawCountMatches(new Object[]{pElement, pComplexName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pElement, final String pComplexName, final Consumer<? super ComplexNameOfElements.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pComplexName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pComplexName the fixed value of pattern parameter complexName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ComplexNameOfElements.Match newMatch(final NamedElement pElement, final String pComplexName) {
      return ComplexNameOfElements.Match.newMatch(pElement, pComplexName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfelement() {
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
    public Stream<NamedElement> streamAllValuesOfelement(final ComplexNameOfElements.Match partialMatch) {
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
    public Stream<NamedElement> streamAllValuesOfelement(final String pComplexName) {
      return rawStreamAllValuesOfelement(new Object[]{null, pComplexName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelement(final ComplexNameOfElements.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfelement(final String pComplexName) {
      return rawStreamAllValuesOfelement(new Object[]{null, pComplexName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfcomplexName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_COMPLEXNAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfcomplexName() {
      return rawStreamAllValuesOfcomplexName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfcomplexName() {
      return rawStreamAllValuesOfcomplexName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfcomplexName(final ComplexNameOfElements.Match partialMatch) {
      return rawStreamAllValuesOfcomplexName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfcomplexName(final NamedElement pElement) {
      return rawStreamAllValuesOfcomplexName(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfcomplexName(final ComplexNameOfElements.Match partialMatch) {
      return rawStreamAllValuesOfcomplexName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for complexName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfcomplexName(final NamedElement pElement) {
      return rawStreamAllValuesOfcomplexName(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ComplexNameOfElements.Match tupleToMatch(final Tuple t) {
      try {
          return ComplexNameOfElements.Match.newMatch((NamedElement) t.get(POSITION_ELEMENT), (String) t.get(POSITION_COMPLEXNAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ComplexNameOfElements.Match arrayToMatch(final Object[] match) {
      try {
          return ComplexNameOfElements.Match.newMatch((NamedElement) match[POSITION_ELEMENT], (String) match[POSITION_COMPLEXNAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ComplexNameOfElements.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ComplexNameOfElements.Match.newMutableMatch((NamedElement) match[POSITION_ELEMENT], (String) match[POSITION_COMPLEXNAME]);
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
    public static IQuerySpecification<ComplexNameOfElements.Matcher> querySpecification() {
      return ComplexNameOfElements.instance();
    }
  }
  
  private ComplexNameOfElements() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ComplexNameOfElements instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ComplexNameOfElements.Matcher instantiate(final ViatraQueryEngine engine) {
    return ComplexNameOfElements.Matcher.on(engine);
  }
  
  @Override
  public ComplexNameOfElements.Matcher instantiate() {
    return ComplexNameOfElements.Matcher.create();
  }
  
  @Override
  public ComplexNameOfElements.Match newEmptyMatch() {
    return ComplexNameOfElements.Match.newEmptyMatch();
  }
  
  @Override
  public ComplexNameOfElements.Match newMatch(final Object... parameters) {
    return ComplexNameOfElements.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.ComplexNameOfElements (visibility: PUBLIC, simpleName: ComplexNameOfElements, identifier: com.incquerylabs.magicdraw.benchmark.queries.ComplexNameOfElements, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.ComplexNameOfElements (visibility: PUBLIC, simpleName: ComplexNameOfElements, identifier: com.incquerylabs.magicdraw.benchmark.queries.ComplexNameOfElements, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ComplexNameOfElements INSTANCE = new ComplexNameOfElements();
    
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
    private static final ComplexNameOfElements.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_complexName = new PParameter("complexName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_complexName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.complexNameOfElements";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","complexName");
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
          PVariable var_complexName = body.getOrCreateVariableByName("complexName");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_complexName), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_complexName, parameter_complexName)
          ));
          // 	find namedElement(element, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_name), com.incquerylabs.magicdraw.benchmark.queries.NamedElement.instance().getInternalQueryRepresentation());
          // 	complexName == eval(name.toFirstUpper + ". "+ name.toFirstLower + "." + name.toUpperCase + "." + name.toLowerCase + "." + name.length)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern complexNameOfElements";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String name = (String) provider.getValue("name");
                  return evaluateExpression_1_1(name);
              }
          },  var__virtual_0_ ); 
          new Equality(body, var_complexName, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String name) {
    String _firstUpper = StringExtensions.toFirstUpper(name);
    String _plus = (_firstUpper + ". ");
    String _firstLower = StringExtensions.toFirstLower(name);
    String _plus_1 = (_plus + _firstLower);
    String _plus_2 = (_plus_1 + ".");
    String _upperCase = name.toUpperCase();
    String _plus_3 = (_plus_2 + _upperCase);
    String _plus_4 = (_plus_3 + ".");
    String _lowerCase = name.toLowerCase();
    String _plus_5 = (_plus_4 + _lowerCase);
    String _plus_6 = (_plus_5 + ".");
    int _length = name.length();
    String _plus_7 = (_plus_6 + Integer.valueOf(_length));
    return _plus_7;
  }
}
