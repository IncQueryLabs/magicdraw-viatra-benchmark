/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/CommonLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library;

import com.incquerylabs.magicdraw.benchmark.queries.library.CompatibleClassifier;
import com.incquerylabs.magicdraw.benchmark.queries.library.ExtractTaggedValue;
import com.incquerylabs.magicdraw.benchmark.queries.library.GeneralizedClassifier;
import com.incquerylabs.magicdraw.benchmark.queries.library.IndirectGeneralization;
import com.incquerylabs.magicdraw.benchmark.queries.library.OwningPackage;
import com.incquerylabs.magicdraw.benchmark.queries.library.OwningPackageOrSelf;
import com.incquerylabs.magicdraw.benchmark.queries.library.StereotypedElement;
import com.incquerylabs.magicdraw.benchmark.queries.library.TaggedValue;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in CommonLibrary.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file CommonLibrary.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.queries.library, the group contains the definition of the following patterns: <ul>
 * <li>generalizedClassifier</li>
 * <li>indirectGeneralization</li>
 * <li>compatibleClassifier</li>
 * <li>owningPackage</li>
 * <li>owningPackageOrSelf</li>
 * <li>stereotypedElement</li>
 * <li>taggedValue</li>
 * <li>extractTaggedValue</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class CommonLibrary extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CommonLibrary instance() {
    if (INSTANCE == null) {
        INSTANCE = new CommonLibrary();
    }
    return INSTANCE;
  }
  
  private static CommonLibrary INSTANCE;
  
  private CommonLibrary() {
    querySpecifications.add(GeneralizedClassifier.instance());
    querySpecifications.add(IndirectGeneralization.instance());
    querySpecifications.add(CompatibleClassifier.instance());
    querySpecifications.add(OwningPackage.instance());
    querySpecifications.add(OwningPackageOrSelf.instance());
    querySpecifications.add(StereotypedElement.instance());
    querySpecifications.add(TaggedValue.instance());
    querySpecifications.add(ExtractTaggedValue.instance());
  }
  
  public GeneralizedClassifier getGeneralizedClassifier() {
    return GeneralizedClassifier.instance();
  }
  
  public GeneralizedClassifier.Matcher getGeneralizedClassifier(final ViatraQueryEngine engine) {
    return GeneralizedClassifier.Matcher.on(engine);
  }
  
  public IndirectGeneralization getIndirectGeneralization() {
    return IndirectGeneralization.instance();
  }
  
  public IndirectGeneralization.Matcher getIndirectGeneralization(final ViatraQueryEngine engine) {
    return IndirectGeneralization.Matcher.on(engine);
  }
  
  public CompatibleClassifier getCompatibleClassifier() {
    return CompatibleClassifier.instance();
  }
  
  public CompatibleClassifier.Matcher getCompatibleClassifier(final ViatraQueryEngine engine) {
    return CompatibleClassifier.Matcher.on(engine);
  }
  
  public OwningPackage getOwningPackage() {
    return OwningPackage.instance();
  }
  
  public OwningPackage.Matcher getOwningPackage(final ViatraQueryEngine engine) {
    return OwningPackage.Matcher.on(engine);
  }
  
  public OwningPackageOrSelf getOwningPackageOrSelf() {
    return OwningPackageOrSelf.instance();
  }
  
  public OwningPackageOrSelf.Matcher getOwningPackageOrSelf(final ViatraQueryEngine engine) {
    return OwningPackageOrSelf.Matcher.on(engine);
  }
  
  public StereotypedElement getStereotypedElement() {
    return StereotypedElement.instance();
  }
  
  public StereotypedElement.Matcher getStereotypedElement(final ViatraQueryEngine engine) {
    return StereotypedElement.Matcher.on(engine);
  }
  
  public TaggedValue getTaggedValue() {
    return TaggedValue.instance();
  }
  
  public TaggedValue.Matcher getTaggedValue(final ViatraQueryEngine engine) {
    return TaggedValue.Matcher.on(engine);
  }
  
  public ExtractTaggedValue getExtractTaggedValue() {
    return ExtractTaggedValue.instance();
  }
  
  public ExtractTaggedValue.Matcher getExtractTaggedValue(final ViatraQueryEngine engine) {
    return ExtractTaggedValue.Matcher.on(engine);
  }
}
