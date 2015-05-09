//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DeviceObservationReportChannel;
import org.hl7.fhir.model.DeviceObservationReportVirtualDevice;
import org.hl7.fhir.model.Extension;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceObservationReport.VirtualDevice", propOrder = {
    "code",
    "channels"
})
public class DeviceObservationReportVirtualDeviceImpl
    extends BackboneElementImpl
    implements Serializable, DeviceObservationReportVirtualDevice, Equals, HashCode
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(name = "channel", type = DeviceObservationReportChannelImpl.class)
    protected List<DeviceObservationReportChannel> channels;

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_DEVICEOBSERVATIONREPORT_0")
    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    @OneToMany(targetEntity = DeviceObservationReportChannel.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CHANNELS_DEVICEOBSERVATIONRE_0")
    public List<DeviceObservationReportChannel> getChannels() {
        if (channels == null) {
            channels = new ArrayList<DeviceObservationReportChannel>();
        }
        return this.channels;
    }

    public void setChannels(List<DeviceObservationReportChannel> channels) {
        this.channels = channels;
    }

    public DeviceObservationReportVirtualDeviceImpl withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public DeviceObservationReportVirtualDeviceImpl withChannels(DeviceObservationReportChannel... values) {
        if (values!= null) {
            for (DeviceObservationReportChannel value: values) {
                getChannels().add(value);
            }
        }
        return this;
    }

    public DeviceObservationReportVirtualDeviceImpl withChannels(Collection<DeviceObservationReportChannel> values) {
        if (values!= null) {
            getChannels().addAll(values);
        }
        return this;
    }

    public DeviceObservationReportVirtualDeviceImpl withChannels(List<DeviceObservationReportChannel> channels) {
        setChannels(channels);
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public DeviceObservationReportVirtualDeviceImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeviceObservationReportVirtualDeviceImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DeviceObservationReportVirtualDeviceImpl that = ((DeviceObservationReportVirtualDeviceImpl) object);
        {
            CodeableConcept lhsCode;
            lhsCode = this.getCode();
            CodeableConcept rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            List<DeviceObservationReportChannel> lhsChannels;
            lhsChannels = (((this.channels!= null)&&(!this.channels.isEmpty()))?this.getChannels():null);
            List<DeviceObservationReportChannel> rhsChannels;
            rhsChannels = (((that.channels!= null)&&(!that.channels.isEmpty()))?that.getChannels():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channels", lhsChannels), LocatorUtils.property(thatLocator, "channels", rhsChannels), lhsChannels, rhsChannels)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            List<DeviceObservationReportChannel> theChannels;
            theChannels = (((this.channels!= null)&&(!this.channels.isEmpty()))?this.getChannels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channels", theChannels), currentHashCode, theChannels);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
