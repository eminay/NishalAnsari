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
import org.hl7.fhir.model.Address;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Narrative;
import org.hl7.fhir.model.Organization;
import org.hl7.fhir.model.OrganizationContact;
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
@XmlType(name = "Organization", propOrder = {
    "identifiers",
    "name",
    "type",
    "telecoms",
    "addresses",
    "partOf",
    "contacts",
    "locations",
    "active"
})
@XmlRootElement(name = "Organization")
public class OrganizationImpl
    extends ResourceImpl
    implements Serializable, Organization, Equals, HashCode
{

    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected List<Identifier> identifiers;
    @XmlElement(type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(name = "telecom", type = ContactImpl.class)
    protected List<Contact> telecoms;
    @XmlElement(name = "address", type = AddressImpl.class)
    protected List<Address> addresses;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl partOf;
    @XmlElement(name = "contact", type = OrganizationContactImpl.class)
    protected List<OrganizationContact> contacts;
    @XmlElement(name = "location", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> locations;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl active;

    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIERS_ORGANIZATION_HJID")
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__ORGANIZATION_HJID")
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__ORGANIZATION_HJID")
    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    @OneToMany(targetEntity = Contact.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TELECOMS_ORGANIZATION_HJID")
    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    public void setTelecoms(List<Contact> telecoms) {
        this.telecoms = telecoms;
    }

    @OneToMany(targetEntity = Address.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDRESSES_ORGANIZATION_HJID")
    public List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }
        return this.addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARTOF_ORGANIZATION_HJID")
    public ResourceReference getPartOf() {
        return partOf;
    }

    public void setPartOf(ResourceReference value) {
        this.partOf = ((ResourceReferenceImpl) value);
    }

    @OneToMany(targetEntity = OrganizationContact.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTACTS_ORGANIZATION_HJID")
    public List<OrganizationContact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<OrganizationContact>();
        }
        return this.contacts;
    }

    public void setContacts(List<OrganizationContact> contacts) {
        this.contacts = contacts;
    }

    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATIONS_ORGANIZATION_HJID")
    public List<ResourceReference> getLocations() {
        if (locations == null) {
            locations = new ArrayList<ResourceReference>();
        }
        return this.locations;
    }

    public void setLocations(List<ResourceReference> locations) {
        this.locations = locations;
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACTIVE_ORGANIZATION_HJID")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean value) {
        this.active = ((BooleanImpl) value);
    }

    public OrganizationImpl withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public OrganizationImpl withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public OrganizationImpl withIdentifiers(List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public OrganizationImpl withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public OrganizationImpl withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public OrganizationImpl withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public OrganizationImpl withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public OrganizationImpl withTelecoms(List<Contact> telecoms) {
        setTelecoms(telecoms);
        return this;
    }

    public OrganizationImpl withAddresses(Address... values) {
        if (values!= null) {
            for (Address value: values) {
                getAddresses().add(value);
            }
        }
        return this;
    }

    public OrganizationImpl withAddresses(Collection<Address> values) {
        if (values!= null) {
            getAddresses().addAll(values);
        }
        return this;
    }

    public OrganizationImpl withAddresses(List<Address> addresses) {
        setAddresses(addresses);
        return this;
    }

    public OrganizationImpl withPartOf(ResourceReference value) {
        setPartOf(value);
        return this;
    }

    public OrganizationImpl withContacts(OrganizationContact... values) {
        if (values!= null) {
            for (OrganizationContact value: values) {
                getContacts().add(value);
            }
        }
        return this;
    }

    public OrganizationImpl withContacts(Collection<OrganizationContact> values) {
        if (values!= null) {
            getContacts().addAll(values);
        }
        return this;
    }

    public OrganizationImpl withContacts(List<OrganizationContact> contacts) {
        setContacts(contacts);
        return this;
    }

    public OrganizationImpl withLocations(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getLocations().add(value);
            }
        }
        return this;
    }

    public OrganizationImpl withLocations(Collection<ResourceReference> values) {
        if (values!= null) {
            getLocations().addAll(values);
        }
        return this;
    }

    public OrganizationImpl withLocations(List<ResourceReference> locations) {
        setLocations(locations);
        return this;
    }

    public OrganizationImpl withActive(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public OrganizationImpl withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public OrganizationImpl withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public OrganizationImpl withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public OrganizationImpl withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public OrganizationImpl withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public OrganizationImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public OrganizationImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public OrganizationImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public OrganizationImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public OrganizationImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public OrganizationImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public OrganizationImpl withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OrganizationImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OrganizationImpl that = ((OrganizationImpl) object);
        {
            List<Identifier> lhsIdentifiers;
            lhsIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            List<Identifier> rhsIdentifiers;
            rhsIdentifiers = (((that.identifiers!= null)&&(!that.identifiers.isEmpty()))?that.getIdentifiers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifiers", lhsIdentifiers), LocatorUtils.property(thatLocator, "identifiers", rhsIdentifiers), lhsIdentifiers, rhsIdentifiers)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.model.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            List<Contact> lhsTelecoms;
            lhsTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            List<Contact> rhsTelecoms;
            rhsTelecoms = (((that.telecoms!= null)&&(!that.telecoms.isEmpty()))?that.getTelecoms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecoms", lhsTelecoms), LocatorUtils.property(thatLocator, "telecoms", rhsTelecoms), lhsTelecoms, rhsTelecoms)) {
                return false;
            }
        }
        {
            List<Address> lhsAddresses;
            lhsAddresses = (((this.addresses!= null)&&(!this.addresses.isEmpty()))?this.getAddresses():null);
            List<Address> rhsAddresses;
            rhsAddresses = (((that.addresses!= null)&&(!that.addresses.isEmpty()))?that.getAddresses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addresses", lhsAddresses), LocatorUtils.property(thatLocator, "addresses", rhsAddresses), lhsAddresses, rhsAddresses)) {
                return false;
            }
        }
        {
            ResourceReference lhsPartOf;
            lhsPartOf = this.getPartOf();
            ResourceReference rhsPartOf;
            rhsPartOf = that.getPartOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partOf", lhsPartOf), LocatorUtils.property(thatLocator, "partOf", rhsPartOf), lhsPartOf, rhsPartOf)) {
                return false;
            }
        }
        {
            List<OrganizationContact> lhsContacts;
            lhsContacts = (((this.contacts!= null)&&(!this.contacts.isEmpty()))?this.getContacts():null);
            List<OrganizationContact> rhsContacts;
            rhsContacts = (((that.contacts!= null)&&(!that.contacts.isEmpty()))?that.getContacts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contacts", lhsContacts), LocatorUtils.property(thatLocator, "contacts", rhsContacts), lhsContacts, rhsContacts)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsLocations;
            lhsLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            List<ResourceReference> rhsLocations;
            rhsLocations = (((that.locations!= null)&&(!that.locations.isEmpty()))?that.getLocations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locations", lhsLocations), LocatorUtils.property(thatLocator, "locations", rhsLocations), lhsLocations, rhsLocations)) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.getActive();
            Boolean rhsActive;
            rhsActive = that.getActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifiers", theIdentifiers), currentHashCode, theIdentifiers);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<Contact> theTelecoms;
            theTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecoms", theTelecoms), currentHashCode, theTelecoms);
        }
        {
            List<Address> theAddresses;
            theAddresses = (((this.addresses!= null)&&(!this.addresses.isEmpty()))?this.getAddresses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addresses", theAddresses), currentHashCode, theAddresses);
        }
        {
            ResourceReference thePartOf;
            thePartOf = this.getPartOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partOf", thePartOf), currentHashCode, thePartOf);
        }
        {
            List<OrganizationContact> theContacts;
            theContacts = (((this.contacts!= null)&&(!this.contacts.isEmpty()))?this.getContacts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contacts", theContacts), currentHashCode, theContacts);
        }
        {
            List<ResourceReference> theLocations;
            theLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locations", theLocations), currentHashCode, theLocations);
        }
        {
            Boolean theActive;
            theActive = this.getActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
