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
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SupplyDispense;
import org.hl7.fhir.model.SupplyDispenseStatus;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supply.Dispense", propOrder = {
    "identifier",
    "status",
    "type",
    "quantity",
    "suppliedItem",
    "supplier",
    "whenPrepared",
    "whenHandedOver",
    "destination",
    "receivers"
})
public class SupplyDispenseImpl
    extends BackboneElementImpl
    implements SupplyDispense, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl identifier;
    @XmlElement(type = SupplyDispenseStatusImpl.class)
    protected SupplyDispenseStatusImpl status;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl quantity;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl suppliedItem;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl supplier;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl whenPrepared;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl whenHandedOver;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl destination;
    @XmlElement(name = "receiver", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> receivers;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    public SupplyDispenseStatus getStatus() {
        return status;
    }

    public void setStatus(SupplyDispenseStatus value) {
        this.status = ((SupplyDispenseStatusImpl) value);
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

    public ResourceReference getSuppliedItem() {
        return suppliedItem;
    }

    public void setSuppliedItem(ResourceReference value) {
        this.suppliedItem = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getSupplier() {
        return supplier;
    }

    public void setSupplier(ResourceReference value) {
        this.supplier = ((ResourceReferenceImpl) value);
    }

    public Period getWhenPrepared() {
        return whenPrepared;
    }

    public void setWhenPrepared(Period value) {
        this.whenPrepared = ((PeriodImpl) value);
    }

    public Period getWhenHandedOver() {
        return whenHandedOver;
    }

    public void setWhenHandedOver(Period value) {
        this.whenHandedOver = ((PeriodImpl) value);
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
            SupplyDispenseStatus theStatus;
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
            ResourceReference theSuppliedItem;
            theSuppliedItem = this.getSuppliedItem();
            strategy.appendField(locator, this, "suppliedItem", buffer, theSuppliedItem);
        }
        {
            ResourceReference theSupplier;
            theSupplier = this.getSupplier();
            strategy.appendField(locator, this, "supplier", buffer, theSupplier);
        }
        {
            Period theWhenPrepared;
            theWhenPrepared = this.getWhenPrepared();
            strategy.appendField(locator, this, "whenPrepared", buffer, theWhenPrepared);
        }
        {
            Period theWhenHandedOver;
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
        return buffer;
    }

}