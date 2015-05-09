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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.Conformance;
import org.hl7.fhir.model.ConformanceDocument;
import org.hl7.fhir.model.ConformanceImplementation;
import org.hl7.fhir.model.ConformanceMessaging;
import org.hl7.fhir.model.ConformanceRest;
import org.hl7.fhir.model.ConformanceSoftware;
import org.hl7.fhir.model.ConformanceStatementStatus;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Id;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecoms",
    "description",
    "status",
    "experimental",
    "date",
    "software",
    "implementation",
    "fhirVersion",
    "acceptUnknown",
    "formats",
    "profiles",
    "rests",
    "messagings",
    "documents"
})
@XmlRootElement(name = "Conformance")
public class ConformanceImpl
    extends ResourceImpl
    implements Conformance, ToString
{

    @XmlElement(type = StringImpl.class)
    protected StringImpl identifier;
    @XmlElement(type = StringImpl.class)
    protected StringImpl version;
    @XmlElement(type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl publisher;
    @XmlElement(name = "telecom", type = ContactImpl.class)
    protected List<Contact> telecoms;
    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = ConformanceStatementStatusImpl.class)
    protected ConformanceStatementStatusImpl status;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl experimental;
    @XmlElement(required = true, type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(type = ConformanceSoftwareImpl.class)
    protected ConformanceSoftwareImpl software;
    @XmlElement(type = ConformanceImplementationImpl.class)
    protected ConformanceImplementationImpl implementation;
    @XmlElement(required = true, type = IdImpl.class)
    protected IdImpl fhirVersion;
    @XmlElement(required = true, type = BooleanImpl.class)
    protected BooleanImpl acceptUnknown;
    @XmlElement(name = "format", required = true, type = CodeImpl.class)
    protected List<Code> formats;
    @XmlElement(name = "profile", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> profiles;
    @XmlElement(name = "rest", type = ConformanceRestImpl.class)
    protected List<ConformanceRest> rests;
    @XmlElement(name = "messaging", type = ConformanceMessagingImpl.class)
    protected List<ConformanceMessaging> messagings;
    @XmlElement(name = "document", type = ConformanceDocumentImpl.class)
    protected List<ConformanceDocument> documents;

    public org.hl7.fhir.model.String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(org.hl7.fhir.model.String value) {
        this.identifier = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getPublisher() {
        return publisher;
    }

    public void setPublisher(org.hl7.fhir.model.String value) {
        this.publisher = ((StringImpl) value);
    }

    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public ConformanceStatementStatus getStatus() {
        return status;
    }

    public void setStatus(ConformanceStatementStatus value) {
        this.status = ((ConformanceStatementStatusImpl) value);
    }

    public Boolean getExperimental() {
        return experimental;
    }

    public void setExperimental(Boolean value) {
        this.experimental = ((BooleanImpl) value);
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    public ConformanceSoftware getSoftware() {
        return software;
    }

    public void setSoftware(ConformanceSoftware value) {
        this.software = ((ConformanceSoftwareImpl) value);
    }

    public ConformanceImplementation getImplementation() {
        return implementation;
    }

    public void setImplementation(ConformanceImplementation value) {
        this.implementation = ((ConformanceImplementationImpl) value);
    }

    public Id getFhirVersion() {
        return fhirVersion;
    }

    public void setFhirVersion(Id value) {
        this.fhirVersion = ((IdImpl) value);
    }

    public Boolean getAcceptUnknown() {
        return acceptUnknown;
    }

    public void setAcceptUnknown(Boolean value) {
        this.acceptUnknown = ((BooleanImpl) value);
    }

    public List<Code> getFormats() {
        if (formats == null) {
            formats = new ArrayList<Code>();
        }
        return this.formats;
    }

    public List<ResourceReference> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<ResourceReference>();
        }
        return this.profiles;
    }

    public List<ConformanceRest> getRests() {
        if (rests == null) {
            rests = new ArrayList<ConformanceRest>();
        }
        return this.rests;
    }

    public List<ConformanceMessaging> getMessagings() {
        if (messagings == null) {
            messagings = new ArrayList<ConformanceMessaging>();
        }
        return this.messagings;
    }

    public List<ConformanceDocument> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<ConformanceDocument>();
        }
        return this.documents;
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
            org.hl7.fhir.model.String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String thePublisher;
            thePublisher = this.getPublisher();
            strategy.appendField(locator, this, "publisher", buffer, thePublisher);
        }
        {
            List<Contact> theTelecoms;
            theTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            strategy.appendField(locator, this, "telecoms", buffer, theTelecoms);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ConformanceStatementStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Boolean theExperimental;
            theExperimental = this.getExperimental();
            strategy.appendField(locator, this, "experimental", buffer, theExperimental);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ConformanceSoftware theSoftware;
            theSoftware = this.getSoftware();
            strategy.appendField(locator, this, "software", buffer, theSoftware);
        }
        {
            ConformanceImplementation theImplementation;
            theImplementation = this.getImplementation();
            strategy.appendField(locator, this, "implementation", buffer, theImplementation);
        }
        {
            Id theFhirVersion;
            theFhirVersion = this.getFhirVersion();
            strategy.appendField(locator, this, "fhirVersion", buffer, theFhirVersion);
        }
        {
            Boolean theAcceptUnknown;
            theAcceptUnknown = this.getAcceptUnknown();
            strategy.appendField(locator, this, "acceptUnknown", buffer, theAcceptUnknown);
        }
        {
            List<Code> theFormats;
            theFormats = (((this.formats!= null)&&(!this.formats.isEmpty()))?this.getFormats():null);
            strategy.appendField(locator, this, "formats", buffer, theFormats);
        }
        {
            List<ResourceReference> theProfiles;
            theProfiles = (((this.profiles!= null)&&(!this.profiles.isEmpty()))?this.getProfiles():null);
            strategy.appendField(locator, this, "profiles", buffer, theProfiles);
        }
        {
            List<ConformanceRest> theRests;
            theRests = (((this.rests!= null)&&(!this.rests.isEmpty()))?this.getRests():null);
            strategy.appendField(locator, this, "rests", buffer, theRests);
        }
        {
            List<ConformanceMessaging> theMessagings;
            theMessagings = (((this.messagings!= null)&&(!this.messagings.isEmpty()))?this.getMessagings():null);
            strategy.appendField(locator, this, "messagings", buffer, theMessagings);
        }
        {
            List<ConformanceDocument> theDocuments;
            theDocuments = (((this.documents!= null)&&(!this.documents.isEmpty()))?this.getDocuments():null);
            strategy.appendField(locator, this, "documents", buffer, theDocuments);
        }
        return buffer;
    }

}