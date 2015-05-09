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
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DocumentReferenceContext;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Period;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference.Context", propOrder = {
    "events",
    "period",
    "facilityType"
})
public class DocumentReferenceContextImpl
    extends BackboneElementImpl
    implements Serializable, DocumentReferenceContext, Equals, HashCode
{

    @XmlElement(name = "event", type = CodeableConceptImpl.class)
    protected List<CodeableConcept> events;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl period;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl facilityType;

    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENTS_DOCUMENTREFERENCECONT_0")
    public List<CodeableConcept> getEvents() {
        if (events == null) {
            events = new ArrayList<CodeableConcept>();
        }
        return this.events;
    }

    public void setEvents(List<CodeableConcept> events) {
        this.events = events;
    }

    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERIOD_DOCUMENTREFERENCECONT_0")
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period value) {
        this.period = ((PeriodImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FACILITYTYPE_DOCUMENTREFEREN_0")
    public CodeableConcept getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(CodeableConcept value) {
        this.facilityType = ((CodeableConceptImpl) value);
    }

    public DocumentReferenceContextImpl withEvents(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getEvents().add(value);
            }
        }
        return this;
    }

    public DocumentReferenceContextImpl withEvents(Collection<CodeableConcept> values) {
        if (values!= null) {
            getEvents().addAll(values);
        }
        return this;
    }

    public DocumentReferenceContextImpl withEvents(List<CodeableConcept> events) {
        setEvents(events);
        return this;
    }

    public DocumentReferenceContextImpl withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    public DocumentReferenceContextImpl withFacilityType(CodeableConcept value) {
        setFacilityType(value);
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public DocumentReferenceContextImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DocumentReferenceContextImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DocumentReferenceContextImpl that = ((DocumentReferenceContextImpl) object);
        {
            List<CodeableConcept> lhsEvents;
            lhsEvents = (((this.events!= null)&&(!this.events.isEmpty()))?this.getEvents():null);
            List<CodeableConcept> rhsEvents;
            rhsEvents = (((that.events!= null)&&(!that.events.isEmpty()))?that.getEvents():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "events", lhsEvents), LocatorUtils.property(thatLocator, "events", rhsEvents), lhsEvents, rhsEvents)) {
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
        {
            CodeableConcept lhsFacilityType;
            lhsFacilityType = this.getFacilityType();
            CodeableConcept rhsFacilityType;
            rhsFacilityType = that.getFacilityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityType", lhsFacilityType), LocatorUtils.property(thatLocator, "facilityType", rhsFacilityType), lhsFacilityType, rhsFacilityType)) {
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
            List<CodeableConcept> theEvents;
            theEvents = (((this.events!= null)&&(!this.events.isEmpty()))?this.getEvents():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "events", theEvents), currentHashCode, theEvents);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod);
        }
        {
            CodeableConcept theFacilityType;
            theFacilityType = this.getFacilityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilityType", theFacilityType), currentHashCode, theFacilityType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
