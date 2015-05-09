//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Narrative;
import org.hl7.fhir.model.ResourceInline;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Supply;
import org.hl7.fhir.model.SupplyDispense;
import org.hl7.fhir.model.SupplyStatus;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

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
    implements Serializable, Supply, Equals, HashCode
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

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "KIND_SUPPLY_HJID")
    public CodeableConcept getKind() {
        return kind;
    }

    public void setKind(CodeableConcept value) {
        this.kind = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_SUPPLY_HJID")
    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    @ManyToOne(targetEntity = SupplyStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_SUPPLY_HJID")
    public SupplyStatus getStatus() {
        return status;
    }

    public void setStatus(SupplyStatus value) {
        this.status = ((SupplyStatusImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORDEREDITEM_SUPPLY_HJID")
    public ResourceReference getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(ResourceReference value) {
        this.orderedItem = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PATIENT_SUPPLY_HJID")
    public ResourceReference getPatient() {
        return patient;
    }

    public void setPatient(ResourceReference value) {
        this.patient = ((ResourceReferenceImpl) value);
    }

    @OneToMany(targetEntity = SupplyDispense.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DISPENSES_SUPPLY_HJID")
    public List<SupplyDispense> getDispenses() {
        if (dispenses == null) {
            dispenses = new ArrayList<SupplyDispense>();
        }
        return this.dispenses;
    }

    public void setDispenses(List<SupplyDispense> dispenses) {
        this.dispenses = dispenses;
    }

    public SupplyImpl withKind(CodeableConcept value) {
        setKind(value);
        return this;
    }

    public SupplyImpl withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public SupplyImpl withStatus(SupplyStatus value) {
        setStatus(value);
        return this;
    }

    public SupplyImpl withOrderedItem(ResourceReference value) {
        setOrderedItem(value);
        return this;
    }

    public SupplyImpl withPatient(ResourceReference value) {
        setPatient(value);
        return this;
    }

    public SupplyImpl withDispenses(SupplyDispense... values) {
        if (values!= null) {
            for (SupplyDispense value: values) {
                getDispenses().add(value);
            }
        }
        return this;
    }

    public SupplyImpl withDispenses(Collection<SupplyDispense> values) {
        if (values!= null) {
            getDispenses().addAll(values);
        }
        return this;
    }

    public SupplyImpl withDispenses(List<SupplyDispense> dispenses) {
        setDispenses(dispenses);
        return this;
    }

    @Override
    public SupplyImpl withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public SupplyImpl withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public SupplyImpl withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public SupplyImpl withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public SupplyImpl withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public SupplyImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SupplyImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SupplyImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public SupplyImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SupplyImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SupplyImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SupplyImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SupplyImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SupplyImpl that = ((SupplyImpl) object);
        {
            CodeableConcept lhsKind;
            lhsKind = this.getKind();
            CodeableConcept rhsKind;
            rhsKind = that.getKind();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kind", lhsKind), LocatorUtils.property(thatLocator, "kind", rhsKind), lhsKind, rhsKind)) {
                return false;
            }
        }
        {
            Identifier lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Identifier rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            SupplyStatus lhsStatus;
            lhsStatus = this.getStatus();
            SupplyStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            ResourceReference lhsOrderedItem;
            lhsOrderedItem = this.getOrderedItem();
            ResourceReference rhsOrderedItem;
            rhsOrderedItem = that.getOrderedItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderedItem", lhsOrderedItem), LocatorUtils.property(thatLocator, "orderedItem", rhsOrderedItem), lhsOrderedItem, rhsOrderedItem)) {
                return false;
            }
        }
        {
            ResourceReference lhsPatient;
            lhsPatient = this.getPatient();
            ResourceReference rhsPatient;
            rhsPatient = that.getPatient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "patient", lhsPatient), LocatorUtils.property(thatLocator, "patient", rhsPatient), lhsPatient, rhsPatient)) {
                return false;
            }
        }
        {
            List<SupplyDispense> lhsDispenses;
            lhsDispenses = (((this.dispenses!= null)&&(!this.dispenses.isEmpty()))?this.getDispenses():null);
            List<SupplyDispense> rhsDispenses;
            rhsDispenses = (((that.dispenses!= null)&&(!that.dispenses.isEmpty()))?that.getDispenses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispenses", lhsDispenses), LocatorUtils.property(thatLocator, "dispenses", rhsDispenses), lhsDispenses, rhsDispenses)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            CodeableConcept theKind;
            theKind = this.getKind();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kind", theKind), currentHashCode, theKind);
        }
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            SupplyStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            ResourceReference theOrderedItem;
            theOrderedItem = this.getOrderedItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderedItem", theOrderedItem), currentHashCode, theOrderedItem);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "patient", thePatient), currentHashCode, thePatient);
        }
        {
            List<SupplyDispense> theDispenses;
            theDispenses = (((this.dispenses!= null)&&(!this.dispenses.isEmpty()))?this.getDispenses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispenses", theDispenses), currentHashCode, theDispenses);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
