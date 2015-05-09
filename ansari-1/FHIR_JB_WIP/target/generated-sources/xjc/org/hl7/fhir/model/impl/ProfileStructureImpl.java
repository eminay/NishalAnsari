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
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.ProfileElement;
import org.hl7.fhir.model.ProfileSearchParam;
import org.hl7.fhir.model.ProfileStructure;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Structure", propOrder = {
    "type",
    "name",
    "publish",
    "purpose",
    "elements",
    "searchParams"
})
public class ProfileStructureImpl
    extends BackboneElementImpl
    implements ProfileStructure, ToString
{

    @XmlElement(required = true, type = CodeImpl.class)
    protected CodeImpl type;
    @XmlElement(type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl publish;
    @XmlElement(type = StringImpl.class)
    protected StringImpl purpose;
    @XmlElement(name = "element", type = ProfileElementImpl.class)
    protected List<ProfileElement> elements;
    @XmlElement(name = "searchParam", type = ProfileSearchParamImpl.class)
    protected List<ProfileSearchParam> searchParams;

    public Code getType() {
        return type;
    }

    public void setType(Code value) {
        this.type = ((CodeImpl) value);
    }

    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean value) {
        this.publish = ((BooleanImpl) value);
    }

    public org.hl7.fhir.model.String getPurpose() {
        return purpose;
    }

    public void setPurpose(org.hl7.fhir.model.String value) {
        this.purpose = ((StringImpl) value);
    }

    public List<ProfileElement> getElements() {
        if (elements == null) {
            elements = new ArrayList<ProfileElement>();
        }
        return this.elements;
    }

    public List<ProfileSearchParam> getSearchParams() {
        if (searchParams == null) {
            searchParams = new ArrayList<ProfileSearchParam>();
        }
        return this.searchParams;
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
            Code theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean thePublish;
            thePublish = this.getPublish();
            strategy.appendField(locator, this, "publish", buffer, thePublish);
        }
        {
            org.hl7.fhir.model.String thePurpose;
            thePurpose = this.getPurpose();
            strategy.appendField(locator, this, "purpose", buffer, thePurpose);
        }
        {
            List<ProfileElement> theElements;
            theElements = (((this.elements!= null)&&(!this.elements.isEmpty()))?this.getElements():null);
            strategy.appendField(locator, this, "elements", buffer, theElements);
        }
        {
            List<ProfileSearchParam> theSearchParams;
            theSearchParams = (((this.searchParams!= null)&&(!this.searchParams.isEmpty()))?this.getSearchParams():null);
            strategy.appendField(locator, this, "searchParams", buffer, theSearchParams);
        }
        return buffer;
    }

}
