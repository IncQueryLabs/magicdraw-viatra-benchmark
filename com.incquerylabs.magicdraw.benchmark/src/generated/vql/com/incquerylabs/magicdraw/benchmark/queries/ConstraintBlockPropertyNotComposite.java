/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.ConstraintBlock;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         pattern constraintBlockPropertyNotComposite(constraintBlock : Class) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.ConstraintBlock(constraintBlock, _);
 *         	Class.ownedAttribute(constraintBlock, property);
 *         	neg Property.aggregation(property, ::composite);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConstraintBlockPropertyNotComposite extends BaseGeneratedEMFQuerySpecification<ConstraintBlockPropertyNotComposite.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.constraintBlockPropertyNotComposite pattern,
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
    private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class fConstraintBlock;
    
    private static List<String> parameterNames = makeImmutableList("constraintBlock");
    
    private Match(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      this.fConstraintBlock = pConstraintBlock;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "constraintBlock": return this.fConstraintBlock;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fConstraintBlock;
          default: return null;
      }
    }
    
    public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class getConstraintBlock() {
      return this.fConstraintBlock;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("constraintBlock".equals(parameterName) ) {
          this.fConstraintBlock = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setConstraintBlock(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConstraintBlock = pConstraintBlock;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.constraintBlockPropertyNotComposite";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConstraintBlockPropertyNotComposite.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fConstraintBlock};
    }
    
    @Override
    public ConstraintBlockPropertyNotComposite.Match toImmutable() {
      return isMutable() ? newMatch(fConstraintBlock) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"constraintBlock\"=" + prettyPrintValue(fConstraintBlock));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fConstraintBlock);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConstraintBlockPropertyNotComposite.Match)) {
          ConstraintBlockPropertyNotComposite.Match other = (ConstraintBlockPropertyNotComposite.Match) obj;
          return Objects.equals(fConstraintBlock, other.fConstraintBlock);
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
    public ConstraintBlockPropertyNotComposite specification() {
      return ConstraintBlockPropertyNotComposite.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConstraintBlockPropertyNotComposite.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConstraintBlockPropertyNotComposite.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return new Mutable(pConstraintBlock);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConstraintBlockPropertyNotComposite.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return new Immutable(pConstraintBlock);
    }
    
    private static final class Mutable extends ConstraintBlockPropertyNotComposite.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
        super(pConstraintBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConstraintBlockPropertyNotComposite.Match {
      Immutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
        super(pConstraintBlock);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.constraintBlockPropertyNotComposite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern constraintBlockPropertyNotComposite(constraintBlock : Class) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.ConstraintBlock(constraintBlock, _);
   * 	Class.ownedAttribute(constraintBlock, property);
   * 	neg Property.aggregation(property, ::composite);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConstraintBlockPropertyNotComposite
   * 
   */
  public static class Matcher extends BaseMatcher<ConstraintBlockPropertyNotComposite.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConstraintBlockPropertyNotComposite.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConstraintBlockPropertyNotComposite.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONSTRAINTBLOCK = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConstraintBlockPropertyNotComposite.Matcher.class);
    
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
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConstraintBlockPropertyNotComposite.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return rawStreamAllMatches(new Object[]{pConstraintBlock}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConstraintBlockPropertyNotComposite.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return rawStreamAllMatches(new Object[]{pConstraintBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConstraintBlockPropertyNotComposite.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return rawGetOneArbitraryMatch(new Object[]{pConstraintBlock});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return rawHasMatch(new Object[]{pConstraintBlock});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return rawCountMatches(new Object[]{pConstraintBlock});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock, final Consumer<? super ConstraintBlockPropertyNotComposite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pConstraintBlock}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConstraintBlockPropertyNotComposite.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return ConstraintBlockPropertyNotComposite.Match.newMatch(pConstraintBlock);
    }
    
    /**
     * Retrieve the set of values that occur in matches for constraintBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> rawStreamAllValuesOfconstraintBlock(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CONSTRAINTBLOCK, parameters).map(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for constraintBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> getAllValuesOfconstraintBlock() {
      return rawStreamAllValuesOfconstraintBlock(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for constraintBlock.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class> streamAllValuesOfconstraintBlock() {
      return rawStreamAllValuesOfconstraintBlock(emptyArray());
    }
    
    @Override
    protected ConstraintBlockPropertyNotComposite.Match tupleToMatch(final Tuple t) {
      try {
          return ConstraintBlockPropertyNotComposite.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_CONSTRAINTBLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConstraintBlockPropertyNotComposite.Match arrayToMatch(final Object[] match) {
      try {
          return ConstraintBlockPropertyNotComposite.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_CONSTRAINTBLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConstraintBlockPropertyNotComposite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConstraintBlockPropertyNotComposite.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_CONSTRAINTBLOCK]);
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
    public static IQuerySpecification<ConstraintBlockPropertyNotComposite.Matcher> querySpecification() {
      return ConstraintBlockPropertyNotComposite.instance();
    }
  }
  
  private ConstraintBlockPropertyNotComposite() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConstraintBlockPropertyNotComposite instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConstraintBlockPropertyNotComposite.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConstraintBlockPropertyNotComposite.Matcher.on(engine);
  }
  
  @Override
  public ConstraintBlockPropertyNotComposite.Matcher instantiate() {
    return ConstraintBlockPropertyNotComposite.Matcher.create();
  }
  
  @Override
  public ConstraintBlockPropertyNotComposite.Match newEmptyMatch() {
    return ConstraintBlockPropertyNotComposite.Match.newEmptyMatch();
  }
  
  @Override
  public ConstraintBlockPropertyNotComposite.Match newMatch(final Object... parameters) {
    return ConstraintBlockPropertyNotComposite.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ConstraintBlockPropertyNotComposite} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ConstraintBlockPropertyNotComposite#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConstraintBlockPropertyNotComposite INSTANCE = new ConstraintBlockPropertyNotComposite();
    
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
    private static final ConstraintBlockPropertyNotComposite.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_constraintBlock = new PParameter("constraintBlock", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_constraintBlock);
    
    private class Embedded_1_Property_aggregation extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "AggregationKind")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Property_aggregation() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Property_aggregation";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  Property.aggregation(property, ::composite)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property", "aggregation")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "AggregationKind")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.constraintBlockPropertyNotComposite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("constraintBlock");
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
          PVariable var_constraintBlock = body.getOrCreateVariableByName("constraintBlock");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_property = body.getOrCreateVariableByName("property");
          new TypeConstraint(body, Tuples.flatTupleOf(var_constraintBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_constraintBlock, parameter_constraintBlock)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.ConstraintBlock(constraintBlock, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_constraintBlock, var___0_), ConstraintBlock.instance().getInternalQueryRepresentation());
          // 	Class.ownedAttribute(constraintBlock, property)
          new TypeConstraint(body, Tuples.flatTupleOf(var_constraintBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_constraintBlock, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuredClassifier", "ownedAttribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          new Equality(body, var__virtual_0_, var_property);
          // 	neg Property.aggregation(property, ::composite)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum.get("composite"));
          new NegativePatternCall(body, Tuples.flatTupleOf(var_property, var__virtual_1_), new ConstraintBlockPropertyNotComposite.GeneratedPQuery.Embedded_1_Property_aggregation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
