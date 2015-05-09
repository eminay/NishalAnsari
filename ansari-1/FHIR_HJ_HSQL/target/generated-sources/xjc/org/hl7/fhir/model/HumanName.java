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
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for HumanName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HumanName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Element">
 *       &lt;sequence>
 *         &lt;element name="use" type="{http://hl7.org/fhir}NameUse" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="family" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="given" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "HumanName")
@Table(name = "HUMANNAME")
public interface HumanName
    extends Element
{


    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link NameUse }
     *     
     */
    NameUse getUse();

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameUse }
     *     
     */
    void setUse(NameUse value);

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getText();

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setText(String value);

    /**
     * Gets the value of the families property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the families property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getFamilies();

    /**
     * 
     * 
     */
    void setFamilies(List<String> families);

    /**
     * Gets the value of the givens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getGivens();

    /**
     * 
     * 
     */
    void setGivens(List<String> givens);

    /**
     * Gets the value of the prefixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getPrefixes();

    /**
     * 
     * 
     */
    void setPrefixes(List<String> prefixes);

    /**
     * Gets the value of the suffixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suffixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuffixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getSuffixes();

    /**
     * 
     * 
     */
    void setSuffixes(List<String> suffixes);

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

}
