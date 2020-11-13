/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/CommonLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.CompatibleClassifier;
import com.incquerylabs.magicdraw.benchmark.queries.library.OwningPackageOrSelf;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
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
 *         //Collects the InstanceSpecification of the given Element having the stereotype with the given name
 *         pattern stereotypedElement(Element : Element, Stereotype : Stereotype, ProfileName : String, StereotypeName : String) {
 *         	Element.appliedStereotype(Element, Stereotype);
 *         	find compatibleClassifier(Stereotype, superStereotype);
 *         	Stereotype.owningPackage(superStereotype, owner);
 *         	find owningPackageOrSelf(owner, profile);
 *         	Profile.name(profile, ProfileName);
 *         	Stereotype.name(superStereotype, StereotypeName);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class StereotypedElement extends BaseGeneratedEMFQuerySpecification<StereotypedElement.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.stereotypedElement pattern,
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
    private Element fElement;
    
    private Stereotype fStereotype;
    
    private String fProfileName;
    
    private String fStereotypeName;
    
    private static List<String> parameterNames = makeImmutableList("Element", "Stereotype", "ProfileName", "StereotypeName");
    
    private Match(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      this.fElement = pElement;
      this.fStereotype = pStereotype;
      this.fProfileName = pProfileName;
      this.fStereotypeName = pStereotypeName;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Element": return this.fElement;
          case "Stereotype": return this.fStereotype;
          case "ProfileName": return this.fProfileName;
          case "StereotypeName": return this.fStereotypeName;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          case 1: return this.fStereotype;
          case 2: return this.fProfileName;
          case 3: return this.fStereotypeName;
          default: return null;
      }
    }
    
    public Element getElement() {
      return this.fElement;
    }
    
    public Stereotype getStereotype() {
      return this.fStereotype;
    }
    
    public String getProfileName() {
      return this.fProfileName;
    }
    
    public String getStereotypeName() {
      return this.fStereotypeName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Element".equals(parameterName) ) {
          this.fElement = (Element) newValue;
          return true;
      }
      if ("Stereotype".equals(parameterName) ) {
          this.fStereotype = (Stereotype) newValue;
          return true;
      }
      if ("ProfileName".equals(parameterName) ) {
          this.fProfileName = (String) newValue;
          return true;
      }
      if ("StereotypeName".equals(parameterName) ) {
          this.fStereotypeName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Element pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setStereotype(final Stereotype pStereotype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStereotype = pStereotype;
    }
    
    public void setProfileName(final String pProfileName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProfileName = pProfileName;
    }
    
    public void setStereotypeName(final String pStereotypeName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStereotypeName = pStereotypeName;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.stereotypedElement";
    }
    
    @Override
    public List<String> parameterNames() {
      return StereotypedElement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fStereotype, fProfileName, fStereotypeName};
    }
    
    @Override
    public StereotypedElement.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fStereotype, fProfileName, fStereotypeName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"Stereotype\"=" + prettyPrintValue(fStereotype) + ", ");
      result.append("\"ProfileName\"=" + prettyPrintValue(fProfileName) + ", ");
      result.append("\"StereotypeName\"=" + prettyPrintValue(fStereotypeName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fStereotype, fProfileName, fStereotypeName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof StereotypedElement.Match)) {
          StereotypedElement.Match other = (StereotypedElement.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fStereotype, other.fStereotype) && Objects.equals(fProfileName, other.fProfileName) && Objects.equals(fStereotypeName, other.fStereotypeName);
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
    public StereotypedElement specification() {
      return StereotypedElement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static StereotypedElement.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static StereotypedElement.Match newMutableMatch(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return new Mutable(pElement, pStereotype, pProfileName, pStereotypeName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static StereotypedElement.Match newMatch(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return new Immutable(pElement, pStereotype, pProfileName, pStereotypeName);
    }
    
    private static final class Mutable extends StereotypedElement.Match {
      Mutable(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
        super(pElement, pStereotype, pProfileName, pStereotypeName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends StereotypedElement.Match {
      Immutable(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
        super(pElement, pStereotype, pProfileName, pStereotypeName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.stereotypedElement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Collects the InstanceSpecification of the given Element having the stereotype with the given name
   * pattern stereotypedElement(Element : Element, Stereotype : Stereotype, ProfileName : String, StereotypeName : String) {
   * 	Element.appliedStereotype(Element, Stereotype);
   * 	find compatibleClassifier(Stereotype, superStereotype);
   * 	Stereotype.owningPackage(superStereotype, owner);
   * 	find owningPackageOrSelf(owner, profile);
   * 	Profile.name(profile, ProfileName);
   * 	Stereotype.name(superStereotype, StereotypeName);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see StereotypedElement
   * 
   */
  public static class Matcher extends BaseMatcher<StereotypedElement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static StereotypedElement.Matcher on(final ViatraQueryEngine engine) {
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
    public static StereotypedElement.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_STEREOTYPE = 1;
    
    private static final int POSITION_PROFILENAME = 2;
    
    private static final int POSITION_STEREOTYPENAME = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StereotypedElement.Matcher.class);
    
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
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<StereotypedElement.Match> getAllMatches(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllMatches(new Object[]{pElement, pStereotype, pProfileName, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<StereotypedElement.Match> streamAllMatches(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllMatches(new Object[]{pElement, pStereotype, pProfileName, pStereotypeName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<StereotypedElement.Match> getOneArbitraryMatch(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pStereotype, pProfileName, pStereotypeName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawHasMatch(new Object[]{pElement, pStereotype, pProfileName, pStereotypeName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawCountMatches(new Object[]{pElement, pStereotype, pProfileName, pStereotypeName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName, final Consumer<? super StereotypedElement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pStereotype, pProfileName, pStereotypeName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pProfileName the fixed value of pattern parameter ProfileName, or null if not bound.
     * @param pStereotypeName the fixed value of pattern parameter StereotypeName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public StereotypedElement.Match newMatch(final Element pElement, final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return StereotypedElement.Match.newMatch(pElement, pStereotype, pProfileName, pStereotypeName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Element> rawStreamAllValuesOfElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(Element.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfElement() {
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
    public Stream<Element> streamAllValuesOfElement(final StereotypedElement.Match partialMatch) {
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
    public Stream<Element> streamAllValuesOfElement(final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfElement(new Object[]{null, pStereotype, pProfileName, pStereotypeName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfElement(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfElement(final Stereotype pStereotype, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfElement(new Object[]{null, pStereotype, pProfileName, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Stereotype> rawStreamAllValuesOfStereotype(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STEREOTYPE, parameters).map(Stereotype.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype() {
      return rawStreamAllValuesOfStereotype(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Stereotype> streamAllValuesOfStereotype() {
      return rawStreamAllValuesOfStereotype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Stereotype> streamAllValuesOfStereotype(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfStereotype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Stereotype> streamAllValuesOfStereotype(final Element pElement, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfStereotype(new Object[]{pElement, null, pProfileName, pStereotypeName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfStereotype(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype(final Element pElement, final String pProfileName, final String pStereotypeName) {
      return rawStreamAllValuesOfStereotype(new Object[]{pElement, null, pProfileName, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfProfileName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROFILENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfProfileName() {
      return rawStreamAllValuesOfProfileName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfProfileName() {
      return rawStreamAllValuesOfProfileName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfProfileName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfProfileName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfProfileName(final Element pElement, final Stereotype pStereotype, final String pStereotypeName) {
      return rawStreamAllValuesOfProfileName(new Object[]{pElement, pStereotype, null, pStereotypeName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfProfileName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfProfileName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ProfileName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfProfileName(final Element pElement, final Stereotype pStereotype, final String pStereotypeName) {
      return rawStreamAllValuesOfProfileName(new Object[]{pElement, pStereotype, null, pStereotypeName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfStereotypeName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STEREOTYPENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfStereotypeName() {
      return rawStreamAllValuesOfStereotypeName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfStereotypeName() {
      return rawStreamAllValuesOfStereotypeName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfStereotypeName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfStereotypeName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfStereotypeName(final Element pElement, final Stereotype pStereotype, final String pProfileName) {
      return rawStreamAllValuesOfStereotypeName(new Object[]{pElement, pStereotype, pProfileName, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfStereotypeName(final StereotypedElement.Match partialMatch) {
      return rawStreamAllValuesOfStereotypeName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for StereotypeName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfStereotypeName(final Element pElement, final Stereotype pStereotype, final String pProfileName) {
      return rawStreamAllValuesOfStereotypeName(new Object[]{pElement, pStereotype, pProfileName, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected StereotypedElement.Match tupleToMatch(final Tuple t) {
      try {
          return StereotypedElement.Match.newMatch((Element) t.get(POSITION_ELEMENT), (Stereotype) t.get(POSITION_STEREOTYPE), (String) t.get(POSITION_PROFILENAME), (String) t.get(POSITION_STEREOTYPENAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StereotypedElement.Match arrayToMatch(final Object[] match) {
      try {
          return StereotypedElement.Match.newMatch((Element) match[POSITION_ELEMENT], (Stereotype) match[POSITION_STEREOTYPE], (String) match[POSITION_PROFILENAME], (String) match[POSITION_STEREOTYPENAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StereotypedElement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return StereotypedElement.Match.newMutableMatch((Element) match[POSITION_ELEMENT], (Stereotype) match[POSITION_STEREOTYPE], (String) match[POSITION_PROFILENAME], (String) match[POSITION_STEREOTYPENAME]);
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
    public static IQuerySpecification<StereotypedElement.Matcher> querySpecification() {
      return StereotypedElement.instance();
    }
  }
  
  private StereotypedElement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static StereotypedElement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StereotypedElement.Matcher instantiate(final ViatraQueryEngine engine) {
    return StereotypedElement.Matcher.on(engine);
  }
  
  @Override
  public StereotypedElement.Matcher instantiate() {
    return StereotypedElement.Matcher.create();
  }
  
  @Override
  public StereotypedElement.Match newEmptyMatch() {
    return StereotypedElement.Match.newEmptyMatch();
  }
  
  @Override
  public StereotypedElement.Match newMatch(final Object... parameters) {
    return StereotypedElement.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element) parameters[0], (com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype) parameters[1], (java.lang.String) parameters[2], (java.lang.String) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link StereotypedElement} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link StereotypedElement#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final StereotypedElement INSTANCE = new StereotypedElement();
    
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
    private static final StereotypedElement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Element = new PParameter("Element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Stereotype = new PParameter("Stereotype", "com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")), PParameterDirection.INOUT);
    
    private final PParameter parameter_ProfileName = new PParameter("ProfileName", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")), PParameterDirection.INOUT);
    
    private final PParameter parameter_StereotypeName = new PParameter("StereotypeName", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Element, parameter_Stereotype, parameter_ProfileName, parameter_StereotypeName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.stereotypedElement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Element","Stereotype","ProfileName","StereotypeName");
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
          PVariable var_Stereotype = body.getOrCreateVariableByName("Stereotype");
          PVariable var_ProfileName = body.getOrCreateVariableByName("ProfileName");
          PVariable var_StereotypeName = body.getOrCreateVariableByName("StereotypeName");
          PVariable var_superStereotype = body.getOrCreateVariableByName("superStereotype");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          PVariable var_profile = body.getOrCreateVariableByName("profile");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Stereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_ProfileName), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_StereotypeName), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Element, parameter_Element),
             new ExportedParameter(body, var_Stereotype, parameter_Stereotype),
             new ExportedParameter(body, var_ProfileName, parameter_ProfileName),
             new ExportedParameter(body, var_StereotypeName, parameter_StereotypeName)
          ));
          // 	Element.appliedStereotype(Element, Stereotype)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element", "appliedStereotype")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          new Equality(body, var__virtual_0_, var_Stereotype);
          // 	find compatibleClassifier(Stereotype, superStereotype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Stereotype, var_superStereotype), CompatibleClassifier.instance().getInternalQueryRepresentation());
          // 	Stereotype.owningPackage(superStereotype, owner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "PackageableElement", "owningPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Package")));
          new Equality(body, var__virtual_1_, var_owner);
          // 	find owningPackageOrSelf(owner, profile)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_owner, var_profile), OwningPackageOrSelf.instance().getInternalQueryRepresentation());
          // 	Profile.name(profile, ProfileName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_profile), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Profile")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_profile, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new Equality(body, var__virtual_2_, var_ProfileName);
          // 	Stereotype.name(superStereotype, StereotypeName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new Equality(body, var__virtual_3_, var_StereotypeName);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
