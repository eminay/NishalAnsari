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
import org.hl7.fhir.model.Address;
import org.hl7.fhir.model.Attachment;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.HumanName;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.RelatedPerson;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPerson", propOrder = {
    "identifiers",
    "patient",
    "relationship",
    "name",
    "telecoms",
    "gender",
    "address",
    "photos"
})
@XmlRootElement(name = "RelatedPerson")
public class RelatedPersonImpl
    extends ResourceImpl
    implements RelatedPerson, ToString
{

    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected List<Identifier> identifiers;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl patient;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl relationship;
    @XmlElement(type = HumanNameImpl.class)
    protected HumanNameImpl name;
    @XmlElement(name = "telecom", type = ContactImpl.class)
    protected List<Contact> telecoms;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl gender;
    @XmlElement(type = AddressImpl.class)
    protected AddressImpl address;
    @XmlElement(name = "photo", type = AttachmentImpl.class)
    protected List<Attachment> photos;

    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public ResourceReference getPatient() {
        return patient;
    }

    public void setPatient(ResourceReference value) {
        this.patient = ((ResourceReferenceImpl) value);
    }

    public CodeableConcept getRelationship() {
        return relationship;
    }

    public void setRelationship(CodeableConcept value) {
        this.relationship = ((CodeableConceptImpl) value);
    }

    public HumanName getName() {
        return name;
    }

    public void setName(HumanName value) {
        this.name = ((HumanNameImpl) value);
    }

    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    public CodeableConcept getGender() {
        return gender;
    }

    public void setGender(CodeableConcept value) {
        this.gender = ((CodeableConceptImpl) value);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address value) {
        this.address = ((AddressImpl) value);
    }

    public List<Attachment> getPhotos() {
        if (photos == null) {
            photos = new ArrayList<Attachment>();
        }
        return this.photos;
    }

    public String toString() {
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            CodeableConcept theRelationship;
            theRelationship = this.getRelationship();
            strategy.appendField(locator, this, "relationship", buffer, theRelationship);
        }
        {
            HumanName theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<Contact> theTelecoms;
            theTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            strategy.appendField(locator, this, "telecoms", buffer, theTelecoms);
        }
        {
            CodeableConcept theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            List<Attachment> thePhotos;
            thePhotos = (((this.photos!= null)&&(!this.photos.isEmpty()))?this.getPhotos():null);
            strategy.appendField(locator, this, "photos", buffer, thePhotos);
        }
        return buffer;
    }

}