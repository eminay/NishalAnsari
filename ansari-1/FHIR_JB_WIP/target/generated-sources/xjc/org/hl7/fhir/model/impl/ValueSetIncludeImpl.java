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
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.Uri;
import org.hl7.fhir.model.ValueSetFilter;
import org.hl7.fhir.model.ValueSetInclude;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Include", propOrder = {
    "system",
    "version",
    "codes",
    "filters"
})
public class ValueSetIncludeImpl
    extends BackboneElementImpl
    implements ValueSetInclude, ToString
{

    @XmlElement(required = true, type = UriImpl.class)
    protected UriImpl system;
    @XmlElement(type = StringImpl.class)
    protected StringImpl version;
    @XmlElement(name = "code", type = CodeImpl.class)
    protected List<Code> codes;
    @XmlElement(name = "filter", type = ValueSetFilterImpl.class)
    protected List<ValueSetFilter> filters;

    public Uri getSystem() {
        return system;
    }

    public void setSystem(Uri value) {
        this.system = ((UriImpl) value);
    }

    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = ((StringImpl) value);
    }

    public List<Code> getCodes() {
        if (codes == null) {
            codes = new ArrayList<Code>();
        }
        return this.codes;
    }

    public List<ValueSetFilter> getFilters() {
        if (filters == null) {
            filters = new ArrayList<ValueSetFilter>();
        }
        return this.filters;
    }

    public java.lang.String toString() {
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
            Uri theSystem;
            theSystem = this.getSystem();
            strategy.appendField(locator, this, "system", buffer, theSystem);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            List<Code> theCodes;
            theCodes = (((this.codes!= null)&&(!this.codes.isEmpty()))?this.getCodes():null);
            strategy.appendField(locator, this, "codes", buffer, theCodes);
        }
        {
            List<ValueSetFilter> theFilters;
            theFilters = (((this.filters!= null)&&(!this.filters.isEmpty()))?this.getFilters():null);
            strategy.appendField(locator, this, "filters", buffer, theFilters);
        }
        return buffer;
    }

}
