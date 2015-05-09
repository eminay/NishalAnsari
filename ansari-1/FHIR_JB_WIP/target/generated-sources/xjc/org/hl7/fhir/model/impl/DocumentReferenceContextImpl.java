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
import org.hl7.fhir.model.DocumentReferenceContext;
import org.hl7.fhir.model.Period;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference.Context", propOrder = {
    "events",
    "period",
    "facilityType"
})
public class DocumentReferenceContextImpl
    extends BackboneElementImpl
    implements DocumentReferenceContext, ToString
{

    @XmlElement(name = "event", type = CodeableConceptImpl.class)
    protected List<CodeableConcept> events;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl period;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl facilityType;

    public List<CodeableConcept> getEvents() {
        if (events == null) {
            events = new ArrayList<CodeableConcept>();
        }
        return this.events;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period value) {
        this.period = ((PeriodImpl) value);
    }

    public CodeableConcept getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(CodeableConcept value) {
        this.facilityType = ((CodeableConceptImpl) value);
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
            List<CodeableConcept> theEvents;
            theEvents = (((this.events!= null)&&(!this.events.isEmpty()))?this.getEvents():null);
            strategy.appendField(locator, this, "events", buffer, theEvents);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        {
            CodeableConcept theFacilityType;
            theFacilityType = this.getFacilityType();
            strategy.appendField(locator, this, "facilityType", buffer, theFacilityType);
        }
        return buffer;
    }

}