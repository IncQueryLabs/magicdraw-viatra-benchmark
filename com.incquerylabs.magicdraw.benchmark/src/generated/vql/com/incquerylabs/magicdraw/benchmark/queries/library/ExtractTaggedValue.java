/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/CommonLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue;
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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         pattern extractTaggedValue(TaggedValue : TaggedValue, Value : java Object) {
 *         	StringTaggedValue.value(TaggedValue, Value);
 *         } or {
 *         	BooleanTaggedValue.value(TaggedValue, Value);
 *         } or {
 *         	IntegerTaggedValue.value(TaggedValue, Value);
 *         } or {
 *         	RealTaggedValue.value(TaggedValue, Value);
 *         } or {
 *         	ElementTaggedValue.value(TaggedValue, Value);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ExtractTaggedValue extends BaseGeneratedEMFQuerySpecification<ExtractTaggedValue.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.extractTaggedValue pattern,
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
    private TaggedValue fTaggedValue;
    
    private Object fValue;
    
    private static List<String> parameterNames = makeImmutableList("TaggedValue", "Value");
    
    private Match(final TaggedValue pTaggedValue, final Object pValue) {
      this.fTaggedValue = pTaggedValue;
      this.fValue = pValue;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "TaggedValue": return this.fTaggedValue;
          case "Value": return this.fValue;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTaggedValue;
          case 1: return this.fValue;
          default: return null;
      }
    }
    
    public TaggedValue getTaggedValue() {
      return this.fTaggedValue;
    }
    
    public Object getValue() {
      return this.fValue;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("TaggedValue".equals(parameterName) ) {
          this.fTaggedValue = (TaggedValue) newValue;
          return true;
      }
      if ("Value".equals(parameterName) && newValue instanceof Object) {
          this.fValue = (Object) newValue;
          return true;
      }
      return false;
    }
    
    public void setTaggedValue(final TaggedValue pTaggedValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTaggedValue = pTaggedValue;
    }
    
    public void setValue(final Object pValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValue = pValue;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.extractTaggedValue";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExtractTaggedValue.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTaggedValue, fValue};
    }
    
    @Override
    public ExtractTaggedValue.Match toImmutable() {
      return isMutable() ? newMatch(fTaggedValue, fValue) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"TaggedValue\"=" + prettyPrintValue(fTaggedValue) + ", ");
      result.append("\"Value\"=" + prettyPrintValue(fValue));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTaggedValue, fValue);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExtractTaggedValue.Match)) {
          ExtractTaggedValue.Match other = (ExtractTaggedValue.Match) obj;
          return Objects.equals(fTaggedValue, other.fTaggedValue) && Objects.equals(fValue, other.fValue);
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
    public ExtractTaggedValue specification() {
      return ExtractTaggedValue.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExtractTaggedValue.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractTaggedValue.Match newMutableMatch(final TaggedValue pTaggedValue, final Object pValue) {
      return new Mutable(pTaggedValue, pValue);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractTaggedValue.Match newMatch(final TaggedValue pTaggedValue, final Object pValue) {
      return new Immutable(pTaggedValue, pValue);
    }
    
    private static final class Mutable extends ExtractTaggedValue.Match {
      Mutable(final TaggedValue pTaggedValue, final Object pValue) {
        super(pTaggedValue, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractTaggedValue.Match {
      Immutable(final TaggedValue pTaggedValue, final Object pValue) {
        super(pTaggedValue, pValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.extractTaggedValue pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern extractTaggedValue(TaggedValue : TaggedValue, Value : java Object) {
   * 	StringTaggedValue.value(TaggedValue, Value);
   * } or {
   * 	BooleanTaggedValue.value(TaggedValue, Value);
   * } or {
   * 	IntegerTaggedValue.value(TaggedValue, Value);
   * } or {
   * 	RealTaggedValue.value(TaggedValue, Value);
   * } or {
   * 	ElementTaggedValue.value(TaggedValue, Value);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ExtractTaggedValue
   * 
   */
  public static class Matcher extends BaseMatcher<ExtractTaggedValue.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExtractTaggedValue.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExtractTaggedValue.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TAGGEDVALUE = 0;
    
    private static final int POSITION_VALUE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractTaggedValue.Matcher.class);
    
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
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractTaggedValue.Match> getAllMatches(final TaggedValue pTaggedValue, final Object pValue) {
      return rawStreamAllMatches(new Object[]{pTaggedValue, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ExtractTaggedValue.Match> streamAllMatches(final TaggedValue pTaggedValue, final Object pValue) {
      return rawStreamAllMatches(new Object[]{pTaggedValue, pValue});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ExtractTaggedValue.Match> getOneArbitraryMatch(final TaggedValue pTaggedValue, final Object pValue) {
      return rawGetOneArbitraryMatch(new Object[]{pTaggedValue, pValue});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TaggedValue pTaggedValue, final Object pValue) {
      return rawHasMatch(new Object[]{pTaggedValue, pValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TaggedValue pTaggedValue, final Object pValue) {
      return rawCountMatches(new Object[]{pTaggedValue, pValue});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TaggedValue pTaggedValue, final Object pValue, final Consumer<? super ExtractTaggedValue.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTaggedValue, pValue}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTaggedValue the fixed value of pattern parameter TaggedValue, or null if not bound.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractTaggedValue.Match newMatch(final TaggedValue pTaggedValue, final Object pValue) {
      return ExtractTaggedValue.Match.newMatch(pTaggedValue, pValue);
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<TaggedValue> rawStreamAllValuesOfTaggedValue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TAGGEDVALUE, parameters).map(TaggedValue.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TaggedValue> getAllValuesOfTaggedValue() {
      return rawStreamAllValuesOfTaggedValue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<TaggedValue> streamAllValuesOfTaggedValue() {
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
    public Stream<TaggedValue> streamAllValuesOfTaggedValue(final ExtractTaggedValue.Match partialMatch) {
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
    public Stream<TaggedValue> streamAllValuesOfTaggedValue(final Object pValue) {
      return rawStreamAllValuesOfTaggedValue(new Object[]{null, pValue});
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TaggedValue> getAllValuesOfTaggedValue(final ExtractTaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfTaggedValue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for TaggedValue.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TaggedValue> getAllValuesOfTaggedValue(final Object pValue) {
      return rawStreamAllValuesOfTaggedValue(new Object[]{null, pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Object> rawStreamAllValuesOfValue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUE, parameters).map(Object.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Object> getAllValuesOfValue() {
      return rawStreamAllValuesOfValue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Object> streamAllValuesOfValue() {
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
    public Stream<Object> streamAllValuesOfValue(final ExtractTaggedValue.Match partialMatch) {
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
    public Stream<Object> streamAllValuesOfValue(final TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfValue(new Object[]{pTaggedValue, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Object> getAllValuesOfValue(final ExtractTaggedValue.Match partialMatch) {
      return rawStreamAllValuesOfValue(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Object> getAllValuesOfValue(final TaggedValue pTaggedValue) {
      return rawStreamAllValuesOfValue(new Object[]{pTaggedValue, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ExtractTaggedValue.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractTaggedValue.Match.newMatch((TaggedValue) t.get(POSITION_TAGGEDVALUE), (Object) t.get(POSITION_VALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractTaggedValue.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractTaggedValue.Match.newMatch((TaggedValue) match[POSITION_TAGGEDVALUE], (Object) match[POSITION_VALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractTaggedValue.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractTaggedValue.Match.newMutableMatch((TaggedValue) match[POSITION_TAGGEDVALUE], (Object) match[POSITION_VALUE]);
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
    public static IQuerySpecification<ExtractTaggedValue.Matcher> querySpecification() {
      return ExtractTaggedValue.instance();
    }
  }
  
  private ExtractTaggedValue() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExtractTaggedValue instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExtractTaggedValue.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExtractTaggedValue.Matcher.on(engine);
  }
  
  @Override
  public ExtractTaggedValue.Matcher instantiate() {
    return ExtractTaggedValue.Matcher.create();
  }
  
  @Override
  public ExtractTaggedValue.Match newEmptyMatch() {
    return ExtractTaggedValue.Match.newEmptyMatch();
  }
  
  @Override
  public ExtractTaggedValue.Match newMatch(final Object... parameters) {
    return ExtractTaggedValue.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue) parameters[0], (java.lang.Object) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ExtractTaggedValue} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ExtractTaggedValue#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ExtractTaggedValue INSTANCE = new ExtractTaggedValue();
    
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
    private static final ExtractTaggedValue.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_TaggedValue = new PParameter("TaggedValue", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TaggedValue", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Value = new PParameter("Value", "java.lang.Object", new JavaTransitiveInstancesKey(java.lang.Object.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_TaggedValue, parameter_Value);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.extractTaggedValue";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("TaggedValue","Value");
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
          PVariable var_TaggedValue = body.getOrCreateVariableByName("TaggedValue");
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Value), new JavaTransitiveInstancesKey(java.lang.Object.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_TaggedValue, parameter_TaggedValue),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	StringTaggedValue.value(TaggedValue, Value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "StringTaggedValue")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "StringTaggedValue", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new Equality(body, var__virtual_0_, var_Value);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_TaggedValue = body.getOrCreateVariableByName("TaggedValue");
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Value), new JavaTransitiveInstancesKey(java.lang.Object.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_TaggedValue, parameter_TaggedValue),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	BooleanTaggedValue.value(TaggedValue, Value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "BooleanTaggedValue")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "BooleanTaggedValue", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Boolean")));
          new Equality(body, var__virtual_0_, var_Value);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_TaggedValue = body.getOrCreateVariableByName("TaggedValue");
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Value), new JavaTransitiveInstancesKey(java.lang.Object.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_TaggedValue, parameter_TaggedValue),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	IntegerTaggedValue.value(TaggedValue, Value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "IntegerTaggedValue")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "IntegerTaggedValue", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Integer")));
          new Equality(body, var__virtual_0_, var_Value);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_TaggedValue = body.getOrCreateVariableByName("TaggedValue");
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Value), new JavaTransitiveInstancesKey(java.lang.Object.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_TaggedValue, parameter_TaggedValue),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	RealTaggedValue.value(TaggedValue, Value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "RealTaggedValue")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "RealTaggedValue", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Real")));
          new Equality(body, var__virtual_0_, var_Value);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_TaggedValue = body.getOrCreateVariableByName("TaggedValue");
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "TaggedValue")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Value), new JavaTransitiveInstancesKey(java.lang.Object.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_TaggedValue, parameter_TaggedValue),
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	ElementTaggedValue.value(TaggedValue, Value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ElementTaggedValue")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_TaggedValue, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "ElementTaggedValue", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Element")));
          new Equality(body, var__virtual_0_, var_Value);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
