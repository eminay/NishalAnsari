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
import org.hl7.fhir.model.AdverseReactionSymptom;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ReactionSeverity;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdverseReaction.Symptom", propOrder = {
    "code",
    "severity"
})
public class AdverseReactionSymptomImpl
    extends BackboneElementImpl
    implements Serializable, AdverseReactionSymptom, Equals, HashCode
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = ReactionSeverityImpl.class)
    protected ReactionSeverityImpl severity;

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_ADVERSEREACTIONSYMPTOM__0")
    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = ReactionSeverity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SEVERITY_ADVERSEREACTIONSYMP_0")
    public ReactionSeverity getSeverity() {
        return severity;
    }

    public void setSeverity(ReactionSeverity value) {
        this.severity = ((ReactionSeverityImpl) value);
    }

    public AdverseReactionSymptomImpl withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public AdverseReactionSymptomImpl withSeverity(ReactionSeverity value) {
        setSeverity(value);
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public AdverseReactionSymptomImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AdverseReactionSymptomImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AdverseReactionSymptomImpl that = ((AdverseReactionSymptomImpl) object);
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
            ReactionSeverity lhsSeverity;
            lhsSeverity = this.getSeverity();
            ReactionSeverity rhsSeverity;
            rhsSeverity = that.getSeverity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "severity", lhsSeverity), LocatorUtils.property(thatLocator, "severity", rhsSeverity), lhsSeverity, rhsSeverity)) {
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
            ReactionSeverity theSeverity;
            theSeverity = this.getSeverity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "severity", theSeverity), currentHashCode, theSeverity);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
