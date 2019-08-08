/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow;
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
import sysml.ItemFlow;
import sysml.ItemFlow_itemProperty;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern itemFlowDifferentType(itemFlow : InformationFlow) {
 *         	find sysml.ItemFlow(itemFlow, _);
 *         	find sysml.ItemFlow_itemProperty(itemFlow, itemProperty);
 *         	Property.type(itemProperty, type);
 *         	neg InformationFlow.conveyed(itemFlow, type);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ItemFlowDifferentType extends BaseGeneratedEMFQuerySpecification<ItemFlowDifferentType.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.itemFlowDifferentType pattern,
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
    private InformationFlow fItemFlow;
    
    private static List<String> parameterNames = makeImmutableList("itemFlow");
    
    private Match(final InformationFlow pItemFlow) {
      this.fItemFlow = pItemFlow;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("itemFlow".equals(parameterName)) return this.fItemFlow;
      return null;
    }
    
    public InformationFlow getItemFlow() {
      return this.fItemFlow;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("itemFlow".equals(parameterName) ) {
          this.fItemFlow = (InformationFlow) newValue;
          return true;
      }
      return false;
    }
    
    public void setItemFlow(final InformationFlow pItemFlow) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fItemFlow = pItemFlow;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.itemFlowDifferentType";
    }
    
    @Override
    public List<String> parameterNames() {
      return ItemFlowDifferentType.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fItemFlow};
    }
    
    @Override
    public ItemFlowDifferentType.Match toImmutable() {
      return isMutable() ? newMatch(fItemFlow) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"itemFlow\"=" + prettyPrintValue(fItemFlow));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fItemFlow);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ItemFlowDifferentType.Match)) {
          ItemFlowDifferentType.Match other = (ItemFlowDifferentType.Match) obj;
          return Objects.equals(fItemFlow, other.fItemFlow);
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
    public ItemFlowDifferentType specification() {
      return ItemFlowDifferentType.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ItemFlowDifferentType.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ItemFlowDifferentType.Match newMutableMatch(final InformationFlow pItemFlow) {
      return new Mutable(pItemFlow);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ItemFlowDifferentType.Match newMatch(final InformationFlow pItemFlow) {
      return new Immutable(pItemFlow);
    }
    
    private static final class Mutable extends ItemFlowDifferentType.Match {
      Mutable(final InformationFlow pItemFlow) {
        super(pItemFlow);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ItemFlowDifferentType.Match {
      Immutable(final InformationFlow pItemFlow) {
        super(pItemFlow);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.itemFlowDifferentType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern itemFlowDifferentType(itemFlow : InformationFlow) {
   * 	find sysml.ItemFlow(itemFlow, _);
   * 	find sysml.ItemFlow_itemProperty(itemFlow, itemProperty);
   * 	Property.type(itemProperty, type);
   * 	neg InformationFlow.conveyed(itemFlow, type);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ItemFlowDifferentType
   * 
   */
  public static class Matcher extends BaseMatcher<ItemFlowDifferentType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ItemFlowDifferentType.Matcher on(final ViatraQueryEngine engine) {
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
    public static ItemFlowDifferentType.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ITEMFLOW = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ItemFlowDifferentType.Matcher.class);
    
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
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ItemFlowDifferentType.Match> getAllMatches(final InformationFlow pItemFlow) {
      return rawStreamAllMatches(new Object[]{pItemFlow}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ItemFlowDifferentType.Match> streamAllMatches(final InformationFlow pItemFlow) {
      return rawStreamAllMatches(new Object[]{pItemFlow});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ItemFlowDifferentType.Match> getOneArbitraryMatch(final InformationFlow pItemFlow) {
      return rawGetOneArbitraryMatch(new Object[]{pItemFlow});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final InformationFlow pItemFlow) {
      return rawHasMatch(new Object[]{pItemFlow});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final InformationFlow pItemFlow) {
      return rawCountMatches(new Object[]{pItemFlow});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final InformationFlow pItemFlow, final Consumer<? super ItemFlowDifferentType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pItemFlow}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pItemFlow the fixed value of pattern parameter itemFlow, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ItemFlowDifferentType.Match newMatch(final InformationFlow pItemFlow) {
      return ItemFlowDifferentType.Match.newMatch(pItemFlow);
    }
    
    /**
     * Retrieve the set of values that occur in matches for itemFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InformationFlow> rawStreamAllValuesOfitemFlow(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ITEMFLOW, parameters).map(InformationFlow.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for itemFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InformationFlow> getAllValuesOfitemFlow() {
      return rawStreamAllValuesOfitemFlow(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for itemFlow.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InformationFlow> streamAllValuesOfitemFlow() {
      return rawStreamAllValuesOfitemFlow(emptyArray());
    }
    
    @Override
    protected ItemFlowDifferentType.Match tupleToMatch(final Tuple t) {
      try {
          return ItemFlowDifferentType.Match.newMatch((InformationFlow) t.get(POSITION_ITEMFLOW));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ItemFlowDifferentType.Match arrayToMatch(final Object[] match) {
      try {
          return ItemFlowDifferentType.Match.newMatch((InformationFlow) match[POSITION_ITEMFLOW]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ItemFlowDifferentType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ItemFlowDifferentType.Match.newMutableMatch((InformationFlow) match[POSITION_ITEMFLOW]);
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
    public static IQuerySpecification<ItemFlowDifferentType.Matcher> querySpecification() {
      return ItemFlowDifferentType.instance();
    }
  }
  
  private ItemFlowDifferentType() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ItemFlowDifferentType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ItemFlowDifferentType.Matcher instantiate(final ViatraQueryEngine engine) {
    return ItemFlowDifferentType.Matcher.on(engine);
  }
  
  @Override
  public ItemFlowDifferentType.Matcher instantiate() {
    return ItemFlowDifferentType.Matcher.create();
  }
  
  @Override
  public ItemFlowDifferentType.Match newEmptyMatch() {
    return ItemFlowDifferentType.Match.newEmptyMatch();
  }
  
  @Override
  public ItemFlowDifferentType.Match newMatch(final Object... parameters) {
    return ItemFlowDifferentType.Match.newMatch((com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.ItemFlowDifferentType (visibility: PUBLIC, simpleName: ItemFlowDifferentType, identifier: com.incquerylabs.magicdraw.benchmark.queries.ItemFlowDifferentType, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: com.incquerylabs.magicdraw.benchmark.queries.ItemFlowDifferentType (visibility: PUBLIC, simpleName: ItemFlowDifferentType, identifier: com.incquerylabs.magicdraw.benchmark.queries.ItemFlowDifferentType, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: com.incquerylabs.magicdraw.benchmark.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ItemFlowDifferentType INSTANCE = new ItemFlowDifferentType();
    
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
    private static final ItemFlowDifferentType.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_itemFlow = new PParameter("itemFlow", "com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_itemFlow);
    
    private class EmbeddedQuery1403589302 extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdinformationflows.InformationFlow", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public EmbeddedQuery1403589302() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$1403589302";
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
        //  InformationFlow.conveyed(itemFlow, type)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow", "conveyed")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Classifier")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.itemFlowDifferentType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("itemFlow");
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
          PVariable var_itemFlow = body.getOrCreateVariableByName("itemFlow");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_itemProperty = body.getOrCreateVariableByName("itemProperty");
          PVariable var_type = body.getOrCreateVariableByName("type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_itemFlow), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "InformationFlow")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_itemFlow, parameter_itemFlow)
          ));
          // 	find sysml.ItemFlow(itemFlow, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_itemFlow, var___0_), ItemFlow.instance().getInternalQueryRepresentation());
          // 	find sysml.ItemFlow_itemProperty(itemFlow, itemProperty)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_itemFlow, var_itemProperty), ItemFlow_itemProperty.instance().getInternalQueryRepresentation());
          // 	Property.type(itemProperty, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_itemProperty), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_itemProperty, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "TypedElement", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Type")));
          new Equality(body, var__virtual_0_, var_type);
          // 	neg InformationFlow.conveyed(itemFlow, type)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_itemFlow, var_type), new ItemFlowDifferentType.GeneratedPQuery.EmbeddedQuery1403589302());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
