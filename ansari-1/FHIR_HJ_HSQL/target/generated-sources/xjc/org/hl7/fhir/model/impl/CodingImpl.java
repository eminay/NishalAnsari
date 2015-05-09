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
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coding", propOrder = {
    "system",
    "version",
    "code",
    "display",
    "primary",
    "valueSet"
})
public class CodingImpl
    extends ElementImpl
    implements Serializable, Coding, Equals, HashCode
{

    @XmlElement(type = UriImpl.class)
    protected UriImpl system;
    @XmlElement(type = StringImpl.class)
    protected StringImpl version;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl code;
    @XmlElement(type = StringImpl.class)
    protected StringImpl display;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl primary;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl valueSet;

    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SYSTEM__CODING_HJID")
    public Uri getSystem() {
        return system;
    }

    public void setSystem(Uri value) {
        this.system = ((UriImpl) value);
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VERSION__CODING_HJID")
    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_CODING_HJID")
    public Code getCode() {
        return code;
    }

    public void setCode(Code value) {
        this.code = ((CodeImpl) value);
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DISPLAY_CODING_HJID")
    public org.hl7.fhir.model.String getDisplay() {
        return display;
    }

    public void setDisplay(org.hl7.fhir.model.String value) {
        this.display = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRIMARY__CODING_HJID")
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean value) {
        this.primary = ((BooleanImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VALUESET_CODING_HJID")
    public ResourceReference getValueSet() {
        return valueSet;
    }

    public void setValueSet(ResourceReference value) {
        this.valueSet = ((ResourceReferenceImpl) value);
    }

    public CodingImpl withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    public CodingImpl withVersion(org.hl7.fhir.model.String value) {
        setVersion(value);
        return this;
    }

    public CodingImpl withCode(Code value) {
        setCode(value);
        return this;
    }

    public CodingImpl withDisplay(org.hl7.fhir.model.String value) {
        setDisplay(value);
        return this;
    }

    public CodingImpl withPrimary(Boolean value) {
        setPrimary(value);
        return this;
    }

    public CodingImpl withValueSet(ResourceReference value) {
        setValueSet(value);
        return this;
    }

    @Override
    public CodingImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CodingImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CodingImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public CodingImpl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CodingImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CodingImpl that = ((CodingImpl) object);
        {
            Uri lhsSystem;
            lhsSystem = this.getSystem();
            Uri rhsSystem;
            rhsSystem = that.getSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "system", lhsSystem), LocatorUtils.property(thatLocator, "system", rhsSystem), lhsSystem, rhsSystem)) {
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
            Code lhsCode;
            lhsCode = this.getCode();
            Code rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDisplay;
            lhsDisplay = this.getDisplay();
            org.hl7.fhir.model.String rhsDisplay;
            rhsDisplay = that.getDisplay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay)) {
                return false;
            }
        }
        {
            Boolean lhsPrimary;
            lhsPrimary = this.getPrimary();
            Boolean rhsPrimary;
            rhsPrimary = that.getPrimary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primary", lhsPrimary), LocatorUtils.property(thatLocator, "primary", rhsPrimary), lhsPrimary, rhsPrimary)) {
                return false;
            }
        }
        {
            ResourceReference lhsValueSet;
            lhsValueSet = this.getValueSet();
            ResourceReference rhsValueSet;
            rhsValueSet = that.getValueSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueSet", lhsValueSet), LocatorUtils.property(thatLocator, "valueSet", rhsValueSet), lhsValueSet, rhsValueSet)) {
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
            Uri theSystem;
            theSystem = this.getSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "system", theSystem), currentHashCode, theSystem);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            Code theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            org.hl7.fhir.model.String theDisplay;
            theDisplay = this.getDisplay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "display", theDisplay), currentHashCode, theDisplay);
        }
        {
            Boolean thePrimary;
            thePrimary = this.getPrimary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primary", thePrimary), currentHashCode, thePrimary);
        }
        {
            ResourceReference theValueSet;
            theValueSet = this.getValueSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueSet", theValueSet), currentHashCode, theValueSet);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
