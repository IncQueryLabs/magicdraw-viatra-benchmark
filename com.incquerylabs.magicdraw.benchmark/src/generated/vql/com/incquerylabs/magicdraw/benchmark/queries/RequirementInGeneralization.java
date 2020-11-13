/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.Requirement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
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
 *         pattern requirementInGeneralization(classifier : Classifier, requirement : Class) {
 *         	Classifier.generalization(classifier, generalization);
 *         	Generalization.general(generalization, requirement);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.Requirement(requirement, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RequirementInGeneralization extends BaseGeneratedEMFQuerySpecification<RequirementInGeneralization.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.requirementInGeneralization pattern,
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
    private Classifier fClassifier;
    
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fRequirement;
    
    private static List<String> parameterNames = makeImmutableList("classifier", "requirement");
    
    private Match(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      this.fClassifier = pClassifier;
      this.fRequirement = pRequirement;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "classifier": return this.fClassifier;
          case "requirement": return this.fRequirement;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fClassifier;
          case 1: return this.fRequirement;
          default: return null;
      }
    }
    
    public Classifier getClassifier() {
      return this.fClassifier;
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getRequirement() {
      return this.fRequirement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("classifier".equals(parameterName) ) {
          this.fClassifier = (Classifier) newValue;
          return true;
      }
      if ("requirement".equals(parameterName) ) {
          this.fRequirement = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setClassifier(final Classifier pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    public void setRequirement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRequirement = pRequirement;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.requirementInGeneralization";
    }
    
    @Override
    public List<String> parameterNames() {
      return RequirementInGeneralization.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier, fRequirement};
    }
    
    @Override
    public RequirementInGeneralization.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier, fRequirement) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"classifier\"=" + prettyPrintValue(fClassifier) + ", ");
      result.append("\"requirement\"=" + prettyPrintValue(fRequirement));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fClassifier, fRequirement);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RequirementInGeneralization.Match)) {
          RequirementInGeneralization.Match other = (RequirementInGeneralization.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier) && Objects.equals(fRequirement, other.fRequirement);
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
    public RequirementInGeneralization specification() {
      return RequirementInGeneralization.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RequirementInGeneralization.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RequirementInGeneralization.Match newMutableMatch(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return new Mutable(pClassifier, pRequirement);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RequirementInGeneralization.Match newMatch(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return new Immutable(pClassifier, pRequirement);
    }
    
    private static final class Mutable extends RequirementInGeneralization.Match {
      Mutable(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
        super(pClassifier, pRequirement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RequirementInGeneralization.Match {
      Immutable(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
        super(pClassifier, pRequirement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.requirementInGeneralization pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern requirementInGeneralization(classifier : Classifier, requirement : Class) {
   * 	Classifier.generalization(classifier, generalization);
   * 	Generalization.general(generalization, requirement);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.Requirement(requirement, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RequirementInGeneralization
   * 
   */
  public static class Matcher extends BaseMatcher<RequirementInGeneralization.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RequirementInGeneralization.Matcher on(final ViatraQueryEngine engine) {
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
    public static RequirementInGeneralization.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CLASSIFIER = 0;
    
    private static final int POSITION_REQUIREMENT = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RequirementInGeneralization.Matcher.class);
    
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
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RequirementInGeneralization.Match> getAllMatches(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawStreamAllMatches(new Object[]{pClassifier, pRequirement}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RequirementInGeneralization.Match> streamAllMatches(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawStreamAllMatches(new Object[]{pClassifier, pRequirement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RequirementInGeneralization.Match> getOneArbitraryMatch(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier, pRequirement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawHasMatch(new Object[]{pClassifier, pRequirement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawCountMatches(new Object[]{pClassifier, pRequirement});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement, final Consumer<? super RequirementInGeneralization.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier, pRequirement}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RequirementInGeneralization.Match newMatch(final Classifier pClassifier, final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return RequirementInGeneralization.Match.newMatch(pClassifier, pRequirement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfclassifier(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLASSIFIER, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier() {
      return rawStreamAllValuesOfclassifier(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier() {
      return rawStreamAllValuesOfclassifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier(final RequirementInGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfclassifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfclassifier(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawStreamAllValuesOfclassifier(new Object[]{null, pRequirement});
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier(final RequirementInGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfclassifier(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfclassifier(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pRequirement) {
      return rawStreamAllValuesOfclassifier(new Object[]{null, pRequirement}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfrequirement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REQUIREMENT, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfrequirement() {
      return rawStreamAllValuesOfrequirement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfrequirement() {
      return rawStreamAllValuesOfrequirement(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfrequirement(final RequirementInGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfrequirement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfrequirement(final Classifier pClassifier) {
      return rawStreamAllValuesOfrequirement(new Object[]{pClassifier, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfrequirement(final RequirementInGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfrequirement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for requirement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfrequirement(final Classifier pClassifier) {
      return rawStreamAllValuesOfrequirement(new Object[]{pClassifier, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected RequirementInGeneralization.Match tupleToMatch(final Tuple t) {
      try {
          return RequirementInGeneralization.Match.newMatch((Classifier) t.get(POSITION_CLASSIFIER), (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_REQUIREMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RequirementInGeneralization.Match arrayToMatch(final Object[] match) {
      try {
          return RequirementInGeneralization.Match.newMatch((Classifier) match[POSITION_CLASSIFIER], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_REQUIREMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RequirementInGeneralization.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RequirementInGeneralization.Match.newMutableMatch((Classifier) match[POSITION_CLASSIFIER], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_REQUIREMENT]);
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
    public static IQuerySpecification<RequirementInGeneralization.Matcher> querySpecification() {
      return RequirementInGeneralization.instance();
    }
  }
  
  private RequirementInGeneralization() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RequirementInGeneralization instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RequirementInGeneralization.Matcher instantiate(final ViatraQueryEngine engine) {
    return RequirementInGeneralization.Matcher.on(engine);
  }
  
  @Override
  public RequirementInGeneralization.Matcher instantiate() {
    return RequirementInGeneralization.Matcher.create();
  }
  
  @Override
  public RequirementInGeneralization.Match newEmptyMatch() {
    return RequirementInGeneralization.Match.newEmptyMatch();
  }
  
  @Override
  public RequirementInGeneralization.Match newMatch(final Object... parameters) {
    return RequirementInGeneralization.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RequirementInGeneralization} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RequirementInGeneralization#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RequirementInGeneralization INSTANCE = new RequirementInGeneralization();
    
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
    private static final RequirementInGeneralization.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_classifier = new PParameter("classifier", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")), PParameterDirection.INOUT);
    
    private final PParameter parameter_requirement = new PParameter("requirement", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_classifier, parameter_requirement);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.requirementInGeneralization";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classifier","requirement");
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
          PVariable var_classifier = body.getOrCreateVariableByName("classifier");
          PVariable var_requirement = body.getOrCreateVariableByName("requirement");
          PVariable var_generalization = body.getOrCreateVariableByName("generalization");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_classifier),
             new ExportedParameter(body, var_requirement, parameter_requirement)
          ));
          // 	Classifier.generalization(classifier, generalization)
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier", "generalization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Generalization")));
          new Equality(body, var__virtual_0_, var_generalization);
          // 	Generalization.general(generalization, requirement)
          new TypeConstraint(body, Tuples.flatTupleOf(var_generalization), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Generalization")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_generalization, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Generalization", "general")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          new Equality(body, var__virtual_1_, var_requirement);
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.Requirement(requirement, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_requirement, var___0_), Requirement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
