/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/CommonLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.CompatibleClassifier;
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
 *         //Matches the value of the slot with the given name
 *         pattern taggedValue(Element : Element, Stereotype : Stereotype, FeatureName : String, TaggedValue : TaggedValue) {
 *         	Element.taggedValue(Element, TaggedValue);
 *         	TaggedValue.tagDefinition(TaggedValue, tagDefinition);
 *         	find compatibleClassifier(Stereotype, superStereotype);
 *         	Stereotype.ownedAttribute(superStereotype, tagDefinition);
 *         	Property.name(tagDefinition, FeatureName);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TaggedValue extends BaseGeneratedEMFQuerySpecification<TaggedValue.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.taggedValue pattern,
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
    
    private String fFeatureName;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue fTaggedValue;
    
    private static List<String> parameterNames = makeImmutableList("Element", "Stereotype", "FeatureName", "TaggedValue");
    
    private Match(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      this.fElement = pElement;
      this.fStereotype = pStereotype;
      this.fFeatureName = pFeatureName;
      this.fTaggedValue = pTaggedValue;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Element": return this.fElement;
          case "Stereotype": return this.fStereotype;
          case "FeatureName": return this.fFeatureName;
          case "TaggedValue": return this.fTaggedValue;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          case 1: return this.fStereotype;
          case 2: return this.fFeatureName;
          case 3: return this.fTaggedValue;
          default: return null;
      }
    }
    
    public Element getElement() {
      return this.fElement;
    }
    
    public Stereotype getStereotype() {
      return this.fStereotype;
    }
    
    public String getFeatureName() {
      return this.fFeatureName;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue getTaggedValue() {
      return this.fTaggedValue;
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
      if ("FeatureName".equals(parameterName) ) {
          this.fFeatureName = (String) newValue;
          return true;
      }
      if ("TaggedValue".equals(parameterName) ) {
          this.fTaggedValue = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue) newValue;
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
    
    public void setFeatureName(final String pFeatureName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFeatureName = pFeatureName;
    }
    
    public void setTaggedValue(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTaggedValue = pTaggedValue;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.taggedValue";
    }
    
    @Override
    public List<String> parameterNames() {
      return TaggedValue.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fStereotype, fFeatureName, fTaggedValue};
    }
    
    @Override
    public TaggedValue.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fStereotype, fFeatureName, fTaggedValue) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"Stereotype\"=" + prettyPrintValue(fStereotype) + ", ");
      result.append("\"FeatureName\"=" + prettyPrintValue(fFeatureName) + ", ");
      result.append("\"TaggedValue\"=" + prettyPrintValue(fTaggedValue));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fStereotype, fFeatureName, fTaggedValue);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TaggedValue.Match)) {
          TaggedValue.Match other = (TaggedValue.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fStereotype, other.fStereotype) && Objects.equals(fFeatureName, other.fFeatureName) && Objects.equals(fTaggedValue, other.fTaggedValue);
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
    public TaggedValue specification() {
      return TaggedValue.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TaggedValue.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TaggedValue.Match newMutableMatch(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return new Mutable(pElement, pStereotype, pFeatureName, pTaggedValue);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TaggedValue.Match newMatch(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return new Immutable(pElement, pStereotype, pFeatureName, pTaggedValue);
    }
    
    private static final class Mutable extends TaggedValue.Match {
      Mutable(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
        super(pElement, pStereotype, pFeatureName, pTaggedValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TaggedValue.Match {
      Immutable(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
        super(pElement, pStereotype, pFeatureName, pTaggedValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.taggedValue pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Matches the value of the slot with the given name
   * pattern taggedValue(Element : Element, Stereotype : Stereotype, FeatureName : String, TaggedValue : TaggedValue) {
   * 	Element.taggedValue(Element, TaggedValue);
   * 	TaggedValue.tagDefinition(TaggedValue, tagDefinition);
   * 	find compatibleClassifier(Stereotype, superStereotype);
   * 	Stereotype.ownedAttribute(superStereotype, tagDefinition);
   * 	Property.name(tagDefinition, FeatureName);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TaggedValue
   * 
   */
  public static class Matcher extends BaseMatcher<TaggedValue.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TaggedValue.Matcher on(final ViatraQueryEngine engine) {
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
    public static TaggedValue.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_STEREOTYPE = 1;
    
    private static final int POSITION_FEATURENAME = 2;
    
    private static final int POSITION_TAGGEDVALUE = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TaggedValue.Matcher.class);
    
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
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TaggedValue.Match> getAllMatches(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllMatches(new Object[]{pElement, pStereotype, pFeatureName, pTaggedValue}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TaggedValue.Match> streamAllMatches(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllMatches(new Object[]{pElement, pStereotype, pFeatureName, pTaggedValue});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TaggedValue.Match> getOneArbitraryMatch(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pStereotype, pFeatureName, pTaggedValue});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawHasMatch(new Object[]{pElement, pStereotype, pFeatureName, pTaggedValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawCountMatches(new Object[]{pElement, pStereotype, pFeatureName, pTaggedValue});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue, final Consumer<? super TaggedValue.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pStereotype, pFeatureName, pTaggedValue}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param pFeatureName the fixed value of pattern parameter FeatureName, or null if not bound.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TaggedValue.Match newMatch(final Element pElement, final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return TaggedValue.Match.newMatch(pElement, pStereotype, pFeatureName, pTaggedValue);
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
    public Stream<Element> streamAllValuesOfElement(final TaggedValue.Match partialMatch) {
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
    public Stream<Element> streamAllValuesOfElement(final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfElement(new Object[]{null, pStereotype, pFeatureName, pTaggedValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfElement(final TaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfElement(final Stereotype pStereotype, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfElement(new Object[]{null, pStereotype, pFeatureName, pTaggedValue}).collect(Collectors.toSet());
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
    public Stream<Stereotype> streamAllValuesOfStereotype(final TaggedValue.Match partialMatch) {
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
    public Stream<Stereotype> streamAllValuesOfStereotype(final Element pElement, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfStereotype(new Object[]{pElement, null, pFeatureName, pTaggedValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype(final TaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfStereotype(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype(final Element pElement, final String pFeatureName, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfStereotype(new Object[]{pElement, null, pFeatureName, pTaggedValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfFeatureName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FEATURENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfFeatureName() {
      return rawStreamAllValuesOfFeatureName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfFeatureName() {
      return rawStreamAllValuesOfFeatureName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfFeatureName(final TaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfFeatureName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfFeatureName(final Element pElement, final Stereotype pStereotype, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfFeatureName(new Object[]{pElement, pStereotype, null, pTaggedValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfFeatureName(final TaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfFeatureName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for FeatureName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfFeatureName(final Element pElement, final Stereotype pStereotype, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfFeatureName(new Object[]{pElement, pStereotype, null, pTaggedValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> rawStreamAllValuesOfTaggedValue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TAGGEDVALUE, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> getAllValuesOfTaggedValue() {
      return rawStreamAllValuesOfTaggedValue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> streamAllValuesOfTaggedValue() {
      return rawStreamAllValuesOfTaggedValue(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> streamAllValuesOfTaggedValue(final TaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfTaggedValue(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> streamAllValuesOfTaggedValue(final Element pElement, final Stereotype pStereotype, final String pFeatureName) {
      return rawStreamAllValuesOfTaggedValue(new Object[]{pElement, pStereotype, pFeatureName, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> getAllValuesOfTaggedValue(final TaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfTaggedValue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue> getAllValuesOfTaggedValue(final Element pElement, final Stereotype pStereotype, final String pFeatureName) {
      return rawStreamAllValuesOfTaggedValue(new Object[]{pElement, pStereotype, pFeatureName, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected TaggedValue.Match tupleToMatch(final Tuple t) {
      try {
          return TaggedValue.Match.newMatch((Element) t.get(POSITION_ELEMENT), (Stereotype) t.get(POSITION_STEREOTYPE), (String) t.get(POSITION_FEATURENAME), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue) t.get(POSITION_TAGGEDVALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TaggedValue.Match arrayToMatch(final Object[] match) {
      try {
          return TaggedValue.Match.newMatch((Element) match[POSITION_ELEMENT], (Stereotype) match[POSITION_STEREOTYPE], (String) match[POSITION_FEATURENAME], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue) match[POSITION_TAGGEDVALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TaggedValue.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TaggedValue.Match.newMutableMatch((Element) match[POSITION_ELEMENT], (Stereotype) match[POSITION_STEREOTYPE], (String) match[POSITION_FEATURENAME], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue) match[POSITION_TAGGEDVALUE]);
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
    public static IQuerySpecification<TaggedValue.Matcher> querySpecification() {
      return TaggedValue.instance();
    }
  }
  
  private TaggedValue() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TaggedValue instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TaggedValue.Matcher instantiate(final ViatraQueryEngine engine) {
    return TaggedValue.Matcher.on(engine);
  }
  
  @Override
  public TaggedValue.Matcher instantiate() {
    return TaggedValue.Matcher.create();
  }
  
  @Override
  public TaggedValue.Match newEmptyMatch() {
    return TaggedValue.Match.newEmptyMatch();
  }
  
  @Override
  public TaggedValue.Match newMatch(final Object... parameters) {
    return TaggedValue.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element) parameters[0], (com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype) parameters[1], (java.lang.String) parameters[2], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TaggedValue} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TaggedValue#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TaggedValue INSTANCE = new TaggedValue();
    
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
    private static final TaggedValue.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Element = new PParameter("Element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Stereotype = new PParameter("Stereotype", "com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")), PParameterDirection.INOUT);
    
    private final PParameter parameter_FeatureName = new PParameter("FeatureName", "java.lang.String", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")), PParameterDirection.INOUT);
    
    private final PParameter parameter_TaggedValue = new PParameter("TaggedValue", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Element, parameter_Stereotype, parameter_FeatureName, parameter_TaggedValue);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.taggedValue";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Element","Stereotype","FeatureName","TaggedValue");
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
          PVariable var_FeatureName = body.getOrCreateVariableByName("FeatureName");
          PVariable var_TaggedValue = body.getOrCreateVariableByName("TaggedValue");
          PVariable var_tagDefinition = body.getOrCreateVariableByName("tagDefinition");
          PVariable var_superStereotype = body.getOrCreateVariableByName("superStereotype");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Stereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_FeatureName), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Element, parameter_Element),
             new ExportedParameter(body, var_Stereotype, parameter_Stereotype),
             new ExportedParameter(body, var_FeatureName, parameter_FeatureName),
             new ExportedParameter(body, var_TaggedValue, parameter_TaggedValue)
          ));
          // 	Element.taggedValue(Element, TaggedValue)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element", "taggedValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          new Equality(body, var__virtual_0_, var_TaggedValue);
          // 	TaggedValue.tagDefinition(TaggedValue, tagDefinition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue", "tagDefinition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          new Equality(body, var__virtual_1_, var_tagDefinition);
          // 	find compatibleClassifier(Stereotype, superStereotype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Stereotype, var_superStereotype), CompatibleClassifier.instance().getInternalQueryRepresentation());
          // 	Stereotype.ownedAttribute(superStereotype, tagDefinition)
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superStereotype, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "StructuredClassifier", "ownedAttribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          new Equality(body, var__virtual_2_, var_tagDefinition);
          // 	Property.name(tagDefinition, FeatureName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tagDefinition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tagDefinition, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new Equality(body, var__virtual_3_, var_FeatureName);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
