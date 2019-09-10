/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/incrementalqueries/IncrementalQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.incrementalqueries;

import com.incquerylabs.magicdraw.benchmark.incrementalqueries.ParentState;
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
 * <li>parentState</li>
 * <li>transitiveSubstatesWithCheck</li>
 * <li>transitiveSubstatesWithCheck2</li>
 * <li>transitiveSubstatesWithCheck3</li>
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
    querySpecifications.add(ParentState.instance());
    querySpecifications.add(TransitiveSubstatesWithCheck.instance());
    querySpecifications.add(TransitiveSubstatesWithCheck2.instance());
    querySpecifications.add(TransitiveSubstatesWithCheck3.instance());
  }
  
  public ParentState getParentState() {
    return ParentState.instance();
  }
  
  public ParentState.Matcher getParentState(final ViatraQueryEngine engine) {
    return ParentState.Matcher.on(engine);
  }
  
  public TransitiveSubstatesWithCheck getTransitiveSubstatesWithCheck() {
    return TransitiveSubstatesWithCheck.instance();
  }
  
  public TransitiveSubstatesWithCheck.Matcher getTransitiveSubstatesWithCheck(final ViatraQueryEngine engine) {
    return TransitiveSubstatesWithCheck.Matcher.on(engine);
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
}
