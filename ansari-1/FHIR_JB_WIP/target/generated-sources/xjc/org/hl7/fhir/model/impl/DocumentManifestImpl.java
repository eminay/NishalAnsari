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
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.DocumentManifest;
import org.hl7.fhir.model.DocumentReferenceStatus;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentManifest", propOrder = {
    "masterIdentifier",
    "identifiers",
    "subjects",
    "recipients",
    "type",
    "authors",
    "created",
    "source",
    "status",
    "supercedes",
    "description",
    "confidentiality",
    "contents"
})
@XmlRootElement(name = "DocumentManifest")
public class DocumentManifestImpl
    extends ResourceImpl
    implements DocumentManifest, ToString
{

    @XmlElement(required = true, type = IdentifierImpl.class)
    protected IdentifierImpl masterIdentifier;
    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected List<Identifier> identifiers;
    @XmlElement(name = "subject", required = true, type = ResourceReferenceImpl.class)
    protected List<ResourceReference> subjects;
    @XmlElement(name = "recipient", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> recipients;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(name = "author", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> authors;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl created;
    @XmlElement(type = UriImpl.class)
    protected UriImpl source;
    @XmlElement(required = true, type = DocumentReferenceStatusImpl.class)
    protected DocumentReferenceStatusImpl status;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl supercedes;
    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl confidentiality;
    @XmlElement(name = "content", required = true, type = ResourceReferenceImpl.class)
    protected List<ResourceReference> contents;

    public Identifier getMasterIdentifier() {
        return masterIdentifier;
    }

    public void setMasterIdentifier(Identifier value) {
        this.masterIdentifier = ((IdentifierImpl) value);
    }

    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public List<ResourceReference> getSubjects() {
        if (subjects == null) {
            subjects = new ArrayList<ResourceReference>();
        }
        return this.subjects;
    }

    public List<ResourceReference> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<ResourceReference>();
        }
        return this.recipients;
    }

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public List<ResourceReference> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<ResourceReference>();
        }
        return this.authors;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime value) {
        this.created = ((DateTimeImpl) value);
    }

    public Uri getSource() {
        return source;
    }

    public void setSource(Uri value) {
        this.source = ((UriImpl) value);
    }

    public DocumentReferenceStatus getStatus() {
        return status;
    }

    public void setStatus(DocumentReferenceStatus value) {
        this.status = ((DocumentReferenceStatusImpl) value);
    }

    public ResourceReference getSupercedes() {
        return supercedes;
    }

    public void setSupercedes(ResourceReference value) {
        this.supercedes = ((ResourceReferenceImpl) value);
    }

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public CodeableConcept getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(CodeableConcept value) {
        this.confidentiality = ((CodeableConceptImpl) value);
    }

    public List<ResourceReference> getContents() {
        if (contents == null) {
            contents = new ArrayList<ResourceReference>();
        }
        return this.contents;
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
            Identifier theMasterIdentifier;
            theMasterIdentifier = this.getMasterIdentifier();
            strategy.appendField(locator, this, "masterIdentifier", buffer, theMasterIdentifier);
        }
        {
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            List<ResourceReference> theSubjects;
            theSubjects = (((this.subjects!= null)&&(!this.subjects.isEmpty()))?this.getSubjects():null);
            strategy.appendField(locator, this, "subjects", buffer, theSubjects);
        }
        {
            List<ResourceReference> theRecipients;
            theRecipients = (((this.recipients!= null)&&(!this.recipients.isEmpty()))?this.getRecipients():null);
            strategy.appendField(locator, this, "recipients", buffer, theRecipients);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<ResourceReference> theAuthors;
            theAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            strategy.appendField(locator, this, "authors", buffer, theAuthors);
        }
        {
            DateTime theCreated;
            theCreated = this.getCreated();
            strategy.appendField(locator, this, "created", buffer, theCreated);
        }
        {
            Uri theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            DocumentReferenceStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference theSupercedes;
            theSupercedes = this.getSupercedes();
            strategy.appendField(locator, this, "supercedes", buffer, theSupercedes);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            CodeableConcept theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            strategy.appendField(locator, this, "confidentiality", buffer, theConfidentiality);
        }
        {
            List<ResourceReference> theContents;
            theContents = (((this.contents!= null)&&(!this.contents.isEmpty()))?this.getContents():null);
            strategy.appendField(locator, this, "contents", buffer, theContents);
        }
        return buffer;
    }

}
