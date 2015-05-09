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
import org.hl7.fhir.model.Extension;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.QueryOutcome;
import org.hl7.fhir.model.QueryResponse;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query.Response", propOrder = {
    "identifier",
    "outcome",
    "total",
    "parameters",
    "firsts",
    "previouses",
    "nexts",
    "lasts",
    "references"
})
public class QueryResponseImpl
    extends BackboneElementImpl
    implements QueryResponse, ToString
{

    @XmlElement(required = true, type = UriImpl.class)
    protected UriImpl identifier;
    @XmlElement(required = true, type = QueryOutcomeImpl.class)
    protected QueryOutcomeImpl outcome;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl total;
    @XmlElement(name = "parameter", type = ExtensionImpl.class)
    protected List<Extension> parameters;
    @XmlElement(name = "first", type = ExtensionImpl.class)
    protected List<Extension> firsts;
    @XmlElement(name = "previous", type = ExtensionImpl.class)
    protected List<Extension> previouses;
    @XmlElement(name = "next", type = ExtensionImpl.class)
    protected List<Extension> nexts;
    @XmlElement(name = "last", type = ExtensionImpl.class)
    protected List<Extension> lasts;
    @XmlElement(name = "reference", type = ResourceReferenceImpl.class)
    protected List<ResourceReference> references;

    public Uri getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Uri value) {
        this.identifier = ((UriImpl) value);
    }

    public QueryOutcome getOutcome() {
        return outcome;
    }

    public void setOutcome(QueryOutcome value) {
        this.outcome = ((QueryOutcomeImpl) value);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer value) {
        this.total = ((IntegerImpl) value);
    }

    public List<Extension> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Extension>();
        }
        return this.parameters;
    }

    public List<Extension> getFirsts() {
        if (firsts == null) {
            firsts = new ArrayList<Extension>();
        }
        return this.firsts;
    }

    public List<Extension> getPreviouses() {
        if (previouses == null) {
            previouses = new ArrayList<Extension>();
        }
        return this.previouses;
    }

    public List<Extension> getNexts() {
        if (nexts == null) {
            nexts = new ArrayList<Extension>();
        }
        return this.nexts;
    }

    public List<Extension> getLasts() {
        if (lasts == null) {
            lasts = new ArrayList<Extension>();
        }
        return this.lasts;
    }

    public List<ResourceReference> getReferences() {
        if (references == null) {
            references = new ArrayList<ResourceReference>();
        }
        return this.references;
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
            Uri theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            QueryOutcome theOutcome;
            theOutcome = this.getOutcome();
            strategy.appendField(locator, this, "outcome", buffer, theOutcome);
        }
        {
            Integer theTotal;
            theTotal = this.getTotal();
            strategy.appendField(locator, this, "total", buffer, theTotal);
        }
        {
            List<Extension> theParameters;
            theParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            strategy.appendField(locator, this, "parameters", buffer, theParameters);
        }
        {
            List<Extension> theFirsts;
            theFirsts = (((this.firsts!= null)&&(!this.firsts.isEmpty()))?this.getFirsts():null);
            strategy.appendField(locator, this, "firsts", buffer, theFirsts);
        }
        {
            List<Extension> thePreviouses;
            thePreviouses = (((this.previouses!= null)&&(!this.previouses.isEmpty()))?this.getPreviouses():null);
            strategy.appendField(locator, this, "previouses", buffer, thePreviouses);
        }
        {
            List<Extension> theNexts;
            theNexts = (((this.nexts!= null)&&(!this.nexts.isEmpty()))?this.getNexts():null);
            strategy.appendField(locator, this, "nexts", buffer, theNexts);
        }
        {
            List<Extension> theLasts;
            theLasts = (((this.lasts!= null)&&(!this.lasts.isEmpty()))?this.getLasts():null);
            strategy.appendField(locator, this, "lasts", buffer, theLasts);
        }
        {
            List<ResourceReference> theReferences;
            theReferences = (((this.references!= null)&&(!this.references.isEmpty()))?this.getReferences():null);
            strategy.appendField(locator, this, "references", buffer, theReferences);
        }
        return buffer;
    }

}
