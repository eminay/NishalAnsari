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
import org.hl7.fhir.model.HumanName;
import org.hl7.fhir.model.Id;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Instant;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Oid;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.QuestionnaireGroup;
import org.hl7.fhir.model.QuestionnaireQuestion;
import org.hl7.fhir.model.Range;
import org.hl7.fhir.model.Ratio;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SampledData;
import org.hl7.fhir.model.Schedule;
import org.hl7.fhir.model.Uri;
import org.hl7.fhir.model.Uuid;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Questionnaire.Question", propOrder = {
    "name",
    "text",
    "answerInstant",
    "answerDateTime",
    "answerString",
    "answerDate",
    "answerBoolean",
    "answerInteger",
    "answerDecimal",
    "choices",
    "options",
    "dataSchedule",
    "dataContact",
    "dataAddress",
    "dataHumanName",
    "dataSampledData",
    "dataResource",
    "dataRatio",
    "dataPeriod",
    "dataRange",
    "dataQuantity",
    "dataCoding",
    "dataCodeableConcept",
    "dataIdentifier",
    "dataAttachment",
    "dataId",
    "dataUuid",
    "dataOid",
    "dataCode",
    "dataDateTime",
    "dataDate",
    "dataUri",
    "dataString",
    "dataInstant",
    "dataBase64Binary",
    "dataDecimal",
    "dataInteger",
    "dataBoolean",
    "remarks",
    "groups"
})
public class QuestionnaireQuestionImpl
    extends BackboneElementImpl
    implements QuestionnaireQuestion, ToString
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl name;
    @XmlElement(type = StringImpl.class)
    protected StringImpl text;
    @XmlElement(type = InstantImpl.class)
    protected InstantImpl answerInstant;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl answerDateTime;
    @XmlElement(type = StringImpl.class)
    protected StringImpl answerString;
    @XmlElement(type = DateImpl.class)
    protected DateImpl answerDate;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl answerBoolean;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl answerInteger;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl answerDecimal;
    @XmlElement(name = "choice", type = CodingImpl.class)
    protected List<Coding> choices;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl options;
    @XmlElement(type = ScheduleImpl.class)
    protected ScheduleImpl dataSchedule;
    @XmlElement(type = ContactImpl.class)
    protected ContactImpl dataContact;
    @XmlElement(type = AddressImpl.class)
    protected AddressImpl dataAddress;
    @XmlElement(type = HumanNameImpl.class)
    protected HumanNameImpl dataHumanName;
    @XmlElement(type = SampledDataImpl.class)
    protected SampledDataImpl dataSampledData;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl dataResource;
    @XmlElement(type = RatioImpl.class)
    protected RatioImpl dataRatio;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl dataPeriod;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl dataRange;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl dataQuantity;
    @XmlElement(type = CodingImpl.class)
    protected CodingImpl dataCoding;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl dataCodeableConcept;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl dataIdentifier;
    @XmlElement(type = AttachmentImpl.class)
    protected AttachmentImpl dataAttachment;
    @XmlElement(type = IdImpl.class)
    protected IdImpl dataId;
    @XmlElement(type = UuidImpl.class)
    protected UuidImpl dataUuid;
    @XmlElement(type = OidImpl.class)
    protected OidImpl dataOid;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl dataCode;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl dataDateTime;
    @XmlElement(type = DateImpl.class)
    protected DateImpl dataDate;
    @XmlElement(type = UriImpl.class)
    protected UriImpl dataUri;
    @XmlElement(type = StringImpl.class)
    protected StringImpl dataString;
    @XmlElement(type = InstantImpl.class)
    protected InstantImpl dataInstant;
    @XmlElement(type = Base64BinaryImpl.class)
    protected Base64BinaryImpl dataBase64Binary;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl dataDecimal;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl dataInteger;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl dataBoolean;
    @XmlElement(type = StringImpl.class)
    protected StringImpl remarks;
    @XmlElement(name = "group", type = QuestionnaireGroupImpl.class)
    protected List<QuestionnaireGroup> groups;

    public CodeableConcept getName() {
        return name;
    }

    public void setName(CodeableConcept value) {
        this.name = ((CodeableConceptImpl) value);
    }

    public org.hl7.fhir.model.String getText() {
        return text;
    }

    public void setText(org.hl7.fhir.model.String value) {
        this.text = ((StringImpl) value);
    }

    public Instant getAnswerInstant() {
        return answerInstant;
    }

    public void setAnswerInstant(Instant value) {
        this.answerInstant = ((InstantImpl) value);
    }

    public DateTime getAnswerDateTime() {
        return answerDateTime;
    }

    public void setAnswerDateTime(DateTime value) {
        this.answerDateTime = ((DateTimeImpl) value);
    }

    public org.hl7.fhir.model.String getAnswerString() {
        return answerString;
    }

    public void setAnswerString(org.hl7.fhir.model.String value) {
        this.answerString = ((StringImpl) value);
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date value) {
        this.answerDate = ((DateImpl) value);
    }

    public Boolean getAnswerBoolean() {
        return answerBoolean;
    }

    public void setAnswerBoolean(Boolean value) {
        this.answerBoolean = ((BooleanImpl) value);
    }

    public Integer getAnswerInteger() {
        return answerInteger;
    }

    public void setAnswerInteger(Integer value) {
        this.answerInteger = ((IntegerImpl) value);
    }

    public Decimal getAnswerDecimal() {
        return answerDecimal;
    }

    public void setAnswerDecimal(Decimal value) {
        this.answerDecimal = ((DecimalImpl) value);
    }

    public List<Coding> getChoices() {
        if (choices == null) {
            choices = new ArrayList<Coding>();
        }
        return this.choices;
    }

    public ResourceReference getOptions() {
        return options;
    }

    public void setOptions(ResourceReference value) {
        this.options = ((ResourceReferenceImpl) value);
    }

    public Schedule getDataSchedule() {
        return dataSchedule;
    }

    public void setDataSchedule(Schedule value) {
        this.dataSchedule = ((ScheduleImpl) value);
    }

    public Contact getDataContact() {
        return dataContact;
    }

    public void setDataContact(Contact value) {
        this.dataContact = ((ContactImpl) value);
    }

    public Address getDataAddress() {
        return dataAddress;
    }

    public void setDataAddress(Address value) {
        this.dataAddress = ((AddressImpl) value);
    }

    public HumanName getDataHumanName() {
        return dataHumanName;
    }

    public void setDataHumanName(HumanName value) {
        this.dataHumanName = ((HumanNameImpl) value);
    }

    public SampledData getDataSampledData() {
        return dataSampledData;
    }

    public void setDataSampledData(SampledData value) {
        this.dataSampledData = ((SampledDataImpl) value);
    }

    public ResourceReference getDataResource() {
        return dataResource;
    }

    public void setDataResource(ResourceReference value) {
        this.dataResource = ((ResourceReferenceImpl) value);
    }

    public Ratio getDataRatio() {
        return dataRatio;
    }

    public void setDataRatio(Ratio value) {
        this.dataRatio = ((RatioImpl) value);
    }

    public Period getDataPeriod() {
        return dataPeriod;
    }

    public void setDataPeriod(Period value) {
        this.dataPeriod = ((PeriodImpl) value);
    }

    public Range getDataRange() {
        return dataRange;
    }

    public void setDataRange(Range value) {
        this.dataRange = ((RangeImpl) value);
    }

    public Quantity getDataQuantity() {
        return dataQuantity;
    }

    public void setDataQuantity(Quantity value) {
        this.dataQuantity = ((QuantityImpl) value);
    }

    public Coding getDataCoding() {
        return dataCoding;
    }

    public void setDataCoding(Coding value) {
        this.dataCoding = ((CodingImpl) value);
    }

    public CodeableConcept getDataCodeableConcept() {
        return dataCodeableConcept;
    }

    public void setDataCodeableConcept(CodeableConcept value) {
        this.dataCodeableConcept = ((CodeableConceptImpl) value);
    }

    public Identifier getDataIdentifier() {
        return dataIdentifier;
    }

    public void setDataIdentifier(Identifier value) {
        this.dataIdentifier = ((IdentifierImpl) value);
    }

    public Attachment getDataAttachment() {
        return dataAttachment;
    }

    public void setDataAttachment(Attachment value) {
        this.dataAttachment = ((AttachmentImpl) value);
    }

    public Id getDataId() {
        return dataId;
    }

    public void setDataId(Id value) {
        this.dataId = ((IdImpl) value);
    }

    public Uuid getDataUuid() {
        return dataUuid;
    }

    public void setDataUuid(Uuid value) {
        this.dataUuid = ((UuidImpl) value);
    }

    public Oid getDataOid() {
        return dataOid;
    }

    public void setDataOid(Oid value) {
        this.dataOid = ((OidImpl) value);
    }

    public Code getDataCode() {
        return dataCode;
    }

    public void setDataCode(Code value) {
        this.dataCode = ((CodeImpl) value);
    }

    public DateTime getDataDateTime() {
        return dataDateTime;
    }

    public void setDataDateTime(DateTime value) {
        this.dataDateTime = ((DateTimeImpl) value);
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date value) {
        this.dataDate = ((DateImpl) value);
    }

    public Uri getDataUri() {
        return dataUri;
    }

    public void setDataUri(Uri value) {
        this.dataUri = ((UriImpl) value);
    }

    public org.hl7.fhir.model.String getDataString() {
        return dataString;
    }

    public void setDataString(org.hl7.fhir.model.String value) {
        this.dataString = ((StringImpl) value);
    }

    public Instant getDataInstant() {
        return dataInstant;
    }

    public void setDataInstant(Instant value) {
        this.dataInstant = ((InstantImpl) value);
    }

    public Base64Binary getDataBase64Binary() {
        return dataBase64Binary;
    }

    public void setDataBase64Binary(Base64Binary value) {
        this.dataBase64Binary = ((Base64BinaryImpl) value);
    }

    public Decimal getDataDecimal() {
        return dataDecimal;
    }

    public void setDataDecimal(Decimal value) {
        this.dataDecimal = ((DecimalImpl) value);
    }

    public Integer getDataInteger() {
        return dataInteger;
    }

    public void setDataInteger(Integer value) {
        this.dataInteger = ((IntegerImpl) value);
    }

    public Boolean getDataBoolean() {
        return dataBoolean;
    }

    public void setDataBoolean(Boolean value) {
        this.dataBoolean = ((BooleanImpl) value);
    }

    public org.hl7.fhir.model.String getRemarks() {
        return remarks;
    }

    public void setRemarks(org.hl7.fhir.model.String value) {
        this.remarks = ((StringImpl) value);
    }

    public List<QuestionnaireGroup> getGroups() {
        if (groups == null) {
            groups = new ArrayList<QuestionnaireGroup>();
        }
        return this.groups;
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
            CodeableConcept theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            Instant theAnswerInstant;
            theAnswerInstant = this.getAnswerInstant();
            strategy.appendField(locator, this, "answerInstant", buffer, theAnswerInstant);
        }
        {
            DateTime theAnswerDateTime;
            theAnswerDateTime = this.getAnswerDateTime();
            strategy.appendField(locator, this, "answerDateTime", buffer, theAnswerDateTime);
        }
        {
            org.hl7.fhir.model.String theAnswerString;
            theAnswerString = this.getAnswerString();
            strategy.appendField(locator, this, "answerString", buffer, theAnswerString);
        }
        {
            Date theAnswerDate;
            theAnswerDate = this.getAnswerDate();
            strategy.appendField(locator, this, "answerDate", buffer, theAnswerDate);
        }
        {
            Boolean theAnswerBoolean;
            theAnswerBoolean = this.getAnswerBoolean();
            strategy.appendField(locator, this, "answerBoolean", buffer, theAnswerBoolean);
        }
        {
            Integer theAnswerInteger;
            theAnswerInteger = this.getAnswerInteger();
            strategy.appendField(locator, this, "answerInteger", buffer, theAnswerInteger);
        }
        {
            Decimal theAnswerDecimal;
            theAnswerDecimal = this.getAnswerDecimal();
            strategy.appendField(locator, this, "answerDecimal", buffer, theAnswerDecimal);
        }
        {
            List<Coding> theChoices;
            theChoices = (((this.choices!= null)&&(!this.choices.isEmpty()))?this.getChoices():null);
            strategy.appendField(locator, this, "choices", buffer, theChoices);
        }
        {
            ResourceReference theOptions;
            theOptions = this.getOptions();
            strategy.appendField(locator, this, "options", buffer, theOptions);
        }
        {
            Schedule theDataSchedule;
            theDataSchedule = this.getDataSchedule();
            strategy.appendField(locator, this, "dataSchedule", buffer, theDataSchedule);
        }
        {
            Contact theDataContact;
            theDataContact = this.getDataContact();
            strategy.appendField(locator, this, "dataContact", buffer, theDataContact);
        }
        {
            Address theDataAddress;
            theDataAddress = this.getDataAddress();
            strategy.appendField(locator, this, "dataAddress", buffer, theDataAddress);
        }
        {
            HumanName theDataHumanName;
            theDataHumanName = this.getDataHumanName();
            strategy.appendField(locator, this, "dataHumanName", buffer, theDataHumanName);
        }
        {
            SampledData theDataSampledData;
            theDataSampledData = this.getDataSampledData();
            strategy.appendField(locator, this, "dataSampledData", buffer, theDataSampledData);
        }
        {
            ResourceReference theDataResource;
            theDataResource = this.getDataResource();
            strategy.appendField(locator, this, "dataResource", buffer, theDataResource);
        }
        {
            Ratio theDataRatio;
            theDataRatio = this.getDataRatio();
            strategy.appendField(locator, this, "dataRatio", buffer, theDataRatio);
        }
        {
            Period theDataPeriod;
            theDataPeriod = this.getDataPeriod();
            strategy.appendField(locator, this, "dataPeriod", buffer, theDataPeriod);
        }
        {
            Range theDataRange;
            theDataRange = this.getDataRange();
            strategy.appendField(locator, this, "dataRange", buffer, theDataRange);
        }
        {
            Quantity theDataQuantity;
            theDataQuantity = this.getDataQuantity();
            strategy.appendField(locator, this, "dataQuantity", buffer, theDataQuantity);
        }
        {
            Coding theDataCoding;
            theDataCoding = this.getDataCoding();
            strategy.appendField(locator, this, "dataCoding", buffer, theDataCoding);
        }
        {
            CodeableConcept theDataCodeableConcept;
            theDataCodeableConcept = this.getDataCodeableConcept();
            strategy.appendField(locator, this, "dataCodeableConcept", buffer, theDataCodeableConcept);
        }
        {
            Identifier theDataIdentifier;
            theDataIdentifier = this.getDataIdentifier();
            strategy.appendField(locator, this, "dataIdentifier", buffer, theDataIdentifier);
        }
        {
            Attachment theDataAttachment;
            theDataAttachment = this.getDataAttachment();
            strategy.appendField(locator, this, "dataAttachment", buffer, theDataAttachment);
        }
        {
            Id theDataId;
            theDataId = this.getDataId();
            strategy.appendField(locator, this, "dataId", buffer, theDataId);
        }
        {
            Uuid theDataUuid;
            theDataUuid = this.getDataUuid();
            strategy.appendField(locator, this, "dataUuid", buffer, theDataUuid);
        }
        {
            Oid theDataOid;
            theDataOid = this.getDataOid();
            strategy.appendField(locator, this, "dataOid", buffer, theDataOid);
        }
        {
            Code theDataCode;
            theDataCode = this.getDataCode();
            strategy.appendField(locator, this, "dataCode", buffer, theDataCode);
        }
        {
            DateTime theDataDateTime;
            theDataDateTime = this.getDataDateTime();
            strategy.appendField(locator, this, "dataDateTime", buffer, theDataDateTime);
        }
        {
            Date theDataDate;
            theDataDate = this.getDataDate();
            strategy.appendField(locator, this, "dataDate", buffer, theDataDate);
        }
        {
            Uri theDataUri;
            theDataUri = this.getDataUri();
            strategy.appendField(locator, this, "dataUri", buffer, theDataUri);
        }
        {
            org.hl7.fhir.model.String theDataString;
            theDataString = this.getDataString();
            strategy.appendField(locator, this, "dataString", buffer, theDataString);
        }
        {
            Instant theDataInstant;
            theDataInstant = this.getDataInstant();
            strategy.appendField(locator, this, "dataInstant", buffer, theDataInstant);
        }
        {
            Base64Binary theDataBase64Binary;
            theDataBase64Binary = this.getDataBase64Binary();
            strategy.appendField(locator, this, "dataBase64Binary", buffer, theDataBase64Binary);
        }
        {
            Decimal theDataDecimal;
            theDataDecimal = this.getDataDecimal();
            strategy.appendField(locator, this, "dataDecimal", buffer, theDataDecimal);
        }
        {
            Integer theDataInteger;
            theDataInteger = this.getDataInteger();
            strategy.appendField(locator, this, "dataInteger", buffer, theDataInteger);
        }
        {
            Boolean theDataBoolean;
            theDataBoolean = this.getDataBoolean();
            strategy.appendField(locator, this, "dataBoolean", buffer, theDataBoolean);
        }
        {
            org.hl7.fhir.model.String theRemarks;
            theRemarks = this.getRemarks();
            strategy.appendField(locator, this, "remarks", buffer, theRemarks);
        }
        {
            List<QuestionnaireGroup> theGroups;
            theGroups = (((this.groups!= null)&&(!this.groups.isEmpty()))?this.getGroups():null);
            strategy.appendField(locator, this, "groups", buffer, theGroups);
        }
        return buffer;
    }

}
