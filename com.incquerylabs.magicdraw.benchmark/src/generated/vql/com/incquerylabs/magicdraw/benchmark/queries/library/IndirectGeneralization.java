/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/CommonLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.GeneralizedClassifier;
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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         //Matches if the parameter `general` is connected with a series of generalization relations to parameter `classifier`
 *         pattern indirectGeneralization(Classifier : Classifier, General : Classifier) {
 *         	find generalizedClassifier +(Classifier, General);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class IndirectGeneralization extends BaseGeneratedEMFQuerySpecification<IndirectGeneralization.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.indirectGeneralization pattern,
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
    
    private Classifier fGeneral;
    
    private static List<String> parameterNames = makeImmutableList("Classifier", "General");
    
    private Match(final Classifier pClassifier, final Classifier pGeneral) {
      this.fClassifier = pClassifier;
      this.fGeneral = pGeneral;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Classifier": return this.fClassifier;
          case "General": return this.fGeneral;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fClassifier;
          case 1: return this.fGeneral;
          default: return null;
      }
    }
    
    public Classifier getClassifier() {
      return this.fClassifier;
    }
    
    public Classifier getGeneral() {
      return this.fGeneral;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Classifier".equals(parameterName) ) {
          this.fClassifier = (Classifier) newValue;
          return true;
      }
      if ("General".equals(parameterName) ) {
          this.fGeneral = (Classifier) newValue;
          return true;
      }
      return false;
    }
    
    public void setClassifier(final Classifier pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    public void setGeneral(final Classifier pGeneral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGeneral = pGeneral;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.indirectGeneralization";
    }
    
    @Override
    public List<String> parameterNames() {
      return IndirectGeneralization.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier, fGeneral};
    }
    
    @Override
    public IndirectGeneralization.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier, fGeneral) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Classifier\"=" + prettyPrintValue(fClassifier) + ", ");
      result.append("\"General\"=" + prettyPrintValue(fGeneral));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fClassifier, fGeneral);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof IndirectGeneralization.Match)) {
          IndirectGeneralization.Match other = (IndirectGeneralization.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier) && Objects.equals(fGeneral, other.fGeneral);
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
    public IndirectGeneralization specification() {
      return IndirectGeneralization.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static IndirectGeneralization.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static IndirectGeneralization.Match newMutableMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return new Mutable(pClassifier, pGeneral);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static IndirectGeneralization.Match newMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return new Immutable(pClassifier, pGeneral);
    }
    
    private static final class Mutable extends IndirectGeneralization.Match {
      Mutable(final Classifier pClassifier, final Classifier pGeneral) {
        super(pClassifier, pGeneral);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends IndirectGeneralization.Match {
      Immutable(final Classifier pClassifier, final Classifier pGeneral) {
        super(pClassifier, pGeneral);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.indirectGeneralization pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Matches if the parameter `general` is connected with a series of generalization relations to parameter `classifier`
   * pattern indirectGeneralization(Classifier : Classifier, General : Classifier) {
   * 	find generalizedClassifier +(Classifier, General);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see IndirectGeneralization
   * 
   */
  public static class Matcher extends BaseMatcher<IndirectGeneralization.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static IndirectGeneralization.Matcher on(final ViatraQueryEngine engine) {
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
    public static IndirectGeneralization.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CLASSIFIER = 0;
    
    private static final int POSITION_GENERAL = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(IndirectGeneralization.Matcher.class);
    
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
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<IndirectGeneralization.Match> getAllMatches(final Classifier pClassifier, final Classifier pGeneral) {
      return rawStreamAllMatches(new Object[]{pClassifier, pGeneral}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<IndirectGeneralization.Match> streamAllMatches(final Classifier pClassifier, final Classifier pGeneral) {
      return rawStreamAllMatches(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<IndirectGeneralization.Match> getOneArbitraryMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return rawHasMatch(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Classifier pClassifier, final Classifier pGeneral) {
      return rawCountMatches(new Object[]{pClassifier, pGeneral});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Classifier pClassifier, final Classifier pGeneral, final Consumer<? super IndirectGeneralization.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier, pGeneral}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter Classifier, or null if not bound.
     * @param pGeneral the fixed value of pattern parameter General, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public IndirectGeneralization.Match newMatch(final Classifier pClassifier, final Classifier pGeneral) {
      return IndirectGeneralization.Match.newMatch(pClassifier, pGeneral);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfClassifier(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLASSIFIER, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfClassifier() {
      return rawStreamAllValuesOfClassifier(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfClassifier() {
      return rawStreamAllValuesOfClassifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfClassifier(final IndirectGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfClassifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfClassifier(final Classifier pGeneral) {
      return rawStreamAllValuesOfClassifier(new Object[]{null, pGeneral});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfClassifier(final IndirectGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfClassifier(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfClassifier(final Classifier pGeneral) {
      return rawStreamAllValuesOfClassifier(new Object[]{null, pGeneral}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Classifier> rawStreamAllValuesOfGeneral(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GENERAL, parameters).map(Classifier.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfGeneral() {
      return rawStreamAllValuesOfGeneral(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfGeneral() {
      return rawStreamAllValuesOfGeneral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfGeneral(final IndirectGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfGeneral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Classifier> streamAllValuesOfGeneral(final Classifier pClassifier) {
      return rawStreamAllValuesOfGeneral(new Object[]{pClassifier, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfGeneral(final IndirectGeneralization.Match partialMatch) {
      return rawStreamAllValuesOfGeneral(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for General.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfGeneral(final Classifier pClassifier) {
      return rawStreamAllValuesOfGeneral(new Object[]{pClassifier, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected IndirectGeneralization.Match tupleToMatch(final Tuple t) {
      try {
          return IndirectGeneralization.Match.newMatch((Classifier) t.get(POSITION_CLASSIFIER), (Classifier) t.get(POSITION_GENERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IndirectGeneralization.Match arrayToMatch(final Object[] match) {
      try {
          return IndirectGeneralization.Match.newMatch((Classifier) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_GENERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IndirectGeneralization.Match arrayToMatchMutable(final Object[] match) {
      try {
          return IndirectGeneralization.Match.newMutableMatch((Classifier) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_GENERAL]);
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
    public static IQuerySpecification<IndirectGeneralization.Matcher> querySpecification() {
      return IndirectGeneralization.instance();
    }
  }
  
  private IndirectGeneralization() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static IndirectGeneralization instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected IndirectGeneralization.Matcher instantiate(final ViatraQueryEngine engine) {
    return IndirectGeneralization.Matcher.on(engine);
  }
  
  @Override
  public IndirectGeneralization.Matcher instantiate() {
    return IndirectGeneralization.Matcher.create();
  }
  
  @Override
  public IndirectGeneralization.Match newEmptyMatch() {
    return IndirectGeneralization.Match.newEmptyMatch();
  }
  
  @Override
  public IndirectGeneralization.Match newMatch(final Object... parameters) {
    return IndirectGeneralization.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link IndirectGeneralization} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link IndirectGeneralization#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final IndirectGeneralization INSTANCE = new IndirectGeneralization();
    
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
    private static final IndirectGeneralization.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Classifier = new PParameter("Classifier", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")), PParameterDirection.INOUT);
    
    private final PParameter parameter_General = new PParameter("General", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Classifier, parameter_General);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.indirectGeneralization";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Classifier","General");
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
          PVariable var_Classifier = body.getOrCreateVariableByName("Classifier");
          PVariable var_General = body.getOrCreateVariableByName("General");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_General), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Classifier")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Classifier, parameter_Classifier),
             new ExportedParameter(body, var_General, parameter_General)
          ));
          // 	find generalizedClassifier +(Classifier, General)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_Classifier, var_General), GeneralizedClassifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
