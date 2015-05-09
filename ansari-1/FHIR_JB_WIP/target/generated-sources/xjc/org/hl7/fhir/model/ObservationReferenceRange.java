//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model;



/**
 * Measurements and simple assertions made about a patient, device or other subject.
 * 
 * <p>Java class for Observation.ReferenceRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Observation.ReferenceRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="low" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="high" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="meaning" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://hl7.org/fhir}Range" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ObservationReferenceRange
    extends BackboneElement
{


    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    Quantity getLow();

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    void setLow(Quantity value);

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    Quantity getHigh();

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    void setHigh(Quantity value);

    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getMeaning();

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setMeaning(CodeableConcept value);

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    Range getAge();

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    void setAge(Range value);

}