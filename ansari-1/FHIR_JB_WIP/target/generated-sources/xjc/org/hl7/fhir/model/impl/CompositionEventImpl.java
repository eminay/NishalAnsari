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
import org.hl7.fhir.model.CompositionEvent;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composition.Event", propOrder = {
    "codes",
    "period",
    "details"
})
public class CompositionEventImpl
    extends BackboneElementImpl
    implements CompositionEvent, ToString
{

    @XmlElement(name = "code", type = CodeableConceptImpl.class)
    protected List<CodeableConcept> codes;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl period;
    @XmlElement(name = "detail", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> details;

    public List<CodeableConcept> getCodes() {
        if (codes == null) {
            codes = new ArrayList<CodeableConcept>();
        }
        return this.codes;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period value) {
        this.period = ((PeriodImpl) value);
    }

    public List<ResourceReference> getDetails() {
        if (details == null) {
            details = new ArrayList<ResourceReference>();
        }
        return this.details;
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
            List<CodeableConcept> theCodes;
            theCodes = (((this.codes!= null)&&(!this.codes.isEmpty()))?this.getCodes():null);
            strategy.appendField(locator, this, "codes", buffer, theCodes);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        {
            List<ResourceReference> theDetails;
            theDetails = (((this.details!= null)&&(!this.details.isEmpty()))?this.getDetails():null);
            strategy.appendField(locator, this, "details", buffer, theDetails);
        }
        return buffer;
    }

}
