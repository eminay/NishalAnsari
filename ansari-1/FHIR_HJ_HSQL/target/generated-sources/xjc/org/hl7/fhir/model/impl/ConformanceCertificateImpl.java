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
import org.hl7.fhir.model.Base64Binary;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.ConformanceCertificate;
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
@XmlType(name = "Conformance.Certificate", propOrder = {
    "type",
    "blob"
})
public class ConformanceCertificateImpl
    extends BackboneElementImpl
    implements Serializable, ConformanceCertificate, Equals, HashCode
{

    @XmlElement(type = CodeImpl.class)
    protected CodeImpl type;
    @XmlElement(type = Base64BinaryImpl.class)
    protected Base64BinaryImpl blob;

    @ManyToOne(targetEntity = Code.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__CONFORMANCECERTIFICATE_0")
    public Code getType() {
        return type;
    }

    public void setType(Code value) {
        this.type = ((CodeImpl) value);
    }

    @ManyToOne(targetEntity = Base64Binary.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BLOB__CONFORMANCECERTIFICATE_0")
    public Base64Binary getBlob() {
        return blob;
    }

    public void setBlob(Base64Binary value) {
        this.blob = ((Base64BinaryImpl) value);
    }

    public ConformanceCertificateImpl withType(Code value) {
        setType(value);
        return this;
    }

    public ConformanceCertificateImpl withBlob(Base64Binary value) {
        setBlob(value);
        return this;
    }

    @Override
    public ConformanceCertificateImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceCertificateImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceCertificateImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConformanceCertificateImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceCertificateImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceCertificateImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConformanceCertificateImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConformanceCertificateImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConformanceCertificateImpl that = ((ConformanceCertificateImpl) object);
        {
            Code lhsType;
            lhsType = this.getType();
            Code rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            Base64Binary lhsBlob;
            lhsBlob = this.getBlob();
            Base64Binary rhsBlob;
            rhsBlob = that.getBlob();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blob", lhsBlob), LocatorUtils.property(thatLocator, "blob", rhsBlob), lhsBlob, rhsBlob)) {
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
            Code theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            Base64Binary theBlob;
            theBlob = this.getBlob();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blob", theBlob), currentHashCode, theBlob);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}