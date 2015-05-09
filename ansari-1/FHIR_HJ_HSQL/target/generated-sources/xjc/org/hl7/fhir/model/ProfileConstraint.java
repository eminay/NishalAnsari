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
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Constraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Constraint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://hl7.org/fhir}id"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://hl7.org/fhir}ConstraintSeverity"/>
 *         &lt;element name="human" type="{http://hl7.org/fhir}string"/>
 *         &lt;element name="xpath" type="{http://hl7.org/fhir}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "ProfileConstraint")
@Table(name = "PROFILECONSTRAINT")
public interface ProfileConstraint
    extends BackboneElement
{


    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    Id getKey();

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    void setKey(Id value);

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintSeverity }
     *     
     */
    ConstraintSeverity getSeverity();

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintSeverity }
     *     
     */
    void setSeverity(ConstraintSeverity value);

    /**
     * Gets the value of the human property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getHuman();

    /**
     * Sets the value of the human property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setHuman(String value);

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getXpath();

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setXpath(String value);

}