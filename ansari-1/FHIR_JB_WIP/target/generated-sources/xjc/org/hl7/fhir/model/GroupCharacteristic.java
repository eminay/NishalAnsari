//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model;



/**
 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized.  I.e. A collection of entities that isn't an Organization.
 * 
 * <p>Java class for Group.Characteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group.Characteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="valueCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *           &lt;element name="valueBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="valueQuantity" type="{http://hl7.org/fhir}Quantity"/&gt;
 *           &lt;element name="valueRange" type="{http://hl7.org/fhir}Range"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface GroupCharacteristic
    extends BackboneElement
{


    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setCode(CodeableConcept value);

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    Range getValueRange();

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    void setValueRange(Range value);

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    Quantity getValueQuantity();

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    void setValueQuantity(Quantity value);

    /**
     * Gets the value of the valueBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getValueBoolean();

    /**
     * Sets the value of the valueBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setValueBoolean(Boolean value);

    /**
     * Gets the value of the valueCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getValueCodeableConcept();

    /**
     * Sets the value of the valueCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setValueCodeableConcept(CodeableConcept value);

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getExclude();

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setExclude(Boolean value);

}