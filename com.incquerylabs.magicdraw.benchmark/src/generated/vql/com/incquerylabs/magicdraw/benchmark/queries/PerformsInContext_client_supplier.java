/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.PerformsInContext;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallBehaviorAction;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
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
 *         UAF Standard:       Version 1.0
 *           UAF Element:     PerformsInContext
 *           UAF Constraint Id:  PerformsInContext.client
 *          
 *         pattern PerformsInContext_client_supplier(abstraction : Abstraction, client : Property, supplier : CallBehaviorAction) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.PerformsInContext(abstraction, _);
 *         	Abstraction.client(abstraction, client);
 *         	Abstraction.supplier(abstraction, supplier);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PerformsInContext_client_supplier extends BaseGeneratedEMFQuerySpecification<PerformsInContext_client_supplier.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_client_supplier pattern,
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
    private Abstraction fAbstraction;
    
    private Property fClient;
    
    private CallBehaviorAction fSupplier;
    
    private static List<String> parameterNames = makeImmutableList("abstraction", "client", "supplier");
    
    private Match(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      this.fAbstraction = pAbstraction;
      this.fClient = pClient;
      this.fSupplier = pSupplier;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "abstraction": return this.fAbstraction;
          case "client": return this.fClient;
          case "supplier": return this.fSupplier;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAbstraction;
          case 1: return this.fClient;
          case 2: return this.fSupplier;
          default: return null;
      }
    }
    
    public Abstraction getAbstraction() {
      return this.fAbstraction;
    }
    
    public Property getClient() {
      return this.fClient;
    }
    
    public CallBehaviorAction getSupplier() {
      return this.fSupplier;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("abstraction".equals(parameterName) ) {
          this.fAbstraction = (Abstraction) newValue;
          return true;
      }
      if ("client".equals(parameterName) ) {
          this.fClient = (Property) newValue;
          return true;
      }
      if ("supplier".equals(parameterName) ) {
          this.fSupplier = (CallBehaviorAction) newValue;
          return true;
      }
      return false;
    }
    
    public void setAbstraction(final Abstraction pAbstraction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAbstraction = pAbstraction;
    }
    
    public void setClient(final Property pClient) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClient = pClient;
    }
    
    public void setSupplier(final CallBehaviorAction pSupplier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSupplier = pSupplier;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_client_supplier";
    }
    
    @Override
    public List<String> parameterNames() {
      return PerformsInContext_client_supplier.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAbstraction, fClient, fSupplier};
    }
    
    @Override
    public PerformsInContext_client_supplier.Match toImmutable() {
      return isMutable() ? newMatch(fAbstraction, fClient, fSupplier) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"abstraction\"=" + prettyPrintValue(fAbstraction) + ", ");
      result.append("\"client\"=" + prettyPrintValue(fClient) + ", ");
      result.append("\"supplier\"=" + prettyPrintValue(fSupplier));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAbstraction, fClient, fSupplier);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PerformsInContext_client_supplier.Match)) {
          PerformsInContext_client_supplier.Match other = (PerformsInContext_client_supplier.Match) obj;
          return Objects.equals(fAbstraction, other.fAbstraction) && Objects.equals(fClient, other.fClient) && Objects.equals(fSupplier, other.fSupplier);
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
    public PerformsInContext_client_supplier specification() {
      return PerformsInContext_client_supplier.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PerformsInContext_client_supplier.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PerformsInContext_client_supplier.Match newMutableMatch(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return new Mutable(pAbstraction, pClient, pSupplier);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PerformsInContext_client_supplier.Match newMatch(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return new Immutable(pAbstraction, pClient, pSupplier);
    }
    
    private static final class Mutable extends PerformsInContext_client_supplier.Match {
      Mutable(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
        super(pAbstraction, pClient, pSupplier);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PerformsInContext_client_supplier.Match {
      Immutable(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
        super(pAbstraction, pClient, pSupplier);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_client_supplier pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * UAF Standard:       Version 1.0
   *   UAF Element:     PerformsInContext
   *   UAF Constraint Id:  PerformsInContext.client
   *  
   * pattern PerformsInContext_client_supplier(abstraction : Abstraction, client : Property, supplier : CallBehaviorAction) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.PerformsInContext(abstraction, _);
   * 	Abstraction.client(abstraction, client);
   * 	Abstraction.supplier(abstraction, supplier);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PerformsInContext_client_supplier
   * 
   */
  public static class Matcher extends BaseMatcher<PerformsInContext_client_supplier.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PerformsInContext_client_supplier.Matcher on(final ViatraQueryEngine engine) {
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
    public static PerformsInContext_client_supplier.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ABSTRACTION = 0;
    
    private static final int POSITION_CLIENT = 1;
    
    private static final int POSITION_SUPPLIER = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PerformsInContext_client_supplier.Matcher.class);
    
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
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PerformsInContext_client_supplier.Match> getAllMatches(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return rawStreamAllMatches(new Object[]{pAbstraction, pClient, pSupplier}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PerformsInContext_client_supplier.Match> streamAllMatches(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return rawStreamAllMatches(new Object[]{pAbstraction, pClient, pSupplier});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PerformsInContext_client_supplier.Match> getOneArbitraryMatch(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return rawGetOneArbitraryMatch(new Object[]{pAbstraction, pClient, pSupplier});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return rawHasMatch(new Object[]{pAbstraction, pClient, pSupplier});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return rawCountMatches(new Object[]{pAbstraction, pClient, pSupplier});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier, final Consumer<? super PerformsInContext_client_supplier.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAbstraction, pClient, pSupplier}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAbstraction the fixed value of pattern parameter abstraction, or null if not bound.
     * @param pClient the fixed value of pattern parameter client, or null if not bound.
     * @param pSupplier the fixed value of pattern parameter supplier, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PerformsInContext_client_supplier.Match newMatch(final Abstraction pAbstraction, final Property pClient, final CallBehaviorAction pSupplier) {
      return PerformsInContext_client_supplier.Match.newMatch(pAbstraction, pClient, pSupplier);
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Abstraction> rawStreamAllValuesOfabstraction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ABSTRACTION, parameters).map(Abstraction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOfabstraction() {
      return rawStreamAllValuesOfabstraction(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOfabstraction() {
      return rawStreamAllValuesOfabstraction(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOfabstraction(final PerformsInContext_client_supplier.Match partialMatch) {
      return rawStreamAllValuesOfabstraction(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOfabstraction(final Property pClient, final CallBehaviorAction pSupplier) {
      return rawStreamAllValuesOfabstraction(new Object[]{null, pClient, pSupplier});
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOfabstraction(final PerformsInContext_client_supplier.Match partialMatch) {
      return rawStreamAllValuesOfabstraction(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for abstraction.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOfabstraction(final Property pClient, final CallBehaviorAction pSupplier) {
      return rawStreamAllValuesOfabstraction(new Object[]{null, pClient, pSupplier}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfclient(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLIENT, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfclient() {
      return rawStreamAllValuesOfclient(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfclient() {
      return rawStreamAllValuesOfclient(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfclient(final PerformsInContext_client_supplier.Match partialMatch) {
      return rawStreamAllValuesOfclient(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfclient(final Abstraction pAbstraction, final CallBehaviorAction pSupplier) {
      return rawStreamAllValuesOfclient(new Object[]{pAbstraction, null, pSupplier});
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfclient(final PerformsInContext_client_supplier.Match partialMatch) {
      return rawStreamAllValuesOfclient(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for client.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfclient(final Abstraction pAbstraction, final CallBehaviorAction pSupplier) {
      return rawStreamAllValuesOfclient(new Object[]{pAbstraction, null, pSupplier}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<CallBehaviorAction> rawStreamAllValuesOfsupplier(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SUPPLIER, parameters).map(CallBehaviorAction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CallBehaviorAction> getAllValuesOfsupplier() {
      return rawStreamAllValuesOfsupplier(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<CallBehaviorAction> streamAllValuesOfsupplier() {
      return rawStreamAllValuesOfsupplier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<CallBehaviorAction> streamAllValuesOfsupplier(final PerformsInContext_client_supplier.Match partialMatch) {
      return rawStreamAllValuesOfsupplier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<CallBehaviorAction> streamAllValuesOfsupplier(final Abstraction pAbstraction, final Property pClient) {
      return rawStreamAllValuesOfsupplier(new Object[]{pAbstraction, pClient, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CallBehaviorAction> getAllValuesOfsupplier(final PerformsInContext_client_supplier.Match partialMatch) {
      return rawStreamAllValuesOfsupplier(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for supplier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CallBehaviorAction> getAllValuesOfsupplier(final Abstraction pAbstraction, final Property pClient) {
      return rawStreamAllValuesOfsupplier(new Object[]{pAbstraction, pClient, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected PerformsInContext_client_supplier.Match tupleToMatch(final Tuple t) {
      try {
          return PerformsInContext_client_supplier.Match.newMatch((Abstraction) t.get(POSITION_ABSTRACTION), (Property) t.get(POSITION_CLIENT), (CallBehaviorAction) t.get(POSITION_SUPPLIER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PerformsInContext_client_supplier.Match arrayToMatch(final Object[] match) {
      try {
          return PerformsInContext_client_supplier.Match.newMatch((Abstraction) match[POSITION_ABSTRACTION], (Property) match[POSITION_CLIENT], (CallBehaviorAction) match[POSITION_SUPPLIER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PerformsInContext_client_supplier.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PerformsInContext_client_supplier.Match.newMutableMatch((Abstraction) match[POSITION_ABSTRACTION], (Property) match[POSITION_CLIENT], (CallBehaviorAction) match[POSITION_SUPPLIER]);
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
    public static IQuerySpecification<PerformsInContext_client_supplier.Matcher> querySpecification() {
      return PerformsInContext_client_supplier.instance();
    }
  }
  
  private PerformsInContext_client_supplier() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PerformsInContext_client_supplier instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PerformsInContext_client_supplier.Matcher instantiate(final ViatraQueryEngine engine) {
    return PerformsInContext_client_supplier.Matcher.on(engine);
  }
  
  @Override
  public PerformsInContext_client_supplier.Matcher instantiate() {
    return PerformsInContext_client_supplier.Matcher.create();
  }
  
  @Override
  public PerformsInContext_client_supplier.Match newEmptyMatch() {
    return PerformsInContext_client_supplier.Match.newEmptyMatch();
  }
  
  @Override
  public PerformsInContext_client_supplier.Match newMatch(final Object... parameters) {
    return PerformsInContext_client_supplier.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[1], (com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallBehaviorAction) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link PerformsInContext_client_supplier} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PerformsInContext_client_supplier#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PerformsInContext_client_supplier INSTANCE = new PerformsInContext_client_supplier();
    
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
    private static final PerformsInContext_client_supplier.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_abstraction = new PParameter("abstraction", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")), PParameterDirection.INOUT);
    
    private final PParameter parameter_client = new PParameter("client", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final PParameter parameter_supplier = new PParameter("supplier", "com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallBehaviorAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "CallBehaviorAction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_abstraction, parameter_client, parameter_supplier);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.PerformsInContext_client_supplier";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("abstraction","client","supplier");
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
          PVariable var_abstraction = body.getOrCreateVariableByName("abstraction");
          PVariable var_client = body.getOrCreateVariableByName("client");
          PVariable var_supplier = body.getOrCreateVariableByName("supplier");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_abstraction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_client), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_supplier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "CallBehaviorAction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_abstraction, parameter_abstraction),
             new ExportedParameter(body, var_client, parameter_client),
             new ExportedParameter(body, var_supplier, parameter_supplier)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.PerformsInContext(abstraction, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_abstraction, var___0_), PerformsInContext.instance().getInternalQueryRepresentation());
          // 	Abstraction.client(abstraction, client)
          new TypeConstraint(body, Tuples.flatTupleOf(var_abstraction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_abstraction, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "client")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new Equality(body, var__virtual_0_, var_client);
          // 	Abstraction.supplier(abstraction, supplier)
          new TypeConstraint(body, Tuples.flatTupleOf(var_abstraction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_abstraction, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "supplier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new Equality(body, var__virtual_1_, var_supplier);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
