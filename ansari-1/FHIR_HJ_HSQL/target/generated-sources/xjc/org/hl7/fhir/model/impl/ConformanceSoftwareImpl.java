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
import org.hl7.fhir.model.ConformanceSoftware;
import org.hl7.fhir.model.DateTime;
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
@XmlType(name = "Conformance.Software", propOrder = {
    "name",
    "version",
    "releaseDate"
})
public class ConformanceSoftwareImpl
    extends BackboneElementImpl
    implements Serializable, ConformanceSoftware, Equals, HashCode
{

    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(type = StringImpl.class)
    protected StringImpl version;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl releaseDate;

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__CONFORMANCESOFTWARE_HJ_0")
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VERSION__CONFORMANCESOFTWARE_0")
    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RELEASEDATE_CONFORMANCESOFTW_0")
    public DateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(DateTime value) {
        this.releaseDate = ((DateTimeImpl) value);
    }

    public ConformanceSoftwareImpl withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public ConformanceSoftwareImpl withVersion(org.hl7.fhir.model.String value) {
        setVersion(value);
        return this;
    }

    public ConformanceSoftwareImpl withReleaseDate(DateTime value) {
        setReleaseDate(value);
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConformanceSoftwareImpl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConformanceSoftwareImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConformanceSoftwareImpl that = ((ConformanceSoftwareImpl) object);
        {
            org.hl7.fhir.model.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.model.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsVersion;
            lhsVersion = this.getVersion();
            org.hl7.fhir.model.String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            DateTime lhsReleaseDate;
            lhsReleaseDate = this.getReleaseDate();
            DateTime rhsReleaseDate;
            rhsReleaseDate = that.getReleaseDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseDate", lhsReleaseDate), LocatorUtils.property(thatLocator, "releaseDate", rhsReleaseDate), lhsReleaseDate, rhsReleaseDate)) {
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
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            DateTime theReleaseDate;
            theReleaseDate = this.getReleaseDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseDate", theReleaseDate), currentHashCode, theReleaseDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}