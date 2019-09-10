/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/WarmUpQueries.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries;

import com.incquerylabs.magicdraw.benchmark.queries.Activitites;
import com.incquerylabs.magicdraw.benchmark.queries.ActorGeneralization;
import com.incquerylabs.magicdraw.benchmark.queries.AssociationClasses;
import com.incquerylabs.magicdraw.benchmark.queries.Variables;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in WarmUpQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file WarmUpQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.queries, the group contains the definition of the following patterns: <ul>
 * <li>variables</li>
 * <li>associationClasses</li>
 * <li>activitites</li>
 * <li>actorGeneralization</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class WarmUpQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static WarmUpQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new WarmUpQueries();
    }
    return INSTANCE;
  }
  
  private static WarmUpQueries INSTANCE;
  
  private WarmUpQueries() {
    querySpecifications.add(Variables.instance());
    querySpecifications.add(AssociationClasses.instance());
    querySpecifications.add(Activitites.instance());
    querySpecifications.add(ActorGeneralization.instance());
  }
  
  public Variables getVariables() {
    return Variables.instance();
  }
  
  public Variables.Matcher getVariables(final ViatraQueryEngine engine) {
    return Variables.Matcher.on(engine);
  }
  
  public AssociationClasses getAssociationClasses() {
    return AssociationClasses.instance();
  }
  
  public AssociationClasses.Matcher getAssociationClasses(final ViatraQueryEngine engine) {
    return AssociationClasses.Matcher.on(engine);
  }
  
  public Activitites getActivitites() {
    return Activitites.instance();
  }
  
  public Activitites.Matcher getActivitites(final ViatraQueryEngine engine) {
    return Activitites.Matcher.on(engine);
  }
  
  public ActorGeneralization getActorGeneralization() {
    return ActorGeneralization.instance();
  }
  
  public ActorGeneralization.Matcher getActorGeneralization(final ViatraQueryEngine engine) {
    return ActorGeneralization.Matcher.on(engine);
  }
}
