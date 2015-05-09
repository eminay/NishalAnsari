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
import org.hl7.fhir.model.AdverseReactionExposure;
import org.hl7.fhir.model.CausalityExpectation;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.ExposureType;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseReaction.Exposure", propOrder = {
    "date",
    "type",
    "causalityExpectation",
    "substance"
})
public class AdverseReactionExposureImpl
    extends BackboneElementImpl
    implements Serializable, AdverseReactionExposure, Equals, HashCode
{

    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(type = ExposureTypeImpl.class)
    protected ExposureTypeImpl type;
    @XmlElement(type = CausalityExpectationImpl.class)
    protected CausalityExpectationImpl causalityExpectation;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl substance;

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__ADVERSEREACTIONEXPOSUR_0")
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    @ManyToOne(targetEntity = ExposureType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__ADVERSEREACTIONEXPOSUR_0")
    public ExposureType getType() {
        return type;
    }

    public void setType(ExposureType value) {
        this.type = ((ExposureTypeImpl) value);
    }

    @ManyToOne(targetEntity = CausalityExpectation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CAUSALITYEXPECTATION_ADVERSE_0")
    public CausalityExpectation getCausalityExpectation() {
        return causalityExpectation;
    }

    public void setCausalityExpectation(CausalityExpectation value) {
        this.causalityExpectation = ((CausalityExpectationImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBSTANCE_ADVERSEREACTIONEXP_0")
    public ResourceReference getSubstance() {
        return substance;
    }

    public void setSubstance(ResourceReference value) {
        this.substance = ((ResourceReferenceImpl) value);
    }

    public AdverseReactionExposureImpl withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public AdverseReactionExposureImpl withType(ExposureType value) {
        setType(value);
        return this;
    }

    public AdverseReactionExposureImpl withCausalityExpectation(CausalityExpectation value) {
        setCausalityExpectation(value);
        return this;
    }

    public AdverseReactionExposureImpl withSubstance(ResourceReference value) {
        setSubstance(value);
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public AdverseReactionExposureImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AdverseReactionExposureImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AdverseReactionExposureImpl that = ((AdverseReactionExposureImpl) object);
        {
            DateTime lhsDate;
            lhsDate = this.getDate();
            DateTime rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            ExposureType lhsType;
            lhsType = this.getType();
            ExposureType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            CausalityExpectation lhsCausalityExpectation;
            lhsCausalityExpectation = this.getCausalityExpectation();
            CausalityExpectation rhsCausalityExpectation;
            rhsCausalityExpectation = that.getCausalityExpectation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "causalityExpectation", lhsCausalityExpectation), LocatorUtils.property(thatLocator, "causalityExpectation", rhsCausalityExpectation), lhsCausalityExpectation, rhsCausalityExpectation)) {
                return false;
            }
        }
        {
            ResourceReference lhsSubstance;
            lhsSubstance = this.getSubstance();
            ResourceReference rhsSubstance;
            rhsSubstance = that.getSubstance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substance", lhsSubstance), LocatorUtils.property(thatLocator, "substance", rhsSubstance), lhsSubstance, rhsSubstance)) {
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
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            ExposureType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            CausalityExpectation theCausalityExpectation;
            theCausalityExpectation = this.getCausalityExpectation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "causalityExpectation", theCausalityExpectation), currentHashCode, theCausalityExpectation);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substance", theSubstance), currentHashCode, theSubstance);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
