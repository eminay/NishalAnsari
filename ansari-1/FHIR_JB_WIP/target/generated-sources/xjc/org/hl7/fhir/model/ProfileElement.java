//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="path" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="representation" type="{http://hl7.org/fhir}PropertyRepresentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="slicing" type="{http://hl7.org/fhir}Profile.Slicing" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://hl7.org/fhir}Profile.Definition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ProfileElement
    extends BackboneElement
{


    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPath();

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPath(String value);

    /**
     * Gets the value of the representations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyRepresentation }
     * 
     * 
     */
    List<PropertyRepresentation> getRepresentations();

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
     * Gets the value of the slicing property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileSlicing }
     *     
     */
    ProfileSlicing getSlicing();

    /**
     * Sets the value of the slicing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileSlicing }
     *     
     */
    void setSlicing(ProfileSlicing value);

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDefinition }
     *     
     */
    ProfileDefinition getDefinition();

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDefinition }
     *     
     */
    void setDefinition(ProfileDefinition value);

}
