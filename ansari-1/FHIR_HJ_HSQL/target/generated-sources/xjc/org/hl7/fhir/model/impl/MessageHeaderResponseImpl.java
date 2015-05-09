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
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Id;
import org.hl7.fhir.model.MessageHeaderResponse;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.ResponseType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader.Response", propOrder = {
    "identifier",
    "code",
    "details"
})
public class MessageHeaderResponseImpl
    extends BackboneElementImpl
    implements Serializable, MessageHeaderResponse, Equals, HashCode
{

    @XmlElement(required = true, type = IdImpl.class)
    protected IdImpl identifier;
    @XmlElement(required = true, type = ResponseTypeImpl.class)
    protected ResponseTypeImpl code;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl details;

    @ManyToOne(targetEntity = Id.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_MESSAGEHEADERRESP_0")
    public Id getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Id value) {
        this.identifier = ((IdImpl) value);
    }

    @ManyToOne(targetEntity = ResponseType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_MESSAGEHEADERRESPONSE_H_0")
    public ResponseType getCode() {
        return code;
    }

    public void setCode(ResponseType value) {
        this.code = ((ResponseTypeImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DETAILS_MESSAGEHEADERRESPONS_0")
    public ResourceReference getDetails() {
        return details;
    }

    public void setDetails(ResourceReference value) {
        this.details = ((ResourceReferenceImpl) value);
    }

    public MessageHeaderResponseImpl withIdentifier(Id value) {
        setIdentifier(value);
        return this;
    }

    public MessageHeaderResponseImpl withCode(ResponseType value) {
        setCode(value);
        return this;
    }

    public MessageHeaderResponseImpl withDetails(ResourceReference value) {
        setDetails(value);
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MessageHeaderResponseImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MessageHeaderResponseImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MessageHeaderResponseImpl that = ((MessageHeaderResponseImpl) object);
        {
            Id lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Id rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            ResponseType lhsCode;
            lhsCode = this.getCode();
            ResponseType rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
                return false;
            }
        }
        {
            ResourceReference lhsDetails;
            lhsDetails = this.getDetails();
            ResourceReference rhsDetails;
            rhsDetails = that.getDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "details", lhsDetails), LocatorUtils.property(thatLocator, "details", rhsDetails), lhsDetails, rhsDetails)) {
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
            Id theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            ResponseType theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            ResourceReference theDetails;
            theDetails = this.getDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "details", theDetails), currentHashCode, theDetails);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
