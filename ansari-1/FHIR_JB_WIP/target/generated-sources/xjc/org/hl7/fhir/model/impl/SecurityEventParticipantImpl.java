//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SecurityEventNetwork;
import org.hl7.fhir.model.SecurityEventParticipant;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent.Participant", propOrder = {
    "roles",
    "reference",
    "userId",
    "altId",
    "name",
    "requestor",
    "media",
    "network"
})
public class SecurityEventParticipantImpl
    extends BackboneElementImpl
    implements SecurityEventParticipant, ToString
{

    @XmlElement(name = "role", type = CodeableConceptImpl.class)
    protected List<CodeableConcept> roles;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl reference;
    @XmlElement(type = StringImpl.class)
    protected StringImpl userId;
    @XmlElement(type = StringImpl.class)
    protected StringImpl altId;
    @XmlElement(type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(required = true, type = BooleanImpl.class)
    protected BooleanImpl requestor;
    @XmlElement(type = CodingImpl.class)
    protected CodingImpl media;
    @XmlElement(type = SecurityEventNetworkImpl.class)
    protected SecurityEventNetworkImpl network;

    public List<CodeableConcept> getRoles() {
        if (roles == null) {
            roles = new ArrayList<CodeableConcept>();
        }
        return this.roles;
    }

    public ResourceReference getReference() {
        return reference;
    }

    public void setReference(ResourceReference value) {
        this.reference = ((ResourceReferenceImpl) value);
    }

    public org.hl7.fhir.model.String getUserId() {
        return userId;
    }

    public void setUserId(org.hl7.fhir.model.String value) {
        this.userId = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getAltId() {
        return altId;
    }

    public void setAltId(org.hl7.fhir.model.String value) {
        this.altId = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    public Boolean getRequestor() {
        return requestor;
    }

    public void setRequestor(Boolean value) {
        this.requestor = ((BooleanImpl) value);
    }

    public Coding getMedia() {
        return media;
    }

    public void setMedia(Coding value) {
        this.media = ((CodingImpl) value);
    }

    public SecurityEventNetwork getNetwork() {
        return network;
    }

    public void setNetwork(SecurityEventNetwork value) {
        this.network = ((SecurityEventNetworkImpl) value);
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<CodeableConcept> theRoles;
            theRoles = (((this.roles!= null)&&(!this.roles.isEmpty()))?this.getRoles():null);
            strategy.appendField(locator, this, "roles", buffer, theRoles);
        }
        {
            ResourceReference theReference;
            theReference = this.getReference();
            strategy.appendField(locator, this, "reference", buffer, theReference);
        }
        {
            org.hl7.fhir.model.String theUserId;
            theUserId = this.getUserId();
            strategy.appendField(locator, this, "userId", buffer, theUserId);
        }
        {
            org.hl7.fhir.model.String theAltId;
            theAltId = this.getAltId();
            strategy.appendField(locator, this, "altId", buffer, theAltId);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean theRequestor;
            theRequestor = this.getRequestor();
            strategy.appendField(locator, this, "requestor", buffer, theRequestor);
        }
        {
            Coding theMedia;
            theMedia = this.getMedia();
            strategy.appendField(locator, this, "media", buffer, theMedia);
        }
        {
            SecurityEventNetwork theNetwork;
            theNetwork = this.getNetwork();
            strategy.appendField(locator, this, "network", buffer, theNetwork);
        }
        return buffer;
    }

}
