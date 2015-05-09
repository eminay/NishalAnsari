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
 * <p>Java class for ExposureType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExposureType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="drugadmin"/>
 *     &lt;enumeration value="immuniz"/>
 *     &lt;enumeration value="coincidental"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExposureType-list")
@XmlEnum
public enum ExposureTypeList {


    /**
     * Drug Administration.
     * 
     */
    @XmlEnumValue("drugadmin")
    DRUGADMIN("drugadmin"),

    /**
     * Immunization.
     * 
     */
    @XmlEnumValue("immuniz")
    IMMUNIZ("immuniz"),

    /**
     * In the same area as the substance.
     * 
     */
    @XmlEnumValue("coincidental")
    COINCIDENTAL("coincidental");
    private final java.lang.String value;

    ExposureTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExposureTypeList fromValue(java.lang.String v) {
        for (ExposureTypeList c: ExposureTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
