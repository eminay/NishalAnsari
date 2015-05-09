//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model;



/**
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Binding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Binding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="isExtensible" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="conformance" type="{http://hl7.org/fhir}BindingConformance" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="referenceUri" type="{http://hl7.org/fhir}uri"/&gt;
 *           &lt;element name="referenceResource" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ProfileBinding
    extends BackboneElement
{


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
     * Gets the value of the isExtensible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getIsExtensible();

    /**
     * Sets the value of the isExtensible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setIsExtensible(Boolean value);

    /**
     * Gets the value of the conformance property.
     * 
     * @return
     *     possible object is
     *     {@link BindingConformance }
     *     
     */
    BindingConformance getConformance();

    /**
     * Sets the value of the conformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingConformance }
     *     
     */
    void setConformance(BindingConformance value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescription(String value);

    /**
     * Gets the value of the referenceResource property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getReferenceResource();

    /**
     * Sets the value of the referenceResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setReferenceResource(ResourceReference value);

    /**
     * Gets the value of the referenceUri property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    Uri getReferenceUri();

    /**
     * Sets the value of the referenceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    void setReferenceUri(Uri value);

}