/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/WarmUpQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.Variable;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
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
 *         // All these patterns are used to warm up the JVM before the real performance queries.
 *         
 *         pattern variables(variable : Variable, type : Type ) {
 *         	Variable.type(variable, type);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Variables extends BaseGeneratedEMFQuerySpecification<Variables.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.variables pattern,
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
    private Variable fVariable;
    
    private Type fType;
    
    private static List<String> parameterNames = makeImmutableList("variable", "type");
    
    private Match(final Variable pVariable, final Type pType) {
      this.fVariable = pVariable;
      this.fType = pType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("variable".equals(parameterName)) return this.fVariable;
      if ("type".equals(parameterName)) return this.fType;
      return null;
    }
    
    public Variable getVariable() {
      return this.fVariable;
    }
    
    public Type getType() {
      return this.fType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("variable".equals(parameterName) ) {
          this.fVariable = (Variable) newValue;
          return true;
      }
      if ("type".equals(parameterName) ) {
          this.fType = (Type) newValue;
          return true;
      }
      return false;
    }
    
    public void setVariable(final Variable pVariable) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fVariable = pVariable;
    }
    
    public void setType(final Type pType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fType = pType;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.variables";
    }
    
    @Override
    public List<String> parameterNames() {
      return Variables.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fVariable, fType};
    }
    
    @Override
    public Variables.Match toImmutable() {
      return isMutable() ? newMatch(fVariable, fType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"variable\"=" + prettyPrintValue(fVariable) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fVariable, fType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Variables.Match)) {
          Variables.Match other = (Variables.Match) obj;
          return Objects.equals(fVariable, other.fVariable) && Objects.equals(fType, other.fType);
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
    public Variables specification() {
      return Variables.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Variables.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Variables.Match newMutableMatch(final Variable pVariable, final Type pType) {
      return new Mutable(pVariable, pType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Variables.Match newMatch(final Variable pVariable, final Type pType) {
      return new Immutable(pVariable, pType);
    }
    
    private static final class Mutable extends Variables.Match {
      Mutable(final Variable pVariable, final Type pType) {
        super(pVariable, pType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Variables.Match {
      Immutable(final Variable pVariable, final Type pType) {
        super(pVariable, pType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.variables pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // All these patterns are used to warm up the JVM before the real performance queries.
   * 
   * pattern variables(variable : Variable, type : Type ) {
   * 	Variable.type(variable, type);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Variables
   * 
   */
  public static class Matcher extends BaseMatcher<Variables.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Variables.Matcher on(final ViatraQueryEngine engine) {
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
    public static Variables.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_VARIABLE = 0;
    
    private static final int POSITION_TYPE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Variables.Matcher.class);
    
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
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Variables.Match> getAllMatches(final Variable pVariable, final Type pType) {
      return rawStreamAllMatches(new Object[]{pVariable, pType}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Variables.Match> streamAllMatches(final Variable pVariable, final Type pType) {
      return rawStreamAllMatches(new Object[]{pVariable, pType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Variables.Match> getOneArbitraryMatch(final Variable pVariable, final Type pType) {
      return rawGetOneArbitraryMatch(new Object[]{pVariable, pType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Variable pVariable, final Type pType) {
      return rawHasMatch(new Object[]{pVariable, pType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Variable pVariable, final Type pType) {
      return rawCountMatches(new Object[]{pVariable, pType});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Variable pVariable, final Type pType, final Consumer<? super Variables.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pVariable, pType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pVariable the fixed value of pattern parameter variable, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Variables.Match newMatch(final Variable pVariable, final Type pType) {
      return Variables.Match.newMatch(pVariable, pType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Variable> rawStreamAllValuesOfvariable(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VARIABLE, parameters).map(Variable.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Variable> getAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Variable> streamAllValuesOfvariable() {
      return rawStreamAllValuesOfvariable(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Variable> streamAllValuesOfvariable(final Variables.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Variable> streamAllValuesOfvariable(final Type pType) {
      return rawStreamAllValuesOfvariable(new Object[]{null, pType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Variable> getAllValuesOfvariable(final Variables.Match partialMatch) {
      return rawStreamAllValuesOfvariable(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for variable.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Variable> getAllValuesOfvariable(final Type pType) {
      return rawStreamAllValuesOfvariable(new Object[]{null, pType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Type> rawStreamAllValuesOftype(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TYPE, parameters).map(Type.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOftype() {
      return rawStreamAllValuesOftype(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOftype() {
      return rawStreamAllValuesOftype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOftype(final Variables.Match partialMatch) {
      return rawStreamAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Type> streamAllValuesOftype(final Variable pVariable) {
      return rawStreamAllValuesOftype(new Object[]{pVariable, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOftype(final Variables.Match partialMatch) {
      return rawStreamAllValuesOftype(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Type> getAllValuesOftype(final Variable pVariable) {
      return rawStreamAllValuesOftype(new Object[]{pVariable, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Variables.Match tupleToMatch(final Tuple t) {
      try {
          return Variables.Match.newMatch((Variable) t.get(POSITION_VARIABLE), (Type) t.get(POSITION_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Variables.Match arrayToMatch(final Object[] match) {
      try {
          return Variables.Match.newMatch((Variable) match[POSITION_VARIABLE], (Type) match[POSITION_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Variables.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Variables.Match.newMutableMatch((Variable) match[POSITION_VARIABLE], (Type) match[POSITION_TYPE]);
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
    public static IQuerySpecification<Variables.Matcher> querySpecification() {
      return Variables.instance();
    }
  }
  
  private Variables() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Variables instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Variables.Matcher instantiate(final ViatraQueryEngine engine) {
    return Variables.Matcher.on(engine);
  }
  
  @Override
  public Variables.Matcher instantiate() {
    return Variables.Matcher.create();
  }
  
  @Override
  public Variables.Match newEmptyMatch() {
    return Variables.Match.newEmptyMatch();
  }
  
  @Override
  public Variables.Match newMatch(final Object... parameters) {
    return Variables.Match.newMatch((com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.Variable) parameters[0], (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.Variables (visibility: PUBLIC, simpleName: Variables, identifier: com.incquerylabs.magicdraw.benchmark.queries.Variables, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.Variables (visibility: PUBLIC, simpleName: Variables, identifier: com.incquerylabs.magicdraw.benchmark.queries.Variables, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Variables INSTANCE = new Variables();
    
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
    private static final Variables.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_variable = new PParameter("variable", "com.nomagic.uml2.ext.magicdraw.activities.mdstructuredactivities.Variable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Variable")), PParameterDirection.INOUT);
    
    private final PParameter parameter_type = new PParameter("type", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_variable, parameter_type);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.variables";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("variable","type");
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
          PVariable var_variable = body.getOrCreateVariableByName("variable");
          PVariable var_type = body.getOrCreateVariableByName("type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Variable")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_variable, parameter_variable),
             new ExportedParameter(body, var_type, parameter_type)
          ));
          // 	Variable.type(variable, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Variable")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_variable, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_0_, var_type);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
