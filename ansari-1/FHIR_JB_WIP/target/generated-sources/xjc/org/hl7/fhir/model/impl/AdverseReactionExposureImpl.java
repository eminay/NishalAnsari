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
import org.hl7.fhir.model.AdverseReactionExposure;
import org.hl7.fhir.model.CausalityExpectation;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.ExposureType;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseReaction.Exposure", propOrder = {
    "date",
    "type",
    "causalityExpectation",
    "substance"
})
public class AdverseReactionExposureImpl
    extends BackboneElementImpl
    implements AdverseReactionExposure, ToString
{

    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(type = ExposureTypeImpl.class)
    protected ExposureTypeImpl type;
    @XmlElement(type = CausalityExpectationImpl.class)
    protected CausalityExpectationImpl causalityExpectation;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl substance;

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    public ExposureType getType() {
        return type;
    }

    public void setType(ExposureType value) {
        this.type = ((ExposureTypeImpl) value);
    }

    public CausalityExpectation getCausalityExpectation() {
        return causalityExpectation;
    }

    public void setCausalityExpectation(CausalityExpectation value) {
        this.causalityExpectation = ((CausalityExpectationImpl) value);
    }

    public ResourceReference getSubstance() {
        return substance;
    }

    public void setSubstance(ResourceReference value) {
        this.substance = ((ResourceReferenceImpl) value);
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
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ExposureType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            CausalityExpectation theCausalityExpectation;
            theCausalityExpectation = this.getCausalityExpectation();
            strategy.appendField(locator, this, "causalityExpectation", buffer, theCausalityExpectation);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            strategy.appendField(locator, this, "substance", buffer, theSubstance);
        }
        return buffer;
    }

}
