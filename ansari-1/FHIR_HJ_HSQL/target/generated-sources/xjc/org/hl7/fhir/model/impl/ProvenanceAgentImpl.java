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
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ProvenanceAgent;
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
@XmlType(name = "Provenance.Agent", propOrder = {
    "role",
    "type",
    "reference",
    "display"
})
public class ProvenanceAgentImpl
    extends BackboneElementImpl
    implements Serializable, ProvenanceAgent, Equals, HashCode
{

    @XmlElement(required = true, type = CodingImpl.class)
    protected CodingImpl role;
    @XmlElement(required = true, type = CodingImpl.class)
    protected CodingImpl type;
    @XmlElement(required = true, type = UriImpl.class)
    protected UriImpl reference;
    @XmlElement(type = StringImpl.class)
    protected StringImpl display;

    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROLE__PROVENANCEAGENT_HJID")
    public Coding getRole() {
        return role;
    }

    public void setRole(Coding value) {
        this.role = ((CodingImpl) value);
    }

    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__PROVENANCEAGENT_HJID")
    public Coding getType() {
        return type;
    }

    public void setType(Coding value) {
        this.type = ((CodingImpl) value);
    }

    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REFERENCE_PROVENANCEAGENT_HJ_0")
    public Uri getReference() {
        return reference;
    }

    public void setReference(Uri value) {
        this.reference = ((UriImpl) value);
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DISPLAY_PROVENANCEAGENT_HJID")
    public org.hl7.fhir.model.String getDisplay() {
        return display;
    }

    public void setDisplay(org.hl7.fhir.model.String value) {
        this.display = ((StringImpl) value);
    }

    public ProvenanceAgentImpl withRole(Coding value) {
        setRole(value);
        return this;
    }

    public ProvenanceAgentImpl withType(Coding value) {
        setType(value);
        return this;
    }

    public ProvenanceAgentImpl withReference(Uri value) {
        setReference(value);
        return this;
    }

    public ProvenanceAgentImpl withDisplay(org.hl7.fhir.model.String value) {
        setDisplay(value);
        return this;
    }

    @Override
    public ProvenanceAgentImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProvenanceAgentImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProvenanceAgentImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ProvenanceAgentImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ProvenanceAgentImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ProvenanceAgentImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ProvenanceAgentImpl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProvenanceAgentImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ProvenanceAgentImpl that = ((ProvenanceAgentImpl) object);
        {
            Coding lhsRole;
            lhsRole = this.getRole();
            Coding rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            Coding lhsType;
            lhsType = this.getType();
            Coding rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            Uri lhsReference;
            lhsReference = this.getReference();
            Uri rhsReference;
            rhsReference = that.getReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Coding theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            Coding theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            Uri theReference;
            theReference = this.getReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference);
        }
        {
            org.hl7.fhir.model.String theDisplay;
            theDisplay = this.getDisplay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "display", theDisplay), currentHashCode, theDisplay);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}