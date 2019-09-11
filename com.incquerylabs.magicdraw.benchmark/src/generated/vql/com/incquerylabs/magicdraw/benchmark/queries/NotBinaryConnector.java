/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.Block;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern notBinaryConnector(connector : Connector) {
 *         	find sysml.Block(block, _);
 *         	Class.ownedConnector(block, connector);
 *         	ends == count Connector.end(connector, _);
 *         	check(ends != 2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NotBinaryConnector extends BaseGeneratedEMFQuerySpecification<NotBinaryConnector.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.notBinaryConnector pattern,
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
    private Connector fConnector;
    
    private static List<String> parameterNames = makeImmutableList("connector");
    
    private Match(final Connector pConnector) {
      this.fConnector = pConnector;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "connector": return this.fConnector;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fConnector;
          default: return null;
      }
    }
    
    public Connector getConnector() {
      return this.fConnector;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("connector".equals(parameterName) ) {
          this.fConnector = (Connector) newValue;
          return true;
      }
      return false;
    }
    
    public void setConnector(final Connector pConnector) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConnector = pConnector;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.notBinaryConnector";
    }
    
    @Override
    public List<String> parameterNames() {
      return NotBinaryConnector.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fConnector};
    }
    
    @Override
    public NotBinaryConnector.Match toImmutable() {
      return isMutable() ? newMatch(fConnector) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"connector\"=" + prettyPrintValue(fConnector));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fConnector);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NotBinaryConnector.Match)) {
          NotBinaryConnector.Match other = (NotBinaryConnector.Match) obj;
          return Objects.equals(fConnector, other.fConnector);
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
    public NotBinaryConnector specification() {
      return NotBinaryConnector.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NotBinaryConnector.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NotBinaryConnector.Match newMutableMatch(final Connector pConnector) {
      return new Mutable(pConnector);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NotBinaryConnector.Match newMatch(final Connector pConnector) {
      return new Immutable(pConnector);
    }
    
    private static final class Mutable extends NotBinaryConnector.Match {
      Mutable(final Connector pConnector) {
        super(pConnector);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NotBinaryConnector.Match {
      Immutable(final Connector pConnector) {
        super(pConnector);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.notBinaryConnector pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern notBinaryConnector(connector : Connector) {
   * 	find sysml.Block(block, _);
   * 	Class.ownedConnector(block, connector);
   * 	ends == count Connector.end(connector, _);
   * 	check(ends != 2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NotBinaryConnector
   * 
   */
  public static class Matcher extends BaseMatcher<NotBinaryConnector.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NotBinaryConnector.Matcher on(final ViatraQueryEngine engine) {
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
    public static NotBinaryConnector.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CONNECTOR = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NotBinaryConnector.Matcher.class);
    
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
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NotBinaryConnector.Match> getAllMatches(final Connector pConnector) {
      return rawStreamAllMatches(new Object[]{pConnector}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NotBinaryConnector.Match> streamAllMatches(final Connector pConnector) {
      return rawStreamAllMatches(new Object[]{pConnector});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NotBinaryConnector.Match> getOneArbitraryMatch(final Connector pConnector) {
      return rawGetOneArbitraryMatch(new Object[]{pConnector});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Connector pConnector) {
      return rawHasMatch(new Object[]{pConnector});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Connector pConnector) {
      return rawCountMatches(new Object[]{pConnector});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Connector pConnector, final Consumer<? super NotBinaryConnector.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pConnector}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NotBinaryConnector.Match newMatch(final Connector pConnector) {
      return NotBinaryConnector.Match.newMatch(pConnector);
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Connector> rawStreamAllValuesOfconnector(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CONNECTOR, parameters).map(Connector.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector() {
      return rawStreamAllValuesOfconnector(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Connector> streamAllValuesOfconnector() {
      return rawStreamAllValuesOfconnector(emptyArray());
    }
    
    @Override
    protected NotBinaryConnector.Match tupleToMatch(final Tuple t) {
      try {
          return NotBinaryConnector.Match.newMatch((Connector) t.get(POSITION_CONNECTOR));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NotBinaryConnector.Match arrayToMatch(final Object[] match) {
      try {
          return NotBinaryConnector.Match.newMatch((Connector) match[POSITION_CONNECTOR]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NotBinaryConnector.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NotBinaryConnector.Match.newMutableMatch((Connector) match[POSITION_CONNECTOR]);
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
    public static IQuerySpecification<NotBinaryConnector.Matcher> querySpecification() {
      return NotBinaryConnector.instance();
    }
  }
  
  private NotBinaryConnector() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NotBinaryConnector instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotBinaryConnector.Matcher instantiate(final ViatraQueryEngine engine) {
    return NotBinaryConnector.Matcher.on(engine);
  }
  
  @Override
  public NotBinaryConnector.Matcher instantiate() {
    return NotBinaryConnector.Matcher.create();
  }
  
  @Override
  public NotBinaryConnector.Match newEmptyMatch() {
    return NotBinaryConnector.Match.newEmptyMatch();
  }
  
  @Override
  public NotBinaryConnector.Match newMatch(final Object... parameters) {
    return NotBinaryConnector.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NotBinaryConnector} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NotBinaryConnector#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NotBinaryConnector INSTANCE = new NotBinaryConnector();
    
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
    private static final NotBinaryConnector.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_connector = new PParameter("connector", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_connector);
    
    private class Embedded_1_Connector_end extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.ConnectorEnd", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_Connector_end() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_Connector_end";
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
        //  Connector.end(connector, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector", "end")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.notBinaryConnector";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("connector");
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
          PVariable var_connector = body.getOrCreateVariableByName("connector");
          PVariable var_block = body.getOrCreateVariableByName("block");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_ends = body.getOrCreateVariableByName("ends");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_connector, parameter_connector)
          ));
          // 	find sysml.Block(block, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_block, var___0_), Block.instance().getInternalQueryRepresentation());
          // 	Class.ownedConnector(block, connector)
          new TypeConstraint(body, Tuples.flatTupleOf(var_block), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_block, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuredClassifier", "ownedConnector")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          new Equality(body, var__virtual_0_, var_connector);
          // 	ends == count Connector.end(connector, _)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_connector, var___1_), new NotBinaryConnector.GeneratedPQuery.Embedded_1_Connector_end(), var__virtual_1_);
          new Equality(body, var_ends, var__virtual_1_);
          // 	check(ends != 2)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern notBinaryConnector";
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
