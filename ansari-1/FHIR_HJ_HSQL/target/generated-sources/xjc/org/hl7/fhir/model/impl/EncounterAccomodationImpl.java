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
import org.hl7.fhir.model.EncounterAccomodation;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Period;
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
@XmlType(name = "Encounter.Accomodation", propOrder = {
    "bed",
    "period"
})
public class EncounterAccomodationImpl
    extends BackboneElementImpl
    implements Serializable, EncounterAccomodation, Equals, HashCode
{

    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl bed;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl period;

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BED_ENCOUNTERACCOMODATION_HJ_0")
    public ResourceReference getBed() {
        return bed;
    }

    public void setBed(ResourceReference value) {
        this.bed = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERIOD_ENCOUNTERACCOMODATION_0")
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period value) {
        this.period = ((PeriodImpl) value);
    }

    public EncounterAccomodationImpl withBed(ResourceReference value) {
        setBed(value);
        return this;
    }

    public EncounterAccomodationImpl withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    @Override
    public EncounterAccomodationImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public EncounterAccomodationImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public EncounterAccomodationImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public EncounterAccomodationImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public EncounterAccomodationImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public EncounterAccomodationImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public EncounterAccomodationImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EncounterAccomodationImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EncounterAccomodationImpl that = ((EncounterAccomodationImpl) object);
        {
            ResourceReference lhsBed;
            lhsBed = this.getBed();
            ResourceReference rhsBed;
            rhsBed = that.getBed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bed", lhsBed), LocatorUtils.property(thatLocator, "bed", rhsBed), lhsBed, rhsBed)) {
                return false;
            }
        }
        {
            Period lhsPeriod;
            lhsPeriod = this.getPeriod();
            Period rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod)) {
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
            ResourceReference theBed;
            theBed = this.getBed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bed", theBed), currentHashCode, theBed);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}