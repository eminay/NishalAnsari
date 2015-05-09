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
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="end" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "Period")
@Table(name = "PERIOD")
public interface Period
    extends Element
{


    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getStart();

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setStart(DateTime value);

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getEnd();

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setEnd(DateTime value);

}