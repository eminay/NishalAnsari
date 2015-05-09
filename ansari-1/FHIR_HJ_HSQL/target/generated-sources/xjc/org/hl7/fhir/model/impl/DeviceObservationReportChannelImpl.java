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
import org.hl7.fhir.model.DeviceObservationReportMetric;
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
@XmlType(name = "DeviceObservationReport.Channel", propOrder = {
    "code",
    "metrics"
})
public class DeviceObservationReportChannelImpl
    extends BackboneElementImpl
    implements Serializable, DeviceObservationReportChannel, Equals, HashCode
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(name = "metric", type = DeviceObservationReportMetricImpl.class)
    protected List<DeviceObservationReportMetric> metrics;

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_DEVICEOBSERVATIONREPORT_1")
    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    @OneToMany(targetEntity = DeviceObservationReportMetric.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "METRICS_DEVICEOBSERVATIONREP_0")
    public List<DeviceObservationReportMetric> getMetrics() {
        if (metrics == null) {
            metrics = new ArrayList<DeviceObservationReportMetric>();
        }
        return this.metrics;
    }

    public void setMetrics(List<DeviceObservationReportMetric> metrics) {
        this.metrics = metrics;
    }

    public DeviceObservationReportChannelImpl withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public DeviceObservationReportChannelImpl withMetrics(DeviceObservationReportMetric... values) {
        if (values!= null) {
            for (DeviceObservationReportMetric value: values) {
                getMetrics().add(value);
            }
        }
        return this;
    }

    public DeviceObservationReportChannelImpl withMetrics(Collection<DeviceObservationReportMetric> values) {
        if (values!= null) {
            getMetrics().addAll(values);
        }
        return this;
    }

    public DeviceObservationReportChannelImpl withMetrics(List<DeviceObservationReportMetric> metrics) {
        setMetrics(metrics);
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public DeviceObservationReportChannelImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeviceObservationReportChannelImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DeviceObservationReportChannelImpl that = ((DeviceObservationReportChannelImpl) object);
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
            List<DeviceObservationReportMetric> lhsMetrics;
            lhsMetrics = (((this.metrics!= null)&&(!this.metrics.isEmpty()))?this.getMetrics():null);
            List<DeviceObservationReportMetric> rhsMetrics;
            rhsMetrics = (((that.metrics!= null)&&(!that.metrics.isEmpty()))?that.getMetrics():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "metrics", lhsMetrics), LocatorUtils.property(thatLocator, "metrics", rhsMetrics), lhsMetrics, rhsMetrics)) {
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
            List<DeviceObservationReportMetric> theMetrics;
            theMetrics = (((this.metrics!= null)&&(!this.metrics.isEmpty()))?this.getMetrics():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "metrics", theMetrics), currentHashCode, theMetrics);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
