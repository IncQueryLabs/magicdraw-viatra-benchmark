/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
 *         pattern endPathMiultiplicityNegative(endPathMultiplicity : Property) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _);
 *         	Property.lowerValue(endPathMultiplicity, lower);
 *         	LiteralInteger.value(lower, value);
 *         	check(value {@literal <} 0);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndPathMiultiplicityNegative extends BaseGeneratedEMFQuerySpecification<EndPathMiultiplicityNegative.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNegative pattern,
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
    private Property fEndPathMultiplicity;
    
    private static List<String> parameterNames = makeImmutableList("endPathMultiplicity");
    
    private Match(final Property pEndPathMultiplicity) {
      this.fEndPathMultiplicity = pEndPathMultiplicity;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "endPathMultiplicity": return this.fEndPathMultiplicity;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEndPathMultiplicity;
          default: return null;
      }
    }
    
    public Property getEndPathMultiplicity() {
      return this.fEndPathMultiplicity;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("endPathMultiplicity".equals(parameterName) ) {
          this.fEndPathMultiplicity = (Property) newValue;
          return true;
      }
      return false;
    }
    
    public void setEndPathMultiplicity(final Property pEndPathMultiplicity) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEndPathMultiplicity = pEndPathMultiplicity;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNegative";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndPathMiultiplicityNegative.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEndPathMultiplicity};
    }
    
    @Override
    public EndPathMiultiplicityNegative.Match toImmutable() {
      return isMutable() ? newMatch(fEndPathMultiplicity) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"endPathMultiplicity\"=" + prettyPrintValue(fEndPathMultiplicity));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEndPathMultiplicity);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndPathMiultiplicityNegative.Match)) {
          EndPathMiultiplicityNegative.Match other = (EndPathMiultiplicityNegative.Match) obj;
          return Objects.equals(fEndPathMultiplicity, other.fEndPathMultiplicity);
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
    public EndPathMiultiplicityNegative specification() {
      return EndPathMiultiplicityNegative.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndPathMiultiplicityNegative.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndPathMiultiplicityNegative.Match newMutableMatch(final Property pEndPathMultiplicity) {
      return new Mutable(pEndPathMultiplicity);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndPathMiultiplicityNegative.Match newMatch(final Property pEndPathMultiplicity) {
      return new Immutable(pEndPathMultiplicity);
    }
    
    private static final class Mutable extends EndPathMiultiplicityNegative.Match {
      Mutable(final Property pEndPathMultiplicity) {
        super(pEndPathMultiplicity);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndPathMiultiplicityNegative.Match {
      Immutable(final Property pEndPathMultiplicity) {
        super(pEndPathMultiplicity);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNegative pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern endPathMiultiplicityNegative(endPathMultiplicity : Property) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _);
   * 	Property.lowerValue(endPathMultiplicity, lower);
   * 	LiteralInteger.value(lower, value);
   * 	check(value {@literal <} 0);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndPathMiultiplicityNegative
   * 
   */
  public static class Matcher extends BaseMatcher<EndPathMiultiplicityNegative.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndPathMiultiplicityNegative.Matcher on(final ViatraQueryEngine engine) {
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
    public static EndPathMiultiplicityNegative.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ENDPATHMULTIPLICITY = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndPathMiultiplicityNegative.Matcher.class);
    
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
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndPathMiultiplicityNegative.Match> getAllMatches(final Property pEndPathMultiplicity) {
      return rawStreamAllMatches(new Object[]{pEndPathMultiplicity}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndPathMiultiplicityNegative.Match> streamAllMatches(final Property pEndPathMultiplicity) {
      return rawStreamAllMatches(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndPathMiultiplicityNegative.Match> getOneArbitraryMatch(final Property pEndPathMultiplicity) {
      return rawGetOneArbitraryMatch(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pEndPathMultiplicity) {
      return rawHasMatch(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pEndPathMultiplicity) {
      return rawCountMatches(new Object[]{pEndPathMultiplicity});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pEndPathMultiplicity, final Consumer<? super EndPathMiultiplicityNegative.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEndPathMultiplicity}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEndPathMultiplicity the fixed value of pattern parameter endPathMultiplicity, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndPathMiultiplicityNegative.Match newMatch(final Property pEndPathMultiplicity) {
      return EndPathMiultiplicityNegative.Match.newMatch(pEndPathMultiplicity);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endPathMultiplicity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfendPathMultiplicity(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDPATHMULTIPLICITY, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for endPathMultiplicity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfendPathMultiplicity() {
      return rawStreamAllValuesOfendPathMultiplicity(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for endPathMultiplicity.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfendPathMultiplicity() {
      return rawStreamAllValuesOfendPathMultiplicity(emptyArray());
    }
    
    @Override
    protected EndPathMiultiplicityNegative.Match tupleToMatch(final Tuple t) {
      try {
          return EndPathMiultiplicityNegative.Match.newMatch((Property) t.get(POSITION_ENDPATHMULTIPLICITY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndPathMiultiplicityNegative.Match arrayToMatch(final Object[] match) {
      try {
          return EndPathMiultiplicityNegative.Match.newMatch((Property) match[POSITION_ENDPATHMULTIPLICITY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndPathMiultiplicityNegative.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndPathMiultiplicityNegative.Match.newMutableMatch((Property) match[POSITION_ENDPATHMULTIPLICITY]);
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
    public static IQuerySpecification<EndPathMiultiplicityNegative.Matcher> querySpecification() {
      return EndPathMiultiplicityNegative.instance();
    }
  }
  
  private EndPathMiultiplicityNegative() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndPathMiultiplicityNegative instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndPathMiultiplicityNegative.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndPathMiultiplicityNegative.Matcher.on(engine);
  }
  
  @Override
  public EndPathMiultiplicityNegative.Matcher instantiate() {
    return EndPathMiultiplicityNegative.Matcher.create();
  }
  
  @Override
  public EndPathMiultiplicityNegative.Match newEmptyMatch() {
    return EndPathMiultiplicityNegative.Match.newEmptyMatch();
  }
  
  @Override
  public EndPathMiultiplicityNegative.Match newMatch(final Object... parameters) {
    return EndPathMiultiplicityNegative.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EndPathMiultiplicityNegative} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EndPathMiultiplicityNegative#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndPathMiultiplicityNegative INSTANCE = new EndPathMiultiplicityNegative();
    
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
    private static final EndPathMiultiplicityNegative.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_endPathMultiplicity = new PParameter("endPathMultiplicity", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_endPathMultiplicity);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.endPathMiultiplicityNegative";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("endPathMultiplicity");
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
          PVariable var_endPathMultiplicity = body.getOrCreateVariableByName("endPathMultiplicity");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_lower = body.getOrCreateVariableByName("lower");
          PVariable var_value = body.getOrCreateVariableByName("value");
          new TypeConstraint(body, Tuples.flatTupleOf(var_endPathMultiplicity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_endPathMultiplicity, parameter_endPathMultiplicity)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.EndPathMultiplicity(endPathMultiplicity, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_endPathMultiplicity, var___0_), EndPathMultiplicity.instance().getInternalQueryRepresentation());
          // 	Property.lowerValue(endPathMultiplicity, lower)
          new TypeConstraint(body, Tuples.flatTupleOf(var_endPathMultiplicity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_endPathMultiplicity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "MultiplicityElement", "lowerValue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ValueSpecification")));
          new Equality(body, var__virtual_0_, var_lower);
          // 	LiteralInteger.value(lower, value)
          new TypeConstraint(body, Tuples.flatTupleOf(var_lower), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_lower, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "LiteralInteger", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Integer")));
          new Equality(body, var__virtual_1_, var_value);
          // 	check(value < 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern endPathMiultiplicityNegative";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("value");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer value = (Integer) provider.getValue("value");
                  return evaluateExpression_1_1(value);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer value) {
    return ((value).intValue() < 0);
  }
}
