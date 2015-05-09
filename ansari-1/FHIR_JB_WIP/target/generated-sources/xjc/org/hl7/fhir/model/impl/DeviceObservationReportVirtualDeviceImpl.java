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
import org.hl7.fhir.model.DeviceObservationReportChannel;
import org.hl7.fhir.model.DeviceObservationReportVirtualDevice;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceObservationReport.VirtualDevice", propOrder = {
    "code",
    "channels"
})
public class DeviceObservationReportVirtualDeviceImpl
    extends BackboneElementImpl
    implements DeviceObservationReportVirtualDevice, ToString
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(name = "channel", type = DeviceObservationReportChannelImpl.class)
    protected List<DeviceObservationReportChannel> channels;

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    public List<DeviceObservationReportChannel> getChannels() {
        if (channels == null) {
            channels = new ArrayList<DeviceObservationReportChannel>();
        }
        return this.channels;
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
            CodeableConcept theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            List<DeviceObservationReportChannel> theChannels;
            theChannels = (((this.channels!= null)&&(!this.channels.isEmpty()))?this.getChannels():null);
            strategy.appendField(locator, this, "channels", buffer, theChannels);
        }
        return buffer;
    }

}
