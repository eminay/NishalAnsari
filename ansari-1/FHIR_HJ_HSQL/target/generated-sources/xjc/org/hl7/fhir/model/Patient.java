//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Patient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="deceasedDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;/choice>
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="multipleBirthBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="multipleBirthInteger" type="{http://hl7.org/fhir}integer"/>
 *         &lt;/choice>
 *         &lt;element name="photo" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}Patient.Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="animal" type="{http://hl7.org/fhir}Patient.Animal" minOccurs="0"/>
 *         &lt;element name="communication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="careProvider" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="managingOrganization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="link" type="{http://hl7.org/fhir}Patient.Link" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="active" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "Patient")
@Table(name = "PATIENT")
public interface Patient
    extends Resource
{


    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    List<Identifier> getIdentifiers();

    /**
     * 
     * 
     */
    void setIdentifiers(List<Identifier> identifiers);

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HumanName }
     * 
     * 
     */
    List<HumanName> getNames();

    /**
     * 
     * 
     */
    void setNames(List<HumanName> names);

    /**
     * Gets the value of the telecoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    List<Contact> getTelecoms();

    /**
     * 
     * 
     */
    void setTelecoms(List<Contact> telecoms);

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getGender();

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setGender(CodeableConcept value);

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getBirthDate();

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setBirthDate(DateTime value);

    /**
     * Gets the value of the deceasedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getDeceasedDateTime();

    /**
     * Sets the value of the deceasedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setDeceasedDateTime(DateTime value);

    /**
     * Gets the value of the deceasedBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getDeceasedBoolean();

    /**
     * Sets the value of the deceasedBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setDeceasedBoolean(Boolean value);

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    List<Address> getAddresses();

    /**
     * 
     * 
     */
    void setAddresses(List<Address> addresses);

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getMaritalStatus();

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setMaritalStatus(CodeableConcept value);

    /**
     * Gets the value of the multipleBirthInteger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    Integer getMultipleBirthInteger();

    /**
     * Sets the value of the multipleBirthInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    void setMultipleBirthInteger(Integer value);

    /**
     * Gets the value of the multipleBirthBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getMultipleBirthBoolean();

    /**
     * Sets the value of the multipleBirthBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setMultipleBirthBoolean(Boolean value);

    /**
     * Gets the value of the photos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    List<Attachment> getPhotos();

    /**
     * 
     * 
     */
    void setPhotos(List<Attachment> photos);

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientContact }
     * 
     * 
     */
    List<PatientContact> getContacts();

    /**
     * 
     * 
     */
    void setContacts(List<PatientContact> contacts);

    /**
     * Gets the value of the animal property.
     * 
     * @return
     *     possible object is
     *     {@link PatientAnimal }
     *     
     */
    PatientAnimal getAnimal();

    /**
     * Sets the value of the animal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientAnimal }
     *     
     */
    void setAnimal(PatientAnimal value);

    /**
     * Gets the value of the communications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    List<CodeableConcept> getCommunications();

    /**
     * 
     * 
     */
    void setCommunications(List<CodeableConcept> communications);

    /**
     * Gets the value of the careProviders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the careProviders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCareProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    List<ResourceReference> getCareProviders();

    /**
     * 
     * 
     */
    void setCareProviders(List<ResourceReference> careProviders);

    /**
     * Gets the value of the managingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getManagingOrganization();

    /**
     * Sets the value of the managingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setManagingOrganization(ResourceReference value);

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatientLink }
     * 
     * 
     */
    List<PatientLink> getLinks();

    /**
     * 
     * 
     */
    void setLinks(List<PatientLink> links);

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getActive();

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setActive(Boolean value);

}