/**
 * Generated from platform:/resource/com.incquerylabs.magicdraw.benchmark/src/main/java/com/incquerylabs/magicdraw/benchmark/queries/library/soaml/SoaMLLibrary.vql
 */
package com.incquerylabs.magicdraw.benchmark.queries.library.soaml;

import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Agent;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Attachment;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Attachment_encoding;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Attachment_mimeType;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Capability;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Collaboration;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Collaboration_isStrict;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Composite;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Consumer;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Expose;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.MessageType;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.MessageType_encoding;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Milestone;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Milestone_progress;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Milestone_signal;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Milestone_value;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Participant;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Port;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Port_connectorRequired;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Property;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Property_isID;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Provider;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Request;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Request_connectorRequired;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Service;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.ServiceChannel;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.ServiceContract;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.ServiceContract_isStrict;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.ServiceInterface;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.Service_connectorRequired;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.ServicesArchitecture;
import com.incquerylabs.magicdraw.benchmark.queries.library.soaml.ServicesArchitecture_isStrict;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in SoaMLLibrary.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SoaMLLibrary.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package com.incquerylabs.magicdraw.benchmark.queries.library.soaml, the group contains the definition of the following patterns: <ul>
 * <li>Agent</li>
 * <li>Attachment</li>
 * <li>Attachment_encoding</li>
 * <li>Attachment_mimeType</li>
 * <li>Capability</li>
 * <li>Collaboration</li>
 * <li>Collaboration_isStrict</li>
 * <li>Composite</li>
 * <li>Consumer</li>
 * <li>Expose</li>
 * <li>MessageType</li>
 * <li>MessageType_encoding</li>
 * <li>Milestone</li>
 * <li>Milestone_progress</li>
 * <li>Milestone_signal</li>
 * <li>Milestone_value</li>
 * <li>Participant</li>
 * <li>Port</li>
 * <li>Port_connectorRequired</li>
 * <li>Property</li>
 * <li>Property_isID</li>
 * <li>Provider</li>
 * <li>Request</li>
 * <li>Request_connectorRequired</li>
 * <li>Service</li>
 * <li>Service_connectorRequired</li>
 * <li>ServiceChannel</li>
 * <li>ServiceContract</li>
 * <li>ServiceContract_isStrict</li>
 * <li>ServiceInterface</li>
 * <li>ServicesArchitecture</li>
 * <li>ServicesArchitecture_isStrict</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SoaMLLibrary extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SoaMLLibrary instance() {
    if (INSTANCE == null) {
        INSTANCE = new SoaMLLibrary();
    }
    return INSTANCE;
  }
  
  private static SoaMLLibrary INSTANCE;
  
  private SoaMLLibrary() {
    querySpecifications.add(Agent.instance());
    querySpecifications.add(Attachment.instance());
    querySpecifications.add(Attachment_encoding.instance());
    querySpecifications.add(Attachment_mimeType.instance());
    querySpecifications.add(Capability.instance());
    querySpecifications.add(Collaboration.instance());
    querySpecifications.add(Collaboration_isStrict.instance());
    querySpecifications.add(Composite.instance());
    querySpecifications.add(Consumer.instance());
    querySpecifications.add(Expose.instance());
    querySpecifications.add(MessageType.instance());
    querySpecifications.add(MessageType_encoding.instance());
    querySpecifications.add(Milestone.instance());
    querySpecifications.add(Milestone_progress.instance());
    querySpecifications.add(Milestone_signal.instance());
    querySpecifications.add(Milestone_value.instance());
    querySpecifications.add(Participant.instance());
    querySpecifications.add(Port.instance());
    querySpecifications.add(Port_connectorRequired.instance());
    querySpecifications.add(Property.instance());
    querySpecifications.add(Property_isID.instance());
    querySpecifications.add(Provider.instance());
    querySpecifications.add(Request.instance());
    querySpecifications.add(Request_connectorRequired.instance());
    querySpecifications.add(Service.instance());
    querySpecifications.add(Service_connectorRequired.instance());
    querySpecifications.add(ServiceChannel.instance());
    querySpecifications.add(ServiceContract.instance());
    querySpecifications.add(ServiceContract_isStrict.instance());
    querySpecifications.add(ServiceInterface.instance());
    querySpecifications.add(ServicesArchitecture.instance());
    querySpecifications.add(ServicesArchitecture_isStrict.instance());
  }
  
  public Agent getAgent() {
    return Agent.instance();
  }
  
  public Agent.Matcher getAgent(final ViatraQueryEngine engine) {
    return Agent.Matcher.on(engine);
  }
  
  public Attachment getAttachment() {
    return Attachment.instance();
  }
  
  public Attachment.Matcher getAttachment(final ViatraQueryEngine engine) {
    return Attachment.Matcher.on(engine);
  }
  
  public Attachment_encoding getAttachment_encoding() {
    return Attachment_encoding.instance();
  }
  
  public Attachment_encoding.Matcher getAttachment_encoding(final ViatraQueryEngine engine) {
    return Attachment_encoding.Matcher.on(engine);
  }
  
  public Attachment_mimeType getAttachment_mimeType() {
    return Attachment_mimeType.instance();
  }
  
  public Attachment_mimeType.Matcher getAttachment_mimeType(final ViatraQueryEngine engine) {
    return Attachment_mimeType.Matcher.on(engine);
  }
  
  public Capability getCapability() {
    return Capability.instance();
  }
  
  public Capability.Matcher getCapability(final ViatraQueryEngine engine) {
    return Capability.Matcher.on(engine);
  }
  
  public Collaboration getCollaboration() {
    return Collaboration.instance();
  }
  
  public Collaboration.Matcher getCollaboration(final ViatraQueryEngine engine) {
    return Collaboration.Matcher.on(engine);
  }
  
  public Collaboration_isStrict getCollaboration_isStrict() {
    return Collaboration_isStrict.instance();
  }
  
  public Collaboration_isStrict.Matcher getCollaboration_isStrict(final ViatraQueryEngine engine) {
    return Collaboration_isStrict.Matcher.on(engine);
  }
  
  public Composite getComposite() {
    return Composite.instance();
  }
  
  public Composite.Matcher getComposite(final ViatraQueryEngine engine) {
    return Composite.Matcher.on(engine);
  }
  
  public Consumer getConsumer() {
    return Consumer.instance();
  }
  
  public Consumer.Matcher getConsumer(final ViatraQueryEngine engine) {
    return Consumer.Matcher.on(engine);
  }
  
  public Expose getExpose() {
    return Expose.instance();
  }
  
  public Expose.Matcher getExpose(final ViatraQueryEngine engine) {
    return Expose.Matcher.on(engine);
  }
  
  public MessageType getMessageType() {
    return MessageType.instance();
  }
  
  public MessageType.Matcher getMessageType(final ViatraQueryEngine engine) {
    return MessageType.Matcher.on(engine);
  }
  
  public MessageType_encoding getMessageType_encoding() {
    return MessageType_encoding.instance();
  }
  
  public MessageType_encoding.Matcher getMessageType_encoding(final ViatraQueryEngine engine) {
    return MessageType_encoding.Matcher.on(engine);
  }
  
  public Milestone getMilestone() {
    return Milestone.instance();
  }
  
  public Milestone.Matcher getMilestone(final ViatraQueryEngine engine) {
    return Milestone.Matcher.on(engine);
  }
  
  public Milestone_progress getMilestone_progress() {
    return Milestone_progress.instance();
  }
  
  public Milestone_progress.Matcher getMilestone_progress(final ViatraQueryEngine engine) {
    return Milestone_progress.Matcher.on(engine);
  }
  
  public Milestone_signal getMilestone_signal() {
    return Milestone_signal.instance();
  }
  
  public Milestone_signal.Matcher getMilestone_signal(final ViatraQueryEngine engine) {
    return Milestone_signal.Matcher.on(engine);
  }
  
  public Milestone_value getMilestone_value() {
    return Milestone_value.instance();
  }
  
  public Milestone_value.Matcher getMilestone_value(final ViatraQueryEngine engine) {
    return Milestone_value.Matcher.on(engine);
  }
  
  public Participant getParticipant() {
    return Participant.instance();
  }
  
  public Participant.Matcher getParticipant(final ViatraQueryEngine engine) {
    return Participant.Matcher.on(engine);
  }
  
  public Port getPort() {
    return Port.instance();
  }
  
  public Port.Matcher getPort(final ViatraQueryEngine engine) {
    return Port.Matcher.on(engine);
  }
  
  public Port_connectorRequired getPort_connectorRequired() {
    return Port_connectorRequired.instance();
  }
  
  public Port_connectorRequired.Matcher getPort_connectorRequired(final ViatraQueryEngine engine) {
    return Port_connectorRequired.Matcher.on(engine);
  }
  
  public Property getProperty() {
    return Property.instance();
  }
  
  public Property.Matcher getProperty(final ViatraQueryEngine engine) {
    return Property.Matcher.on(engine);
  }
  
  public Property_isID getProperty_isID() {
    return Property_isID.instance();
  }
  
  public Property_isID.Matcher getProperty_isID(final ViatraQueryEngine engine) {
    return Property_isID.Matcher.on(engine);
  }
  
  public Provider getProvider() {
    return Provider.instance();
  }
  
  public Provider.Matcher getProvider(final ViatraQueryEngine engine) {
    return Provider.Matcher.on(engine);
  }
  
  public Request getRequest() {
    return Request.instance();
  }
  
  public Request.Matcher getRequest(final ViatraQueryEngine engine) {
    return Request.Matcher.on(engine);
  }
  
  public Request_connectorRequired getRequest_connectorRequired() {
    return Request_connectorRequired.instance();
  }
  
  public Request_connectorRequired.Matcher getRequest_connectorRequired(final ViatraQueryEngine engine) {
    return Request_connectorRequired.Matcher.on(engine);
  }
  
  public Service getService() {
    return Service.instance();
  }
  
  public Service.Matcher getService(final ViatraQueryEngine engine) {
    return Service.Matcher.on(engine);
  }
  
  public Service_connectorRequired getService_connectorRequired() {
    return Service_connectorRequired.instance();
  }
  
  public Service_connectorRequired.Matcher getService_connectorRequired(final ViatraQueryEngine engine) {
    return Service_connectorRequired.Matcher.on(engine);
  }
  
  public ServiceChannel getServiceChannel() {
    return ServiceChannel.instance();
  }
  
  public ServiceChannel.Matcher getServiceChannel(final ViatraQueryEngine engine) {
    return ServiceChannel.Matcher.on(engine);
  }
  
  public ServiceContract getServiceContract() {
    return ServiceContract.instance();
  }
  
  public ServiceContract.Matcher getServiceContract(final ViatraQueryEngine engine) {
    return ServiceContract.Matcher.on(engine);
  }
  
  public ServiceContract_isStrict getServiceContract_isStrict() {
    return ServiceContract_isStrict.instance();
  }
  
  public ServiceContract_isStrict.Matcher getServiceContract_isStrict(final ViatraQueryEngine engine) {
    return ServiceContract_isStrict.Matcher.on(engine);
  }
  
  public ServiceInterface getServiceInterface() {
    return ServiceInterface.instance();
  }
  
  public ServiceInterface.Matcher getServiceInterface(final ViatraQueryEngine engine) {
    return ServiceInterface.Matcher.on(engine);
  }
  
  public ServicesArchitecture getServicesArchitecture() {
    return ServicesArchitecture.instance();
  }
  
  public ServicesArchitecture.Matcher getServicesArchitecture(final ViatraQueryEngine engine) {
    return ServicesArchitecture.Matcher.on(engine);
  }
  
  public ServicesArchitecture_isStrict getServicesArchitecture_isStrict() {
    return ServicesArchitecture_isStrict.instance();
  }
  
  public ServicesArchitecture_isStrict.Matcher getServicesArchitecture_isStrict(final ViatraQueryEngine engine) {
    return ServicesArchitecture_isStrict.Matcher.on(engine);
  }
}
