/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries.internal;

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
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.internal.ConstraintBlocks;
import com.incquerylabs.magicdraw.benchmark.incrementalqueries.internal.TransitionWithGuard;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in IncrementalQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.incrementalqueries, the group contains the definition of the following patterns: <ul>
 * <li>classes</li>
 * <li>nonBlockClasses</li>
 * <li>blocks</li>
 * <li>requirements</li>
 * <li>constraintBlocks</li>
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
 * <li>transitionWithGuard</li>
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
public final class IncrementalQueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static IncrementalQueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new IncrementalQueriesAll();
    }
    return INSTANCE;
  }
  
  private static IncrementalQueriesAll INSTANCE;
  
  private IncrementalQueriesAll() {
    querySpecifications.add(Classes.instance());
    querySpecifications.add(NonBlockClasses.instance());
    querySpecifications.add(Blocks.instance());
    querySpecifications.add(Requirements.instance());
    querySpecifications.add(ConstraintBlocks.instance());
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
    querySpecifications.add(TransitionWithGuard.instance());
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
}
