//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Decimal;
import org.hl7.fhir.model.EventTiming;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.ScheduleRepeat;
import org.hl7.fhir.model.UnitsOfTime;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule.Repeat", propOrder = {
    "frequency",
    "when",
    "duration",
    "units",
    "count",
    "end"
})
public class ScheduleRepeatImpl
    extends ElementImpl
    implements ScheduleRepeat, ToString
{

    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl frequency;
    @XmlElement(type = EventTimingImpl.class)
    protected EventTimingImpl when;
    @XmlElement(required = true, type = DecimalImpl.class)
    protected DecimalImpl duration;
    @XmlElement(required = true, type = UnitsOfTimeImpl.class)
    protected UnitsOfTimeImpl units;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl count;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl end;

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer value) {
        this.frequency = ((IntegerImpl) value);
    }

    public EventTiming getWhen() {
        return when;
    }

    public void setWhen(EventTiming value) {
        this.when = ((EventTimingImpl) value);
    }

    public Decimal getDuration() {
        return duration;
    }

    public void setDuration(Decimal value) {
        this.duration = ((DecimalImpl) value);
    }

    public UnitsOfTime getUnits() {
        return units;
    }

    public void setUnits(UnitsOfTime value) {
        this.units = ((UnitsOfTimeImpl) value);
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer value) {
        this.count = ((IntegerImpl) value);
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime value) {
        this.end = ((DateTimeImpl) value);
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
            Integer theFrequency;
            theFrequency = this.getFrequency();
            strategy.appendField(locator, this, "frequency", buffer, theFrequency);
        }
        {
            EventTiming theWhen;
            theWhen = this.getWhen();
            strategy.appendField(locator, this, "when", buffer, theWhen);
        }
        {
            Decimal theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            UnitsOfTime theUnits;
            theUnits = this.getUnits();
            strategy.appendField(locator, this, "units", buffer, theUnits);
        }
        {
            Integer theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount);
        }
        {
            DateTime theEnd;
            theEnd = this.getEnd();
            strategy.appendField(locator, this, "end", buffer, theEnd);
        }
        return buffer;
    }

}
