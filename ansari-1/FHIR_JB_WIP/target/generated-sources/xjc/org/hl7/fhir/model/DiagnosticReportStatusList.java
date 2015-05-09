//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticReportStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiagnosticReportStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="registered"/&gt;
 *     &lt;enumeration value="partial"/&gt;
 *     &lt;enumeration value="final"/&gt;
 *     &lt;enumeration value="corrected"/&gt;
 *     &lt;enumeration value="amended"/&gt;
 *     &lt;enumeration value="appended"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="entered in error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticReportStatus-list")
@XmlEnum
public enum DiagnosticReportStatusList {


    /**
     * The existence of the report is registered, but there is nothing yet available.
     * 
     */
    @XmlEnumValue("registered")
    REGISTERED("registered"),

    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     * 
     */
    @XmlEnumValue("partial")
    PARTIAL("partial"),

    /**
     * The report is complete and verified by an authorized person.
     * 
     */
    @XmlEnumValue("final")
    FINAL("final"),

    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person.
     * 
     */
    @XmlEnumValue("corrected")
    CORRECTED("corrected"),

    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person, and data has been changed.
     * 
     */
    @XmlEnumValue("amended")
    AMENDED("amended"),

    /**
     * The report has been modified subsequent to being Final, and is complete and verified by an authorized person. New content has been added, but existing content hasn't changed.
     * 
     */
    @XmlEnumValue("appended")
    APPENDED("appended"),

    /**
     * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The report has been withdrawn following previous Final release.
     * 
     */
    @XmlEnumValue("entered in error")
    ENTERED_IN_ERROR("entered in error");
    private final java.lang.String value;

    DiagnosticReportStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticReportStatusList fromValue(java.lang.String v) {
        for (DiagnosticReportStatusList c: DiagnosticReportStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
