//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criticality-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Criticality-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fatal"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Criticality-list")
@XmlEnum
public enum CriticalityList {


    /**
     * Likely to result in death if re-exposed.
     * 
     */
    @XmlEnumValue("fatal")
    FATAL("fatal"),

    /**
     * Likely to result in reactions that will need to be treated if re-exposed.
     * 
     */
    @XmlEnumValue("high")
    HIGH("high"),

    /**
     * Likely to result in reactions that will inconvenience the subject.
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * Not likely to result in any inconveniences for the subject.
     * 
     */
    @XmlEnumValue("low")
    LOW("low");
    private final java.lang.String value;

    CriticalityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CriticalityList fromValue(java.lang.String v) {
        for (CriticalityList c: CriticalityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
