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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.Composition;
import org.hl7.fhir.model.CompositionAttester;
import org.hl7.fhir.model.CompositionEvent;
import org.hl7.fhir.model.CompositionSection;
import org.hl7.fhir.model.CompositionStatus;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Identifier;
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
@XmlType(name = "Composition", propOrder = {
    "identifier",
    "date",
    "type",
    "clazz",
    "title",
    "status",
    "confidentiality",
    "subject",
    "authors",
    "attesters",
    "custodian",
    "event",
    "encounter",
    "sections"
})
@XmlRootElement(name = "Composition")
public class CompositionImpl
    extends ResourceImpl
    implements Serializable, Composition, Equals, HashCode
{

    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl identifier;
    @XmlElement(required = true, type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(name = "class", type = CodeableConceptImpl.class)
    protected CodeableConceptImpl clazz;
    @XmlElement(type = StringImpl.class)
    protected StringImpl title;
    @XmlElement(required = true, type = CompositionStatusImpl.class)
    protected CompositionStatusImpl status;
    @XmlElement(required = true, type = CodingImpl.class)
    protected CodingImpl confidentiality;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(name = "author", required = true, type = ResourceReferenceImpl.class)
    protected List<ResourceReference> authors;
    @XmlElement(name = "attester", type = CompositionAttesterImpl.class)
    protected List<CompositionAttester> attesters;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl custodian;
    @XmlElement(type = CompositionEventImpl.class)
    protected CompositionEventImpl event;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl encounter;
    @XmlElement(name = "section", type = CompositionSectionImpl.class)
    protected List<CompositionSection> sections;

    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_COMPOSITION_HJID")
    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__COMPOSITION_HJID")
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__COMPOSITION_HJID")
    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLAZZ_COMPOSITION_HJID")
    public CodeableConcept getClazz() {
        return clazz;
    }

    public void setClazz(CodeableConcept value) {
        this.clazz = ((CodeableConceptImpl) value);
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TITLE_COMPOSITION_HJID")
    public org.hl7.fhir.model.String getTitle() {
        return title;
    }

    public void setTitle(org.hl7.fhir.model.String value) {
        this.title = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = CompositionStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_COMPOSITION_HJID")
    public CompositionStatus getStatus() {
        return status;
    }

    public void setStatus(CompositionStatus value) {
        this.status = ((CompositionStatusImpl) value);
    }

    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONFIDENTIALITY_COMPOSITION__0")
    public Coding getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(Coding value) {
        this.confidentiality = ((CodingImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBJECT_COMPOSITION_HJID")
    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AUTHORS_COMPOSITION_HJID")
    public List<ResourceReference> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<ResourceReference>();
        }
        return this.authors;
    }

    public void setAuthors(List<ResourceReference> authors) {
        this.authors = authors;
    }

    @OneToMany(targetEntity = CompositionAttester.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ATTESTERS_COMPOSITION_HJID")
    public List<CompositionAttester> getAttesters() {
        if (attesters == null) {
            attesters = new ArrayList<CompositionAttester>();
        }
        return this.attesters;
    }

    public void setAttesters(List<CompositionAttester> attesters) {
        this.attesters = attesters;
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CUSTODIAN_COMPOSITION_HJID")
    public ResourceReference getCustodian() {
        return custodian;
    }

    public void setCustodian(ResourceReference value) {
        this.custodian = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = CompositionEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENT_COMPOSITION_HJID")
    public CompositionEvent getEvent() {
        return event;
    }

    public void setEvent(CompositionEvent value) {
        this.event = ((CompositionEventImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENCOUNTER_COMPOSITION_HJID")
    public ResourceReference getEncounter() {
        return encounter;
    }

    public void setEncounter(ResourceReference value) {
        this.encounter = ((ResourceReferenceImpl) value);
    }

    @OneToMany(targetEntity = CompositionSection.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SECTIONS_COMPOSITION_HJID")
    public List<CompositionSection> getSections() {
        if (sections == null) {
            sections = new ArrayList<CompositionSection>();
        }
        return this.sections;
    }

    public void setSections(List<CompositionSection> sections) {
        this.sections = sections;
    }

    public CompositionImpl withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public CompositionImpl withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public CompositionImpl withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public CompositionImpl withClazz(CodeableConcept value) {
        setClazz(value);
        return this;
    }

    public CompositionImpl withTitle(org.hl7.fhir.model.String value) {
        setTitle(value);
        return this;
    }

    public CompositionImpl withStatus(CompositionStatus value) {
        setStatus(value);
        return this;
    }

    public CompositionImpl withConfidentiality(Coding value) {
        setConfidentiality(value);
        return this;
    }

    public CompositionImpl withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public CompositionImpl withAuthors(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getAuthors().add(value);
            }
        }
        return this;
    }

    public CompositionImpl withAuthors(Collection<ResourceReference> values) {
        if (values!= null) {
            getAuthors().addAll(values);
        }
        return this;
    }

    public CompositionImpl withAuthors(List<ResourceReference> authors) {
        setAuthors(authors);
        return this;
    }

    public CompositionImpl withAttesters(CompositionAttester... values) {
        if (values!= null) {
            for (CompositionAttester value: values) {
                getAttesters().add(value);
            }
        }
        return this;
    }

    public CompositionImpl withAttesters(Collection<CompositionAttester> values) {
        if (values!= null) {
            getAttesters().addAll(values);
        }
        return this;
    }

    public CompositionImpl withAttesters(List<CompositionAttester> attesters) {
        setAttesters(attesters);
        return this;
    }

    public CompositionImpl withCustodian(ResourceReference value) {
        setCustodian(value);
        return this;
    }

    public CompositionImpl withEvent(CompositionEvent value) {
        setEvent(value);
        return this;
    }

    public CompositionImpl withEncounter(ResourceReference value) {
        setEncounter(value);
        return this;
    }

    public CompositionImpl withSections(CompositionSection... values) {
        if (values!= null) {
            for (CompositionSection value: values) {
                getSections().add(value);
            }
        }
        return this;
    }

    public CompositionImpl withSections(Collection<CompositionSection> values) {
        if (values!= null) {
            getSections().addAll(values);
        }
        return this;
    }

    public CompositionImpl withSections(List<CompositionSection> sections) {
        setSections(sections);
        return this;
    }

    @Override
    public CompositionImpl withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public CompositionImpl withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public CompositionImpl withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public CompositionImpl withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public CompositionImpl withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public CompositionImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CompositionImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CompositionImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public CompositionImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public CompositionImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public CompositionImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public CompositionImpl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompositionImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompositionImpl that = ((CompositionImpl) object);
        {
            Identifier lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Identifier rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
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
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            CodeableConcept lhsClazz;
            lhsClazz = this.getClazz();
            CodeableConcept rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsTitle;
            lhsTitle = this.getTitle();
            org.hl7.fhir.model.String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            CompositionStatus lhsStatus;
            lhsStatus = this.getStatus();
            CompositionStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Coding lhsConfidentiality;
            lhsConfidentiality = this.getConfidentiality();
            Coding rhsConfidentiality;
            rhsConfidentiality = that.getConfidentiality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidentiality", lhsConfidentiality), LocatorUtils.property(thatLocator, "confidentiality", rhsConfidentiality), lhsConfidentiality, rhsConfidentiality)) {
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
            List<ResourceReference> lhsAuthors;
            lhsAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            List<ResourceReference> rhsAuthors;
            rhsAuthors = (((that.authors!= null)&&(!that.authors.isEmpty()))?that.getAuthors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authors", lhsAuthors), LocatorUtils.property(thatLocator, "authors", rhsAuthors), lhsAuthors, rhsAuthors)) {
                return false;
            }
        }
        {
            List<CompositionAttester> lhsAttesters;
            lhsAttesters = (((this.attesters!= null)&&(!this.attesters.isEmpty()))?this.getAttesters():null);
            List<CompositionAttester> rhsAttesters;
            rhsAttesters = (((that.attesters!= null)&&(!that.attesters.isEmpty()))?that.getAttesters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attesters", lhsAttesters), LocatorUtils.property(thatLocator, "attesters", rhsAttesters), lhsAttesters, rhsAttesters)) {
                return false;
            }
        }
        {
            ResourceReference lhsCustodian;
            lhsCustodian = this.getCustodian();
            ResourceReference rhsCustodian;
            rhsCustodian = that.getCustodian();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "custodian", lhsCustodian), LocatorUtils.property(thatLocator, "custodian", rhsCustodian), lhsCustodian, rhsCustodian)) {
                return false;
            }
        }
        {
            CompositionEvent lhsEvent;
            lhsEvent = this.getEvent();
            CompositionEvent rhsEvent;
            rhsEvent = that.getEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent)) {
                return false;
            }
        }
        {
            ResourceReference lhsEncounter;
            lhsEncounter = this.getEncounter();
            ResourceReference rhsEncounter;
            rhsEncounter = that.getEncounter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encounter", lhsEncounter), LocatorUtils.property(thatLocator, "encounter", rhsEncounter), lhsEncounter, rhsEncounter)) {
                return false;
            }
        }
        {
            List<CompositionSection> lhsSections;
            lhsSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            List<CompositionSection> rhsSections;
            rhsSections = (((that.sections!= null)&&(!that.sections.isEmpty()))?that.getSections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sections", lhsSections), LocatorUtils.property(thatLocator, "sections", rhsSections), lhsSections, rhsSections)) {
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
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            CodeableConcept theClazz;
            theClazz = this.getClazz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clazz", theClazz), currentHashCode, theClazz);
        }
        {
            org.hl7.fhir.model.String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            CompositionStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            Coding theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentiality", theConfidentiality), currentHashCode, theConfidentiality);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            List<ResourceReference> theAuthors;
            theAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authors", theAuthors), currentHashCode, theAuthors);
        }
        {
            List<CompositionAttester> theAttesters;
            theAttesters = (((this.attesters!= null)&&(!this.attesters.isEmpty()))?this.getAttesters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attesters", theAttesters), currentHashCode, theAttesters);
        }
        {
            ResourceReference theCustodian;
            theCustodian = this.getCustodian();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "custodian", theCustodian), currentHashCode, theCustodian);
        }
        {
            CompositionEvent theEvent;
            theEvent = this.getEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encounter", theEncounter), currentHashCode, theEncounter);
        }
        {
            List<CompositionSection> theSections;
            theSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sections", theSections), currentHashCode, theSections);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}