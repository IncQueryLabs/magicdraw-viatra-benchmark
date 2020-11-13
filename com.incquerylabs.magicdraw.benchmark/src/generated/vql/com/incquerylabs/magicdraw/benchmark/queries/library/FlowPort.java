/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/SysMLLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.StereotypedElement;
import com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
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
 *         //Pattern that queries elements with the stereotype 'FlowPort' or other stereotypes generalizing it.
 *         pattern FlowPort(Element : Port, Stereotype : Stereotype) {
 *         	find stereotypedElement(Element, Stereotype, "SysML", "FlowPort");
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class FlowPort extends BaseGeneratedEMFQuerySpecification<FlowPort.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.library.FlowPort pattern,
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
    private Port fElement;
    
    private Stereotype fStereotype;
    
    private static List<String> parameterNames = makeImmutableList("Element", "Stereotype");
    
    private Match(final Port pElement, final Stereotype pStereotype) {
      this.fElement = pElement;
      this.fStereotype = pStereotype;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Element": return this.fElement;
          case "Stereotype": return this.fStereotype;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fElement;
          case 1: return this.fStereotype;
          default: return null;
      }
    }
    
    public Port getElement() {
      return this.fElement;
    }
    
    public Stereotype getStereotype() {
      return this.fStereotype;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Element".equals(parameterName) ) {
          this.fElement = (Port) newValue;
          return true;
      }
      if ("Stereotype".equals(parameterName) ) {
          this.fStereotype = (Stereotype) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final Port pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    public void setStereotype(final Stereotype pStereotype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStereotype = pStereotype;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.FlowPort";
    }
    
    @Override
    public List<String> parameterNames() {
      return FlowPort.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement, fStereotype};
    }
    
    @Override
    public FlowPort.Match toImmutable() {
      return isMutable() ? newMatch(fElement, fStereotype) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Element\"=" + prettyPrintValue(fElement) + ", ");
      result.append("\"Stereotype\"=" + prettyPrintValue(fStereotype));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement, fStereotype);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof FlowPort.Match)) {
          FlowPort.Match other = (FlowPort.Match) obj;
          return Objects.equals(fElement, other.fElement) && Objects.equals(fStereotype, other.fStereotype);
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
    public FlowPort specification() {
      return FlowPort.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static FlowPort.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static FlowPort.Match newMutableMatch(final Port pElement, final Stereotype pStereotype) {
      return new Mutable(pElement, pStereotype);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static FlowPort.Match newMatch(final Port pElement, final Stereotype pStereotype) {
      return new Immutable(pElement, pStereotype);
    }
    
    private static final class Mutable extends FlowPort.Match {
      Mutable(final Port pElement, final Stereotype pStereotype) {
        super(pElement, pStereotype);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends FlowPort.Match {
      Immutable(final Port pElement, final Stereotype pStereotype) {
        super(pElement, pStereotype);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.library.FlowPort pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //Pattern that queries elements with the stereotype 'FlowPort' or other stereotypes generalizing it.
   * pattern FlowPort(Element : Port, Stereotype : Stereotype) {
   * 	find stereotypedElement(Element, Stereotype, "SysML", "FlowPort");
   * }
   * </pre></code>
   * 
   * @see Match
   * @see FlowPort
   * 
   */
  public static class Matcher extends BaseMatcher<FlowPort.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static FlowPort.Matcher on(final ViatraQueryEngine engine) {
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
    public static FlowPort.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final int POSITION_STEREOTYPE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(FlowPort.Matcher.class);
    
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
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<FlowPort.Match> getAllMatches(final Port pElement, final Stereotype pStereotype) {
      return rawStreamAllMatches(new Object[]{pElement, pStereotype}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<FlowPort.Match> streamAllMatches(final Port pElement, final Stereotype pStereotype) {
      return rawStreamAllMatches(new Object[]{pElement, pStereotype});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<FlowPort.Match> getOneArbitraryMatch(final Port pElement, final Stereotype pStereotype) {
      return rawGetOneArbitraryMatch(new Object[]{pElement, pStereotype});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Port pElement, final Stereotype pStereotype) {
      return rawHasMatch(new Object[]{pElement, pStereotype});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Port pElement, final Stereotype pStereotype) {
      return rawCountMatches(new Object[]{pElement, pStereotype});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Port pElement, final Stereotype pStereotype, final Consumer<? super FlowPort.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement, pStereotype}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param pStereotype the fixed value of pattern parameter Stereotype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public FlowPort.Match newMatch(final Port pElement, final Stereotype pStereotype) {
      return FlowPort.Match.newMatch(pElement, pStereotype);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Port> rawStreamAllValuesOfElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(Port.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfElement(final FlowPort.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Port> streamAllValuesOfElement(final Stereotype pStereotype) {
      return rawStreamAllValuesOfElement(new Object[]{null, pStereotype});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfElement(final FlowPort.Match partialMatch) {
      return rawStreamAllValuesOfElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Port> getAllValuesOfElement(final Stereotype pStereotype) {
      return rawStreamAllValuesOfElement(new Object[]{null, pStereotype}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Stereotype> rawStreamAllValuesOfStereotype(final Object[] parameters) {
      return rawStreamAllValues(POSITION_STEREOTYPE, parameters).map(Stereotype.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype() {
      return rawStreamAllValuesOfStereotype(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Stereotype> streamAllValuesOfStereotype() {
      return rawStreamAllValuesOfStereotype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Stereotype> streamAllValuesOfStereotype(final FlowPort.Match partialMatch) {
      return rawStreamAllValuesOfStereotype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Stereotype> streamAllValuesOfStereotype(final Port pElement) {
      return rawStreamAllValuesOfStereotype(new Object[]{pElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype(final FlowPort.Match partialMatch) {
      return rawStreamAllValuesOfStereotype(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Stereotype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Stereotype> getAllValuesOfStereotype(final Port pElement) {
      return rawStreamAllValuesOfStereotype(new Object[]{pElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected FlowPort.Match tupleToMatch(final Tuple t) {
      try {
          return FlowPort.Match.newMatch((Port) t.get(POSITION_ELEMENT), (Stereotype) t.get(POSITION_STEREOTYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FlowPort.Match arrayToMatch(final Object[] match) {
      try {
          return FlowPort.Match.newMatch((Port) match[POSITION_ELEMENT], (Stereotype) match[POSITION_STEREOTYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected FlowPort.Match arrayToMatchMutable(final Object[] match) {
      try {
          return FlowPort.Match.newMutableMatch((Port) match[POSITION_ELEMENT], (Stereotype) match[POSITION_STEREOTYPE]);
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
    public static IQuerySpecification<FlowPort.Matcher> querySpecification() {
      return FlowPort.instance();
    }
  }
  
  private FlowPort() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static FlowPort instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected FlowPort.Matcher instantiate(final ViatraQueryEngine engine) {
    return FlowPort.Matcher.on(engine);
  }
  
  @Override
  public FlowPort.Matcher instantiate() {
    return FlowPort.Matcher.create();
  }
  
  @Override
  public FlowPort.Match newEmptyMatch() {
    return FlowPort.Match.newEmptyMatch();
  }
  
  @Override
  public FlowPort.Match newMatch(final Object... parameters) {
    return FlowPort.Match.newMatch((com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port) parameters[0], (com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link FlowPort} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link FlowPort#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final FlowPort INSTANCE = new FlowPort();
    
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
    private static final FlowPort.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Element = new PParameter("Element", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Port")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Stereotype = new PParameter("Stereotype", "com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Element, parameter_Stereotype);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.library.FlowPort";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Element","Stereotype");
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
          PVariable var_Element = body.getOrCreateVariableByName("Element");
          PVariable var_Stereotype = body.getOrCreateVariableByName("Stereotype");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Port")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Stereotype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Stereotype")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Element, parameter_Element),
             new ExportedParameter(body, var_Stereotype, parameter_Stereotype)
          ));
          // 	find stereotypedElement(Element, Stereotype, "SysML", "FlowPort")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, "SysML");
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, "FlowPort");
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Element, var_Stereotype, var__virtual_0_, var__virtual_1_), StereotypedElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
