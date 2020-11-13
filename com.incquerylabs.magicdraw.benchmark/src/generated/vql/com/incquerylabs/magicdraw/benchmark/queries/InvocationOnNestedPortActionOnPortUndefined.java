/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/APerformanceQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.library.InvocationOnNestedPortAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.InvocationAction;
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

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern
 *         invocationOnNestedPortActionOnPortUndefined(action : InvocationAction) {
 *         	find com.incquerylabs.magicdraw.benchmark.queries.library.InvocationOnNestedPortAction(action, _);
 *         	neg InvocationAction.onPort(action, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class InvocationOnNestedPortActionOnPortUndefined extends BaseGeneratedEMFQuerySpecification<InvocationOnNestedPortActionOnPortUndefined.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.invocationOnNestedPortActionOnPortUndefined pattern,
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
    private InvocationAction fAction;
    
    private static List<String> parameterNames = makeImmutableList("action");
    
    private Match(final InvocationAction pAction) {
      this.fAction = pAction;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "action": return this.fAction;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAction;
          default: return null;
      }
    }
    
    public InvocationAction getAction() {
      return this.fAction;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("action".equals(parameterName) ) {
          this.fAction = (InvocationAction) newValue;
          return true;
      }
      return false;
    }
    
    public void setAction(final InvocationAction pAction) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAction = pAction;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.invocationOnNestedPortActionOnPortUndefined";
    }
    
    @Override
    public List<String> parameterNames() {
      return InvocationOnNestedPortActionOnPortUndefined.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAction};
    }
    
    @Override
    public InvocationOnNestedPortActionOnPortUndefined.Match toImmutable() {
      return isMutable() ? newMatch(fAction) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"action\"=" + prettyPrintValue(fAction));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAction);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof InvocationOnNestedPortActionOnPortUndefined.Match)) {
          InvocationOnNestedPortActionOnPortUndefined.Match other = (InvocationOnNestedPortActionOnPortUndefined.Match) obj;
          return Objects.equals(fAction, other.fAction);
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
    public InvocationOnNestedPortActionOnPortUndefined specification() {
      return InvocationOnNestedPortActionOnPortUndefined.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static InvocationOnNestedPortActionOnPortUndefined.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static InvocationOnNestedPortActionOnPortUndefined.Match newMutableMatch(final InvocationAction pAction) {
      return new Mutable(pAction);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static InvocationOnNestedPortActionOnPortUndefined.Match newMatch(final InvocationAction pAction) {
      return new Immutable(pAction);
    }
    
    private static final class Mutable extends InvocationOnNestedPortActionOnPortUndefined.Match {
      Mutable(final InvocationAction pAction) {
        super(pAction);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends InvocationOnNestedPortActionOnPortUndefined.Match {
      Immutable(final InvocationAction pAction) {
        super(pAction);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.invocationOnNestedPortActionOnPortUndefined pattern,
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
   * invocationOnNestedPortActionOnPortUndefined(action : InvocationAction) {
   * 	find com.incquerylabs.magicdraw.benchmark.queries.library.InvocationOnNestedPortAction(action, _);
   * 	neg InvocationAction.onPort(action, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see InvocationOnNestedPortActionOnPortUndefined
   * 
   */
  public static class Matcher extends BaseMatcher<InvocationOnNestedPortActionOnPortUndefined.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static InvocationOnNestedPortActionOnPortUndefined.Matcher on(final ViatraQueryEngine engine) {
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
    public static InvocationOnNestedPortActionOnPortUndefined.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ACTION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InvocationOnNestedPortActionOnPortUndefined.Matcher.class);
    
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
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<InvocationOnNestedPortActionOnPortUndefined.Match> getAllMatches(final InvocationAction pAction) {
      return rawStreamAllMatches(new Object[]{pAction}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<InvocationOnNestedPortActionOnPortUndefined.Match> streamAllMatches(final InvocationAction pAction) {
      return rawStreamAllMatches(new Object[]{pAction});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<InvocationOnNestedPortActionOnPortUndefined.Match> getOneArbitraryMatch(final InvocationAction pAction) {
      return rawGetOneArbitraryMatch(new Object[]{pAction});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final InvocationAction pAction) {
      return rawHasMatch(new Object[]{pAction});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final InvocationAction pAction) {
      return rawCountMatches(new Object[]{pAction});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final InvocationAction pAction, final Consumer<? super InvocationOnNestedPortActionOnPortUndefined.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAction}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAction the fixed value of pattern parameter action, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public InvocationOnNestedPortActionOnPortUndefined.Match newMatch(final InvocationAction pAction) {
      return InvocationOnNestedPortActionOnPortUndefined.Match.newMatch(pAction);
    }
    
    /**
     * Retrieve the set of values that occur in matches for action.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InvocationAction> rawStreamAllValuesOfaction(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ACTION, parameters).map(InvocationAction.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for action.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InvocationAction> getAllValuesOfaction() {
      return rawStreamAllValuesOfaction(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for action.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InvocationAction> streamAllValuesOfaction() {
      return rawStreamAllValuesOfaction(emptyArray());
    }
    
    @Override
    protected InvocationOnNestedPortActionOnPortUndefined.Match tupleToMatch(final Tuple t) {
      try {
          return InvocationOnNestedPortActionOnPortUndefined.Match.newMatch((InvocationAction) t.get(POSITION_ACTION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InvocationOnNestedPortActionOnPortUndefined.Match arrayToMatch(final Object[] match) {
      try {
          return InvocationOnNestedPortActionOnPortUndefined.Match.newMatch((InvocationAction) match[POSITION_ACTION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InvocationOnNestedPortActionOnPortUndefined.Match arrayToMatchMutable(final Object[] match) {
      try {
          return InvocationOnNestedPortActionOnPortUndefined.Match.newMutableMatch((InvocationAction) match[POSITION_ACTION]);
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
    public static IQuerySpecification<InvocationOnNestedPortActionOnPortUndefined.Matcher> querySpecification() {
      return InvocationOnNestedPortActionOnPortUndefined.instance();
    }
  }
  
  private InvocationOnNestedPortActionOnPortUndefined() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static InvocationOnNestedPortActionOnPortUndefined instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvocationOnNestedPortActionOnPortUndefined.Matcher instantiate(final ViatraQueryEngine engine) {
    return InvocationOnNestedPortActionOnPortUndefined.Matcher.on(engine);
  }
  
  @Override
  public InvocationOnNestedPortActionOnPortUndefined.Matcher instantiate() {
    return InvocationOnNestedPortActionOnPortUndefined.Matcher.create();
  }
  
  @Override
  public InvocationOnNestedPortActionOnPortUndefined.Match newEmptyMatch() {
    return InvocationOnNestedPortActionOnPortUndefined.Match.newEmptyMatch();
  }
  
  @Override
  public InvocationOnNestedPortActionOnPortUndefined.Match newMatch(final Object... parameters) {
    return InvocationOnNestedPortActionOnPortUndefined.Match.newMatch((com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.InvocationAction) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link InvocationOnNestedPortActionOnPortUndefined} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link InvocationOnNestedPortActionOnPortUndefined#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final InvocationOnNestedPortActionOnPortUndefined INSTANCE = new InvocationOnNestedPortActionOnPortUndefined();
    
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
    private static final InvocationOnNestedPortActionOnPortUndefined.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_action = new PParameter("action", "com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.InvocationAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "InvocationAction")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_action);
    
    private class Embedded_1_InvocationAction_onPort extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.InvocationAction", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "InvocationAction")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.compositestructures.mdports.Port", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Port")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_InvocationAction_onPort() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_InvocationAction_onPort";
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
        //  InvocationAction.onPort(action, _)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "InvocationAction")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "InvocationAction", "onPort")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "Port")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.invocationOnNestedPortActionOnPortUndefined";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("action");
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
          PVariable var_action = body.getOrCreateVariableByName("action");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1.1", "InvocationAction")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_action, parameter_action)
          ));
          // 	find com.incquerylabs.magicdraw.benchmark.queries.library.InvocationOnNestedPortAction(action, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_action, var___0_), InvocationOnNestedPortAction.instance().getInternalQueryRepresentation());
          // 	neg InvocationAction.onPort(action, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_action, var___1_), new InvocationOnNestedPortActionOnPortUndefined.GeneratedPQuery.Embedded_1_InvocationAction_onPort());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
