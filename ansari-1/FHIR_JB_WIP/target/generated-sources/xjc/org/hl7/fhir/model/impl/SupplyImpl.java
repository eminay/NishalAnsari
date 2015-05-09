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
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Supply;
import org.hl7.fhir.model.SupplyDispense;
import org.hl7.fhir.model.SupplyStatus;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supply", propOrder = {
    "kind",
    "identifier",
    "status",
    "orderedItem",
    "patient",
    "dispenses"
})
@XmlRootElement(name = "Supply")
public class SupplyImpl
    extends ResourceImpl
    implements Supply, ToString
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl kind;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl identifier;
    @XmlElement(type = SupplyStatusImpl.class)
    protected SupplyStatusImpl status;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl orderedItem;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl patient;
    @XmlElement(name = "dispense", type = SupplyDispenseImpl.class)
    protected List<SupplyDispense> dispenses;

    public CodeableConcept getKind() {
        return kind;
    }

    public void setKind(CodeableConcept value) {
        this.kind = ((CodeableConceptImpl) value);
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    public SupplyStatus getStatus() {
        return status;
    }

    public void setStatus(SupplyStatus value) {
        this.status = ((SupplyStatusImpl) value);
    }

    public ResourceReference getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(ResourceReference value) {
        this.orderedItem = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getPatient() {
        return patient;
    }

    public void setPatient(ResourceReference value) {
        this.patient = ((ResourceReferenceImpl) value);
    }

    public List<SupplyDispense> getDispenses() {
        if (dispenses == null) {
            dispenses = new ArrayList<SupplyDispense>();
        }
        return this.dispenses;
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
            CodeableConcept theKind;
            theKind = this.getKind();
            strategy.appendField(locator, this, "kind", buffer, theKind);
        }
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            SupplyStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference theOrderedItem;
            theOrderedItem = this.getOrderedItem();
            strategy.appendField(locator, this, "orderedItem", buffer, theOrderedItem);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            List<SupplyDispense> theDispenses;
            theDispenses = (((this.dispenses!= null)&&(!this.dispenses.isEmpty()))?this.getDispenses():null);
            strategy.appendField(locator, this, "dispenses", buffer, theDispenses);
        }
        return buffer;
    }

}
