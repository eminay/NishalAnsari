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
import org.hl7.fhir.model.Age;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Condition;
import org.hl7.fhir.model.ConditionEvidence;
import org.hl7.fhir.model.ConditionLocation;
import org.hl7.fhir.model.ConditionRelatedItem;
import org.hl7.fhir.model.ConditionStage;
import org.hl7.fhir.model.ConditionStatus;
import org.hl7.fhir.model.Date;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "identifiers",
    "subject",
    "encounter",
    "asserter",
    "dateAsserted",
    "code",
    "category",
    "status",
    "certainty",
    "severity",
    "onsetAge",
    "onsetDate",
    "abatementBoolean",
    "abatementAge",
    "abatementDate",
    "stage",
    "evidences",
    "locations",
    "relatedItems",
    "notes"
})
@XmlRootElement(name = "Condition")
public class ConditionImpl
    extends ResourceImpl
    implements Condition, ToString
{

    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected List<Identifier> identifiers;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl encounter;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl asserter;
    @XmlElement(type = DateImpl.class)
    protected DateImpl dateAsserted;
    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl category;
    @XmlElement(required = true, type = ConditionStatusImpl.class)
    protected ConditionStatusImpl status;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl certainty;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl severity;
    @XmlElement(type = AgeImpl.class)
    protected AgeImpl onsetAge;
    @XmlElement(type = DateImpl.class)
    protected DateImpl onsetDate;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl abatementBoolean;
    @XmlElement(type = AgeImpl.class)
    protected AgeImpl abatementAge;
    @XmlElement(type = DateImpl.class)
    protected DateImpl abatementDate;
    @XmlElement(type = ConditionStageImpl.class)
    protected ConditionStageImpl stage;
    @XmlElement(name = "evidence", type = ConditionEvidenceImpl.class)
    protected List<ConditionEvidence> evidences;
    @XmlElement(name = "location", type = ConditionLocationImpl.class)
    protected List<ConditionLocation> locations;
    @XmlElement(name = "relatedItem", type = ConditionRelatedItemImpl.class)
    protected List<ConditionRelatedItem> relatedItems;
    @XmlElement(type = StringImpl.class)
    protected StringImpl notes;

    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getEncounter() {
        return encounter;
    }

    public void setEncounter(ResourceReference value) {
        this.encounter = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getAsserter() {
        return asserter;
    }

    public void setAsserter(ResourceReference value) {
        this.asserter = ((ResourceReferenceImpl) value);
    }

    public Date getDateAsserted() {
        return dateAsserted;
    }

    public void setDateAsserted(Date value) {
        this.dateAsserted = ((DateImpl) value);
    }

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    public CodeableConcept getCategory() {
        return category;
    }

    public void setCategory(CodeableConcept value) {
        this.category = ((CodeableConceptImpl) value);
    }

    public ConditionStatus getStatus() {
        return status;
    }

    public void setStatus(ConditionStatus value) {
        this.status = ((ConditionStatusImpl) value);
    }

    public CodeableConcept getCertainty() {
        return certainty;
    }

    public void setCertainty(CodeableConcept value) {
        this.certainty = ((CodeableConceptImpl) value);
    }

    public CodeableConcept getSeverity() {
        return severity;
    }

    public void setSeverity(CodeableConcept value) {
        this.severity = ((CodeableConceptImpl) value);
    }

    public Age getOnsetAge() {
        return onsetAge;
    }

    public void setOnsetAge(Age value) {
        this.onsetAge = ((AgeImpl) value);
    }

    public Date getOnsetDate() {
        return onsetDate;
    }

    public void setOnsetDate(Date value) {
        this.onsetDate = ((DateImpl) value);
    }

    public Boolean getAbatementBoolean() {
        return abatementBoolean;
    }

    public void setAbatementBoolean(Boolean value) {
        this.abatementBoolean = ((BooleanImpl) value);
    }

    public Age getAbatementAge() {
        return abatementAge;
    }

    public void setAbatementAge(Age value) {
        this.abatementAge = ((AgeImpl) value);
    }

    public Date getAbatementDate() {
        return abatementDate;
    }

    public void setAbatementDate(Date value) {
        this.abatementDate = ((DateImpl) value);
    }

    public ConditionStage getStage() {
        return stage;
    }

    public void setStage(ConditionStage value) {
        this.stage = ((ConditionStageImpl) value);
    }

    public List<ConditionEvidence> getEvidences() {
        if (evidences == null) {
            evidences = new ArrayList<ConditionEvidence>();
        }
        return this.evidences;
    }

    public List<ConditionLocation> getLocations() {
        if (locations == null) {
            locations = new ArrayList<ConditionLocation>();
        }
        return this.locations;
    }

    public List<ConditionRelatedItem> getRelatedItems() {
        if (relatedItems == null) {
            relatedItems = new ArrayList<ConditionRelatedItem>();
        }
        return this.relatedItems;
    }

    public org.hl7.fhir.model.String getNotes() {
        return notes;
    }

    public void setNotes(org.hl7.fhir.model.String value) {
        this.notes = ((StringImpl) value);
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            strategy.appendField(locator, this, "encounter", buffer, theEncounter);
        }
        {
            ResourceReference theAsserter;
            theAsserter = this.getAsserter();
            strategy.appendField(locator, this, "asserter", buffer, theAsserter);
        }
        {
            Date theDateAsserted;
            theDateAsserted = this.getDateAsserted();
            strategy.appendField(locator, this, "dateAsserted", buffer, theDateAsserted);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            CodeableConcept theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            ConditionStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            CodeableConcept theCertainty;
            theCertainty = this.getCertainty();
            strategy.appendField(locator, this, "certainty", buffer, theCertainty);
        }
        {
            CodeableConcept theSeverity;
            theSeverity = this.getSeverity();
            strategy.appendField(locator, this, "severity", buffer, theSeverity);
        }
        {
            Age theOnsetAge;
            theOnsetAge = this.getOnsetAge();
            strategy.appendField(locator, this, "onsetAge", buffer, theOnsetAge);
        }
        {
            Date theOnsetDate;
            theOnsetDate = this.getOnsetDate();
            strategy.appendField(locator, this, "onsetDate", buffer, theOnsetDate);
        }
        {
            Boolean theAbatementBoolean;
            theAbatementBoolean = this.getAbatementBoolean();
            strategy.appendField(locator, this, "abatementBoolean", buffer, theAbatementBoolean);
        }
        {
            Age theAbatementAge;
            theAbatementAge = this.getAbatementAge();
            strategy.appendField(locator, this, "abatementAge", buffer, theAbatementAge);
        }
        {
            Date theAbatementDate;
            theAbatementDate = this.getAbatementDate();
            strategy.appendField(locator, this, "abatementDate", buffer, theAbatementDate);
        }
        {
            ConditionStage theStage;
            theStage = this.getStage();
            strategy.appendField(locator, this, "stage", buffer, theStage);
        }
        {
            List<ConditionEvidence> theEvidences;
            theEvidences = (((this.evidences!= null)&&(!this.evidences.isEmpty()))?this.getEvidences():null);
            strategy.appendField(locator, this, "evidences", buffer, theEvidences);
        }
        {
            List<ConditionLocation> theLocations;
            theLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            strategy.appendField(locator, this, "locations", buffer, theLocations);
        }
        {
            List<ConditionRelatedItem> theRelatedItems;
            theRelatedItems = (((this.relatedItems!= null)&&(!this.relatedItems.isEmpty()))?this.getRelatedItems():null);
            strategy.appendField(locator, this, "relatedItems", buffer, theRelatedItems);
        }
        {
            org.hl7.fhir.model.String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        return buffer;
    }

}
