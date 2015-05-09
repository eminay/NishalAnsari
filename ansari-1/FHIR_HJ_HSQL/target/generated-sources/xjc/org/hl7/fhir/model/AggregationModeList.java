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
 * <p>Java class for AggregationMode-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregationMode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contained"/>
 *     &lt;enumeration value="referenced"/>
 *     &lt;enumeration value="bundled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregationMode-list")
@XmlEnum
public enum AggregationModeList {


    /**
     * The reference is a local reference to a contained resource.
     * 
     */
    @XmlEnumValue("contained")
    CONTAINED("contained"),

    /**
     * The reference to to a resource that has to be resolved externally to the resource that includes the reference.
     * 
     */
    @XmlEnumValue("referenced")
    REFERENCED("referenced"),

    /**
     * The resource the reference points to will be found in the same bundle as the resource that includes the reference.
     * 
     */
    @XmlEnumValue("bundled")
    BUNDLED("bundled");
    private final java.lang.String value;

    AggregationModeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AggregationModeList fromValue(java.lang.String v) {
        for (AggregationModeList c: AggregationModeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
