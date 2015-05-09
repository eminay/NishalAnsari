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
 * <p>Java class for SecurityEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="event" type="{http://hl7.org/fhir}SecurityEvent.Event"/>
 *         &lt;element name="participant" type="{http://hl7.org/fhir}SecurityEvent.Participant" maxOccurs="unbounded"/>
 *         &lt;element name="source" type="{http://hl7.org/fhir}SecurityEvent.Source"/>
 *         &lt;element name="object" type="{http://hl7.org/fhir}SecurityEvent.Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@Entity(name = "SecurityEvent")
@Table(name = "SECURITYEVENT")
public interface SecurityEvent
    extends Resource
{


    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventEvent }
     *     
     */
    SecurityEventEvent getEvent();

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventEvent }
     *     
     */
    void setEvent(SecurityEventEvent value);

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventParticipant }
     * 
     * 
     */
    List<SecurityEventParticipant> getParticipants();

    /**
     * 
     * 
     */
    void setParticipants(List<SecurityEventParticipant> participants);

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventSource }
     *     
     */
    SecurityEventSource getSource();

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventSource }
     *     
     */
    void setSource(SecurityEventSource value);

    /**
     * Gets the value of the objects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventObject }
     * 
     * 
     */
    List<SecurityEventObject> getObjects();

    /**
     * 
     * 
     */
    void setObjects(List<SecurityEventObject> objects);

}