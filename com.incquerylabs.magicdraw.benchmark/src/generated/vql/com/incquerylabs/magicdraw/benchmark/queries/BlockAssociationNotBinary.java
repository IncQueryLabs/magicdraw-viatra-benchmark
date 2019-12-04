/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.internal.NotAllEndsAreBlocks;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
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
 *         pattern blockAssociationNotBinary(association : Association) {
 *         	neg find notAllEndsAreBlocks(association);
 *         	ends == count Association.memberEnd(association, _);
 *         	check(ends != 2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BlockAssociationNotBinary extends BaseGeneratedEMFQuerySpecification<BlockAssociationNotBinary.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.blockAssociationNotBinary pattern,
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
    private Association fAssociation;
    
    private static List<String> parameterNames = makeImmutableList("association");
    
    private Match(final Association pAssociation) {
      this.fAssociation = pAssociation;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "association": return this.fAssociation;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAssociation;
          default: return null;
      }
    }
    
    public Association getAssociation() {
      return this.fAssociation;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("association".equals(parameterName) ) {
          this.fAssociation = (Association) newValue;
          return true;
      }
      return false;
    }
    
    public void setAssociation(final Association pAssociation) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAssociation = pAssociation;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.blockAssociationNotBinary";
    }
    
    @Override
    public List<String> parameterNames() {
      return BlockAssociationNotBinary.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAssociation};
    }
    
    @Override
    public BlockAssociationNotBinary.Match toImmutable() {
      return isMutable() ? newMatch(fAssociation) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"association\"=" + prettyPrintValue(fAssociation));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAssociation);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BlockAssociationNotBinary.Match)) {
          BlockAssociationNotBinary.Match other = (BlockAssociationNotBinary.Match) obj;
          return Objects.equals(fAssociation, other.fAssociation);
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
    public BlockAssociationNotBinary specification() {
      return BlockAssociationNotBinary.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BlockAssociationNotBinary.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BlockAssociationNotBinary.Match newMutableMatch(final Association pAssociation) {
      return new Mutable(pAssociation);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BlockAssociationNotBinary.Match newMatch(final Association pAssociation) {
      return new Immutable(pAssociation);
    }
    
    private static final class Mutable extends BlockAssociationNotBinary.Match {
      Mutable(final Association pAssociation) {
        super(pAssociation);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends BlockAssociationNotBinary.Match {
      Immutable(final Association pAssociation) {
        super(pAssociation);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.blockAssociationNotBinary pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern blockAssociationNotBinary(association : Association) {
   * 	neg find notAllEndsAreBlocks(association);
   * 	ends == count Association.memberEnd(association, _);
   * 	check(ends != 2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BlockAssociationNotBinary
   * 
   */
  public static class Matcher extends BaseMatcher<BlockAssociationNotBinary.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BlockAssociationNotBinary.Matcher on(final ViatraQueryEngine engine) {
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
    public static BlockAssociationNotBinary.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ASSOCIATION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BlockAssociationNotBinary.Matcher.class);
    
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
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BlockAssociationNotBinary.Match> getAllMatches(final Association pAssociation) {
      return rawStreamAllMatches(new Object[]{pAssociation}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BlockAssociationNotBinary.Match> streamAllMatches(final Association pAssociation) {
      return rawStreamAllMatches(new Object[]{pAssociation});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BlockAssociationNotBinary.Match> getOneArbitraryMatch(final Association pAssociation) {
      return rawGetOneArbitraryMatch(new Object[]{pAssociation});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Association pAssociation) {
      return rawHasMatch(new Object[]{pAssociation});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Association pAssociation) {
      return rawCountMatches(new Object[]{pAssociation});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Association pAssociation, final Consumer<? super BlockAssociationNotBinary.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAssociation}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAssociation the fixed value of pattern parameter association, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BlockAssociationNotBinary.Match newMatch(final Association pAssociation) {
      return BlockAssociationNotBinary.Match.newMatch(pAssociation);
    }
    
    /**
     * Retrieve the set of values that occur in matches for association.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Association> rawStreamAllValuesOfassociation(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ASSOCIATION, parameters).map(Association.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for association.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Association> getAllValuesOfassociation() {
      return rawStreamAllValuesOfassociation(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for association.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Association> streamAllValuesOfassociation() {
      return rawStreamAllValuesOfassociation(emptyArray());
    }
    
    @Override
    protected BlockAssociationNotBinary.Match tupleToMatch(final Tuple t) {
      try {
          return BlockAssociationNotBinary.Match.newMatch((Association) t.get(POSITION_ASSOCIATION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BlockAssociationNotBinary.Match arrayToMatch(final Object[] match) {
      try {
          return BlockAssociationNotBinary.Match.newMatch((Association) match[POSITION_ASSOCIATION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BlockAssociationNotBinary.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BlockAssociationNotBinary.Match.newMutableMatch((Association) match[POSITION_ASSOCIATION]);
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
    public static IQuerySpecification<BlockAssociationNotBinary.Matcher> querySpecification() {
      return BlockAssociationNotBinary.instance();
    }
  }
  
  private BlockAssociationNotBinary() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BlockAssociationNotBinary instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected BlockAssociationNotBinary.Matcher instantiate(final ViatraQueryEngine engine) {
    return BlockAssociationNotBinary.Matcher.on(engine);
  }
  
  @Override
  public BlockAssociationNotBinary.Matcher instantiate() {
    return BlockAssociationNotBinary.Matcher.create();
  }
  
  @Override
  public BlockAssociationNotBinary.Match newEmptyMatch() {
    return BlockAssociationNotBinary.Match.newEmptyMatch();
  }
  
  @Override
  public BlockAssociationNotBinary.Match newMatch(final Object... parameters) {
    return BlockAssociationNotBinary.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link BlockAssociationNotBinary} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link BlockAssociationNotBinary#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BlockAssociationNotBinary INSTANCE = new BlockAssociationNotBinary();
    
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
    private static final BlockAssociationNotBinary.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_association = new PParameter("association", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Association")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_association);
    
    private class Embedded_1_Association_memberEnd extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Association")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Association_memberEnd() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Association_memberEnd";
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
        //  Association.memberEnd(association, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Association")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Association", "memberEnd")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.blockAssociationNotBinary";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("association");
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
          PVariable var_association = body.getOrCreateVariableByName("association");
          PVariable var_ends = body.getOrCreateVariableByName("ends");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_association), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Association")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_association, parameter_association)
          ));
          // 	neg find notAllEndsAreBlocks(association)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_association), NotAllEndsAreBlocks.instance().getInternalQueryRepresentation());
          // 	ends == count Association.memberEnd(association, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_association, var___0_), new BlockAssociationNotBinary.GeneratedPQuery.Embedded_1_Association_memberEnd(), var__virtual_0_);
          new Equality(body, var_ends, var__virtual_0_);
          // 	check(ends != 2)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern blockAssociationNotBinary";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("ends");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer ends = (Integer) provider.getValue("ends");
                  return evaluateExpression_1_1(ends);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer ends) {
    return ((ends).intValue() != 2);
  }
}
