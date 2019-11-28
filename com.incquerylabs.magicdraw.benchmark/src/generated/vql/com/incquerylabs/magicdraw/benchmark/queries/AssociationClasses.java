/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/WarmUpQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.mdusecases.UseCase;
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
 *         pattern associationClasses(associationClass : AssociationClass, useCase : UseCase) {
 *         	AssociationClass.ownedUseCase(associationClass, useCase);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AssociationClasses extends BaseGeneratedEMFQuerySpecification<AssociationClasses.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.associationClasses pattern,
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
    private AssociationClass fAssociationClass;
    
    private UseCase fUseCase;
    
    private static List<String> parameterNames = makeImmutableList("associationClass", "useCase");
    
    private Match(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      this.fAssociationClass = pAssociationClass;
      this.fUseCase = pUseCase;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "associationClass": return this.fAssociationClass;
          case "useCase": return this.fUseCase;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAssociationClass;
          case 1: return this.fUseCase;
          default: return null;
      }
    }
    
    public AssociationClass getAssociationClass() {
      return this.fAssociationClass;
    }
    
    public UseCase getUseCase() {
      return this.fUseCase;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("associationClass".equals(parameterName) ) {
          this.fAssociationClass = (AssociationClass) newValue;
          return true;
      }
      if ("useCase".equals(parameterName) ) {
          this.fUseCase = (UseCase) newValue;
          return true;
      }
      return false;
    }
    
    public void setAssociationClass(final AssociationClass pAssociationClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAssociationClass = pAssociationClass;
    }
    
    public void setUseCase(final UseCase pUseCase) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUseCase = pUseCase;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.associationClasses";
    }
    
    @Override
    public List<String> parameterNames() {
      return AssociationClasses.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAssociationClass, fUseCase};
    }
    
    @Override
    public AssociationClasses.Match toImmutable() {
      return isMutable() ? newMatch(fAssociationClass, fUseCase) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"associationClass\"=" + prettyPrintValue(fAssociationClass) + ", ");
      result.append("\"useCase\"=" + prettyPrintValue(fUseCase));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAssociationClass, fUseCase);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AssociationClasses.Match)) {
          AssociationClasses.Match other = (AssociationClasses.Match) obj;
          return Objects.equals(fAssociationClass, other.fAssociationClass) && Objects.equals(fUseCase, other.fUseCase);
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
    public AssociationClasses specification() {
      return AssociationClasses.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AssociationClasses.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AssociationClasses.Match newMutableMatch(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return new Mutable(pAssociationClass, pUseCase);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AssociationClasses.Match newMatch(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return new Immutable(pAssociationClass, pUseCase);
    }
    
    private static final class Mutable extends AssociationClasses.Match {
      Mutable(final AssociationClass pAssociationClass, final UseCase pUseCase) {
        super(pAssociationClass, pUseCase);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AssociationClasses.Match {
      Immutable(final AssociationClass pAssociationClass, final UseCase pUseCase) {
        super(pAssociationClass, pUseCase);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.associationClasses pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern associationClasses(associationClass : AssociationClass, useCase : UseCase) {
   * 	AssociationClass.ownedUseCase(associationClass, useCase);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AssociationClasses
   * 
   */
  public static class Matcher extends BaseMatcher<AssociationClasses.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AssociationClasses.Matcher on(final ViatraQueryEngine engine) {
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
    public static AssociationClasses.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ASSOCIATIONCLASS = 0;
    
    private static final int POSITION_USECASE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AssociationClasses.Matcher.class);
    
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
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AssociationClasses.Match> getAllMatches(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return rawStreamAllMatches(new Object[]{pAssociationClass, pUseCase}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AssociationClasses.Match> streamAllMatches(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return rawStreamAllMatches(new Object[]{pAssociationClass, pUseCase});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AssociationClasses.Match> getOneArbitraryMatch(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return rawGetOneArbitraryMatch(new Object[]{pAssociationClass, pUseCase});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return rawHasMatch(new Object[]{pAssociationClass, pUseCase});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return rawCountMatches(new Object[]{pAssociationClass, pUseCase});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final AssociationClass pAssociationClass, final UseCase pUseCase, final Consumer<? super AssociationClasses.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAssociationClass, pUseCase}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAssociationClass the fixed value of pattern parameter associationClass, or null if not bound.
     * @param pUseCase the fixed value of pattern parameter useCase, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AssociationClasses.Match newMatch(final AssociationClass pAssociationClass, final UseCase pUseCase) {
      return AssociationClasses.Match.newMatch(pAssociationClass, pUseCase);
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<AssociationClass> rawStreamAllValuesOfassociationClass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ASSOCIATIONCLASS, parameters).map(AssociationClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AssociationClass> getAllValuesOfassociationClass() {
      return rawStreamAllValuesOfassociationClass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<AssociationClass> streamAllValuesOfassociationClass() {
      return rawStreamAllValuesOfassociationClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<AssociationClass> streamAllValuesOfassociationClass(final AssociationClasses.Match partialMatch) {
      return rawStreamAllValuesOfassociationClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<AssociationClass> streamAllValuesOfassociationClass(final UseCase pUseCase) {
      return rawStreamAllValuesOfassociationClass(new Object[]{null, pUseCase});
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AssociationClass> getAllValuesOfassociationClass(final AssociationClasses.Match partialMatch) {
      return rawStreamAllValuesOfassociationClass(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for associationClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<AssociationClass> getAllValuesOfassociationClass(final UseCase pUseCase) {
      return rawStreamAllValuesOfassociationClass(new Object[]{null, pUseCase}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<UseCase> rawStreamAllValuesOfuseCase(final Object[] parameters) {
      return rawStreamAllValues(POSITION_USECASE, parameters).map(UseCase.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UseCase> getAllValuesOfuseCase() {
      return rawStreamAllValuesOfuseCase(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<UseCase> streamAllValuesOfuseCase() {
      return rawStreamAllValuesOfuseCase(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UseCase> streamAllValuesOfuseCase(final AssociationClasses.Match partialMatch) {
      return rawStreamAllValuesOfuseCase(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<UseCase> streamAllValuesOfuseCase(final AssociationClass pAssociationClass) {
      return rawStreamAllValuesOfuseCase(new Object[]{pAssociationClass, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UseCase> getAllValuesOfuseCase(final AssociationClasses.Match partialMatch) {
      return rawStreamAllValuesOfuseCase(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for useCase.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<UseCase> getAllValuesOfuseCase(final AssociationClass pAssociationClass) {
      return rawStreamAllValuesOfuseCase(new Object[]{pAssociationClass, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected AssociationClasses.Match tupleToMatch(final Tuple t) {
      try {
          return AssociationClasses.Match.newMatch((AssociationClass) t.get(POSITION_ASSOCIATIONCLASS), (UseCase) t.get(POSITION_USECASE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AssociationClasses.Match arrayToMatch(final Object[] match) {
      try {
          return AssociationClasses.Match.newMatch((AssociationClass) match[POSITION_ASSOCIATIONCLASS], (UseCase) match[POSITION_USECASE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AssociationClasses.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AssociationClasses.Match.newMutableMatch((AssociationClass) match[POSITION_ASSOCIATIONCLASS], (UseCase) match[POSITION_USECASE]);
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
    public static IQuerySpecification<AssociationClasses.Matcher> querySpecification() {
      return AssociationClasses.instance();
    }
  }
  
  private AssociationClasses() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AssociationClasses instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AssociationClasses.Matcher instantiate(final ViatraQueryEngine engine) {
    return AssociationClasses.Matcher.on(engine);
  }
  
  @Override
  public AssociationClasses.Matcher instantiate() {
    return AssociationClasses.Matcher.create();
  }
  
  @Override
  public AssociationClasses.Match newEmptyMatch() {
    return AssociationClasses.Match.newEmptyMatch();
  }
  
  @Override
  public AssociationClasses.Match newMatch(final Object... parameters) {
    return AssociationClasses.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass) parameters[0], (com.nomagic.uml2.ext.magicdraw.mdusecases.UseCase) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AssociationClasses} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AssociationClasses#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AssociationClasses INSTANCE = new AssociationClasses();
    
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
    private static final AssociationClasses.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_associationClass = new PParameter("associationClass", "com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "AssociationClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_useCase = new PParameter("useCase", "com.nomagic.uml2.ext.magicdraw.mdusecases.UseCase", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "UseCase")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_associationClass, parameter_useCase);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.associationClasses";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("associationClass","useCase");
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
          PVariable var_associationClass = body.getOrCreateVariableByName("associationClass");
          PVariable var_useCase = body.getOrCreateVariableByName("useCase");
          new TypeConstraint(body, Tuples.flatTupleOf(var_associationClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AssociationClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_useCase), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UseCase")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_associationClass, parameter_associationClass),
             new ExportedParameter(body, var_useCase, parameter_useCase)
          ));
          // 	AssociationClass.ownedUseCase(associationClass, useCase)
          new TypeConstraint(body, Tuples.flatTupleOf(var_associationClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AssociationClass")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_associationClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier", "ownedUseCase")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "UseCase")));
          new Equality(body, var__virtual_0_, var_useCase);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
