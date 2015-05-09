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
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.ConditionRelatedItem;
import org.hl7.fhir.model.ConditionRelationshipType;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition.RelatedItem", propOrder = {
    "type",
    "code",
    "target"
})
public class ConditionRelatedItemImpl
    extends BackboneElementImpl
    implements ConditionRelatedItem, ToString
{

    @XmlElement(required = true, type = ConditionRelationshipTypeImpl.class)
    protected ConditionRelationshipTypeImpl type;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl target;

    public ConditionRelationshipType getType() {
        return type;
    }

    public void setType(ConditionRelationshipType value) {
        this.type = ((ConditionRelationshipTypeImpl) value);
    }

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    public ResourceReference getTarget() {
        return target;
    }

    public void setTarget(ResourceReference value) {
        this.target = ((ResourceReferenceImpl) value);
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
            ConditionRelationshipType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            ResourceReference theTarget;
            theTarget = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theTarget);
        }
        return buffer;
    }

}
