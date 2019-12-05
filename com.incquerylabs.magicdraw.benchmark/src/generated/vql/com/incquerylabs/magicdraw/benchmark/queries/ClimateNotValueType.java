/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.ValueType;
import com.incquerylabs.magicdraw.benchmark.queries.library.updm.Climate;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
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
 *         UPDM Standard:       Version 2.1.1
 *           Compliance Level:  UPDM L1
 *           UPDM Element:      Climate
 *          
 *         pattern climateNotValueType(dataType : DataType) {
 *             find com.incquerylabs.magicdraw.benchmark.queries.library.updm.Climate(dataType, _);
 *             neg find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(dataType, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ClimateNotValueType extends BaseGeneratedEMFQuerySpecification<ClimateNotValueType.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.climateNotValueType pattern,
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
    private DataType fDataType;
    
    private static List<String> parameterNames = makeImmutableList("dataType");
    
    private Match(final DataType pDataType) {
      this.fDataType = pDataType;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "dataType": return this.fDataType;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fDataType;
          default: return null;
      }
    }
    
    public DataType getDataType() {
      return this.fDataType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("dataType".equals(parameterName) ) {
          this.fDataType = (DataType) newValue;
          return true;
      }
      return false;
    }
    
    public void setDataType(final DataType pDataType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDataType = pDataType;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.climateNotValueType";
    }
    
    @Override
    public List<String> parameterNames() {
      return ClimateNotValueType.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDataType};
    }
    
    @Override
    public ClimateNotValueType.Match toImmutable() {
      return isMutable() ? newMatch(fDataType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"dataType\"=" + prettyPrintValue(fDataType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDataType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ClimateNotValueType.Match)) {
          ClimateNotValueType.Match other = (ClimateNotValueType.Match) obj;
          return Objects.equals(fDataType, other.fDataType);
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
    public ClimateNotValueType specification() {
      return ClimateNotValueType.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ClimateNotValueType.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ClimateNotValueType.Match newMutableMatch(final DataType pDataType) {
      return new Mutable(pDataType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ClimateNotValueType.Match newMatch(final DataType pDataType) {
      return new Immutable(pDataType);
    }
    
    private static final class Mutable extends ClimateNotValueType.Match {
      Mutable(final DataType pDataType) {
        super(pDataType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ClimateNotValueType.Match {
      Immutable(final DataType pDataType) {
        super(pDataType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.climateNotValueType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * UPDM Standard:       Version 2.1.1
   *   Compliance Level:  UPDM L1
   *   UPDM Element:      Climate
   *  
   * pattern climateNotValueType(dataType : DataType) {
   *     find com.incquerylabs.magicdraw.benchmark.queries.library.updm.Climate(dataType, _);
   *     neg find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(dataType, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ClimateNotValueType
   * 
   */
  public static class Matcher extends BaseMatcher<ClimateNotValueType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ClimateNotValueType.Matcher on(final ViatraQueryEngine engine) {
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
    public static ClimateNotValueType.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DATATYPE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ClimateNotValueType.Matcher.class);
    
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
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ClimateNotValueType.Match> getAllMatches(final DataType pDataType) {
      return rawStreamAllMatches(new Object[]{pDataType}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ClimateNotValueType.Match> streamAllMatches(final DataType pDataType) {
      return rawStreamAllMatches(new Object[]{pDataType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ClimateNotValueType.Match> getOneArbitraryMatch(final DataType pDataType) {
      return rawGetOneArbitraryMatch(new Object[]{pDataType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DataType pDataType) {
      return rawHasMatch(new Object[]{pDataType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DataType pDataType) {
      return rawCountMatches(new Object[]{pDataType});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DataType pDataType, final Consumer<? super ClimateNotValueType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDataType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ClimateNotValueType.Match newMatch(final DataType pDataType) {
      return ClimateNotValueType.Match.newMatch(pDataType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DataType> rawStreamAllValuesOfdataType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DATATYPE, parameters).map(DataType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfdataType() {
      return rawStreamAllValuesOfdataType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DataType> streamAllValuesOfdataType() {
      return rawStreamAllValuesOfdataType(emptyArray());
    }
    
    @Override
    protected ClimateNotValueType.Match tupleToMatch(final Tuple t) {
      try {
          return ClimateNotValueType.Match.newMatch((DataType) t.get(POSITION_DATATYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ClimateNotValueType.Match arrayToMatch(final Object[] match) {
      try {
          return ClimateNotValueType.Match.newMatch((DataType) match[POSITION_DATATYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ClimateNotValueType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ClimateNotValueType.Match.newMutableMatch((DataType) match[POSITION_DATATYPE]);
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
    public static IQuerySpecification<ClimateNotValueType.Matcher> querySpecification() {
      return ClimateNotValueType.instance();
    }
  }
  
  private ClimateNotValueType() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ClimateNotValueType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClimateNotValueType.Matcher instantiate(final ViatraQueryEngine engine) {
    return ClimateNotValueType.Matcher.on(engine);
  }
  
  @Override
  public ClimateNotValueType.Matcher instantiate() {
    return ClimateNotValueType.Matcher.create();
  }
  
  @Override
  public ClimateNotValueType.Match newEmptyMatch() {
    return ClimateNotValueType.Match.newEmptyMatch();
  }
  
  @Override
  public ClimateNotValueType.Match newMatch(final Object... parameters) {
    return ClimateNotValueType.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ClimateNotValueType} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ClimateNotValueType#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ClimateNotValueType INSTANCE = new ClimateNotValueType();
    
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
    private static final ClimateNotValueType.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_dataType = new PParameter("dataType", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_dataType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.climateNotValueType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("dataType");
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
          PVariable var_dataType = body.getOrCreateVariableByName("dataType");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dataType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_dataType, parameter_dataType)
          ));
          //     find com.incquerylabs.magicdraw.benchmark.queries.library.updm.Climate(dataType, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_dataType, var___0_), Climate.instance().getInternalQueryRepresentation());
          //     neg find com.incquerylabs.magicdraw.benchmark.queries.library.ValueType(dataType, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_dataType, var___1_), ValueType.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
