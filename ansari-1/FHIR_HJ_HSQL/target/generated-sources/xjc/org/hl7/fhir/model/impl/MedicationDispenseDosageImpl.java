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
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.MedicationDispenseDosage;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.Ratio;
import org.hl7.fhir.model.Schedule;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.Dosage", propOrder = {
    "additionalInstructions",
    "timingSchedule",
    "timingPeriod",
    "timingDateTime",
    "asNeededCodeableConcept",
    "asNeededBoolean",
    "site",
    "route",
    "method",
    "quantity",
    "rate",
    "maxDosePerPeriod"
})
public class MedicationDispenseDosageImpl
    extends BackboneElementImpl
    implements Serializable, MedicationDispenseDosage, Equals, HashCode
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl additionalInstructions;
    @XmlElement(type = ScheduleImpl.class)
    protected ScheduleImpl timingSchedule;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl timingPeriod;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl timingDateTime;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl asNeededCodeableConcept;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl asNeededBoolean;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl site;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl route;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl method;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl quantity;
    @XmlElement(type = RatioImpl.class)
    protected RatioImpl rate;
    @XmlElement(type = RatioImpl.class)
    protected RatioImpl maxDosePerPeriod;

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDITIONALINSTRUCTIONS_MEDIC_1")
    public CodeableConcept getAdditionalInstructions() {
        return additionalInstructions;
    }

    public void setAdditionalInstructions(CodeableConcept value) {
        this.additionalInstructions = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Schedule.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMINGSCHEDULE_MEDICATIONDIS_0")
    public Schedule getTimingSchedule() {
        return timingSchedule;
    }

    public void setTimingSchedule(Schedule value) {
        this.timingSchedule = ((ScheduleImpl) value);
    }

    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMINGPERIOD_MEDICATIONDISPE_0")
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    public void setTimingPeriod(Period value) {
        this.timingPeriod = ((PeriodImpl) value);
    }

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMINGDATETIME_MEDICATIONDIS_0")
    public DateTime getTimingDateTime() {
        return timingDateTime;
    }

    public void setTimingDateTime(DateTime value) {
        this.timingDateTime = ((DateTimeImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASNEEDEDCODEABLECONCEPT_MEDI_3")
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASNEEDEDBOOLEAN_MEDICATIONDI_0")
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    public void setAsNeededBoolean(Boolean value) {
        this.asNeededBoolean = ((BooleanImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SITE_MEDICATIONDISPENSEDOSAG_0")
    public CodeableConcept getSite() {
        return site;
    }

    public void setSite(CodeableConcept value) {
        this.site = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROUTE_MEDICATIONDISPENSEDOSA_0")
    public CodeableConcept getRoute() {
        return route;
    }

    public void setRoute(CodeableConcept value) {
        this.route = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "METHOD__MEDICATIONDISPENSEDO_0")
    public CodeableConcept getMethod() {
        return method;
    }

    public void setMethod(CodeableConcept value) {
        this.method = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUANTITY_MEDICATIONDISPENSED_1")
    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity value) {
        this.quantity = ((QuantityImpl) value);
    }

    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RATE_MEDICATIONDISPENSEDOSAG_0")
    public Ratio getRate() {
        return rate;
    }

    public void setRate(Ratio value) {
        this.rate = ((RatioImpl) value);
    }

    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MAXDOSEPERPERIOD_MEDICATIOND_0")
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = ((RatioImpl) value);
    }

    public MedicationDispenseDosageImpl withAdditionalInstructions(CodeableConcept value) {
        setAdditionalInstructions(value);
        return this;
    }

    public MedicationDispenseDosageImpl withTimingSchedule(Schedule value) {
        setTimingSchedule(value);
        return this;
    }

    public MedicationDispenseDosageImpl withTimingPeriod(Period value) {
        setTimingPeriod(value);
        return this;
    }

    public MedicationDispenseDosageImpl withTimingDateTime(DateTime value) {
        setTimingDateTime(value);
        return this;
    }

    public MedicationDispenseDosageImpl withAsNeededCodeableConcept(CodeableConcept value) {
        setAsNeededCodeableConcept(value);
        return this;
    }

    public MedicationDispenseDosageImpl withAsNeededBoolean(Boolean value) {
        setAsNeededBoolean(value);
        return this;
    }

    public MedicationDispenseDosageImpl withSite(CodeableConcept value) {
        setSite(value);
        return this;
    }

    public MedicationDispenseDosageImpl withRoute(CodeableConcept value) {
        setRoute(value);
        return this;
    }

    public MedicationDispenseDosageImpl withMethod(CodeableConcept value) {
        setMethod(value);
        return this;
    }

    public MedicationDispenseDosageImpl withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public MedicationDispenseDosageImpl withRate(Ratio value) {
        setRate(value);
        return this;
    }

    public MedicationDispenseDosageImpl withMaxDosePerPeriod(Ratio value) {
        setMaxDosePerPeriod(value);
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationDispenseDosageImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationDispenseDosageImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationDispenseDosageImpl that = ((MedicationDispenseDosageImpl) object);
        {
            CodeableConcept lhsAdditionalInstructions;
            lhsAdditionalInstructions = this.getAdditionalInstructions();
            CodeableConcept rhsAdditionalInstructions;
            rhsAdditionalInstructions = that.getAdditionalInstructions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInstructions", lhsAdditionalInstructions), LocatorUtils.property(thatLocator, "additionalInstructions", rhsAdditionalInstructions), lhsAdditionalInstructions, rhsAdditionalInstructions)) {
                return false;
            }
        }
        {
            Schedule lhsTimingSchedule;
            lhsTimingSchedule = this.getTimingSchedule();
            Schedule rhsTimingSchedule;
            rhsTimingSchedule = that.getTimingSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingSchedule", lhsTimingSchedule), LocatorUtils.property(thatLocator, "timingSchedule", rhsTimingSchedule), lhsTimingSchedule, rhsTimingSchedule)) {
                return false;
            }
        }
        {
            Period lhsTimingPeriod;
            lhsTimingPeriod = this.getTimingPeriod();
            Period rhsTimingPeriod;
            rhsTimingPeriod = that.getTimingPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingPeriod", lhsTimingPeriod), LocatorUtils.property(thatLocator, "timingPeriod", rhsTimingPeriod), lhsTimingPeriod, rhsTimingPeriod)) {
                return false;
            }
        }
        {
            DateTime lhsTimingDateTime;
            lhsTimingDateTime = this.getTimingDateTime();
            DateTime rhsTimingDateTime;
            rhsTimingDateTime = that.getTimingDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingDateTime", lhsTimingDateTime), LocatorUtils.property(thatLocator, "timingDateTime", rhsTimingDateTime), lhsTimingDateTime, rhsTimingDateTime)) {
                return false;
            }
        }
        {
            CodeableConcept lhsAsNeededCodeableConcept;
            lhsAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            CodeableConcept rhsAsNeededCodeableConcept;
            rhsAsNeededCodeableConcept = that.getAsNeededCodeableConcept();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asNeededCodeableConcept", lhsAsNeededCodeableConcept), LocatorUtils.property(thatLocator, "asNeededCodeableConcept", rhsAsNeededCodeableConcept), lhsAsNeededCodeableConcept, rhsAsNeededCodeableConcept)) {
                return false;
            }
        }
        {
            Boolean lhsAsNeededBoolean;
            lhsAsNeededBoolean = this.getAsNeededBoolean();
            Boolean rhsAsNeededBoolean;
            rhsAsNeededBoolean = that.getAsNeededBoolean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asNeededBoolean", lhsAsNeededBoolean), LocatorUtils.property(thatLocator, "asNeededBoolean", rhsAsNeededBoolean), lhsAsNeededBoolean, rhsAsNeededBoolean)) {
                return false;
            }
        }
        {
            CodeableConcept lhsSite;
            lhsSite = this.getSite();
            CodeableConcept rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
                return false;
            }
        }
        {
            CodeableConcept lhsRoute;
            lhsRoute = this.getRoute();
            CodeableConcept rhsRoute;
            rhsRoute = that.getRoute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "route", lhsRoute), LocatorUtils.property(thatLocator, "route", rhsRoute), lhsRoute, rhsRoute)) {
                return false;
            }
        }
        {
            CodeableConcept lhsMethod;
            lhsMethod = this.getMethod();
            CodeableConcept rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod)) {
                return false;
            }
        }
        {
            Quantity lhsQuantity;
            lhsQuantity = this.getQuantity();
            Quantity rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            Ratio lhsRate;
            lhsRate = this.getRate();
            Ratio rhsRate;
            rhsRate = that.getRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate)) {
                return false;
            }
        }
        {
            Ratio lhsMaxDosePerPeriod;
            lhsMaxDosePerPeriod = this.getMaxDosePerPeriod();
            Ratio rhsMaxDosePerPeriod;
            rhsMaxDosePerPeriod = that.getMaxDosePerPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxDosePerPeriod", lhsMaxDosePerPeriod), LocatorUtils.property(thatLocator, "maxDosePerPeriod", rhsMaxDosePerPeriod), lhsMaxDosePerPeriod, rhsMaxDosePerPeriod)) {
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
            CodeableConcept theAdditionalInstructions;
            theAdditionalInstructions = this.getAdditionalInstructions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInstructions", theAdditionalInstructions), currentHashCode, theAdditionalInstructions);
        }
        {
            Schedule theTimingSchedule;
            theTimingSchedule = this.getTimingSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingSchedule", theTimingSchedule), currentHashCode, theTimingSchedule);
        }
        {
            Period theTimingPeriod;
            theTimingPeriod = this.getTimingPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingPeriod", theTimingPeriod), currentHashCode, theTimingPeriod);
        }
        {
            DateTime theTimingDateTime;
            theTimingDateTime = this.getTimingDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingDateTime", theTimingDateTime), currentHashCode, theTimingDateTime);
        }
        {
            CodeableConcept theAsNeededCodeableConcept;
            theAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asNeededCodeableConcept", theAsNeededCodeableConcept), currentHashCode, theAsNeededCodeableConcept);
        }
        {
            Boolean theAsNeededBoolean;
            theAsNeededBoolean = this.getAsNeededBoolean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asNeededBoolean", theAsNeededBoolean), currentHashCode, theAsNeededBoolean);
        }
        {
            CodeableConcept theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            CodeableConcept theRoute;
            theRoute = this.getRoute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "route", theRoute), currentHashCode, theRoute);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            Ratio theRate;
            theRate = this.getRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate);
        }
        {
            Ratio theMaxDosePerPeriod;
            theMaxDosePerPeriod = this.getMaxDosePerPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxDosePerPeriod", theMaxDosePerPeriod), currentHashCode, theMaxDosePerPeriod);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
