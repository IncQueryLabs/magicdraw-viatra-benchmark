/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.BindingConnector;
import sysml.FullPort;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern fullPortBoundToFullPort(port : Port) {
 *         	find sysml.FullPort(port, _);
 *         	find sysml.BindingConnector(connector, _);
 *         	Connector.end(connector, end);
 *         	ConnectorEnd.role(end, port);
 *         	Connector.end(connector, otherEnd);
 *         	ConnectorEnd.role(otherEnd, role);
 *         	role != port;
 *         	find sysml.FullPort(role, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FullPortBoundToFullPort extends BaseGeneratedEMFQuerySpecification<FullPortBoundToFullPort.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.fullPortBoundToFullPort pattern,
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
    private Port fPort;
    
    private static List<String> parameterNames = makeImmutableList("port");
    
    private Match(final Port pPort) {
      this.fPort = pPort;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "port": return this.fPort;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fPort;
          default: return null;
      }
    }
    
    public Port getPort() {
      return this.fPort;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("port".equals(parameterName) ) {
          this.fPort = (Port) newValue;
          return true;
      }
      return false;
    }
    
    public void setPort(final Port pPort) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPort = pPort;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.fullPortBoundToFullPort";
    }
    
    @Override
    public List<String> parameterNames() {
      return FullPortBoundToFullPort.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPort};
    }
    
    @Override
    public FullPortBoundToFullPort.Match toImmutable() {
      return isMutable() ? newMatch(fPort) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"port\"=" + prettyPrintValue(fPort));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fPort);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FullPortBoundToFullPort.Match)) {
          FullPortBoundToFullPort.Match other = (FullPortBoundToFullPort.Match) obj;
          return Objects.equals(fPort, other.fPort);
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
    public FullPortBoundToFullPort specification() {
      return FullPortBoundToFullPort.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FullPortBoundToFullPort.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FullPortBoundToFullPort.Match newMutableMatch(final Port pPort) {
      return new Mutable(pPort);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FullPortBoundToFullPort.Match newMatch(final Port pPort) {
      return new Immutable(pPort);
    }
    
    private static final class Mutable extends FullPortBoundToFullPort.Match {
      Mutable(final Port pPort) {
        super(pPort);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends FullPortBoundToFullPort.Match {
      Immutable(final Port pPort) {
        super(pPort);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.fullPortBoundToFullPort pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern fullPortBoundToFullPort(port : Port) {
   * 	find sysml.FullPort(port, _);
   * 	find sysml.BindingConnector(connector, _);
   * 	Connector.end(connector, end);
   * 	ConnectorEnd.role(end, port);
   * 	Connector.end(connector, otherEnd);
   * 	ConnectorEnd.role(otherEnd, role);
   * 	role != port;
   * 	find sysml.FullPort(role, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FullPortBoundToFullPort
   * 
   */
  public static class Matcher extends BaseMatcher<FullPortBoundToFullPort.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FullPortBoundToFullPort.Matcher on(final ViatraQueryEngine engine) {
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
    public static FullPortBoundToFullPort.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PORT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FullPortBoundToFullPort.Matcher.class);
    
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
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FullPortBoundToFullPort.Match> getAllMatches(final Port pPort) {
      return rawStreamAllMatches(new Object[]{pPort}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FullPortBoundToFullPort.Match> streamAllMatches(final Port pPort) {
      return rawStreamAllMatches(new Object[]{pPort});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FullPortBoundToFullPort.Match> getOneArbitraryMatch(final Port pPort) {
      return rawGetOneArbitraryMatch(new Object[]{pPort});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pPort) {
      return rawHasMatch(new Object[]{pPort});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pPort) {
      return rawCountMatches(new Object[]{pPort});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pPort, final Consumer<? super FullPortBoundToFullPort.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPort}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPort the fixed value of pattern parameter port, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FullPortBoundToFullPort.Match newMatch(final Port pPort) {
      return FullPortBoundToFullPort.Match.newMatch(pPort);
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfport(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PORT, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfport() {
      return rawStreamAllValuesOfport(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for port.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfport() {
      return rawStreamAllValuesOfport(emptyArray());
    }
    
    @Override
    protected FullPortBoundToFullPort.Match tupleToMatch(final Tuple t) {
      try {
          return FullPortBoundToFullPort.Match.newMatch((Port) t.get(POSITION_PORT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FullPortBoundToFullPort.Match arrayToMatch(final Object[] match) {
      try {
          return FullPortBoundToFullPort.Match.newMatch((Port) match[POSITION_PORT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FullPortBoundToFullPort.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FullPortBoundToFullPort.Match.newMutableMatch((Port) match[POSITION_PORT]);
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
    public static IQuerySpecification<FullPortBoundToFullPort.Matcher> querySpecification() {
      return FullPortBoundToFullPort.instance();
    }
  }
  
  private FullPortBoundToFullPort() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FullPortBoundToFullPort instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected FullPortBoundToFullPort.Matcher instantiate(final ViatraQueryEngine engine) {
    return FullPortBoundToFullPort.Matcher.on(engine);
  }
  
  @Override
  public FullPortBoundToFullPort.Matcher instantiate() {
    return FullPortBoundToFullPort.Matcher.create();
  }
  
  @Override
  public FullPortBoundToFullPort.Match newEmptyMatch() {
    return FullPortBoundToFullPort.Match.newEmptyMatch();
  }
  
  @Override
  public FullPortBoundToFullPort.Match newMatch(final Object... parameters) {
    return FullPortBoundToFullPort.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link FullPortBoundToFullPort} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FullPortBoundToFullPort#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FullPortBoundToFullPort INSTANCE = new FullPortBoundToFullPort();
    
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
    private static final FullPortBoundToFullPort.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_port = new PParameter("port", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_port);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.fullPortBoundToFullPort";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("port");
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
          PVariable var_port = body.getOrCreateVariableByName("port");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_connector = body.getOrCreateVariableByName("connector");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_end = body.getOrCreateVariableByName("end");
          PVariable var_otherEnd = body.getOrCreateVariableByName("otherEnd");
          PVariable var_role = body.getOrCreateVariableByName("role");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_port), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Port")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_port, parameter_port)
          ));
          // 	find sysml.FullPort(port, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_port, var___0_), FullPort.instance().getInternalQueryRepresentation());
          // 	find sysml.BindingConnector(connector, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_connector, var___1_), BindingConnector.instance().getInternalQueryRepresentation());
          // 	Connector.end(connector, end)
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector", "end")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new Equality(body, var__virtual_0_, var_end);
          // 	ConnectorEnd.role(end, port)
          new TypeConstraint(body, Tuples.flatTupleOf(var_end), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_end, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd", "role")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectableElement")));
          new Equality(body, var__virtual_1_, var_port);
          // 	Connector.end(connector, otherEnd)
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Connector", "end")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          new Equality(body, var__virtual_2_, var_otherEnd);
          // 	ConnectorEnd.role(otherEnd, role)
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherEnd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_otherEnd, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectorEnd", "role")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "ConnectableElement")));
          new Equality(body, var__virtual_3_, var_role);
          // 	role != port
          new Inequality(body, var_role, var_port);
          // 	find sysml.FullPort(role, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_role, var___2_), FullPort.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
