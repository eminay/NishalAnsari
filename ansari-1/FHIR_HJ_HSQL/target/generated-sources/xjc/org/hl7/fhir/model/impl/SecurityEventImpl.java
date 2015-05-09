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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Narrative;
import org.hl7.fhir.model.ResourceInline;
import org.hl7.fhir.model.SecurityEvent;
import org.hl7.fhir.model.SecurityEventEvent;
import org.hl7.fhir.model.SecurityEventObject;
import org.hl7.fhir.model.SecurityEventParticipant;
import org.hl7.fhir.model.SecurityEventSource;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent", propOrder = {
    "event",
    "participants",
    "source",
    "objects"
})
@XmlRootElement(name = "SecurityEvent")
public class SecurityEventImpl
    extends ResourceImpl
    implements Serializable, SecurityEvent, Equals, HashCode
{

    @XmlElement(required = true, type = SecurityEventEventImpl.class)
    protected SecurityEventEventImpl event;
    @XmlElement(name = "participant", required = true, type = SecurityEventParticipantImpl.class)
    protected List<SecurityEventParticipant> participants;
    @XmlElement(required = true, type = SecurityEventSourceImpl.class)
    protected SecurityEventSourceImpl source;
    @XmlElement(name = "object", type = SecurityEventObjectImpl.class)
    protected List<SecurityEventObject> objects;

    @ManyToOne(targetEntity = SecurityEventEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENT_SECURITYEVENT_HJID")
    public SecurityEventEvent getEvent() {
        return event;
    }

    public void setEvent(SecurityEventEvent value) {
        this.event = ((SecurityEventEventImpl) value);
    }

    @OneToMany(targetEntity = SecurityEventParticipant.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARTICIPANTS_SECURITYEVENT_H_0")
    public List<SecurityEventParticipant> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<SecurityEventParticipant>();
        }
        return this.participants;
    }

    public void setParticipants(List<SecurityEventParticipant> participants) {
        this.participants = participants;
    }

    @ManyToOne(targetEntity = SecurityEventSource.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__SECURITYEVENT_HJID")
    public SecurityEventSource getSource() {
        return source;
    }

    public void setSource(SecurityEventSource value) {
        this.source = ((SecurityEventSourceImpl) value);
    }

    @OneToMany(targetEntity = SecurityEventObject.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OBJECTS_SECURITYEVENT_HJID")
    public List<SecurityEventObject> getObjects() {
        if (objects == null) {
            objects = new ArrayList<SecurityEventObject>();
        }
        return this.objects;
    }

    public void setObjects(List<SecurityEventObject> objects) {
        this.objects = objects;
    }

    public SecurityEventImpl withEvent(SecurityEventEvent value) {
        setEvent(value);
        return this;
    }

    public SecurityEventImpl withParticipants(SecurityEventParticipant... values) {
        if (values!= null) {
            for (SecurityEventParticipant value: values) {
                getParticipants().add(value);
            }
        }
        return this;
    }

    public SecurityEventImpl withParticipants(Collection<SecurityEventParticipant> values) {
        if (values!= null) {
            getParticipants().addAll(values);
        }
        return this;
    }

    public SecurityEventImpl withParticipants(List<SecurityEventParticipant> participants) {
        setParticipants(participants);
        return this;
    }

    public SecurityEventImpl withSource(SecurityEventSource value) {
        setSource(value);
        return this;
    }

    public SecurityEventImpl withObjects(SecurityEventObject... values) {
        if (values!= null) {
            for (SecurityEventObject value: values) {
                getObjects().add(value);
            }
        }
        return this;
    }

    public SecurityEventImpl withObjects(Collection<SecurityEventObject> values) {
        if (values!= null) {
            getObjects().addAll(values);
        }
        return this;
    }

    public SecurityEventImpl withObjects(List<SecurityEventObject> objects) {
        setObjects(objects);
        return this;
    }

    @Override
    public SecurityEventImpl withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public SecurityEventImpl withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public SecurityEventImpl withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventImpl withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventImpl withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public SecurityEventImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public SecurityEventImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SecurityEventImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecurityEventImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityEventImpl that = ((SecurityEventImpl) object);
        {
            SecurityEventEvent lhsEvent;
            lhsEvent = this.getEvent();
            SecurityEventEvent rhsEvent;
            rhsEvent = that.getEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent)) {
                return false;
            }
        }
        {
            List<SecurityEventParticipant> lhsParticipants;
            lhsParticipants = (((this.participants!= null)&&(!this.participants.isEmpty()))?this.getParticipants():null);
            List<SecurityEventParticipant> rhsParticipants;
            rhsParticipants = (((that.participants!= null)&&(!that.participants.isEmpty()))?that.getParticipants():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participants", lhsParticipants), LocatorUtils.property(thatLocator, "participants", rhsParticipants), lhsParticipants, rhsParticipants)) {
                return false;
            }
        }
        {
            SecurityEventSource lhsSource;
            lhsSource = this.getSource();
            SecurityEventSource rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            List<SecurityEventObject> lhsObjects;
            lhsObjects = (((this.objects!= null)&&(!this.objects.isEmpty()))?this.getObjects():null);
            List<SecurityEventObject> rhsObjects;
            rhsObjects = (((that.objects!= null)&&(!that.objects.isEmpty()))?that.getObjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objects", lhsObjects), LocatorUtils.property(thatLocator, "objects", rhsObjects), lhsObjects, rhsObjects)) {
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
            SecurityEventEvent theEvent;
            theEvent = this.getEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent);
        }
        {
            List<SecurityEventParticipant> theParticipants;
            theParticipants = (((this.participants!= null)&&(!this.participants.isEmpty()))?this.getParticipants():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participants", theParticipants), currentHashCode, theParticipants);
        }
        {
            SecurityEventSource theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            List<SecurityEventObject> theObjects;
            theObjects = (((this.objects!= null)&&(!this.objects.isEmpty()))?this.getObjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objects", theObjects), currentHashCode, theObjects);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
