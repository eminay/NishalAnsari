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
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.ListEntry;
import org.hl7.fhir.model.ListMode;
import org.hl7.fhir.model.Narrative;
import org.hl7.fhir.model.ResourceInline;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List", propOrder = {
    "identifiers",
    "code",
    "subject",
    "source",
    "date",
    "ordered",
    "mode",
    "entries",
    "emptyReason"
})
@XmlRootElement(name = "List")
public class ListImpl
    extends ResourceImpl
    implements Serializable, org.hl7.fhir.model.List, Equals, HashCode
{

    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected java.util.List<Identifier> identifiers;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl source;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl ordered;
    @XmlElement(required = true, type = ListModeImpl.class)
    protected ListModeImpl mode;
    @XmlElement(name = "entry", type = ListEntryImpl.class)
    protected java.util.List<ListEntry> entries;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl emptyReason;

    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIERS_LIST_HJID")
    public java.util.List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public void setIdentifiers(java.util.List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CODE_LIST_HJID")
    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBJECT_LIST_HJID")
    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SOURCE__LIST_HJID")
    public ResourceReference getSource() {
        return source;
    }

    public void setSource(ResourceReference value) {
        this.source = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__LIST_HJID")
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORDERED_LIST_HJID")
    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(Boolean value) {
        this.ordered = ((BooleanImpl) value);
    }

    @ManyToOne(targetEntity = ListMode.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODE__LIST_HJID")
    public ListMode getMode() {
        return mode;
    }

    public void setMode(ListMode value) {
        this.mode = ((ListModeImpl) value);
    }

    @OneToMany(targetEntity = ListEntry.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENTRIES_LIST_HJID")
    public java.util.List<ListEntry> getEntries() {
        if (entries == null) {
            entries = new ArrayList<ListEntry>();
        }
        return this.entries;
    }

    public void setEntries(java.util.List<ListEntry> entries) {
        this.entries = entries;
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EMPTYREASON_LIST_HJID")
    public CodeableConcept getEmptyReason() {
        return emptyReason;
    }

    public void setEmptyReason(CodeableConcept value) {
        this.emptyReason = ((CodeableConceptImpl) value);
    }

    public ListImpl withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public ListImpl withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public ListImpl withIdentifiers(java.util.List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public ListImpl withCode(CodeableConcept value) {
        setCode(value);
        return this;
    }

    public ListImpl withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public ListImpl withSource(ResourceReference value) {
        setSource(value);
        return this;
    }

    public ListImpl withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public ListImpl withOrdered(Boolean value) {
        setOrdered(value);
        return this;
    }

    public ListImpl withMode(ListMode value) {
        setMode(value);
        return this;
    }

    public ListImpl withEntries(ListEntry... values) {
        if (values!= null) {
            for (ListEntry value: values) {
                getEntries().add(value);
            }
        }
        return this;
    }

    public ListImpl withEntries(Collection<ListEntry> values) {
        if (values!= null) {
            getEntries().addAll(values);
        }
        return this;
    }

    public ListImpl withEntries(java.util.List<ListEntry> entries) {
        setEntries(entries);
        return this;
    }

    public ListImpl withEmptyReason(CodeableConcept value) {
        setEmptyReason(value);
        return this;
    }

    @Override
    public ListImpl withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ListImpl withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public ListImpl withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public ListImpl withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public ListImpl withContaineds(java.util.List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public ListImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ListImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ListImpl withModifierExtensions(java.util.List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public ListImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public ListImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public ListImpl withExtensions(java.util.List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public ListImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ListImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ListImpl that = ((ListImpl) object);
        {
            java.util.List<Identifier> lhsIdentifiers;
            lhsIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            java.util.List<Identifier> rhsIdentifiers;
            rhsIdentifiers = (((that.identifiers!= null)&&(!that.identifiers.isEmpty()))?that.getIdentifiers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifiers", lhsIdentifiers), LocatorUtils.property(thatLocator, "identifiers", rhsIdentifiers), lhsIdentifiers, rhsIdentifiers)) {
                return false;
            }
        }
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
            ResourceReference lhsSubject;
            lhsSubject = this.getSubject();
            ResourceReference rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            ResourceReference lhsSource;
            lhsSource = this.getSource();
            ResourceReference rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
                return false;
            }
        }
        {
            DateTime lhsDate;
            lhsDate = this.getDate();
            DateTime rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            Boolean lhsOrdered;
            lhsOrdered = this.getOrdered();
            Boolean rhsOrdered;
            rhsOrdered = that.getOrdered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordered", lhsOrdered), LocatorUtils.property(thatLocator, "ordered", rhsOrdered), lhsOrdered, rhsOrdered)) {
                return false;
            }
        }
        {
            ListMode lhsMode;
            lhsMode = this.getMode();
            ListMode rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode)) {
                return false;
            }
        }
        {
            java.util.List<ListEntry> lhsEntries;
            lhsEntries = (((this.entries!= null)&&(!this.entries.isEmpty()))?this.getEntries():null);
            java.util.List<ListEntry> rhsEntries;
            rhsEntries = (((that.entries!= null)&&(!that.entries.isEmpty()))?that.getEntries():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entries", lhsEntries), LocatorUtils.property(thatLocator, "entries", rhsEntries), lhsEntries, rhsEntries)) {
                return false;
            }
        }
        {
            CodeableConcept lhsEmptyReason;
            lhsEmptyReason = this.getEmptyReason();
            CodeableConcept rhsEmptyReason;
            rhsEmptyReason = that.getEmptyReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emptyReason", lhsEmptyReason), LocatorUtils.property(thatLocator, "emptyReason", rhsEmptyReason), lhsEmptyReason, rhsEmptyReason)) {
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
            java.util.List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifiers", theIdentifiers), currentHashCode, theIdentifiers);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            ResourceReference theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            Boolean theOrdered;
            theOrdered = this.getOrdered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordered", theOrdered), currentHashCode, theOrdered);
        }
        {
            ListMode theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode);
        }
        {
            java.util.List<ListEntry> theEntries;
            theEntries = (((this.entries!= null)&&(!this.entries.isEmpty()))?this.getEntries():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entries", theEntries), currentHashCode, theEntries);
        }
        {
            CodeableConcept theEmptyReason;
            theEmptyReason = this.getEmptyReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emptyReason", theEmptyReason), currentHashCode, theEmptyReason);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
