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
import org.hl7.fhir.model.DocumentReferenceParameter;
import org.hl7.fhir.model.DocumentReferenceService;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference.Service", propOrder = {
    "type",
    "address",
    "parameters"
})
public class DocumentReferenceServiceImpl
    extends BackboneElementImpl
    implements DocumentReferenceService, ToString
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = StringImpl.class)
    protected StringImpl address;
    @XmlElement(name = "parameter", type = DocumentReferenceParameterImpl.class)
    protected List<DocumentReferenceParameter> parameters;

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public org.hl7.fhir.model.String getAddress() {
        return address;
    }

    public void setAddress(org.hl7.fhir.model.String value) {
        this.address = ((StringImpl) value);
    }

    public List<DocumentReferenceParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<DocumentReferenceParameter>();
        }
        return this.parameters;
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
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            List<DocumentReferenceParameter> theParameters;
            theParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            strategy.appendField(locator, this, "parameters", buffer, theParameters);
        }
        return buffer;
    }

}
