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
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.ImmunizationRecommendationDateCriterion;
import org.hl7.fhir.model.ImmunizationRecommendationProtocol;
import org.hl7.fhir.model.ImmunizationRecommendationRecommendation;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmunizationRecommendation.Recommendation", propOrder = {
    "date",
    "vaccineType",
    "doseNumber",
    "forecastStatus",
    "dateCriterions",
    "protocol",
    "supportingImmunizations",
    "supportingPatientInformations"
})
public class ImmunizationRecommendationRecommendationImpl
    extends BackboneElementImpl
    implements ImmunizationRecommendationRecommendation, ToString
{

    @XmlElement(required = true, type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl vaccineType;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl doseNumber;
    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl forecastStatus;
    @XmlElement(name = "dateCriterion", type = ImmunizationRecommendationDateCriterionImpl.class)
    protected List<ImmunizationRecommendationDateCriterion> dateCriterions;
    @XmlElement(type = ImmunizationRecommendationProtocolImpl.class)
    protected ImmunizationRecommendationProtocolImpl protocol;
    @XmlElement(name = "supportingImmunization", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> supportingImmunizations;
    @XmlElement(name = "supportingPatientInformation", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> supportingPatientInformations;

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    public CodeableConcept getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(CodeableConcept value) {
        this.vaccineType = ((CodeableConceptImpl) value);
    }

    public Integer getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(Integer value) {
        this.doseNumber = ((IntegerImpl) value);
    }

    public CodeableConcept getForecastStatus() {
        return forecastStatus;
    }

    public void setForecastStatus(CodeableConcept value) {
        this.forecastStatus = ((CodeableConceptImpl) value);
    }

    public List<ImmunizationRecommendationDateCriterion> getDateCriterions() {
        if (dateCriterions == null) {
            dateCriterions = new ArrayList<ImmunizationRecommendationDateCriterion>();
        }
        return this.dateCriterions;
    }

    public ImmunizationRecommendationProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(ImmunizationRecommendationProtocol value) {
        this.protocol = ((ImmunizationRecommendationProtocolImpl) value);
    }

    public List<ResourceReference> getSupportingImmunizations() {
        if (supportingImmunizations == null) {
            supportingImmunizations = new ArrayList<ResourceReference>();
        }
        return this.supportingImmunizations;
    }

    public List<ResourceReference> getSupportingPatientInformations() {
        if (supportingPatientInformations == null) {
            supportingPatientInformations = new ArrayList<ResourceReference>();
        }
        return this.supportingPatientInformations;
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
            CodeableConcept theVaccineType;
            theVaccineType = this.getVaccineType();
            strategy.appendField(locator, this, "vaccineType", buffer, theVaccineType);
        }
        {
            Integer theDoseNumber;
            theDoseNumber = this.getDoseNumber();
            strategy.appendField(locator, this, "doseNumber", buffer, theDoseNumber);
        }
        {
            CodeableConcept theForecastStatus;
            theForecastStatus = this.getForecastStatus();
            strategy.appendField(locator, this, "forecastStatus", buffer, theForecastStatus);
        }
        {
            List<ImmunizationRecommendationDateCriterion> theDateCriterions;
            theDateCriterions = (((this.dateCriterions!= null)&&(!this.dateCriterions.isEmpty()))?this.getDateCriterions():null);
            strategy.appendField(locator, this, "dateCriterions", buffer, theDateCriterions);
        }
        {
            ImmunizationRecommendationProtocol theProtocol;
            theProtocol = this.getProtocol();
            strategy.appendField(locator, this, "protocol", buffer, theProtocol);
        }
        {
            List<ResourceReference> theSupportingImmunizations;
            theSupportingImmunizations = (((this.supportingImmunizations!= null)&&(!this.supportingImmunizations.isEmpty()))?this.getSupportingImmunizations():null);
            strategy.appendField(locator, this, "supportingImmunizations", buffer, theSupportingImmunizations);
        }
        {
            List<ResourceReference> theSupportingPatientInformations;
            theSupportingPatientInformations = (((this.supportingPatientInformations!= null)&&(!this.supportingPatientInformations.isEmpty()))?this.getSupportingPatientInformations():null);
            strategy.appendField(locator, this, "supportingPatientInformations", buffer, theSupportingPatientInformations);
        }
        return buffer;
    }

}
