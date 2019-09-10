/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

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
import sysml.ConstraintBlock;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern
 *         constraintBlockSpecializationNotConstraintBlock(constraintBlock : Class) {
 *         	find sysml.ConstraintBlock(constraintBlock, _);
 *         	Classifier(classifier);
 *         	Classifier.generalization(classifier, generalization);
 *         	Generalization.general(generalization, constraintBlock);
 *         	neg find sysml.ConstraintBlock(classifier, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConstraintBlockSpecializationNotConstraintBlock extends BaseGeneratedEMFQuerySpecification<ConstraintBlockSpecializationNotConstraintBlock.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.constraintBlockSpecializationNotConstraintBlock pattern,
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
      return "com.incquerylabs.magicdraw.benchmark.queries.constraintBlockSpecializationNotConstraintBlock";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConstraintBlockSpecializationNotConstraintBlock.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fConstraintBlock};
    }
    
    @Override
    public ConstraintBlockSpecializationNotConstraintBlock.Match toImmutable() {
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
      if ((obj instanceof ConstraintBlockSpecializationNotConstraintBlock.Match)) {
          ConstraintBlockSpecializationNotConstraintBlock.Match other = (ConstraintBlockSpecializationNotConstraintBlock.Match) obj;
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
    public ConstraintBlockSpecializationNotConstraintBlock specification() {
      return ConstraintBlockSpecializationNotConstraintBlock.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConstraintBlockSpecializationNotConstraintBlock.Match newEmptyMatch() {
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
    public static ConstraintBlockSpecializationNotConstraintBlock.Match newMutableMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
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
    public static ConstraintBlockSpecializationNotConstraintBlock.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return new Immutable(pConstraintBlock);
    }
    
    private static final class Mutable extends ConstraintBlockSpecializationNotConstraintBlock.Match {
      Mutable(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
        super(pConstraintBlock);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConstraintBlockSpecializationNotConstraintBlock.Match {
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
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.constraintBlockSpecializationNotConstraintBlock pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern
   * constraintBlockSpecializationNotConstraintBlock(constraintBlock : Class) {
   * 	find sysml.ConstraintBlock(constraintBlock, _);
   * 	Classifier(classifier);
   * 	Classifier.generalization(classifier, generalization);
   * 	Generalization.general(generalization, constraintBlock);
   * 	neg find sysml.ConstraintBlock(classifier, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConstraintBlockSpecializationNotConstraintBlock
   * 
   */
  public static class Matcher extends BaseMatcher<ConstraintBlockSpecializationNotConstraintBlock.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConstraintBlockSpecializationNotConstraintBlock.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConstraintBlockSpecializationNotConstraintBlock.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONSTRAINTBLOCK = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConstraintBlockSpecializationNotConstraintBlock.Matcher.class);
    
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
    public Collection<ConstraintBlockSpecializationNotConstraintBlock.Match> getAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
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
    public Stream<ConstraintBlockSpecializationNotConstraintBlock.Match> streamAllMatches(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return rawStreamAllMatches(new Object[]{pConstraintBlock});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConstraintBlock the fixed value of pattern parameter constraintBlock, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConstraintBlockSpecializationNotConstraintBlock.Match> getOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
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
    public boolean forOneArbitraryMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock, final Consumer<? super ConstraintBlockSpecializationNotConstraintBlock.Match> processor) {
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
    public ConstraintBlockSpecializationNotConstraintBlock.Match newMatch(final com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class pConstraintBlock) {
      return ConstraintBlockSpecializationNotConstraintBlock.Match.newMatch(pConstraintBlock);
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
    protected ConstraintBlockSpecializationNotConstraintBlock.Match tupleToMatch(final Tuple t) {
      try {
          return ConstraintBlockSpecializationNotConstraintBlock.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) t.get(POSITION_CONSTRAINTBLOCK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConstraintBlockSpecializationNotConstraintBlock.Match arrayToMatch(final Object[] match) {
      try {
          return ConstraintBlockSpecializationNotConstraintBlock.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_CONSTRAINTBLOCK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConstraintBlockSpecializationNotConstraintBlock.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConstraintBlockSpecializationNotConstraintBlock.Match.newMutableMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) match[POSITION_CONSTRAINTBLOCK]);
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
    public static IQuerySpecification<ConstraintBlockSpecializationNotConstraintBlock.Matcher> querySpecification() {
      return ConstraintBlockSpecializationNotConstraintBlock.instance();
    }
  }
  
  private ConstraintBlockSpecializationNotConstraintBlock() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConstraintBlockSpecializationNotConstraintBlock instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConstraintBlockSpecializationNotConstraintBlock.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConstraintBlockSpecializationNotConstraintBlock.Matcher.on(engine);
  }
  
  @Override
  public ConstraintBlockSpecializationNotConstraintBlock.Matcher instantiate() {
    return ConstraintBlockSpecializationNotConstraintBlock.Matcher.create();
  }
  
  @Override
  public ConstraintBlockSpecializationNotConstraintBlock.Match newEmptyMatch() {
    return ConstraintBlockSpecializationNotConstraintBlock.Match.newEmptyMatch();
  }
  
  @Override
  public ConstraintBlockSpecializationNotConstraintBlock.Match newMatch(final Object... parameters) {
    return ConstraintBlockSpecializationNotConstraintBlock.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ConstraintBlockSpecializationNotConstraintBlock} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ConstraintBlockSpecializationNotConstraintBlock#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConstraintBlockSpecializationNotConstraintBlock INSTANCE = new ConstraintBlockSpecializationNotConstraintBlock();
    
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
    private static final ConstraintBlockSpecializationNotConstraintBlock.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_constraintBlock = new PParameter("constraintBlock", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_constraintBlock);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.constraintBlockSpecializationNotConstraintBlock";
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
          PVariable var_classifier = body.getOrCreateVariableByName("classifier");
          PVariable var_generalization = body.getOrCreateVariableByName("generalization");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_constraintBlock), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_constraintBlock, parameter_constraintBlock)
          ));
          // 	find sysml.ConstraintBlock(constraintBlock, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_constraintBlock, var___0_), ConstraintBlock.instance().getInternalQueryRepresentation());
          // 	Classifier(classifier)
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          // 	Classifier.generalization(classifier, generalization)
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier", "generalization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")));
          new Equality(body, var__virtual_0_, var_generalization);
          // 	Generalization.general(generalization, constraintBlock)
          new TypeConstraint(body, Tuples.flatTupleOf(var_generalization), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_generalization, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Generalization", "general")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
          new Equality(body, var__virtual_1_, var_constraintBlock);
          // 	neg find sysml.ConstraintBlock(classifier, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_classifier, var___1_), ConstraintBlock.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
