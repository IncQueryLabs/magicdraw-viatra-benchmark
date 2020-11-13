/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty;
import com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty_connector;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern
 *         connectionPropertyDifferentName(property : Property, connector : Connector) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty(property, _);
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty_connector(property, connector);
 *         	Property.name(property, propName);
 *         	Connector.name(connector, conName);
 *         	propName != conName;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConnectionPropertyDifferentName extends BaseGeneratedEMFQuerySpecification<ConnectionPropertyDifferentName.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.connectionPropertyDifferentName pattern,
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
    private Property fProperty;
    
    private Connector fConnector;
    
    private static List<String> parameterNames = makeImmutableList("property", "connector");
    
    private Match(final Property pProperty, final Connector pConnector) {
      this.fProperty = pProperty;
      this.fConnector = pConnector;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "property": return this.fProperty;
          case "connector": return this.fConnector;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fProperty;
          case 1: return this.fConnector;
          default: return null;
      }
    }
    
    public Property getProperty() {
      return this.fProperty;
    }
    
    public Connector getConnector() {
      return this.fConnector;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("property".equals(parameterName) ) {
          this.fProperty = (Property) newValue;
          return true;
      }
      if ("connector".equals(parameterName) ) {
          this.fConnector = (Connector) newValue;
          return true;
      }
      return false;
    }
    
    public void setProperty(final Property pProperty) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fProperty = pProperty;
    }
    
    public void setConnector(final Connector pConnector) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fConnector = pConnector;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.connectionPropertyDifferentName";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConnectionPropertyDifferentName.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fProperty, fConnector};
    }
    
    @Override
    public ConnectionPropertyDifferentName.Match toImmutable() {
      return isMutable() ? newMatch(fProperty, fConnector) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"property\"=" + prettyPrintValue(fProperty) + ", ");
      result.append("\"connector\"=" + prettyPrintValue(fConnector));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fProperty, fConnector);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConnectionPropertyDifferentName.Match)) {
          ConnectionPropertyDifferentName.Match other = (ConnectionPropertyDifferentName.Match) obj;
          return Objects.equals(fProperty, other.fProperty) && Objects.equals(fConnector, other.fConnector);
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
    public ConnectionPropertyDifferentName specification() {
      return ConnectionPropertyDifferentName.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConnectionPropertyDifferentName.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConnectionPropertyDifferentName.Match newMutableMatch(final Property pProperty, final Connector pConnector) {
      return new Mutable(pProperty, pConnector);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConnectionPropertyDifferentName.Match newMatch(final Property pProperty, final Connector pConnector) {
      return new Immutable(pProperty, pConnector);
    }
    
    private static final class Mutable extends ConnectionPropertyDifferentName.Match {
      Mutable(final Property pProperty, final Connector pConnector) {
        super(pProperty, pConnector);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConnectionPropertyDifferentName.Match {
      Immutable(final Property pProperty, final Connector pConnector) {
        super(pProperty, pConnector);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.connectionPropertyDifferentName pattern,
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
   * connectionPropertyDifferentName(property : Property, connector : Connector) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty(property, _);
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty_connector(property, connector);
   * 	Property.name(property, propName);
   * 	Connector.name(connector, conName);
   * 	propName != conName;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConnectionPropertyDifferentName
   * 
   */
  public static class Matcher extends BaseMatcher<ConnectionPropertyDifferentName.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConnectionPropertyDifferentName.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConnectionPropertyDifferentName.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_PROPERTY = 0;
    
    private static final int POSITION_CONNECTOR = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConnectionPropertyDifferentName.Matcher.class);
    
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
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConnectionPropertyDifferentName.Match> getAllMatches(final Property pProperty, final Connector pConnector) {
      return rawStreamAllMatches(new Object[]{pProperty, pConnector}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConnectionPropertyDifferentName.Match> streamAllMatches(final Property pProperty, final Connector pConnector) {
      return rawStreamAllMatches(new Object[]{pProperty, pConnector});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConnectionPropertyDifferentName.Match> getOneArbitraryMatch(final Property pProperty, final Connector pConnector) {
      return rawGetOneArbitraryMatch(new Object[]{pProperty, pConnector});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pProperty, final Connector pConnector) {
      return rawHasMatch(new Object[]{pProperty, pConnector});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pProperty, final Connector pConnector) {
      return rawCountMatches(new Object[]{pProperty, pConnector});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pProperty, final Connector pConnector, final Consumer<? super ConnectionPropertyDifferentName.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pProperty, pConnector}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pProperty the fixed value of pattern parameter property, or null if not bound.
     * @param pConnector the fixed value of pattern parameter connector, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConnectionPropertyDifferentName.Match newMatch(final Property pProperty, final Connector pConnector) {
      return ConnectionPropertyDifferentName.Match.newMatch(pProperty, pConnector);
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfproperty(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PROPERTY, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfproperty() {
      return rawStreamAllValuesOfproperty(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfproperty() {
      return rawStreamAllValuesOfproperty(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfproperty(final ConnectionPropertyDifferentName.Match partialMatch) {
      return rawStreamAllValuesOfproperty(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfproperty(final Connector pConnector) {
      return rawStreamAllValuesOfproperty(new Object[]{null, pConnector});
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfproperty(final ConnectionPropertyDifferentName.Match partialMatch) {
      return rawStreamAllValuesOfproperty(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfproperty(final Connector pConnector) {
      return rawStreamAllValuesOfproperty(new Object[]{null, pConnector}).collect(Collectors.toSet());
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
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Connector> streamAllValuesOfconnector(final ConnectionPropertyDifferentName.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Connector> streamAllValuesOfconnector(final Property pProperty) {
      return rawStreamAllValuesOfconnector(new Object[]{pProperty, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final ConnectionPropertyDifferentName.Match partialMatch) {
      return rawStreamAllValuesOfconnector(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for connector.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Connector> getAllValuesOfconnector(final Property pProperty) {
      return rawStreamAllValuesOfconnector(new Object[]{pProperty, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ConnectionPropertyDifferentName.Match tupleToMatch(final Tuple t) {
      try {
          return ConnectionPropertyDifferentName.Match.newMatch((Property) t.get(POSITION_PROPERTY), (Connector) t.get(POSITION_CONNECTOR));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConnectionPropertyDifferentName.Match arrayToMatch(final Object[] match) {
      try {
          return ConnectionPropertyDifferentName.Match.newMatch((Property) match[POSITION_PROPERTY], (Connector) match[POSITION_CONNECTOR]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConnectionPropertyDifferentName.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConnectionPropertyDifferentName.Match.newMutableMatch((Property) match[POSITION_PROPERTY], (Connector) match[POSITION_CONNECTOR]);
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
    public static IQuerySpecification<ConnectionPropertyDifferentName.Matcher> querySpecification() {
      return ConnectionPropertyDifferentName.instance();
    }
  }
  
  private ConnectionPropertyDifferentName() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConnectionPropertyDifferentName instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConnectionPropertyDifferentName.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConnectionPropertyDifferentName.Matcher.on(engine);
  }
  
  @Override
  public ConnectionPropertyDifferentName.Matcher instantiate() {
    return ConnectionPropertyDifferentName.Matcher.create();
  }
  
  @Override
  public ConnectionPropertyDifferentName.Match newEmptyMatch() {
    return ConnectionPropertyDifferentName.Match.newEmptyMatch();
  }
  
  @Override
  public ConnectionPropertyDifferentName.Match newMatch(final Object... parameters) {
    return ConnectionPropertyDifferentName.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0], (com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ConnectionPropertyDifferentName} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ConnectionPropertyDifferentName#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConnectionPropertyDifferentName INSTANCE = new ConnectionPropertyDifferentName();
    
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
    private static final ConnectionPropertyDifferentName.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_property = new PParameter("property", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")), PParameterDirection.INOUT);
    
    private final PParameter parameter_connector = new PParameter("connector", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdinternalstructures.Connector", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Connector")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_property, parameter_connector);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.connectionPropertyDifferentName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("property","connector");
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
          PVariable var_property = body.getOrCreateVariableByName("property");
          PVariable var_connector = body.getOrCreateVariableByName("connector");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_propName = body.getOrCreateVariableByName("propName");
          PVariable var_conName = body.getOrCreateVariableByName("conName");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Connector")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_property, parameter_property),
             new ExportedParameter(body, var_connector, parameter_connector)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty(property, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var___0_), ConnectorProperty.instance().getInternalQueryRepresentation());
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.ConnectorProperty_connector(property, connector)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_property, var_connector), ConnectorProperty_connector.instance().getInternalQueryRepresentation());
          // 	Property.name(property, propName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_property, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new Equality(body, var__virtual_0_, var_propName);
          // 	Connector.name(connector, conName)
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Connector")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_connector, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "NamedElement", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "String")));
          new Equality(body, var__virtual_1_, var_conName);
          // 	propName != conName
          new Inequality(body, var_propName, var_conName);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
