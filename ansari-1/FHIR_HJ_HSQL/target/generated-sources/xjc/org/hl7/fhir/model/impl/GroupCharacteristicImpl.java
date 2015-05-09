//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.GroupCharacteristic;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.Range;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group.Characteristic", propOrder = {
    "code",
    "valueRange",
    "valueQuantity",
    "valueBoolean",
    "valueCodeableConcept",
    "exclude"
})
public class GroupCharacteristicImpl
    extends BackboneElementImpl
    implements Serializable, GroupCharacteristic, Equals, HashCode
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl valueRange;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl valueQuantity;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl valueBoolean;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl valueCodeableConcept;
    @XmlElement(required = true, type = BooleanImpl.class)
    protected BooleanImpl exclude;

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_GROUPCHARACTERISTIC_HJID")
    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Range.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALUERANGE_GROUPCHARACTERIST_0")
    public Range getValueRange() {
        return valueRange;
    }

    public void setValueRange(Range value) {
        this.valueRange = ((RangeImpl) value);
    }

    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALUEQUANTITY_GROUPCHARACTER_0")
    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    public void setValueQuantity(Quantity value) {
        this.valueQuantity = ((QuantityImpl) value);
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALUEBOOLEAN_GROUPCHARACTERI_0")
    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(Boolean value) {
        this.valueBoolean = ((BooleanImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALUECODEABLECONCEPT_GROUPCH_0")
    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXCLUDE_GROUPCHARACTERISTIC__0")
    public Boolean getExclude() {
        return exclude;
    }

    public void setExclude(Boolean value) {
        this.exclude = ((BooleanImpl) value);
    }

    public GroupCharacteristicImpl withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public GroupCharacteristicImpl withValueRange(Range value) {
        setValueRange(value);
        return this;
    }

    public GroupCharacteristicImpl withValueQuantity(Quantity value) {
        setValueQuantity(value);
        return this;
    }

    public GroupCharacteristicImpl withValueBoolean(Boolean value) {
        setValueBoolean(value);
        return this;
    }

    public GroupCharacteristicImpl withValueCodeableConcept(CodeableConcept value) {
        setValueCodeableConcept(value);
        return this;
    }

    public GroupCharacteristicImpl withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    @Override
    public GroupCharacteristicImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupCharacteristicImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public GroupCharacteristicImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public GroupCharacteristicImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupCharacteristicImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public GroupCharacteristicImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public GroupCharacteristicImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GroupCharacteristicImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final GroupCharacteristicImpl that = ((GroupCharacteristicImpl) object);
        {
            CodeableConcept lhsCode;
            lhsCode = this.getCode();
            CodeableConcept rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            Range lhsValueRange;
            lhsValueRange = this.getValueRange();
            Range rhsValueRange;
            rhsValueRange = that.getValueRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueRange", lhsValueRange), LocatorUtils.property(thatLocator, "valueRange", rhsValueRange), lhsValueRange, rhsValueRange)) {
                return false;
            }
        }
        {
            Quantity lhsValueQuantity;
            lhsValueQuantity = this.getValueQuantity();
            Quantity rhsValueQuantity;
            rhsValueQuantity = that.getValueQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueQuantity", lhsValueQuantity), LocatorUtils.property(thatLocator, "valueQuantity", rhsValueQuantity), lhsValueQuantity, rhsValueQuantity)) {
                return false;
            }
        }
        {
            Boolean lhsValueBoolean;
            lhsValueBoolean = this.getValueBoolean();
            Boolean rhsValueBoolean;
            rhsValueBoolean = that.getValueBoolean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueBoolean", lhsValueBoolean), LocatorUtils.property(thatLocator, "valueBoolean", rhsValueBoolean), lhsValueBoolean, rhsValueBoolean)) {
                return false;
            }
        }
        {
            CodeableConcept lhsValueCodeableConcept;
            lhsValueCodeableConcept = this.getValueCodeableConcept();
            CodeableConcept rhsValueCodeableConcept;
            rhsValueCodeableConcept = that.getValueCodeableConcept();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueCodeableConcept", lhsValueCodeableConcept), LocatorUtils.property(thatLocator, "valueCodeableConcept", rhsValueCodeableConcept), lhsValueCodeableConcept, rhsValueCodeableConcept)) {
                return false;
            }
        }
        {
            Boolean lhsExclude;
            lhsExclude = this.getExclude();
            Boolean rhsExclude;
            rhsExclude = that.getExclude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exclude", lhsExclude), LocatorUtils.property(thatLocator, "exclude", rhsExclude), lhsExclude, rhsExclude)) {
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
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            Range theValueRange;
            theValueRange = this.getValueRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueRange", theValueRange), currentHashCode, theValueRange);
        }
        {
            Quantity theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueQuantity", theValueQuantity), currentHashCode, theValueQuantity);
        }
        {
            Boolean theValueBoolean;
            theValueBoolean = this.getValueBoolean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueBoolean", theValueBoolean), currentHashCode, theValueBoolean);
        }
        {
            CodeableConcept theValueCodeableConcept;
            theValueCodeableConcept = this.getValueCodeableConcept();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueCodeableConcept", theValueCodeableConcept), currentHashCode, theValueCodeableConcept);
        }
        {
            Boolean theExclude;
            theExclude = this.getExclude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exclude", theExclude), currentHashCode, theExclude);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
