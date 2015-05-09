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
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SpecimenTreatment;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen.Treatment", propOrder = {
    "description",
    "procedure",
    "additives"
})
public class SpecimenTreatmentImpl
    extends BackboneElementImpl
    implements Serializable, SpecimenTreatment, Equals, HashCode
{

    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl procedure;
    @XmlElement(name = "additive", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> additives;

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_SPECIMENTREATMEN_0")
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROCEDURE__SPECIMENTREATMENT_0")
    public CodeableConcept getProcedure() {
        return procedure;
    }

    public void setProcedure(CodeableConcept value) {
        this.procedure = ((CodeableConceptImpl) value);
    }

    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDITIVES_SPECIMENTREATMENT__0")
    public List<ResourceReference> getAdditives() {
        if (additives == null) {
            additives = new ArrayList<ResourceReference>();
        }
        return this.additives;
    }

    public void setAdditives(List<ResourceReference> additives) {
        this.additives = additives;
    }

    public SpecimenTreatmentImpl withDescription(org.hl7.fhir.model.String value) {
        setDescription(value);
        return this;
    }

    public SpecimenTreatmentImpl withProcedure(CodeableConcept value) {
        setProcedure(value);
        return this;
    }

    public SpecimenTreatmentImpl withAdditives(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getAdditives().add(value);
            }
        }
        return this;
    }

    public SpecimenTreatmentImpl withAdditives(Collection<ResourceReference> values) {
        if (values!= null) {
            getAdditives().addAll(values);
        }
        return this;
    }

    public SpecimenTreatmentImpl withAdditives(List<ResourceReference> additives) {
        setAdditives(additives);
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SpecimenTreatmentImpl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SpecimenTreatmentImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SpecimenTreatmentImpl that = ((SpecimenTreatmentImpl) object);
        {
            org.hl7.fhir.model.String lhsDescription;
            lhsDescription = this.getDescription();
            org.hl7.fhir.model.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            CodeableConcept lhsProcedure;
            lhsProcedure = this.getProcedure();
            CodeableConcept rhsProcedure;
            rhsProcedure = that.getProcedure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procedure", lhsProcedure), LocatorUtils.property(thatLocator, "procedure", rhsProcedure), lhsProcedure, rhsProcedure)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsAdditives;
            lhsAdditives = (((this.additives!= null)&&(!this.additives.isEmpty()))?this.getAdditives():null);
            List<ResourceReference> rhsAdditives;
            rhsAdditives = (((that.additives!= null)&&(!that.additives.isEmpty()))?that.getAdditives():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additives", lhsAdditives), LocatorUtils.property(thatLocator, "additives", rhsAdditives), lhsAdditives, rhsAdditives)) {
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
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            CodeableConcept theProcedure;
            theProcedure = this.getProcedure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procedure", theProcedure), currentHashCode, theProcedure);
        }
        {
            List<ResourceReference> theAdditives;
            theAdditives = (((this.additives!= null)&&(!this.additives.isEmpty()))?this.getAdditives():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additives", theAdditives), currentHashCode, theAdditives);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
