/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/sysml_validation_queries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import sysml.Requirement;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern requirementHasAttribute(attirubute : Property) {
 *         	find sysml.Requirement(req, _);
 *         	Class.ownedAttribute(req, attirubute);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RequirementHasAttribute extends BaseGeneratedEMFQuerySpecification<RequirementHasAttribute.Matcher> {
  /**
   * Pattern-specific match representation of the com.incquerylabs.magicdraw.benchmark.queries.requirementHasAttribute pattern,
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
    private Property fAttirubute;
    
    private static List<String> parameterNames = makeImmutableList("attirubute");
    
    private Match(final Property pAttirubute) {
      this.fAttirubute = pAttirubute;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "attirubute": return this.fAttirubute;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fAttirubute;
          default: return null;
      }
    }
    
    public Property getAttirubute() {
      return this.fAttirubute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attirubute".equals(parameterName) ) {
          this.fAttirubute = (Property) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttirubute(final Property pAttirubute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttirubute = pAttirubute;
    }
    
    @Override
    public String patternName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.requirementHasAttribute";
    }
    
    @Override
    public List<String> parameterNames() {
      return RequirementHasAttribute.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttirubute};
    }
    
    @Override
    public RequirementHasAttribute.Match toImmutable() {
      return isMutable() ? newMatch(fAttirubute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attirubute\"=" + prettyPrintValue(fAttirubute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAttirubute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RequirementHasAttribute.Match)) {
          RequirementHasAttribute.Match other = (RequirementHasAttribute.Match) obj;
          return Objects.equals(fAttirubute, other.fAttirubute);
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
    public RequirementHasAttribute specification() {
      return RequirementHasAttribute.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RequirementHasAttribute.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RequirementHasAttribute.Match newMutableMatch(final Property pAttirubute) {
      return new Mutable(pAttirubute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RequirementHasAttribute.Match newMatch(final Property pAttirubute) {
      return new Immutable(pAttirubute);
    }
    
    private static final class Mutable extends RequirementHasAttribute.Match {
      Mutable(final Property pAttirubute) {
        super(pAttirubute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RequirementHasAttribute.Match {
      Immutable(final Property pAttirubute) {
        super(pAttirubute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the com.incquerylabs.magicdraw.benchmark.queries.requirementHasAttribute pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern requirementHasAttribute(attirubute : Property) {
   * 	find sysml.Requirement(req, _);
   * 	Class.ownedAttribute(req, attirubute);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RequirementHasAttribute
   * 
   */
  public static class Matcher extends BaseMatcher<RequirementHasAttribute.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RequirementHasAttribute.Matcher on(final ViatraQueryEngine engine) {
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
    public static RequirementHasAttribute.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ATTIRUBUTE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RequirementHasAttribute.Matcher.class);
    
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
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RequirementHasAttribute.Match> getAllMatches(final Property pAttirubute) {
      return rawStreamAllMatches(new Object[]{pAttirubute}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RequirementHasAttribute.Match> streamAllMatches(final Property pAttirubute) {
      return rawStreamAllMatches(new Object[]{pAttirubute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RequirementHasAttribute.Match> getOneArbitraryMatch(final Property pAttirubute) {
      return rawGetOneArbitraryMatch(new Object[]{pAttirubute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Property pAttirubute) {
      return rawHasMatch(new Object[]{pAttirubute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Property pAttirubute) {
      return rawCountMatches(new Object[]{pAttirubute});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Property pAttirubute, final Consumer<? super RequirementHasAttribute.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttirubute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttirubute the fixed value of pattern parameter attirubute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RequirementHasAttribute.Match newMatch(final Property pAttirubute) {
      return RequirementHasAttribute.Match.newMatch(pAttirubute);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attirubute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Property> rawStreamAllValuesOfattirubute(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ATTIRUBUTE, parameters).map(Property.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attirubute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Property> getAllValuesOfattirubute() {
      return rawStreamAllValuesOfattirubute(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attirubute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Property> streamAllValuesOfattirubute() {
      return rawStreamAllValuesOfattirubute(emptyArray());
    }
    
    @Override
    protected RequirementHasAttribute.Match tupleToMatch(final Tuple t) {
      try {
          return RequirementHasAttribute.Match.newMatch((Property) t.get(POSITION_ATTIRUBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RequirementHasAttribute.Match arrayToMatch(final Object[] match) {
      try {
          return RequirementHasAttribute.Match.newMatch((Property) match[POSITION_ATTIRUBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RequirementHasAttribute.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RequirementHasAttribute.Match.newMutableMatch((Property) match[POSITION_ATTIRUBUTE]);
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
    public static IQuerySpecification<RequirementHasAttribute.Matcher> querySpecification() {
      return RequirementHasAttribute.instance();
    }
  }
  
  private RequirementHasAttribute() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RequirementHasAttribute instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RequirementHasAttribute.Matcher instantiate(final ViatraQueryEngine engine) {
    return RequirementHasAttribute.Matcher.on(engine);
  }
  
  @Override
  public RequirementHasAttribute.Matcher instantiate() {
    return RequirementHasAttribute.Matcher.create();
  }
  
  @Override
  public RequirementHasAttribute.Match newEmptyMatch() {
    return RequirementHasAttribute.Match.newEmptyMatch();
  }
  
  @Override
  public RequirementHasAttribute.Match newMatch(final Object... parameters) {
    return RequirementHasAttribute.Match.newMatch((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RequirementHasAttribute} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RequirementHasAttribute#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RequirementHasAttribute INSTANCE = new RequirementHasAttribute();
    
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
    private static final RequirementHasAttribute.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_attirubute = new PParameter("attirubute", "com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_attirubute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "com.incquerylabs.magicdraw.benchmark.queries.requirementHasAttribute";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attirubute");
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
          PVariable var_attirubute = body.getOrCreateVariableByName("attirubute");
          PVariable var_req = body.getOrCreateVariableByName("req");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attirubute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attirubute, parameter_attirubute)
          ));
          // 	find sysml.Requirement(req, _)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_req, var___0_), Requirement.instance().getInternalQueryRepresentation());
          // 	Class.ownedAttribute(req, attirubute)
          new TypeConstraint(body, Tuples.flatTupleOf(var_req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_req, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "StructuredClassifier", "ownedAttribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.nomagic.com/magicdraw/UML/2.5.1", "Property")));
          new Equality(body, var__virtual_0_, var_attirubute);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
