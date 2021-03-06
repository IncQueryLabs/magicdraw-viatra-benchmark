/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.Dependencies;
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
 *         Reusing the dependency pattern and querying simple attributes.
 *          
 *         pattern namesOfDependencyEndpoints(source : NamedElement, sourceName : java ^java.lang.String, target : NamedElement, targetName : java ^java.lang.String) {
 *         	find dependencies(source, target);
 *         	NamedElement.name(source, sourceName);
 *         	NamedElement.name(target, targetName);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NamesOfDependencyEndpoints extends BaseGeneratedEMFQuerySpecification<NamesOfDependencyEndpoints.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.namesOfDependencyEndpoints pattern,
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
    private NamedElement fSource;
    
    private String fSourceName;
    
    private NamedElement fTarget;
    
    private String fTargetName;
    
    private static List<String> parameterNames = makeImmutableList("source", "sourceName", "target", "targetName");
    
    private Match(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      this.fSource = pSource;
      this.fSourceName = pSourceName;
      this.fTarget = pTarget;
      this.fTargetName = pTargetName;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "source": return this.fSource;
          case "sourceName": return this.fSourceName;
          case "target": return this.fTarget;
          case "targetName": return this.fTargetName;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fSource;
          case 1: return this.fSourceName;
          case 2: return this.fTarget;
          case 3: return this.fTargetName;
          default: return null;
      }
    }
    
    public NamedElement getSource() {
      return this.fSource;
    }
    
    public String getSourceName() {
      return this.fSourceName;
    }
    
    public NamedElement getTarget() {
      return this.fTarget;
    }
    
    public String getTargetName() {
      return this.fTargetName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("source".equals(parameterName) ) {
          this.fSource = (NamedElement) newValue;
          return true;
      }
      if ("sourceName".equals(parameterName) ) {
          this.fSourceName = (String) newValue;
          return true;
      }
      if ("target".equals(parameterName) ) {
          this.fTarget = (NamedElement) newValue;
          return true;
      }
      if ("targetName".equals(parameterName) ) {
          this.fTargetName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setSource(final NamedElement pSource) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSource = pSource;
    }
    
    public void setSourceName(final String pSourceName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSourceName = pSourceName;
    }
    
    public void setTarget(final NamedElement pTarget) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTarget = pTarget;
    }
    
    public void setTargetName(final String pTargetName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTargetName = pTargetName;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.namesOfDependencyEndpoints";
    }
    
    @Override
    public List<String> parameterNames() {
      return NamesOfDependencyEndpoints.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSource, fSourceName, fTarget, fTargetName};
    }
    
    @Override
    public NamesOfDependencyEndpoints.Match toImmutable() {
      return isMutable() ? newMatch(fSource, fSourceName, fTarget, fTargetName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
      result.append("\"sourceName\"=" + prettyPrintValue(fSourceName) + ", ");
      result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
      result.append("\"targetName\"=" + prettyPrintValue(fTargetName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fSource, fSourceName, fTarget, fTargetName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NamesOfDependencyEndpoints.Match)) {
          NamesOfDependencyEndpoints.Match other = (NamesOfDependencyEndpoints.Match) obj;
          return Objects.equals(fSource, other.fSource) && Objects.equals(fSourceName, other.fSourceName) && Objects.equals(fTarget, other.fTarget) && Objects.equals(fTargetName, other.fTargetName);
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
    public NamesOfDependencyEndpoints specification() {
      return NamesOfDependencyEndpoints.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NamesOfDependencyEndpoints.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NamesOfDependencyEndpoints.Match newMutableMatch(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return new Mutable(pSource, pSourceName, pTarget, pTargetName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NamesOfDependencyEndpoints.Match newMatch(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return new Immutable(pSource, pSourceName, pTarget, pTargetName);
    }
    
    private static final class Mutable extends NamesOfDependencyEndpoints.Match {
      Mutable(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
        super(pSource, pSourceName, pTarget, pTargetName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NamesOfDependencyEndpoints.Match {
      Immutable(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
        super(pSource, pSourceName, pTarget, pTargetName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.namesOfDependencyEndpoints pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Reusing the dependency pattern and querying simple attributes.
   *  
   * pattern namesOfDependencyEndpoints(source : NamedElement, sourceName : java ^java.lang.String, target : NamedElement, targetName : java ^java.lang.String) {
   * 	find dependencies(source, target);
   * 	NamedElement.name(source, sourceName);
   * 	NamedElement.name(target, targetName);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NamesOfDependencyEndpoints
   * 
   */
  public static class Matcher extends BaseMatcher<NamesOfDependencyEndpoints.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NamesOfDependencyEndpoints.Matcher on(final ViatraQueryEngine engine) {
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
    public static NamesOfDependencyEndpoints.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SOURCE = 0;
    
    private static final int POSITION_SOURCENAME = 1;
    
    private static final int POSITION_TARGET = 2;
    
    private static final int POSITION_TARGETNAME = 3;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NamesOfDependencyEndpoints.Matcher.class);
    
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
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NamesOfDependencyEndpoints.Match> getAllMatches(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawStreamAllMatches(new Object[]{pSource, pSourceName, pTarget, pTargetName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NamesOfDependencyEndpoints.Match> streamAllMatches(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawStreamAllMatches(new Object[]{pSource, pSourceName, pTarget, pTargetName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NamesOfDependencyEndpoints.Match> getOneArbitraryMatch(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawGetOneArbitraryMatch(new Object[]{pSource, pSourceName, pTarget, pTargetName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawHasMatch(new Object[]{pSource, pSourceName, pTarget, pTargetName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawCountMatches(new Object[]{pSource, pSourceName, pTarget, pTargetName});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName, final Consumer<? super NamesOfDependencyEndpoints.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSource, pSourceName, pTarget, pTargetName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param pSourceName the fixed value of pattern parameter sourceName, or null if not bound.
     * @param pTarget the fixed value of pattern parameter target, or null if not bound.
     * @param pTargetName the fixed value of pattern parameter targetName, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NamesOfDependencyEndpoints.Match newMatch(final NamedElement pSource, final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return NamesOfDependencyEndpoints.Match.newMatch(pSource, pSourceName, pTarget, pTargetName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOfsource(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SOURCE, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfsource(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOfsource(final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawStreamAllValuesOfsource(new Object[]{null, pSourceName, pTarget, pTargetName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfsource(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOfsource(final String pSourceName, final NamedElement pTarget, final String pTargetName) {
      return rawStreamAllValuesOfsource(new Object[]{null, pSourceName, pTarget, pTargetName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfsourceName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SOURCENAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfsourceName() {
      return rawStreamAllValuesOfsourceName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfsourceName() {
      return rawStreamAllValuesOfsourceName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfsourceName(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOfsourceName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfsourceName(final NamedElement pSource, final NamedElement pTarget, final String pTargetName) {
      return rawStreamAllValuesOfsourceName(new Object[]{pSource, null, pTarget, pTargetName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfsourceName(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOfsourceName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for sourceName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfsourceName(final NamedElement pSource, final NamedElement pTarget, final String pTargetName) {
      return rawStreamAllValuesOfsourceName(new Object[]{pSource, null, pTarget, pTargetName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<NamedElement> rawStreamAllValuesOftarget(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGET, parameters).map(NamedElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOftarget() {
      return rawStreamAllValuesOftarget(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOftarget(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<NamedElement> streamAllValuesOftarget(final NamedElement pSource, final String pSourceName, final String pTargetName) {
      return rawStreamAllValuesOftarget(new Object[]{pSource, pSourceName, null, pTargetName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOftarget(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOftarget(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<NamedElement> getAllValuesOftarget(final NamedElement pSource, final String pSourceName, final String pTargetName) {
      return rawStreamAllValuesOftarget(new Object[]{pSource, pSourceName, null, pTargetName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOftargetName(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGETNAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOftargetName() {
      return rawStreamAllValuesOftargetName(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOftargetName() {
      return rawStreamAllValuesOftargetName(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOftargetName(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOftargetName(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOftargetName(final NamedElement pSource, final String pSourceName, final NamedElement pTarget) {
      return rawStreamAllValuesOftargetName(new Object[]{pSource, pSourceName, pTarget, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOftargetName(final NamesOfDependencyEndpoints.Match partialMatch) {
      return rawStreamAllValuesOftargetName(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for targetName.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOftargetName(final NamedElement pSource, final String pSourceName, final NamedElement pTarget) {
      return rawStreamAllValuesOftargetName(new Object[]{pSource, pSourceName, pTarget, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected NamesOfDependencyEndpoints.Match tupleToMatch(final Tuple t) {
      try {
          return NamesOfDependencyEndpoints.Match.newMatch((NamedElement) t.get(POSITION_SOURCE), (String) t.get(POSITION_SOURCENAME), (NamedElement) t.get(POSITION_TARGET), (String) t.get(POSITION_TARGETNAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NamesOfDependencyEndpoints.Match arrayToMatch(final Object[] match) {
      try {
          return NamesOfDependencyEndpoints.Match.newMatch((NamedElement) match[POSITION_SOURCE], (String) match[POSITION_SOURCENAME], (NamedElement) match[POSITION_TARGET], (String) match[POSITION_TARGETNAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NamesOfDependencyEndpoints.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NamesOfDependencyEndpoints.Match.newMutableMatch((NamedElement) match[POSITION_SOURCE], (String) match[POSITION_SOURCENAME], (NamedElement) match[POSITION_TARGET], (String) match[POSITION_TARGETNAME]);
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
    public static IQuerySpecification<NamesOfDependencyEndpoints.Matcher> querySpecification() {
      return NamesOfDependencyEndpoints.instance();
    }
  }
  
  private NamesOfDependencyEndpoints() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NamesOfDependencyEndpoints instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NamesOfDependencyEndpoints.Matcher instantiate(final ViatraQueryEngine engine) {
    return NamesOfDependencyEndpoints.Matcher.on(engine);
  }
  
  @Override
  public NamesOfDependencyEndpoints.Matcher instantiate() {
    return NamesOfDependencyEndpoints.Matcher.create();
  }
  
  @Override
  public NamesOfDependencyEndpoints.Match newEmptyMatch() {
    return NamesOfDependencyEndpoints.Match.newEmptyMatch();
  }
  
  @Override
  public NamesOfDependencyEndpoints.Match newMatch(final Object... parameters) {
    return NamesOfDependencyEndpoints.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[0], (java.lang.String) parameters[1], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement) parameters[2], (java.lang.String) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NamesOfDependencyEndpoints} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NamesOfDependencyEndpoints#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NamesOfDependencyEndpoints INSTANCE = new NamesOfDependencyEndpoints();
    
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
    private static final NamesOfDependencyEndpoints.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_source = new PParameter("source", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_sourceName = new PParameter("sourceName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_target = new PParameter("target", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_targetName = new PParameter("targetName", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_source, parameter_sourceName, parameter_target, parameter_targetName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.namesOfDependencyEndpoints";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("source","sourceName","target","targetName");
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
          PVariable var_source = body.getOrCreateVariableByName("source");
          PVariable var_sourceName = body.getOrCreateVariableByName("sourceName");
          PVariable var_target = body.getOrCreateVariableByName("target");
          PVariable var_targetName = body.getOrCreateVariableByName("targetName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_sourceName), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_targetName), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_source, parameter_source),
             new ExportedParameter(body, var_sourceName, parameter_sourceName),
             new ExportedParameter(body, var_target, parameter_target),
             new ExportedParameter(body, var_targetName, parameter_targetName)
          ));
          // 	find dependencies(source, target)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_source, var_target), Dependencies.instance().getInternalQueryRepresentation());
          // 	NamedElement.name(source, sourceName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_source, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_0_, var_sourceName);
          // 	NamedElement.name(target, targetName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_target, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "String")));
          new Equality(body, var__virtual_1_, var_targetName);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
