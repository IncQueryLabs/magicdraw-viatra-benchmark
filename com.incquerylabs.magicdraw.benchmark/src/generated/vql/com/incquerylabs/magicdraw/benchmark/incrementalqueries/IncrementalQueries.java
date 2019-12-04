/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.AllBenchMarkedQueries;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.AlphabeticalDependencies;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.Blocks;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.BlocksOrRequirements;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.BlocksOrRequirementsOrConstraints;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.CircularDependencies;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.Classes;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.ComplexNameOfElements;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.Dependencies;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.DependencyChains;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.ElementsWithShortNames;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.IncomingTransitions;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.LoopTransitionWithTriggerEffectEventNoGuard;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.NamedElement;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.NamesOfDependencyEndpoints;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.NonBlockClasses;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.NumberOfSubregions;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.NumberOfTransitiveSubstates;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.ParentState;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.Requirements;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.StateWithMostSubstates;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.StatesWithMoreIncomingTransitions;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.StatesWithShortNames;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.Subregions;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitionPointingOutOfCompState;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitiveSubstates;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitiveSubstatesWithCheck;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitiveSubstatesWithCheck2;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.TransitiveSubstatesWithCheck3;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in IncrementalQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file IncrementalQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.incrementalqueries, the group contains the definition of the following patterns: <ul>
 * <li>classes</li>
 * <li>nonBlockClasses</li>
 * <li>blocks</li>
 * <li>requirements</li>
 * <li>blocksOrRequirements</li>
 * <li>blocksOrRequirementsOrConstraints</li>
 * <li>namedElement</li>
 * <li>complexNameOfElements</li>
 * <li>dependencyChains</li>
 * <li>circularDependencies</li>
 * <li>dependencies</li>
 * <li>namesOfDependencyEndpoints</li>
 * <li>alphabeticalDependencies</li>
 * <li>elementsWithShortNames</li>
 * <li>transitionPointingOutOfCompState</li>
 * <li>loopTransitionWithTriggerEffectEventNoGuard</li>
 * <li>parentState</li>
 * <li>subregions</li>
 * <li>numberOfSubregions</li>
 * <li>statesWithShortNames</li>
 * <li>incomingTransitions</li>
 * <li>transitiveSubstates</li>
 * <li>transitiveSubstatesWithCheck</li>
 * <li>statesWithMoreIncomingTransitions</li>
 * <li>transitiveSubstatesWithCheck2</li>
 * <li>transitiveSubstatesWithCheck3</li>
 * <li>numberOfTransitiveSubstates</li>
 * <li>stateWithMostSubstates</li>
 * <li>allBenchMarkedQueries</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class IncrementalQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static IncrementalQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new IncrementalQueries();
    }
    return INSTANCE;
  }
  
  private static IncrementalQueries INSTANCE;
  
  private IncrementalQueries() {
    querySpecifications.add(Classes.instance());
    querySpecifications.add(NonBlockClasses.instance());
    querySpecifications.add(Blocks.instance());
    querySpecifications.add(Requirements.instance());
    querySpecifications.add(BlocksOrRequirements.instance());
    querySpecifications.add(BlocksOrRequirementsOrConstraints.instance());
    querySpecifications.add(NamedElement.instance());
    querySpecifications.add(ComplexNameOfElements.instance());
    querySpecifications.add(DependencyChains.instance());
    querySpecifications.add(CircularDependencies.instance());
    querySpecifications.add(Dependencies.instance());
    querySpecifications.add(NamesOfDependencyEndpoints.instance());
    querySpecifications.add(AlphabeticalDependencies.instance());
    querySpecifications.add(ElementsWithShortNames.instance());
    querySpecifications.add(TransitionPointingOutOfCompState.instance());
    querySpecifications.add(LoopTransitionWithTriggerEffectEventNoGuard.instance());
    querySpecifications.add(ParentState.instance());
    querySpecifications.add(Subregions.instance());
    querySpecifications.add(NumberOfSubregions.instance());
    querySpecifications.add(StatesWithShortNames.instance());
    querySpecifications.add(IncomingTransitions.instance());
    querySpecifications.add(TransitiveSubstates.instance());
    querySpecifications.add(TransitiveSubstatesWithCheck.instance());
    querySpecifications.add(StatesWithMoreIncomingTransitions.instance());
    querySpecifications.add(TransitiveSubstatesWithCheck2.instance());
    querySpecifications.add(TransitiveSubstatesWithCheck3.instance());
    querySpecifications.add(NumberOfTransitiveSubstates.instance());
    querySpecifications.add(StateWithMostSubstates.instance());
    querySpecifications.add(AllBenchMarkedQueries.instance());
  }
  
  public Classes getClasses() {
    return Classes.instance();
  }
  
  public Classes.Matcher getClasses(final ViatraQueryEngine engine) {
    return Classes.Matcher.on(engine);
  }
  
  public NonBlockClasses getNonBlockClasses() {
    return NonBlockClasses.instance();
  }
  
  public NonBlockClasses.Matcher getNonBlockClasses(final ViatraQueryEngine engine) {
    return NonBlockClasses.Matcher.on(engine);
  }
  
  public Blocks getBlocks() {
    return Blocks.instance();
  }
  
  public Blocks.Matcher getBlocks(final ViatraQueryEngine engine) {
    return Blocks.Matcher.on(engine);
  }
  
  public Requirements getRequirements() {
    return Requirements.instance();
  }
  
  public Requirements.Matcher getRequirements(final ViatraQueryEngine engine) {
    return Requirements.Matcher.on(engine);
  }
  
  public BlocksOrRequirements getBlocksOrRequirements() {
    return BlocksOrRequirements.instance();
  }
  
  public BlocksOrRequirements.Matcher getBlocksOrRequirements(final ViatraQueryEngine engine) {
    return BlocksOrRequirements.Matcher.on(engine);
  }
  
  public BlocksOrRequirementsOrConstraints getBlocksOrRequirementsOrConstraints() {
    return BlocksOrRequirementsOrConstraints.instance();
  }
  
  public BlocksOrRequirementsOrConstraints.Matcher getBlocksOrRequirementsOrConstraints(final ViatraQueryEngine engine) {
    return BlocksOrRequirementsOrConstraints.Matcher.on(engine);
  }
  
  public NamedElement getNamedElement() {
    return NamedElement.instance();
  }
  
  public NamedElement.Matcher getNamedElement(final ViatraQueryEngine engine) {
    return NamedElement.Matcher.on(engine);
  }
  
  public ComplexNameOfElements getComplexNameOfElements() {
    return ComplexNameOfElements.instance();
  }
  
  public ComplexNameOfElements.Matcher getComplexNameOfElements(final ViatraQueryEngine engine) {
    return ComplexNameOfElements.Matcher.on(engine);
  }
  
  public DependencyChains getDependencyChains() {
    return DependencyChains.instance();
  }
  
  public DependencyChains.Matcher getDependencyChains(final ViatraQueryEngine engine) {
    return DependencyChains.Matcher.on(engine);
  }
  
  public CircularDependencies getCircularDependencies() {
    return CircularDependencies.instance();
  }
  
  public CircularDependencies.Matcher getCircularDependencies(final ViatraQueryEngine engine) {
    return CircularDependencies.Matcher.on(engine);
  }
  
  public Dependencies getDependencies() {
    return Dependencies.instance();
  }
  
  public Dependencies.Matcher getDependencies(final ViatraQueryEngine engine) {
    return Dependencies.Matcher.on(engine);
  }
  
  public NamesOfDependencyEndpoints getNamesOfDependencyEndpoints() {
    return NamesOfDependencyEndpoints.instance();
  }
  
  public NamesOfDependencyEndpoints.Matcher getNamesOfDependencyEndpoints(final ViatraQueryEngine engine) {
    return NamesOfDependencyEndpoints.Matcher.on(engine);
  }
  
  public AlphabeticalDependencies getAlphabeticalDependencies() {
    return AlphabeticalDependencies.instance();
  }
  
  public AlphabeticalDependencies.Matcher getAlphabeticalDependencies(final ViatraQueryEngine engine) {
    return AlphabeticalDependencies.Matcher.on(engine);
  }
  
  public ElementsWithShortNames getElementsWithShortNames() {
    return ElementsWithShortNames.instance();
  }
  
  public ElementsWithShortNames.Matcher getElementsWithShortNames(final ViatraQueryEngine engine) {
    return ElementsWithShortNames.Matcher.on(engine);
  }
  
  public TransitionPointingOutOfCompState getTransitionPointingOutOfCompState() {
    return TransitionPointingOutOfCompState.instance();
  }
  
  public TransitionPointingOutOfCompState.Matcher getTransitionPointingOutOfCompState(final ViatraQueryEngine engine) {
    return TransitionPointingOutOfCompState.Matcher.on(engine);
  }
  
  public LoopTransitionWithTriggerEffectEventNoGuard getLoopTransitionWithTriggerEffectEventNoGuard() {
    return LoopTransitionWithTriggerEffectEventNoGuard.instance();
  }
  
  public LoopTransitionWithTriggerEffectEventNoGuard.Matcher getLoopTransitionWithTriggerEffectEventNoGuard(final ViatraQueryEngine engine) {
    return LoopTransitionWithTriggerEffectEventNoGuard.Matcher.on(engine);
  }
  
  public ParentState getParentState() {
    return ParentState.instance();
  }
  
  public ParentState.Matcher getParentState(final ViatraQueryEngine engine) {
    return ParentState.Matcher.on(engine);
  }
  
  public Subregions getSubregions() {
    return Subregions.instance();
  }
  
  public Subregions.Matcher getSubregions(final ViatraQueryEngine engine) {
    return Subregions.Matcher.on(engine);
  }
  
  public NumberOfSubregions getNumberOfSubregions() {
    return NumberOfSubregions.instance();
  }
  
  public NumberOfSubregions.Matcher getNumberOfSubregions(final ViatraQueryEngine engine) {
    return NumberOfSubregions.Matcher.on(engine);
  }
  
  public StatesWithShortNames getStatesWithShortNames() {
    return StatesWithShortNames.instance();
  }
  
  public StatesWithShortNames.Matcher getStatesWithShortNames(final ViatraQueryEngine engine) {
    return StatesWithShortNames.Matcher.on(engine);
  }
  
  public IncomingTransitions getIncomingTransitions() {
    return IncomingTransitions.instance();
  }
  
  public IncomingTransitions.Matcher getIncomingTransitions(final ViatraQueryEngine engine) {
    return IncomingTransitions.Matcher.on(engine);
  }
  
  public TransitiveSubstates getTransitiveSubstates() {
    return TransitiveSubstates.instance();
  }
  
  public TransitiveSubstates.Matcher getTransitiveSubstates(final ViatraQueryEngine engine) {
    return TransitiveSubstates.Matcher.on(engine);
  }
  
  public TransitiveSubstatesWithCheck getTransitiveSubstatesWithCheck() {
    return TransitiveSubstatesWithCheck.instance();
  }
  
  public TransitiveSubstatesWithCheck.Matcher getTransitiveSubstatesWithCheck(final ViatraQueryEngine engine) {
    return TransitiveSubstatesWithCheck.Matcher.on(engine);
  }
  
  public StatesWithMoreIncomingTransitions getStatesWithMoreIncomingTransitions() {
    return StatesWithMoreIncomingTransitions.instance();
  }
  
  public StatesWithMoreIncomingTransitions.Matcher getStatesWithMoreIncomingTransitions(final ViatraQueryEngine engine) {
    return StatesWithMoreIncomingTransitions.Matcher.on(engine);
  }
  
  public TransitiveSubstatesWithCheck2 getTransitiveSubstatesWithCheck2() {
    return TransitiveSubstatesWithCheck2.instance();
  }
  
  public TransitiveSubstatesWithCheck2.Matcher getTransitiveSubstatesWithCheck2(final ViatraQueryEngine engine) {
    return TransitiveSubstatesWithCheck2.Matcher.on(engine);
  }
  
  public TransitiveSubstatesWithCheck3 getTransitiveSubstatesWithCheck3() {
    return TransitiveSubstatesWithCheck3.instance();
  }
  
  public TransitiveSubstatesWithCheck3.Matcher getTransitiveSubstatesWithCheck3(final ViatraQueryEngine engine) {
    return TransitiveSubstatesWithCheck3.Matcher.on(engine);
  }
  
  public NumberOfTransitiveSubstates getNumberOfTransitiveSubstates() {
    return NumberOfTransitiveSubstates.instance();
  }
  
  public NumberOfTransitiveSubstates.Matcher getNumberOfTransitiveSubstates(final ViatraQueryEngine engine) {
    return NumberOfTransitiveSubstates.Matcher.on(engine);
  }
  
  public StateWithMostSubstates getStateWithMostSubstates() {
    return StateWithMostSubstates.instance();
  }
  
  public StateWithMostSubstates.Matcher getStateWithMostSubstates(final ViatraQueryEngine engine) {
    return StateWithMostSubstates.Matcher.on(engine);
  }
  
  public AllBenchMarkedQueries getAllBenchMarkedQueries() {
    return AllBenchMarkedQueries.instance();
  }
  
  public AllBenchMarkedQueries.Matcher getAllBenchMarkedQueries(final ViatraQueryEngine engine) {
    return AllBenchMarkedQueries.Matcher.on(engine);
  }
}
