//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="use" type="{http://hl7.org/fhir}IdentifierUse" minOccurs="0"/>
 *         &lt;element name="label" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *         &lt;element name="value" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="assigner" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "Identifier")
@Table(name = "IDENTIFIER")
public interface Identifier
    extends Element
{


    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierUse }
     *     
     */
    IdentifierUse getUse();

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierUse }
     *     
     */
    void setUse(IdentifierUse value);

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLabel();

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLabel(String value);

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    Uri getSystem();

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    void setSystem(Uri value);

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getValue();

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setValue(String value);

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    Period getPeriod();

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    void setPeriod(Period value);

    /**
     * Gets the value of the assigner property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getAssigner();

    /**
     * Sets the value of the assigner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setAssigner(ResourceReference value);

}
