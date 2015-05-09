//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityEventAction-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityEventAction-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityEventAction-list")
@XmlEnum
public enum SecurityEventActionList {


    /**
     * Create a new database object, such as Placing an Order.
     * 
     */
    C,

    /**
     * Display or print data, such as a Doctor Census.
     * 
     */
    R,

    /**
     * Update data, such as Revise Patient Information.
     * 
     */
    U,

    /**
     * Delete items, such as a doctor master file record.
     * 
     */
    D,

    /**
     * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
     * 
     */
    E;

    public java.lang.String value() {
        return name();
    }

    public static SecurityEventActionList fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
