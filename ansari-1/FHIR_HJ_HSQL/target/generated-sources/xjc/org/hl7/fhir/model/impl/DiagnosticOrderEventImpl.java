//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.DiagnosticOrderEvent;
import org.hl7.fhir.model.DiagnosticOrderStatus;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticOrder.Event", propOrder = {
    "status",
    "description",
    "dateTime",
    "actor"
})
public class DiagnosticOrderEventImpl
    extends BackboneElementImpl
    implements Serializable, DiagnosticOrderEvent, Equals, HashCode
{

    @XmlElement(required = true, type = DiagnosticOrderStatusImpl.class)
    protected DiagnosticOrderStatusImpl status;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl description;
    @XmlElement(required = true, type = DateTimeImpl.class)
    protected DateTimeImpl dateTime;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl actor;

    @ManyToOne(targetEntity = DiagnosticOrderStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_DIAGNOSTICORDEREVENT__0")
    public DiagnosticOrderStatus getStatus() {
        return status;
    }

    public void setStatus(DiagnosticOrderStatus value) {
        this.status = ((DiagnosticOrderStatusImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_DIAGNOSTICORDERE_0")
    public CodeableConcept getDescription() {
        return description;
    }

    public void setDescription(CodeableConcept value) {
        this.description = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATETIME_DIAGNOSTICORDEREVEN_0")
    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime value) {
        this.dateTime = ((DateTimeImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACTOR_DIAGNOSTICORDEREVENT_H_0")
    public ResourceReference getActor() {
        return actor;
    }

    public void setActor(ResourceReference value) {
        this.actor = ((ResourceReferenceImpl) value);
    }

    public DiagnosticOrderEventImpl withStatus(DiagnosticOrderStatus value) {
        setStatus(value);
        return this;
    }

    public DiagnosticOrderEventImpl withDescription(CodeableConcept value) {
        setDescription(value);
        return this;
    }

    public DiagnosticOrderEventImpl withDateTime(DateTime value) {
        setDateTime(value);
        return this;
    }

    public DiagnosticOrderEventImpl withActor(ResourceReference value) {
        setActor(value);
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public DiagnosticOrderEventImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DiagnosticOrderEventImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DiagnosticOrderEventImpl that = ((DiagnosticOrderEventImpl) object);
        {
            DiagnosticOrderStatus lhsStatus;
            lhsStatus = this.getStatus();
            DiagnosticOrderStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            CodeableConcept lhsDescription;
            lhsDescription = this.getDescription();
            CodeableConcept rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            DateTime lhsDateTime;
            lhsDateTime = this.getDateTime();
            DateTime rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime)) {
                return false;
            }
        }
        {
            ResourceReference lhsActor;
            lhsActor = this.getActor();
            ResourceReference rhsActor;
            rhsActor = that.getActor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actor", lhsActor), LocatorUtils.property(thatLocator, "actor", rhsActor), lhsActor, rhsActor)) {
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
            DiagnosticOrderStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            CodeableConcept theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            DateTime theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime);
        }
        {
            ResourceReference theActor;
            theActor = this.getActor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actor", theActor), currentHashCode, theActor);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}