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
import org.hl7.fhir.model.Attachment;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.DiagnosticReport;
import org.hl7.fhir.model.DiagnosticReportImage;
import org.hl7.fhir.model.DiagnosticReportStatus;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticReport", propOrder = {
    "name",
    "status",
    "issued",
    "subject",
    "performer",
    "identifier",
    "requestDetails",
    "serviceCategory",
    "diagnosticPeriod",
    "diagnosticDateTime",
    "specimens",
    "results",
    "imagingStudies",
    "images",
    "conclusion",
    "codedDiagnosises",
    "presentedForms"
})
@XmlRootElement(name = "DiagnosticReport")
public class DiagnosticReportImpl
    extends ResourceImpl
    implements DiagnosticReport, ToString
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl name;
    @XmlElement(required = true, type = DiagnosticReportStatusImpl.class)
    protected DiagnosticReportStatusImpl status;
    @XmlElement(required = true, type = DateTimeImpl.class)
    protected DateTimeImpl issued;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl performer;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl identifier;
    @XmlElement(name = "requestDetail", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> requestDetails;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl serviceCategory;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl diagnosticPeriod;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl diagnosticDateTime;
    @XmlElement(name = "specimen", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> specimens;
    @XmlElement(name = "result", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> results;
    @XmlElement(name = "imagingStudy", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> imagingStudies;
    @XmlElement(name = "image", type = DiagnosticReportImageImpl.class)
    protected List<DiagnosticReportImage> images;
    @XmlElement(type = StringImpl.class)
    protected StringImpl conclusion;
    @XmlElement(name = "codedDiagnosis", type = CodeableConceptImpl.class)
    protected List<CodeableConcept> codedDiagnosises;
    @XmlElement(name = "presentedForm", type = AttachmentImpl.class)
    protected List<Attachment> presentedForms;

    public CodeableConcept getName() {
        return name;
    }

    public void setName(CodeableConcept value) {
        this.name = ((CodeableConceptImpl) value);
    }

    public DiagnosticReportStatus getStatus() {
        return status;
    }

    public void setStatus(DiagnosticReportStatus value) {
        this.status = ((DiagnosticReportStatusImpl) value);
    }

    public DateTime getIssued() {
        return issued;
    }

    public void setIssued(DateTime value) {
        this.issued = ((DateTimeImpl) value);
    }

    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getPerformer() {
        return performer;
    }

    public void setPerformer(ResourceReference value) {
        this.performer = ((ResourceReferenceImpl) value);
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    public List<ResourceReference> getRequestDetails() {
        if (requestDetails == null) {
            requestDetails = new ArrayList<ResourceReference>();
        }
        return this.requestDetails;
    }

    public CodeableConcept getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(CodeableConcept value) {
        this.serviceCategory = ((CodeableConceptImpl) value);
    }

    public Period getDiagnosticPeriod() {
        return diagnosticPeriod;
    }

    public void setDiagnosticPeriod(Period value) {
        this.diagnosticPeriod = ((PeriodImpl) value);
    }

    public DateTime getDiagnosticDateTime() {
        return diagnosticDateTime;
    }

    public void setDiagnosticDateTime(DateTime value) {
        this.diagnosticDateTime = ((DateTimeImpl) value);
    }

    public List<ResourceReference> getSpecimens() {
        if (specimens == null) {
            specimens = new ArrayList<ResourceReference>();
        }
        return this.specimens;
    }

    public List<ResourceReference> getResults() {
        if (results == null) {
            results = new ArrayList<ResourceReference>();
        }
        return this.results;
    }

    public List<ResourceReference> getImagingStudies() {
        if (imagingStudies == null) {
            imagingStudies = new ArrayList<ResourceReference>();
        }
        return this.imagingStudies;
    }

    public List<DiagnosticReportImage> getImages() {
        if (images == null) {
            images = new ArrayList<DiagnosticReportImage>();
        }
        return this.images;
    }

    public org.hl7.fhir.model.String getConclusion() {
        return conclusion;
    }

    public void setConclusion(org.hl7.fhir.model.String value) {
        this.conclusion = ((StringImpl) value);
    }

    public List<CodeableConcept> getCodedDiagnosises() {
        if (codedDiagnosises == null) {
            codedDiagnosises = new ArrayList<CodeableConcept>();
        }
        return this.codedDiagnosises;
    }

    public List<Attachment> getPresentedForms() {
        if (presentedForms == null) {
            presentedForms = new ArrayList<Attachment>();
        }
        return this.presentedForms;
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
            DiagnosticReportStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            DateTime theIssued;
            theIssued = this.getIssued();
            strategy.appendField(locator, this, "issued", buffer, theIssued);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            ResourceReference thePerformer;
            thePerformer = this.getPerformer();
            strategy.appendField(locator, this, "performer", buffer, thePerformer);
        }
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            List<ResourceReference> theRequestDetails;
            theRequestDetails = (((this.requestDetails!= null)&&(!this.requestDetails.isEmpty()))?this.getRequestDetails():null);
            strategy.appendField(locator, this, "requestDetails", buffer, theRequestDetails);
        }
        {
            CodeableConcept theServiceCategory;
            theServiceCategory = this.getServiceCategory();
            strategy.appendField(locator, this, "serviceCategory", buffer, theServiceCategory);
        }
        {
            Period theDiagnosticPeriod;
            theDiagnosticPeriod = this.getDiagnosticPeriod();
            strategy.appendField(locator, this, "diagnosticPeriod", buffer, theDiagnosticPeriod);
        }
        {
            DateTime theDiagnosticDateTime;
            theDiagnosticDateTime = this.getDiagnosticDateTime();
            strategy.appendField(locator, this, "diagnosticDateTime", buffer, theDiagnosticDateTime);
        }
        {
            List<ResourceReference> theSpecimens;
            theSpecimens = (((this.specimens!= null)&&(!this.specimens.isEmpty()))?this.getSpecimens():null);
            strategy.appendField(locator, this, "specimens", buffer, theSpecimens);
        }
        {
            List<ResourceReference> theResults;
            theResults = (((this.results!= null)&&(!this.results.isEmpty()))?this.getResults():null);
            strategy.appendField(locator, this, "results", buffer, theResults);
        }
        {
            List<ResourceReference> theImagingStudies;
            theImagingStudies = (((this.imagingStudies!= null)&&(!this.imagingStudies.isEmpty()))?this.getImagingStudies():null);
            strategy.appendField(locator, this, "imagingStudies", buffer, theImagingStudies);
        }
        {
            List<DiagnosticReportImage> theImages;
            theImages = (((this.images!= null)&&(!this.images.isEmpty()))?this.getImages():null);
            strategy.appendField(locator, this, "images", buffer, theImages);
        }
        {
            org.hl7.fhir.model.String theConclusion;
            theConclusion = this.getConclusion();
            strategy.appendField(locator, this, "conclusion", buffer, theConclusion);
        }
        {
            List<CodeableConcept> theCodedDiagnosises;
            theCodedDiagnosises = (((this.codedDiagnosises!= null)&&(!this.codedDiagnosises.isEmpty()))?this.getCodedDiagnosises():null);
            strategy.appendField(locator, this, "codedDiagnosises", buffer, theCodedDiagnosises);
        }
        {
            List<Attachment> thePresentedForms;
            thePresentedForms = (((this.presentedForms!= null)&&(!this.presentedForms.isEmpty()))?this.getPresentedForms():null);
            strategy.appendField(locator, this, "presentedForms", buffer, thePresentedForms);
        }
        return buffer;
    }

}
