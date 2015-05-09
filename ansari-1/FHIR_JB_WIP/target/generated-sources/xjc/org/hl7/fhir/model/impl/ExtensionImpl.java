//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.hl7.fhir.model.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Address;
import org.hl7.fhir.model.Attachment;
import org.hl7.fhir.model.Base64Binary;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.Date;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Decimal;
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.HumanName;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Instant;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.Range;
import org.hl7.fhir.model.Ratio;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SampledData;
import org.hl7.fhir.model.Schedule;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension", propOrder = {
    "valueSchedule",
    "valueContact",
    "valueAddress",
    "valueHumanName",
    "valueSampledData",
    "valueResource",
    "valueRatio",
    "valuePeriod",
    "valueRange",
    "valueQuantity",
    "valueCoding",
    "valueCodeableConcept",
    "valueIdentifier",
    "valueAttachment",
    "valueCode",
    "valueDateTime",
    "valueDate",
    "valueUri",
    "valueString",
    "valueInstant",
    "valueBase64Binary",
    "valueDecimal",
    "valueInteger",
    "valueBoolean"
})
public class ExtensionImpl
    extends ElementImpl
    implements Extension, ToString
{

    @XmlElement(type = ScheduleImpl.class)
    protected ScheduleImpl valueSchedule;
    @XmlElement(type = ContactImpl.class)
    protected ContactImpl valueContact;
    @XmlElement(type = AddressImpl.class)
    protected AddressImpl valueAddress;
    @XmlElement(type = HumanNameImpl.class)
    protected HumanNameImpl valueHumanName;
    @XmlElement(type = SampledDataImpl.class)
    protected SampledDataImpl valueSampledData;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl valueResource;
    @XmlElement(type = RatioImpl.class)
    protected RatioImpl valueRatio;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl valuePeriod;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl valueRange;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl valueQuantity;
    @XmlElement(type = CodingImpl.class)
    protected CodingImpl valueCoding;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl valueCodeableConcept;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl valueIdentifier;
    @XmlElement(type = AttachmentImpl.class)
    protected AttachmentImpl valueAttachment;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl valueCode;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl valueDateTime;
    @XmlElement(type = DateImpl.class)
    protected DateImpl valueDate;
    @XmlElement(type = UriImpl.class)
    protected UriImpl valueUri;
    @XmlElement(type = StringImpl.class)
    protected StringImpl valueString;
    @XmlElement(type = InstantImpl.class)
    protected InstantImpl valueInstant;
    @XmlElement(type = Base64BinaryImpl.class)
    protected Base64BinaryImpl valueBase64Binary;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl valueDecimal;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl valueInteger;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl valueBoolean;
    @XmlAttribute(name = "url", required = true)
    protected java.lang.String url;

    public Schedule getValueSchedule() {
        return valueSchedule;
    }

    public void setValueSchedule(Schedule value) {
        this.valueSchedule = ((ScheduleImpl) value);
    }

    public Contact getValueContact() {
        return valueContact;
    }

    public void setValueContact(Contact value) {
        this.valueContact = ((ContactImpl) value);
    }

    public Address getValueAddress() {
        return valueAddress;
    }

    public void setValueAddress(Address value) {
        this.valueAddress = ((AddressImpl) value);
    }

    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    public void setValueHumanName(HumanName value) {
        this.valueHumanName = ((HumanNameImpl) value);
    }

    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    public void setValueSampledData(SampledData value) {
        this.valueSampledData = ((SampledDataImpl) value);
    }

    public ResourceReference getValueResource() {
        return valueResource;
    }

    public void setValueResource(ResourceReference value) {
        this.valueResource = ((ResourceReferenceImpl) value);
    }

    public Ratio getValueRatio() {
        return valueRatio;
    }

    public void setValueRatio(Ratio value) {
        this.valueRatio = ((RatioImpl) value);
    }

    public Period getValuePeriod() {
        return valuePeriod;
    }

    public void setValuePeriod(Period value) {
        this.valuePeriod = ((PeriodImpl) value);
    }

    public Range getValueRange() {
        return valueRange;
    }

    public void setValueRange(Range value) {
        this.valueRange = ((RangeImpl) value);
    }

    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    public void setValueQuantity(Quantity value) {
        this.valueQuantity = ((QuantityImpl) value);
    }

    public Coding getValueCoding() {
        return valueCoding;
    }

    public void setValueCoding(Coding value) {
        this.valueCoding = ((CodingImpl) value);
    }

    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = ((CodeableConceptImpl) value);
    }

    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = ((IdentifierImpl) value);
    }

    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    public void setValueAttachment(Attachment value) {
        this.valueAttachment = ((AttachmentImpl) value);
    }

    public Code getValueCode() {
        return valueCode;
    }

    public void setValueCode(Code value) {
        this.valueCode = ((CodeImpl) value);
    }

    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(DateTime value) {
        this.valueDateTime = ((DateTimeImpl) value);
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date value) {
        this.valueDate = ((DateImpl) value);
    }

    public Uri getValueUri() {
        return valueUri;
    }

    public void setValueUri(Uri value) {
        this.valueUri = ((UriImpl) value);
    }

    public org.hl7.fhir.model.String getValueString() {
        return valueString;
    }

    public void setValueString(org.hl7.fhir.model.String value) {
        this.valueString = ((StringImpl) value);
    }

    public Instant getValueInstant() {
        return valueInstant;
    }

    public void setValueInstant(Instant value) {
        this.valueInstant = ((InstantImpl) value);
    }

    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = ((Base64BinaryImpl) value);
    }

    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    public void setValueDecimal(Decimal value) {
        this.valueDecimal = ((DecimalImpl) value);
    }

    public Integer getValueInteger() {
        return valueInteger;
    }

    public void setValueInteger(Integer value) {
        this.valueInteger = ((IntegerImpl) value);
    }

    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(Boolean value) {
        this.valueBoolean = ((BooleanImpl) value);
    }

    public java.lang.String getUrl() {
        return url;
    }

    public void setUrl(java.lang.String value) {
        this.url = value;
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
            Schedule theValueSchedule;
            theValueSchedule = this.getValueSchedule();
            strategy.appendField(locator, this, "valueSchedule", buffer, theValueSchedule);
        }
        {
            Contact theValueContact;
            theValueContact = this.getValueContact();
            strategy.appendField(locator, this, "valueContact", buffer, theValueContact);
        }
        {
            Address theValueAddress;
            theValueAddress = this.getValueAddress();
            strategy.appendField(locator, this, "valueAddress", buffer, theValueAddress);
        }
        {
            HumanName theValueHumanName;
            theValueHumanName = this.getValueHumanName();
            strategy.appendField(locator, this, "valueHumanName", buffer, theValueHumanName);
        }
        {
            SampledData theValueSampledData;
            theValueSampledData = this.getValueSampledData();
            strategy.appendField(locator, this, "valueSampledData", buffer, theValueSampledData);
        }
        {
            ResourceReference theValueResource;
            theValueResource = this.getValueResource();
            strategy.appendField(locator, this, "valueResource", buffer, theValueResource);
        }
        {
            Ratio theValueRatio;
            theValueRatio = this.getValueRatio();
            strategy.appendField(locator, this, "valueRatio", buffer, theValueRatio);
        }
        {
            Period theValuePeriod;
            theValuePeriod = this.getValuePeriod();
            strategy.appendField(locator, this, "valuePeriod", buffer, theValuePeriod);
        }
        {
            Range theValueRange;
            theValueRange = this.getValueRange();
            strategy.appendField(locator, this, "valueRange", buffer, theValueRange);
        }
        {
            Quantity theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity);
        }
        {
            Coding theValueCoding;
            theValueCoding = this.getValueCoding();
            strategy.appendField(locator, this, "valueCoding", buffer, theValueCoding);
        }
        {
            CodeableConcept theValueCodeableConcept;
            theValueCodeableConcept = this.getValueCodeableConcept();
            strategy.appendField(locator, this, "valueCodeableConcept", buffer, theValueCodeableConcept);
        }
        {
            Identifier theValueIdentifier;
            theValueIdentifier = this.getValueIdentifier();
            strategy.appendField(locator, this, "valueIdentifier", buffer, theValueIdentifier);
        }
        {
            Attachment theValueAttachment;
            theValueAttachment = this.getValueAttachment();
            strategy.appendField(locator, this, "valueAttachment", buffer, theValueAttachment);
        }
        {
            Code theValueCode;
            theValueCode = this.getValueCode();
            strategy.appendField(locator, this, "valueCode", buffer, theValueCode);
        }
        {
            DateTime theValueDateTime;
            theValueDateTime = this.getValueDateTime();
            strategy.appendField(locator, this, "valueDateTime", buffer, theValueDateTime);
        }
        {
            Date theValueDate;
            theValueDate = this.getValueDate();
            strategy.appendField(locator, this, "valueDate", buffer, theValueDate);
        }
        {
            Uri theValueUri;
            theValueUri = this.getValueUri();
            strategy.appendField(locator, this, "valueUri", buffer, theValueUri);
        }
        {
            org.hl7.fhir.model.String theValueString;
            theValueString = this.getValueString();
            strategy.appendField(locator, this, "valueString", buffer, theValueString);
        }
        {
            Instant theValueInstant;
            theValueInstant = this.getValueInstant();
            strategy.appendField(locator, this, "valueInstant", buffer, theValueInstant);
        }
        {
            Base64Binary theValueBase64Binary;
            theValueBase64Binary = this.getValueBase64Binary();
            strategy.appendField(locator, this, "valueBase64Binary", buffer, theValueBase64Binary);
        }
        {
            Decimal theValueDecimal;
            theValueDecimal = this.getValueDecimal();
            strategy.appendField(locator, this, "valueDecimal", buffer, theValueDecimal);
        }
        {
            Integer theValueInteger;
            theValueInteger = this.getValueInteger();
            strategy.appendField(locator, this, "valueInteger", buffer, theValueInteger);
        }
        {
            Boolean theValueBoolean;
            theValueBoolean = this.getValueBoolean();
            strategy.appendField(locator, this, "valueBoolean", buffer, theValueBoolean);
        }
        {
            java.lang.String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        return buffer;
    }

}