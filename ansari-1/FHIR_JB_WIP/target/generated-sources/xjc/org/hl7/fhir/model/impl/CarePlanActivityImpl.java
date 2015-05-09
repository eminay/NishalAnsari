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
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CarePlanActivity;
import org.hl7.fhir.model.CarePlanActivityStatus;
import org.hl7.fhir.model.CarePlanSimple;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Activity", propOrder = {
    "goals",
    "status",
    "prohibited",
    "actionResultings",
    "notes",
    "detail",
    "simple"
})
public class CarePlanActivityImpl
    extends BackboneElementImpl
    implements CarePlanActivity, ToString
{

    @XmlElement(name = "goal")
    protected List<java.lang.String> goals;
    @XmlElement(type = CarePlanActivityStatusImpl.class)
    protected CarePlanActivityStatusImpl status;
    @XmlElement(required = true, type = BooleanImpl.class)
    protected BooleanImpl prohibited;
    @XmlElement(name = "actionResulting", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> actionResultings;
    @XmlElement(type = StringImpl.class)
    protected StringImpl notes;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl detail;
    @XmlElement(type = CarePlanSimpleImpl.class)
    protected CarePlanSimpleImpl simple;

    public List<java.lang.String> getGoals() {
        if (goals == null) {
            goals = new ArrayList<java.lang.String>();
        }
        return this.goals;
    }

    public CarePlanActivityStatus getStatus() {
        return status;
    }

    public void setStatus(CarePlanActivityStatus value) {
        this.status = ((CarePlanActivityStatusImpl) value);
    }

    public Boolean getProhibited() {
        return prohibited;
    }

    public void setProhibited(Boolean value) {
        this.prohibited = ((BooleanImpl) value);
    }

    public List<ResourceReference> getActionResultings() {
        if (actionResultings == null) {
            actionResultings = new ArrayList<ResourceReference>();
        }
        return this.actionResultings;
    }

    public org.hl7.fhir.model.String getNotes() {
        return notes;
    }

    public void setNotes(org.hl7.fhir.model.String value) {
        this.notes = ((StringImpl) value);
    }

    public ResourceReference getDetail() {
        return detail;
    }

    public void setDetail(ResourceReference value) {
        this.detail = ((ResourceReferenceImpl) value);
    }

    public CarePlanSimple getSimple() {
        return simple;
    }

    public void setSimple(CarePlanSimple value) {
        this.simple = ((CarePlanSimpleImpl) value);
    }

    public java.lang.String toString() {
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
            List<java.lang.String> theGoals;
            theGoals = (((this.goals!= null)&&(!this.goals.isEmpty()))?this.getGoals():null);
            strategy.appendField(locator, this, "goals", buffer, theGoals);
        }
        {
            CarePlanActivityStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Boolean theProhibited;
            theProhibited = this.getProhibited();
            strategy.appendField(locator, this, "prohibited", buffer, theProhibited);
        }
        {
            List<ResourceReference> theActionResultings;
            theActionResultings = (((this.actionResultings!= null)&&(!this.actionResultings.isEmpty()))?this.getActionResultings():null);
            strategy.appendField(locator, this, "actionResultings", buffer, theActionResultings);
        }
        {
            org.hl7.fhir.model.String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        {
            ResourceReference theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail);
        }
        {
            CarePlanSimple theSimple;
            theSimple = this.getSimple();
            strategy.appendField(locator, this, "simple", buffer, theSimple);
        }
        return buffer;
    }

}