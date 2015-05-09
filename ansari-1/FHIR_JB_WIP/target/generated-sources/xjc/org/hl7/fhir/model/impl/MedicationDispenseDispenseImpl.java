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
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.MedicationDispenseDispense;
import org.hl7.fhir.model.MedicationDispenseDosage;
import org.hl7.fhir.model.MedicationDispenseStatus;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.Dispense", propOrder = {
    "identifier",
    "status",
    "type",
    "quantity",
    "medication",
    "whenPrepared",
    "whenHandedOver",
    "destination",
    "receivers",
    "dosages"
})
public class MedicationDispenseDispenseImpl
    extends BackboneElementImpl
    implements MedicationDispenseDispense, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl identifier;
    @XmlElement(type = MedicationDispenseStatusImpl.class)
    protected MedicationDispenseStatusImpl status;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl quantity;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl medication;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl whenPrepared;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl whenHandedOver;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl destination;
    @XmlElement(name = "receiver", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> receivers;
    @XmlElement(name = "dosage", type = MedicationDispenseDosageImpl.class)
    protected List<MedicationDispenseDosage> dosages;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    public MedicationDispenseStatus getStatus() {
        return status;
    }

    public void setStatus(MedicationDispenseStatus value) {
        this.status = ((MedicationDispenseStatusImpl) value);
    }

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity value) {
        this.quantity = ((QuantityImpl) value);
    }

    public ResourceReference getMedication() {
        return medication;
    }

    public void setMedication(ResourceReference value) {
        this.medication = ((ResourceReferenceImpl) value);
    }

    public DateTime getWhenPrepared() {
        return whenPrepared;
    }

    public void setWhenPrepared(DateTime value) {
        this.whenPrepared = ((DateTimeImpl) value);
    }

    public DateTime getWhenHandedOver() {
        return whenHandedOver;
    }

    public void setWhenHandedOver(DateTime value) {
        this.whenHandedOver = ((DateTimeImpl) value);
    }

    public ResourceReference getDestination() {
        return destination;
    }

    public void setDestination(ResourceReference value) {
        this.destination = ((ResourceReferenceImpl) value);
    }

    public List<ResourceReference> getReceivers() {
        if (receivers == null) {
            receivers = new ArrayList<ResourceReference>();
        }
        return this.receivers;
    }

    public List<MedicationDispenseDosage> getDosages() {
        if (dosages == null) {
            dosages = new ArrayList<MedicationDispenseDosage>();
        }
        return this.dosages;
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
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            MedicationDispenseStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            ResourceReference theMedication;
            theMedication = this.getMedication();
            strategy.appendField(locator, this, "medication", buffer, theMedication);
        }
        {
            DateTime theWhenPrepared;
            theWhenPrepared = this.getWhenPrepared();
            strategy.appendField(locator, this, "whenPrepared", buffer, theWhenPrepared);
        }
        {
            DateTime theWhenHandedOver;
            theWhenHandedOver = this.getWhenHandedOver();
            strategy.appendField(locator, this, "whenHandedOver", buffer, theWhenHandedOver);
        }
        {
            ResourceReference theDestination;
            theDestination = this.getDestination();
            strategy.appendField(locator, this, "destination", buffer, theDestination);
        }
        {
            List<ResourceReference> theReceivers;
            theReceivers = (((this.receivers!= null)&&(!this.receivers.isEmpty()))?this.getReceivers():null);
            strategy.appendField(locator, this, "receivers", buffer, theReceivers);
        }
        {
            List<MedicationDispenseDosage> theDosages;
            theDosages = (((this.dosages!= null)&&(!this.dosages.isEmpty()))?this.getDosages():null);
            strategy.appendField(locator, this, "dosages", buffer, theDosages);
        }
        return buffer;
    }

}
