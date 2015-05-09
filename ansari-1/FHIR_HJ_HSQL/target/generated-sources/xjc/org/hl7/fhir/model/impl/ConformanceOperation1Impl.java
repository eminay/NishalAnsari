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
import org.hl7.fhir.model.ConformanceOperation1;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.RestfulOperationSystem;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Operation1", propOrder = {
    "code",
    "documentation"
})
public class ConformanceOperation1Impl
    extends BackboneElementImpl
    implements Serializable, ConformanceOperation1, Equals, HashCode
{

    @XmlElement(required = true, type = RestfulOperationSystemImpl.class)
    protected RestfulOperationSystemImpl code;
    @XmlElement(type = StringImpl.class)
    protected StringImpl documentation;

    @ManyToOne(targetEntity = RestfulOperationSystem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_CONFORMANCEOPERATION1_H_0")
    public RestfulOperationSystem getCode() {
        return code;
    }

    public void setCode(RestfulOperationSystem value) {
        this.code = ((RestfulOperationSystemImpl) value);
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOCUMENTATION_CONFORMANCEOPE_0")
    public org.hl7.fhir.model.String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(org.hl7.fhir.model.String value) {
        this.documentation = ((StringImpl) value);
    }

    public ConformanceOperation1Impl withCode(RestfulOperationSystem value) {
        setCode(value);
        return this;
    }

    public ConformanceOperation1Impl withDocumentation(org.hl7.fhir.model.String value) {
        setDocumentation(value);
        return this;
    }

    @Override
    public ConformanceOperation1Impl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceOperation1Impl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceOperation1Impl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ConformanceOperation1Impl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ConformanceOperation1Impl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ConformanceOperation1Impl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ConformanceOperation1Impl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ConformanceOperation1Impl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConformanceOperation1Impl that = ((ConformanceOperation1Impl) object);
        {
            RestfulOperationSystem lhsCode;
            lhsCode = this.getCode();
            RestfulOperationSystem rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDocumentation;
            lhsDocumentation = this.getDocumentation();
            org.hl7.fhir.model.String rhsDocumentation;
            rhsDocumentation = that.getDocumentation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentation", lhsDocumentation), LocatorUtils.property(thatLocator, "documentation", rhsDocumentation), lhsDocumentation, rhsDocumentation)) {
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
            RestfulOperationSystem theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentation", theDocumentation), currentHashCode, theDocumentation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}