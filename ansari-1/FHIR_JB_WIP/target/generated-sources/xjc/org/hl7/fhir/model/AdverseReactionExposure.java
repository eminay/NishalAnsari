//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model;



/**
 * Records an unexpected reaction suspected to be related to the exposure of the reaction subject to a substance.
 * 
 * <p>Java class for AdverseReaction.Exposure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdverseReaction.Exposure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}ExposureType" minOccurs="0"/&gt;
 *         &lt;element name="causalityExpectation" type="{http://hl7.org/fhir}CausalityExpectation" minOccurs="0"/&gt;
 *         &lt;element name="substance" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface AdverseReactionExposure
    extends BackboneElement
{


    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setDate(DateTime value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType }
     *     
     */
    ExposureType getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType }
     *     
     */
    void setType(ExposureType value);

    /**
     * Gets the value of the causalityExpectation property.
     * 
     * @return
     *     possible object is
     *     {@link CausalityExpectation }
     *     
     */
    CausalityExpectation getCausalityExpectation();

    /**
     * Sets the value of the causalityExpectation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CausalityExpectation }
     *     
     */
    void setCausalityExpectation(CausalityExpectation value);

    /**
     * Gets the value of the substance property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getSubstance();

    /**
     * Sets the value of the substance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setSubstance(ResourceReference value);

}