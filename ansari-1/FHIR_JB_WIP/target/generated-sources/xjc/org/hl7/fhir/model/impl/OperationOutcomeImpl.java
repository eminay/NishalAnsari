//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.OperationOutcome;
import org.hl7.fhir.model.OperationOutcomeIssue;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationOutcome", propOrder = {
    "issues"
})
@XmlRootElement(name = "OperationOutcome")
public class OperationOutcomeImpl
    extends ResourceImpl
    implements OperationOutcome, ToString
{

    @XmlElement(name = "issue", required = true, type = OperationOutcomeIssueImpl.class)
    protected List<OperationOutcomeIssue> issues;

    public List<OperationOutcomeIssue> getIssues() {
        if (issues == null) {
            issues = new ArrayList<OperationOutcomeIssue>();
        }
        return this.issues;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<OperationOutcomeIssue> theIssues;
            theIssues = (((this.issues!= null)&&(!this.issues.isEmpty()))?this.getIssues():null);
            strategy.appendField(locator, this, "issues", buffer, theIssues);
        }
        return buffer;
    }

}
