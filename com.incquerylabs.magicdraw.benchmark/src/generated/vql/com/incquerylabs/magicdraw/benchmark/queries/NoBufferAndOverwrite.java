/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectNode;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.NoBuffer;
import sysml.Overwrite;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern noBufferAndOverwrite(objectNode : ObjectNode) {
 *         	find sysml.NoBuffer(objectNode, _);
 *         	find sysml.Overwrite(objectNode, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NoBufferAndOverwrite extends BaseGeneratedEMFQuerySpecification<NoBufferAndOverwrite.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.noBufferAndOverwrite pattern,
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
    private ObjectNode fObjectNode;
    
    private static List<String> parameterNames = makeImmutableList("objectNode");
    
    private Match(final ObjectNode pObjectNode) {
      this.fObjectNode = pObjectNode;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "objectNode": return this.fObjectNode;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fObjectNode;
          default: return null;
      }
    }
    
    public ObjectNode getObjectNode() {
      return this.fObjectNode;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("objectNode".equals(parameterName) ) {
          this.fObjectNode = (ObjectNode) newValue;
          return true;
      }
      return false;
    }
    
    public void setObjectNode(final ObjectNode pObjectNode) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fObjectNode = pObjectNode;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.noBufferAndOverwrite";
    }
    
    @Override
    public List<String> parameterNames() {
      return NoBufferAndOverwrite.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fObjectNode};
    }
    
    @Override
    public NoBufferAndOverwrite.Match toImmutable() {
      return isMutable() ? newMatch(fObjectNode) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"objectNode\"=" + prettyPrintValue(fObjectNode));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fObjectNode);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NoBufferAndOverwrite.Match)) {
          NoBufferAndOverwrite.Match other = (NoBufferAndOverwrite.Match) obj;
          return Objects.equals(fObjectNode, other.fObjectNode);
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
    public NoBufferAndOverwrite specification() {
      return NoBufferAndOverwrite.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NoBufferAndOverwrite.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NoBufferAndOverwrite.Match newMutableMatch(final ObjectNode pObjectNode) {
      return new Mutable(pObjectNode);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NoBufferAndOverwrite.Match newMatch(final ObjectNode pObjectNode) {
      return new Immutable(pObjectNode);
    }
    
    private static final class Mutable extends NoBufferAndOverwrite.Match {
      Mutable(final ObjectNode pObjectNode) {
        super(pObjectNode);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NoBufferAndOverwrite.Match {
      Immutable(final ObjectNode pObjectNode) {
        super(pObjectNode);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.noBufferAndOverwrite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern noBufferAndOverwrite(objectNode : ObjectNode) {
   * 	find sysml.NoBuffer(objectNode, _);
   * 	find sysml.Overwrite(objectNode, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NoBufferAndOverwrite
   * 
   */
  public static class Matcher extends BaseMatcher<NoBufferAndOverwrite.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NoBufferAndOverwrite.Matcher on(final ViatraQueryEngine engine) {
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
    public static NoBufferAndOverwrite.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_OBJECTNODE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NoBufferAndOverwrite.Matcher.class);
    
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
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NoBufferAndOverwrite.Match> getAllMatches(final ObjectNode pObjectNode) {
      return rawStreamAllMatches(new Object[]{pObjectNode}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NoBufferAndOverwrite.Match> streamAllMatches(final ObjectNode pObjectNode) {
      return rawStreamAllMatches(new Object[]{pObjectNode});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NoBufferAndOverwrite.Match> getOneArbitraryMatch(final ObjectNode pObjectNode) {
      return rawGetOneArbitraryMatch(new Object[]{pObjectNode});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ObjectNode pObjectNode) {
      return rawHasMatch(new Object[]{pObjectNode});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ObjectNode pObjectNode) {
      return rawCountMatches(new Object[]{pObjectNode});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ObjectNode pObjectNode, final Consumer<? super NoBufferAndOverwrite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pObjectNode}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pObjectNode the fixed value of pattern parameter objectNode, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NoBufferAndOverwrite.Match newMatch(final ObjectNode pObjectNode) {
      return NoBufferAndOverwrite.Match.newMatch(pObjectNode);
    }
    
    /**
     * Retrieve the set of values that occur in matches for objectNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ObjectNode> rawStreamAllValuesOfobjectNode(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OBJECTNODE, parameters).map(ObjectNode.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for objectNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ObjectNode> getAllValuesOfobjectNode() {
      return rawStreamAllValuesOfobjectNode(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for objectNode.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ObjectNode> streamAllValuesOfobjectNode() {
      return rawStreamAllValuesOfobjectNode(emptyArray());
    }
    
    @Override
    protected NoBufferAndOverwrite.Match tupleToMatch(final Tuple t) {
      try {
          return NoBufferAndOverwrite.Match.newMatch((ObjectNode) t.get(POSITION_OBJECTNODE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NoBufferAndOverwrite.Match arrayToMatch(final Object[] match) {
      try {
          return NoBufferAndOverwrite.Match.newMatch((ObjectNode) match[POSITION_OBJECTNODE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NoBufferAndOverwrite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NoBufferAndOverwrite.Match.newMutableMatch((ObjectNode) match[POSITION_OBJECTNODE]);
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
    public static IQuerySpecification<NoBufferAndOverwrite.Matcher> querySpecification() {
      return NoBufferAndOverwrite.instance();
    }
  }
  
  private NoBufferAndOverwrite() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NoBufferAndOverwrite instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NoBufferAndOverwrite.Matcher instantiate(final ViatraQueryEngine engine) {
    return NoBufferAndOverwrite.Matcher.on(engine);
  }
  
  @Override
  public NoBufferAndOverwrite.Matcher instantiate() {
    return NoBufferAndOverwrite.Matcher.create();
  }
  
  @Override
  public NoBufferAndOverwrite.Match newEmptyMatch() {
    return NoBufferAndOverwrite.Match.newEmptyMatch();
  }
  
  @Override
  public NoBufferAndOverwrite.Match newMatch(final Object... parameters) {
    return NoBufferAndOverwrite.Match.newMatch((com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectNode) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NoBufferAndOverwrite} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NoBufferAndOverwrite#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NoBufferAndOverwrite INSTANCE = new NoBufferAndOverwrite();
    
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
    private static final NoBufferAndOverwrite.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_objectNode = new PParameter("objectNode", "com.nomagic.uml2.ext.magicdraw.activities.mdbasicactivities.ObjectNode", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ObjectNode")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_objectNode);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.noBufferAndOverwrite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("objectNode");
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
          PVariable var_objectNode = body.getOrCreateVariableByName("objectNode");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_objectNode), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ObjectNode")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_objectNode, parameter_objectNode)
          ));
          // 	find sysml.NoBuffer(objectNode, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_objectNode, var___0_), NoBuffer.instance().getInternalQueryRepresentation());
          // 	find sysml.Overwrite(objectNode, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_objectNode, var___1_), Overwrite.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
