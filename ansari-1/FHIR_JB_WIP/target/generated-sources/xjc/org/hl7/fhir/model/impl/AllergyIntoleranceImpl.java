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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.AllergyIntolerance;
import org.hl7.fhir.model.Criticality;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SensitivityStatus;
import org.hl7.fhir.model.SensitivityType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllergyIntolerance", propOrder = {
    "identifiers",
    "criticality",
    "sensitivityType",
    "recordedDate",
    "status",
    "subject",
    "recorder",
    "substance",
    "reactions",
    "sensitivityTests"
})
@XmlRootElement(name = "AllergyIntolerance")
public class AllergyIntoleranceImpl
    extends ResourceImpl
    implements AllergyIntolerance, ToString
{

    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected List<Identifier> identifiers;
    @XmlElement(type = CriticalityImpl.class)
    protected CriticalityImpl criticality;
    @XmlElement(required = true, type = SensitivityTypeImpl.class)
    protected SensitivityTypeImpl sensitivityType;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl recordedDate;
    @XmlElement(required = true, type = SensitivityStatusImpl.class)
    protected SensitivityStatusImpl status;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl recorder;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl substance;
    @XmlElement(name = "reaction", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> reactions;
    @XmlElement(name = "sensitivityTest", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> sensitivityTests;

    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public Criticality getCriticality() {
        return criticality;
    }

    public void setCriticality(Criticality value) {
        this.criticality = ((CriticalityImpl) value);
    }

    public SensitivityType getSensitivityType() {
        return sensitivityType;
    }

    public void setSensitivityType(SensitivityType value) {
        this.sensitivityType = ((SensitivityTypeImpl) value);
    }

    public DateTime getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(DateTime value) {
        this.recordedDate = ((DateTimeImpl) value);
    }

    public SensitivityStatus getStatus() {
        return status;
    }

    public void setStatus(SensitivityStatus value) {
        this.status = ((SensitivityStatusImpl) value);
    }

    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getRecorder() {
        return recorder;
    }

    public void setRecorder(ResourceReference value) {
        this.recorder = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getSubstance() {
        return substance;
    }

    public void setSubstance(ResourceReference value) {
        this.substance = ((ResourceReferenceImpl) value);
    }

    public List<ResourceReference> getReactions() {
        if (reactions == null) {
            reactions = new ArrayList<ResourceReference>();
        }
        return this.reactions;
    }

    public List<ResourceReference> getSensitivityTests() {
        if (sensitivityTests == null) {
            sensitivityTests = new ArrayList<ResourceReference>();
        }
        return this.sensitivityTests;
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            Criticality theCriticality;
            theCriticality = this.getCriticality();
            strategy.appendField(locator, this, "criticality", buffer, theCriticality);
        }
        {
            SensitivityType theSensitivityType;
            theSensitivityType = this.getSensitivityType();
            strategy.appendField(locator, this, "sensitivityType", buffer, theSensitivityType);
        }
        {
            DateTime theRecordedDate;
            theRecordedDate = this.getRecordedDate();
            strategy.appendField(locator, this, "recordedDate", buffer, theRecordedDate);
        }
        {
            SensitivityStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            ResourceReference theRecorder;
            theRecorder = this.getRecorder();
            strategy.appendField(locator, this, "recorder", buffer, theRecorder);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            strategy.appendField(locator, this, "substance", buffer, theSubstance);
        }
        {
            List<ResourceReference> theReactions;
            theReactions = (((this.reactions!= null)&&(!this.reactions.isEmpty()))?this.getReactions():null);
            strategy.appendField(locator, this, "reactions", buffer, theReactions);
        }
        {
            List<ResourceReference> theSensitivityTests;
            theSensitivityTests = (((this.sensitivityTests!= null)&&(!this.sensitivityTests.isEmpty()))?this.getSensitivityTests():null);
            strategy.appendField(locator, this, "sensitivityTests", buffer, theSensitivityTests);
        }
        return buffer;
    }

}