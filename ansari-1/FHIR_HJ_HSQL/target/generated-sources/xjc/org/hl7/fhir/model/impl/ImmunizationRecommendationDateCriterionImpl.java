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
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ImmunizationRecommendationDateCriterion;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationRecommendation.DateCriterion", propOrder = {
    "code",
    "value"
})
public class ImmunizationRecommendationDateCriterionImpl
    extends BackboneElementImpl
    implements Serializable, ImmunizationRecommendationDateCriterion, Equals, HashCode
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(required = true, type = DateTimeImpl.class)
    protected DateTimeImpl value;

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_IMMUNIZATIONRECOMMENDAT_0")
    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALUE__IMMUNIZATIONRECOMMEND_0")
    public DateTime getValue() {
        return value;
    }

    public void setValue(DateTime value) {
        this.value = ((DateTimeImpl) value);
    }

    public ImmunizationRecommendationDateCriterionImpl withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public ImmunizationRecommendationDateCriterionImpl withValue(DateTime value) {
        setValue(value);
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ImmunizationRecommendationDateCriterionImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ImmunizationRecommendationDateCriterionImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ImmunizationRecommendationDateCriterionImpl that = ((ImmunizationRecommendationDateCriterionImpl) object);
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
            DateTime lhsValue;
            lhsValue = this.getValue();
            DateTime rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
            DateTime theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}