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
import org.hl7.fhir.model.Ratio;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SubstanceIngredient;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Substance.Ingredient", propOrder = {
    "quantity",
    "substance"
})
public class SubstanceIngredientImpl
    extends BackboneElementImpl
    implements Serializable, SubstanceIngredient, Equals, HashCode
{

    @XmlElement(type = RatioImpl.class)
    protected RatioImpl quantity;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl substance;

    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUANTITY_SUBSTANCEINGREDIENT_0")
    public Ratio getQuantity() {
        return quantity;
    }

    public void setQuantity(Ratio value) {
        this.quantity = ((RatioImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBSTANCE_SUBSTANCEINGREDIEN_0")
    public ResourceReference getSubstance() {
        return substance;
    }

    public void setSubstance(ResourceReference value) {
        this.substance = ((ResourceReferenceImpl) value);
    }

    public SubstanceIngredientImpl withQuantity(Ratio value) {
        setQuantity(value);
        return this;
    }

    public SubstanceIngredientImpl withSubstance(ResourceReference value) {
        setSubstance(value);
        return this;
    }

    @Override
    public SubstanceIngredientImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SubstanceIngredientImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SubstanceIngredientImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public SubstanceIngredientImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SubstanceIngredientImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SubstanceIngredientImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SubstanceIngredientImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SubstanceIngredientImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SubstanceIngredientImpl that = ((SubstanceIngredientImpl) object);
        {
            Ratio lhsQuantity;
            lhsQuantity = this.getQuantity();
            Ratio rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            ResourceReference lhsSubstance;
            lhsSubstance = this.getSubstance();
            ResourceReference rhsSubstance;
            rhsSubstance = that.getSubstance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substance", lhsSubstance), LocatorUtils.property(thatLocator, "substance", rhsSubstance), lhsSubstance, rhsSubstance)) {
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
            Ratio theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            ResourceReference theSubstance;
            theSubstance = this.getSubstance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substance", theSubstance), currentHashCode, theSubstance);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
