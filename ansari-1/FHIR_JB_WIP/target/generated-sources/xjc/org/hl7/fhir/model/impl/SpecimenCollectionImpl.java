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
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SpecimenCollection;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen.Collection", propOrder = {
    "collector",
    "comments",
    "collectedPeriod",
    "collectedDateTime",
    "quantity",
    "method",
    "sourceSite"
})
public class SpecimenCollectionImpl
    extends BackboneElementImpl
    implements SpecimenCollection, ToString
{

    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl collector;
    @XmlElement(name = "comment", type = StringImpl.class)
    protected List<org.hl7.fhir.model.String> comments;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl collectedPeriod;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl collectedDateTime;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl quantity;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl method;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl sourceSite;

    public ResourceReference getCollector() {
        return collector;
    }

    public void setCollector(ResourceReference value) {
        this.collector = ((ResourceReferenceImpl) value);
    }

    public List<org.hl7.fhir.model.String> getComments() {
        if (comments == null) {
            comments = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.comments;
    }

    public Period getCollectedPeriod() {
        return collectedPeriod;
    }

    public void setCollectedPeriod(Period value) {
        this.collectedPeriod = ((PeriodImpl) value);
    }

    public DateTime getCollectedDateTime() {
        return collectedDateTime;
    }

    public void setCollectedDateTime(DateTime value) {
        this.collectedDateTime = ((DateTimeImpl) value);
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity value) {
        this.quantity = ((QuantityImpl) value);
    }

    public CodeableConcept getMethod() {
        return method;
    }

    public void setMethod(CodeableConcept value) {
        this.method = ((CodeableConceptImpl) value);
    }

    public CodeableConcept getSourceSite() {
        return sourceSite;
    }

    public void setSourceSite(CodeableConcept value) {
        this.sourceSite = ((CodeableConceptImpl) value);
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
            ResourceReference theCollector;
            theCollector = this.getCollector();
            strategy.appendField(locator, this, "collector", buffer, theCollector);
        }
        {
            List<org.hl7.fhir.model.String> theComments;
            theComments = (((this.comments!= null)&&(!this.comments.isEmpty()))?this.getComments():null);
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            Period theCollectedPeriod;
            theCollectedPeriod = this.getCollectedPeriod();
            strategy.appendField(locator, this, "collectedPeriod", buffer, theCollectedPeriod);
        }
        {
            DateTime theCollectedDateTime;
            theCollectedDateTime = this.getCollectedDateTime();
            strategy.appendField(locator, this, "collectedDateTime", buffer, theCollectedDateTime);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theMethod);
        }
        {
            CodeableConcept theSourceSite;
            theSourceSite = this.getSourceSite();
            strategy.appendField(locator, this, "sourceSite", buffer, theSourceSite);
        }
        return buffer;
    }

}