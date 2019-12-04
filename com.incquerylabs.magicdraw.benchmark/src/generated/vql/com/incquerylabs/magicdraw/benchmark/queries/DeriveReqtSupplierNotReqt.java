/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement;
import com.incquerylabs.magicdraw.benchmark.queries.library.DeriveReqt;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         pattern deriveReqtSupplierNotReqt(deriveReqt : Abstraction) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.DeriveReqt(deriveReqt, _);
 *         	Abstraction.supplier(deriveReqt, supplier);
 *         	neg find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(supplier, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DeriveReqtSupplierNotReqt extends BaseGeneratedEMFQuerySpecification<DeriveReqtSupplierNotReqt.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.deriveReqtSupplierNotReqt pattern,
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
    private Abstraction fDeriveReqt;
    
    private static List<String> parameterNames = makeImmutableList("deriveReqt");
    
    private Match(final Abstraction pDeriveReqt) {
      this.fDeriveReqt = pDeriveReqt;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "deriveReqt": return this.fDeriveReqt;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fDeriveReqt;
          default: return null;
      }
    }
    
    public Abstraction getDeriveReqt() {
      return this.fDeriveReqt;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("deriveReqt".equals(parameterName) ) {
          this.fDeriveReqt = (Abstraction) newValue;
          return true;
      }
      return false;
    }
    
    public void setDeriveReqt(final Abstraction pDeriveReqt) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDeriveReqt = pDeriveReqt;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.deriveReqtSupplierNotReqt";
    }
    
    @Override
    public List<String> parameterNames() {
      return DeriveReqtSupplierNotReqt.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDeriveReqt};
    }
    
    @Override
    public DeriveReqtSupplierNotReqt.Match toImmutable() {
      return isMutable() ? newMatch(fDeriveReqt) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"deriveReqt\"=" + prettyPrintValue(fDeriveReqt));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDeriveReqt);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DeriveReqtSupplierNotReqt.Match)) {
          DeriveReqtSupplierNotReqt.Match other = (DeriveReqtSupplierNotReqt.Match) obj;
          return Objects.equals(fDeriveReqt, other.fDeriveReqt);
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
    public DeriveReqtSupplierNotReqt specification() {
      return DeriveReqtSupplierNotReqt.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DeriveReqtSupplierNotReqt.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DeriveReqtSupplierNotReqt.Match newMutableMatch(final Abstraction pDeriveReqt) {
      return new Mutable(pDeriveReqt);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DeriveReqtSupplierNotReqt.Match newMatch(final Abstraction pDeriveReqt) {
      return new Immutable(pDeriveReqt);
    }
    
    private static final class Mutable extends DeriveReqtSupplierNotReqt.Match {
      Mutable(final Abstraction pDeriveReqt) {
        super(pDeriveReqt);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DeriveReqtSupplierNotReqt.Match {
      Immutable(final Abstraction pDeriveReqt) {
        super(pDeriveReqt);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.deriveReqtSupplierNotReqt pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern deriveReqtSupplierNotReqt(deriveReqt : Abstraction) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.DeriveReqt(deriveReqt, _);
   * 	Abstraction.supplier(deriveReqt, supplier);
   * 	neg find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(supplier, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DeriveReqtSupplierNotReqt
   * 
   */
  public static class Matcher extends BaseMatcher<DeriveReqtSupplierNotReqt.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DeriveReqtSupplierNotReqt.Matcher on(final ViatraQueryEngine engine) {
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
    public static DeriveReqtSupplierNotReqt.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DERIVEREQT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DeriveReqtSupplierNotReqt.Matcher.class);
    
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
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DeriveReqtSupplierNotReqt.Match> getAllMatches(final Abstraction pDeriveReqt) {
      return rawStreamAllMatches(new Object[]{pDeriveReqt}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DeriveReqtSupplierNotReqt.Match> streamAllMatches(final Abstraction pDeriveReqt) {
      return rawStreamAllMatches(new Object[]{pDeriveReqt});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DeriveReqtSupplierNotReqt.Match> getOneArbitraryMatch(final Abstraction pDeriveReqt) {
      return rawGetOneArbitraryMatch(new Object[]{pDeriveReqt});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Abstraction pDeriveReqt) {
      return rawHasMatch(new Object[]{pDeriveReqt});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Abstraction pDeriveReqt) {
      return rawCountMatches(new Object[]{pDeriveReqt});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Abstraction pDeriveReqt, final Consumer<? super DeriveReqtSupplierNotReqt.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDeriveReqt}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDeriveReqt the fixed value of pattern parameter deriveReqt, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DeriveReqtSupplierNotReqt.Match newMatch(final Abstraction pDeriveReqt) {
      return DeriveReqtSupplierNotReqt.Match.newMatch(pDeriveReqt);
    }
    
    /**
     * Retrieve the set of values that occur in matches for deriveReqt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Abstraction> rawStreamAllValuesOfderiveReqt(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DERIVEREQT, parameters).map(Abstraction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for deriveReqt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Abstraction> getAllValuesOfderiveReqt() {
      return rawStreamAllValuesOfderiveReqt(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for deriveReqt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Abstraction> streamAllValuesOfderiveReqt() {
      return rawStreamAllValuesOfderiveReqt(emptyArray());
    }
    
    @Override
    protected DeriveReqtSupplierNotReqt.Match tupleToMatch(final Tuple t) {
      try {
          return DeriveReqtSupplierNotReqt.Match.newMatch((Abstraction) t.get(POSITION_DERIVEREQT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeriveReqtSupplierNotReqt.Match arrayToMatch(final Object[] match) {
      try {
          return DeriveReqtSupplierNotReqt.Match.newMatch((Abstraction) match[POSITION_DERIVEREQT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeriveReqtSupplierNotReqt.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DeriveReqtSupplierNotReqt.Match.newMutableMatch((Abstraction) match[POSITION_DERIVEREQT]);
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
    public static IQuerySpecification<DeriveReqtSupplierNotReqt.Matcher> querySpecification() {
      return DeriveReqtSupplierNotReqt.instance();
    }
  }
  
  private DeriveReqtSupplierNotReqt() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DeriveReqtSupplierNotReqt instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DeriveReqtSupplierNotReqt.Matcher instantiate(final ViatraQueryEngine engine) {
    return DeriveReqtSupplierNotReqt.Matcher.on(engine);
  }
  
  @Override
  public DeriveReqtSupplierNotReqt.Matcher instantiate() {
    return DeriveReqtSupplierNotReqt.Matcher.create();
  }
  
  @Override
  public DeriveReqtSupplierNotReqt.Match newEmptyMatch() {
    return DeriveReqtSupplierNotReqt.Match.newEmptyMatch();
  }
  
  @Override
  public DeriveReqtSupplierNotReqt.Match newMatch(final Object... parameters) {
    return DeriveReqtSupplierNotReqt.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DeriveReqtSupplierNotReqt} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link DeriveReqtSupplierNotReqt#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DeriveReqtSupplierNotReqt INSTANCE = new DeriveReqtSupplierNotReqt();
    
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
    private static final DeriveReqtSupplierNotReqt.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_deriveReqt = new PParameter("deriveReqt", "com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Abstraction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_deriveReqt);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.deriveReqtSupplierNotReqt";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("deriveReqt");
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
          PVariable var_deriveReqt = body.getOrCreateVariableByName("deriveReqt");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_supplier = body.getOrCreateVariableByName("supplier");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_deriveReqt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_deriveReqt, parameter_deriveReqt)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.DeriveReqt(deriveReqt, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_deriveReqt, var___0_), DeriveReqt.instance().getInternalQueryRepresentation());
          // 	Abstraction.supplier(deriveReqt, supplier)
          new TypeConstraint(body, Tuples.flatTupleOf(var_deriveReqt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Abstraction")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_deriveReqt, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Dependency", "supplier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "NamedElement")));
          new Equality(body, var__virtual_0_, var_supplier);
          // 	neg find com.incquerylabs.magicdraw.benchmark.queries.library.AbstractRequirement(supplier, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_supplier, var___1_), AbstractRequirement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
