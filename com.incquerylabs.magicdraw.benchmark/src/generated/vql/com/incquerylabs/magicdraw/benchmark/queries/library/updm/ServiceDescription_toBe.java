/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/updm/UPDM_Library.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library.updm;

import com.incquerylabs.magicdraw.benchmark.queries.library.SlotValue;
import com.incquerylabs.magicdraw.benchmark.queries.library.updm.ServiceDescription;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean;
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
 *         Pattern that queries the 'toBe' attribute of elements with the stereotype 'ServiceDescription'.
 *          
 *           Parameters:
 *           element: 'Package' object with the stereotype 'ServiceDescription'.
 *           valuespec : LiteralBoolean : A value of the attribute 'toBe'.
 *          
 *         pattern ServiceDescription_toBe(element : Package, valuespec : LiteralBoolean) {
 *         	find ServiceDescription(element, domainStereotypeInstance);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.slotValue(domainStereotypeInstance, "toBe", valuespec);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ServiceDescription_toBe extends BaseGeneratedEMFQuerySpecification<ServiceDescription_toBe.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.updm.ServiceDescription_toBe pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package fElement;
    
    private LiteralBoolean fValuespec;
    
    private static List<String> parameterNames = makeImmutableList("element", "valuespec");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      this.fElement = pElement;
      this.fValuespec = pValuespec;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "element": return this.fElement;
          case "valuespec": return this.fValuespec;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          case 1: return this.fValuespec;
          default: return null;
      }
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getElement() {
      return this.fElement;
    }
    
    public LiteralBoolean getValuespec() {
      return this.fValuespec;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("element".equals(parameterName) ) {
          this.fElement = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) newValue;
          return true;
      }
      if ("valuespec".equals(parameterName) ) {
          this.fValuespec = (LiteralBoolean) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setValuespec(final LiteralBoolean pValuespec) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValuespec = pValuespec;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.updm.ServiceDescription_toBe";
    }
    
    @Override
    public List<String> parameterNames() {
      return ServiceDescription_toBe.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fValuespec};
    }
    
    @Override
    public ServiceDescription_toBe.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fValuespec) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"valuespec\"=" + prettyPrintValue(fValuespec));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fValuespec);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ServiceDescription_toBe.Match)) {
          ServiceDescription_toBe.Match other = (ServiceDescription_toBe.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fValuespec, other.fValuespec);
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
    public ServiceDescription_toBe specification() {
      return ServiceDescription_toBe.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ServiceDescription_toBe.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ServiceDescription_toBe.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return new Mutable(pElement, pValuespec);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ServiceDescription_toBe.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return new Immutable(pElement, pValuespec);
    }
    
    private static final class Mutable extends ServiceDescription_toBe.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
        super(pElement, pValuespec);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ServiceDescription_toBe.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
        super(pElement, pValuespec);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.updm.ServiceDescription_toBe pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Pattern that queries the 'toBe' attribute of elements with the stereotype 'ServiceDescription'.
   *  
   *   Parameters:
   *   element: 'Package' object with the stereotype 'ServiceDescription'.
   *   valuespec : LiteralBoolean : A value of the attribute 'toBe'.
   *  
   * pattern ServiceDescription_toBe(element : Package, valuespec : LiteralBoolean) {
   * 	find ServiceDescription(element, domainStereotypeInstance);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.slotValue(domainStereotypeInstance, "toBe", valuespec);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ServiceDescription_toBe
   * 
   */
  public static class Matcher extends BaseMatcher<ServiceDescription_toBe.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ServiceDescription_toBe.Matcher on(final ViatraQueryEngine engine) {
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
    public static ServiceDescription_toBe.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_VALUESPEC = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ServiceDescription_toBe.Matcher.class);
    
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
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ServiceDescription_toBe.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return rawStreamAllMatches(new Object[]{pElement, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ServiceDescription_toBe.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return rawStreamAllMatches(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ServiceDescription_toBe.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return rawHasMatch(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return rawCountMatches(new Object[]{pElement, pValuespec});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec, final Consumer<? super ServiceDescription_toBe.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pValuespec}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter element, or null if not bound.
     * @param pValuespec the fixed value of pattern parameter valuespec, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ServiceDescription_toBe.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement, final LiteralBoolean pValuespec) {
      return ServiceDescription_toBe.Match.newMatch(pElement, pValuespec);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> rawStreamAllValuesOfelement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfelement() {
      return rawStreamAllValuesOfelement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfelement() {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfelement(final ServiceDescription_toBe.Match partialMatch) {
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
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> streamAllValuesOfelement(final LiteralBoolean pValuespec) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValuespec});
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfelement(final ServiceDescription_toBe.Match partialMatch) {
      return rawStreamAllValuesOfelement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package> getAllValuesOfelement(final LiteralBoolean pValuespec) {
      return rawStreamAllValuesOfelement(new Object[]{null, pValuespec}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<LiteralBoolean> rawStreamAllValuesOfvaluespec(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUESPEC, parameters).map(LiteralBoolean.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<LiteralBoolean> getAllValuesOfvaluespec() {
      return rawStreamAllValuesOfvaluespec(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<LiteralBoolean> streamAllValuesOfvaluespec() {
      return rawStreamAllValuesOfvaluespec(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<LiteralBoolean> streamAllValuesOfvaluespec(final ServiceDescription_toBe.Match partialMatch) {
      return rawStreamAllValuesOfvaluespec(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<LiteralBoolean> streamAllValuesOfvaluespec(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement) {
      return rawStreamAllValuesOfvaluespec(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<LiteralBoolean> getAllValuesOfvaluespec(final ServiceDescription_toBe.Match partialMatch) {
      return rawStreamAllValuesOfvaluespec(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for valuespec.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<LiteralBoolean> getAllValuesOfvaluespec(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package pElement) {
      return rawStreamAllValuesOfvaluespec(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ServiceDescription_toBe.Match tupleToMatch(final Tuple t) {
      try {
          return ServiceDescription_toBe.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) t.get(POSITION_ELEMENT), (LiteralBoolean) t.get(POSITION_VALUESPEC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ServiceDescription_toBe.Match arrayToMatch(final Object[] match) {
      try {
          return ServiceDescription_toBe.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_ELEMENT], (LiteralBoolean) match[POSITION_VALUESPEC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ServiceDescription_toBe.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ServiceDescription_toBe.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) match[POSITION_ELEMENT], (LiteralBoolean) match[POSITION_VALUESPEC]);
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
    public static IQuerySpecification<ServiceDescription_toBe.Matcher> querySpecification() {
      return ServiceDescription_toBe.instance();
    }
  }
  
  private ServiceDescription_toBe() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ServiceDescription_toBe instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ServiceDescription_toBe.Matcher instantiate(final ViatraQueryEngine engine) {
    return ServiceDescription_toBe.Matcher.on(engine);
  }
  
  @Override
  public ServiceDescription_toBe.Matcher instantiate() {
    return ServiceDescription_toBe.Matcher.create();
  }
  
  @Override
  public ServiceDescription_toBe.Match newEmptyMatch() {
    return ServiceDescription_toBe.Match.newEmptyMatch();
  }
  
  @Override
  public ServiceDescription_toBe.Match newMatch(final Object... parameters) {
    return ServiceDescription_toBe.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ServiceDescription_toBe} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ServiceDescription_toBe#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ServiceDescription_toBe INSTANCE = new ServiceDescription_toBe();
    
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
    private static final ServiceDescription_toBe.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_element = new PParameter("element", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_valuespec = new PParameter("valuespec", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralBoolean")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_element, parameter_valuespec);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.updm.ServiceDescription_toBe";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("element","valuespec");
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
          PVariable var_valuespec = body.getOrCreateVariableByName("valuespec");
          PVariable var_domainStereotypeInstance = body.getOrCreateVariableByName("domainStereotypeInstance");
          new TypeConstraint(body, Tuples.flatTupleOf(var_element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_valuespec), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralBoolean")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_element, parameter_element),
             new ExportedParameter(body, var_valuespec, parameter_valuespec)
          ));
          // 	find ServiceDescription(element, domainStereotypeInstance)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_element, var_domainStereotypeInstance), ServiceDescription.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.slotValue(domainStereotypeInstance, "toBe", valuespec)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "toBe");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_domainStereotypeInstance, var__virtual_0_, var_valuespec), SlotValue.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
