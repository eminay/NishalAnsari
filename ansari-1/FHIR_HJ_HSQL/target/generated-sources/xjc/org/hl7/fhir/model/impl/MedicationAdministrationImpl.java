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
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.MedicationAdministration;
import org.hl7.fhir.model.MedicationAdministrationDosage;
import org.hl7.fhir.model.MedicationAdministrationStatus;
import org.hl7.fhir.model.Narrative;
import org.hl7.fhir.model.Period;
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
@XmlType(name = "MedicationAdministration", propOrder = {
    "identifiers",
    "status",
    "patient",
    "practitioner",
    "encounter",
    "prescription",
    "wasNotGiven",
    "reasonNotGivens",
    "whenGiven",
    "medication",
    "devices",
    "dosages"
})
@XmlRootElement(name = "MedicationAdministration")
public class MedicationAdministrationImpl
    extends ResourceImpl
    implements Serializable, MedicationAdministration, Equals, HashCode
{

    @XmlElement(name = "identifier", type = IdentifierImpl.class)
    protected List<Identifier> identifiers;
    @XmlElement(required = true, type = MedicationAdministrationStatusImpl.class)
    protected MedicationAdministrationStatusImpl status;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl patient;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl practitioner;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl encounter;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl prescription;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl wasNotGiven;
    @XmlElement(name = "reasonNotGiven", type = CodeableConceptImpl.class)
    protected List<CodeableConcept> reasonNotGivens;
    @XmlElement(required = true, type = PeriodImpl.class)
    protected PeriodImpl whenGiven;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl medication;
    @XmlElement(name = "device", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> devices;
    @XmlElement(name = "dosage", type = MedicationAdministrationDosageImpl.class)
    protected List<MedicationAdministrationDosage> dosages;

    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIERS_MEDICATIONADMINI_0")
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @ManyToOne(targetEntity = MedicationAdministrationStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_MEDICATIONADMINISTRAT_0")
    public MedicationAdministrationStatus getStatus() {
        return status;
    }

    public void setStatus(MedicationAdministrationStatus value) {
        this.status = ((MedicationAdministrationStatusImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PATIENT_MEDICATIONADMINISTRA_0")
    public ResourceReference getPatient() {
        return patient;
    }

    public void setPatient(ResourceReference value) {
        this.patient = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRACTITIONER_MEDICATIONADMIN_0")
    public ResourceReference getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(ResourceReference value) {
        this.practitioner = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENCOUNTER_MEDICATIONADMINIST_0")
    public ResourceReference getEncounter() {
        return encounter;
    }

    public void setEncounter(ResourceReference value) {
        this.encounter = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRESCRIPTION_MEDICATIONADMIN_0")
    public ResourceReference getPrescription() {
        return prescription;
    }

    public void setPrescription(ResourceReference value) {
        this.prescription = ((ResourceReferenceImpl) value);
    }

    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WASNOTGIVEN_MEDICATIONADMINI_0")
    public Boolean getWasNotGiven() {
        return wasNotGiven;
    }

    public void setWasNotGiven(Boolean value) {
        this.wasNotGiven = ((BooleanImpl) value);
    }

    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REASONNOTGIVENS_MEDICATIONAD_0")
    public List<CodeableConcept> getReasonNotGivens() {
        if (reasonNotGivens == null) {
            reasonNotGivens = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotGivens;
    }

    public void setReasonNotGivens(List<CodeableConcept> reasonNotGivens) {
        this.reasonNotGivens = reasonNotGivens;
    }

    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "WHENGIVEN_MEDICATIONADMINIST_0")
    public Period getWhenGiven() {
        return whenGiven;
    }

    public void setWhenGiven(Period value) {
        this.whenGiven = ((PeriodImpl) value);
    }

    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MEDICATION_MEDICATIONADMINIS_0")
    public ResourceReference getMedication() {
        return medication;
    }

    public void setMedication(ResourceReference value) {
        this.medication = ((ResourceReferenceImpl) value);
    }

    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DEVICES_MEDICATIONADMINISTRA_0")
    public List<ResourceReference> getDevices() {
        if (devices == null) {
            devices = new ArrayList<ResourceReference>();
        }
        return this.devices;
    }

    public void setDevices(List<ResourceReference> devices) {
        this.devices = devices;
    }

    @OneToMany(targetEntity = MedicationAdministrationDosage.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOSAGES_MEDICATIONADMINISTRA_0")
    public List<MedicationAdministrationDosage> getDosages() {
        if (dosages == null) {
            dosages = new ArrayList<MedicationAdministrationDosage>();
        }
        return this.dosages;
    }

    public void setDosages(List<MedicationAdministrationDosage> dosages) {
        this.dosages = dosages;
    }

    public MedicationAdministrationImpl withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public MedicationAdministrationImpl withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public MedicationAdministrationImpl withIdentifiers(List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public MedicationAdministrationImpl withStatus(MedicationAdministrationStatus value) {
        setStatus(value);
        return this;
    }

    public MedicationAdministrationImpl withPatient(ResourceReference value) {
        setPatient(value);
        return this;
    }

    public MedicationAdministrationImpl withPractitioner(ResourceReference value) {
        setPractitioner(value);
        return this;
    }

    public MedicationAdministrationImpl withEncounter(ResourceReference value) {
        setEncounter(value);
        return this;
    }

    public MedicationAdministrationImpl withPrescription(ResourceReference value) {
        setPrescription(value);
        return this;
    }

    public MedicationAdministrationImpl withWasNotGiven(Boolean value) {
        setWasNotGiven(value);
        return this;
    }

    public MedicationAdministrationImpl withReasonNotGivens(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getReasonNotGivens().add(value);
            }
        }
        return this;
    }

    public MedicationAdministrationImpl withReasonNotGivens(Collection<CodeableConcept> values) {
        if (values!= null) {
            getReasonNotGivens().addAll(values);
        }
        return this;
    }

    public MedicationAdministrationImpl withReasonNotGivens(List<CodeableConcept> reasonNotGivens) {
        setReasonNotGivens(reasonNotGivens);
        return this;
    }

    public MedicationAdministrationImpl withWhenGiven(Period value) {
        setWhenGiven(value);
        return this;
    }

    public MedicationAdministrationImpl withMedication(ResourceReference value) {
        setMedication(value);
        return this;
    }

    public MedicationAdministrationImpl withDevices(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getDevices().add(value);
            }
        }
        return this;
    }

    public MedicationAdministrationImpl withDevices(Collection<ResourceReference> values) {
        if (values!= null) {
            getDevices().addAll(values);
        }
        return this;
    }

    public MedicationAdministrationImpl withDevices(List<ResourceReference> devices) {
        setDevices(devices);
        return this;
    }

    public MedicationAdministrationImpl withDosages(MedicationAdministrationDosage... values) {
        if (values!= null) {
            for (MedicationAdministrationDosage value: values) {
                getDosages().add(value);
            }
        }
        return this;
    }

    public MedicationAdministrationImpl withDosages(Collection<MedicationAdministrationDosage> values) {
        if (values!= null) {
            getDosages().addAll(values);
        }
        return this;
    }

    public MedicationAdministrationImpl withDosages(List<MedicationAdministrationDosage> dosages) {
        setDosages(dosages);
        return this;
    }

    @Override
    public MedicationAdministrationImpl withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public MedicationAdministrationImpl withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public MedicationAdministrationImpl withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationAdministrationImpl withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationAdministrationImpl withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public MedicationAdministrationImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationAdministrationImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationAdministrationImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationAdministrationImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationAdministrationImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationAdministrationImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationAdministrationImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationAdministrationImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationAdministrationImpl that = ((MedicationAdministrationImpl) object);
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
            MedicationAdministrationStatus lhsStatus;
            lhsStatus = this.getStatus();
            MedicationAdministrationStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            ResourceReference lhsPatient;
            lhsPatient = this.getPatient();
            ResourceReference rhsPatient;
            rhsPatient = that.getPatient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "patient", lhsPatient), LocatorUtils.property(thatLocator, "patient", rhsPatient), lhsPatient, rhsPatient)) {
                return false;
            }
        }
        {
            ResourceReference lhsPractitioner;
            lhsPractitioner = this.getPractitioner();
            ResourceReference rhsPractitioner;
            rhsPractitioner = that.getPractitioner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "practitioner", lhsPractitioner), LocatorUtils.property(thatLocator, "practitioner", rhsPractitioner), lhsPractitioner, rhsPractitioner)) {
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
            ResourceReference lhsPrescription;
            lhsPrescription = this.getPrescription();
            ResourceReference rhsPrescription;
            rhsPrescription = that.getPrescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prescription", lhsPrescription), LocatorUtils.property(thatLocator, "prescription", rhsPrescription), lhsPrescription, rhsPrescription)) {
                return false;
            }
        }
        {
            Boolean lhsWasNotGiven;
            lhsWasNotGiven = this.getWasNotGiven();
            Boolean rhsWasNotGiven;
            rhsWasNotGiven = that.getWasNotGiven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wasNotGiven", lhsWasNotGiven), LocatorUtils.property(thatLocator, "wasNotGiven", rhsWasNotGiven), lhsWasNotGiven, rhsWasNotGiven)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsReasonNotGivens;
            lhsReasonNotGivens = (((this.reasonNotGivens!= null)&&(!this.reasonNotGivens.isEmpty()))?this.getReasonNotGivens():null);
            List<CodeableConcept> rhsReasonNotGivens;
            rhsReasonNotGivens = (((that.reasonNotGivens!= null)&&(!that.reasonNotGivens.isEmpty()))?that.getReasonNotGivens():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reasonNotGivens", lhsReasonNotGivens), LocatorUtils.property(thatLocator, "reasonNotGivens", rhsReasonNotGivens), lhsReasonNotGivens, rhsReasonNotGivens)) {
                return false;
            }
        }
        {
            Period lhsWhenGiven;
            lhsWhenGiven = this.getWhenGiven();
            Period rhsWhenGiven;
            rhsWhenGiven = that.getWhenGiven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "whenGiven", lhsWhenGiven), LocatorUtils.property(thatLocator, "whenGiven", rhsWhenGiven), lhsWhenGiven, rhsWhenGiven)) {
                return false;
            }
        }
        {
            ResourceReference lhsMedication;
            lhsMedication = this.getMedication();
            ResourceReference rhsMedication;
            rhsMedication = that.getMedication();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "medication", lhsMedication), LocatorUtils.property(thatLocator, "medication", rhsMedication), lhsMedication, rhsMedication)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsDevices;
            lhsDevices = (((this.devices!= null)&&(!this.devices.isEmpty()))?this.getDevices():null);
            List<ResourceReference> rhsDevices;
            rhsDevices = (((that.devices!= null)&&(!that.devices.isEmpty()))?that.getDevices():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "devices", lhsDevices), LocatorUtils.property(thatLocator, "devices", rhsDevices), lhsDevices, rhsDevices)) {
                return false;
            }
        }
        {
            List<MedicationAdministrationDosage> lhsDosages;
            lhsDosages = (((this.dosages!= null)&&(!this.dosages.isEmpty()))?this.getDosages():null);
            List<MedicationAdministrationDosage> rhsDosages;
            rhsDosages = (((that.dosages!= null)&&(!that.dosages.isEmpty()))?that.getDosages():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dosages", lhsDosages), LocatorUtils.property(thatLocator, "dosages", rhsDosages), lhsDosages, rhsDosages)) {
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
            MedicationAdministrationStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "patient", thePatient), currentHashCode, thePatient);
        }
        {
            ResourceReference thePractitioner;
            thePractitioner = this.getPractitioner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "practitioner", thePractitioner), currentHashCode, thePractitioner);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encounter", theEncounter), currentHashCode, theEncounter);
        }
        {
            ResourceReference thePrescription;
            thePrescription = this.getPrescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prescription", thePrescription), currentHashCode, thePrescription);
        }
        {
            Boolean theWasNotGiven;
            theWasNotGiven = this.getWasNotGiven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wasNotGiven", theWasNotGiven), currentHashCode, theWasNotGiven);
        }
        {
            List<CodeableConcept> theReasonNotGivens;
            theReasonNotGivens = (((this.reasonNotGivens!= null)&&(!this.reasonNotGivens.isEmpty()))?this.getReasonNotGivens():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reasonNotGivens", theReasonNotGivens), currentHashCode, theReasonNotGivens);
        }
        {
            Period theWhenGiven;
            theWhenGiven = this.getWhenGiven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "whenGiven", theWhenGiven), currentHashCode, theWhenGiven);
        }
        {
            ResourceReference theMedication;
            theMedication = this.getMedication();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "medication", theMedication), currentHashCode, theMedication);
        }
        {
            List<ResourceReference> theDevices;
            theDevices = (((this.devices!= null)&&(!this.devices.isEmpty()))?this.getDevices():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "devices", theDevices), currentHashCode, theDevices);
        }
        {
            List<MedicationAdministrationDosage> theDosages;
            theDosages = (((this.dosages!= null)&&(!this.dosages.isEmpty()))?this.getDosages():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dosages", theDosages), currentHashCode, theDosages);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}