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
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ObservationReferenceRange;
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
@XmlType(name = "Observation.ReferenceRange", propOrder = {
    "low",
    "high",
    "meaning",
    "age"
})
public class ObservationReferenceRangeImpl
    extends BackboneElementImpl
    implements Serializable, ObservationReferenceRange, Equals, HashCode
{

    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl low;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl high;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl meaning;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl age;

    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOW_OBSERVATIONREFERENCERANG_0")
    public Quantity getLow() {
        return low;
    }

    public void setLow(Quantity value) {
        this.low = ((QuantityImpl) value);
    }

    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "HIGH_OBSERVATIONREFERENCERAN_0")
    public Quantity getHigh() {
        return high;
    }

    public void setHigh(Quantity value) {
        this.high = ((QuantityImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MEANING_OBSERVATIONREFERENCE_0")
    public CodeableConcept getMeaning() {
        return meaning;
    }

    public void setMeaning(CodeableConcept value) {
        this.meaning = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Range.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AGE_OBSERVATIONREFERENCERANG_0")
    public Range getAge() {
        return age;
    }

    public void setAge(Range value) {
        this.age = ((RangeImpl) value);
    }

    public ObservationReferenceRangeImpl withLow(Quantity value) {
        setLow(value);
        return this;
    }

    public ObservationReferenceRangeImpl withHigh(Quantity value) {
        setHigh(value);
        return this;
    }

    public ObservationReferenceRangeImpl withMeaning(CodeableConcept value) {
        setMeaning(value);
        return this;
    }

    public ObservationReferenceRangeImpl withAge(Range value) {
        setAge(value);
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ObservationReferenceRangeImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ObservationReferenceRangeImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ObservationReferenceRangeImpl that = ((ObservationReferenceRangeImpl) object);
        {
            Quantity lhsLow;
            lhsLow = this.getLow();
            Quantity rhsLow;
            rhsLow = that.getLow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "low", lhsLow), LocatorUtils.property(thatLocator, "low", rhsLow), lhsLow, rhsLow)) {
                return false;
            }
        }
        {
            Quantity lhsHigh;
            lhsHigh = this.getHigh();
            Quantity rhsHigh;
            rhsHigh = that.getHigh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "high", lhsHigh), LocatorUtils.property(thatLocator, "high", rhsHigh), lhsHigh, rhsHigh)) {
                return false;
            }
        }
        {
            CodeableConcept lhsMeaning;
            lhsMeaning = this.getMeaning();
            CodeableConcept rhsMeaning;
            rhsMeaning = that.getMeaning();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meaning", lhsMeaning), LocatorUtils.property(thatLocator, "meaning", rhsMeaning), lhsMeaning, rhsMeaning)) {
                return false;
            }
        }
        {
            Range lhsAge;
            lhsAge = this.getAge();
            Range rhsAge;
            rhsAge = that.getAge();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "age", lhsAge), LocatorUtils.property(thatLocator, "age", rhsAge), lhsAge, rhsAge)) {
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
            Quantity theLow;
            theLow = this.getLow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "low", theLow), currentHashCode, theLow);
        }
        {
            Quantity theHigh;
            theHigh = this.getHigh();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "high", theHigh), currentHashCode, theHigh);
        }
        {
            CodeableConcept theMeaning;
            theMeaning = this.getMeaning();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meaning", theMeaning), currentHashCode, theMeaning);
        }
        {
            Range theAge;
            theAge = this.getAge();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "age", theAge), currentHashCode, theAge);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}