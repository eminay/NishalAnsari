//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package org.hl7.fhir.model.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

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
    implements Serializable, QueryResponse, Equals, HashCode
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

    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_QUERYRESPONSE_HJID")
    public Uri getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Uri value) {
        this.identifier = ((UriImpl) value);
    }

    @ManyToOne(targetEntity = QueryOutcome.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OUTCOME_QUERYRESPONSE_HJID")
    public QueryOutcome getOutcome() {
        return outcome;
    }

    public void setOutcome(QueryOutcome value) {
        this.outcome = ((QueryOutcomeImpl) value);
    }

    @ManyToOne(targetEntity = Integer.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TOTAL_QUERYRESPONSE_HJID")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer value) {
        this.total = ((IntegerImpl) value);
    }

    @OneToMany(targetEntity = Extension.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARAMETERS__QUERYRESPONSE_HJ_0")
    public List<Extension> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<Extension>();
        }
        return this.parameters;
    }

    public void setParameters(List<Extension> parameters) {
        this.parameters = parameters;
    }

    @OneToMany(targetEntity = Extension.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FIRSTS_QUERYRESPONSE_HJID")
    public List<Extension> getFirsts() {
        if (firsts == null) {
            firsts = new ArrayList<Extension>();
        }
        return this.firsts;
    }

    public void setFirsts(List<Extension> firsts) {
        this.firsts = firsts;
    }

    @OneToMany(targetEntity = Extension.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PREVIOUSES_QUERYRESPONSE_HJID")
    public List<Extension> getPreviouses() {
        if (previouses == null) {
            previouses = new ArrayList<Extension>();
        }
        return this.previouses;
    }

    public void setPreviouses(List<Extension> previouses) {
        this.previouses = previouses;
    }

    @OneToMany(targetEntity = Extension.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NEXTS_QUERYRESPONSE_HJID")
    public List<Extension> getNexts() {
        if (nexts == null) {
            nexts = new ArrayList<Extension>();
        }
        return this.nexts;
    }

    public void setNexts(List<Extension> nexts) {
        this.nexts = nexts;
    }

    @OneToMany(targetEntity = Extension.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LASTS_QUERYRESPONSE_HJID")
    public List<Extension> getLasts() {
        if (lasts == null) {
            lasts = new ArrayList<Extension>();
        }
        return this.lasts;
    }

    public void setLasts(List<Extension> lasts) {
        this.lasts = lasts;
    }

    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REFERENCES__QUERYRESPONSE_HJ_0")
    public List<ResourceReference> getReferences() {
        if (references == null) {
            references = new ArrayList<ResourceReference>();
        }
        return this.references;
    }

    public void setReferences(List<ResourceReference> references) {
        this.references = references;
    }

    public QueryResponseImpl withIdentifier(Uri value) {
        setIdentifier(value);
        return this;
    }

    public QueryResponseImpl withOutcome(QueryOutcome value) {
        setOutcome(value);
        return this;
    }

    public QueryResponseImpl withTotal(Integer value) {
        setTotal(value);
        return this;
    }

    public QueryResponseImpl withParameters(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getParameters().add(value);
            }
        }
        return this;
    }

    public QueryResponseImpl withParameters(Collection<Extension> values) {
        if (values!= null) {
            getParameters().addAll(values);
        }
        return this;
    }

    public QueryResponseImpl withParameters(List<Extension> parameters) {
        setParameters(parameters);
        return this;
    }

    public QueryResponseImpl withFirsts(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getFirsts().add(value);
            }
        }
        return this;
    }

    public QueryResponseImpl withFirsts(Collection<Extension> values) {
        if (values!= null) {
            getFirsts().addAll(values);
        }
        return this;
    }

    public QueryResponseImpl withFirsts(List<Extension> firsts) {
        setFirsts(firsts);
        return this;
    }

    public QueryResponseImpl withPreviouses(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getPreviouses().add(value);
            }
        }
        return this;
    }

    public QueryResponseImpl withPreviouses(Collection<Extension> values) {
        if (values!= null) {
            getPreviouses().addAll(values);
        }
        return this;
    }

    public QueryResponseImpl withPreviouses(List<Extension> previouses) {
        setPreviouses(previouses);
        return this;
    }

    public QueryResponseImpl withNexts(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getNexts().add(value);
            }
        }
        return this;
    }

    public QueryResponseImpl withNexts(Collection<Extension> values) {
        if (values!= null) {
            getNexts().addAll(values);
        }
        return this;
    }

    public QueryResponseImpl withNexts(List<Extension> nexts) {
        setNexts(nexts);
        return this;
    }

    public QueryResponseImpl withLasts(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getLasts().add(value);
            }
        }
        return this;
    }

    public QueryResponseImpl withLasts(Collection<Extension> values) {
        if (values!= null) {
            getLasts().addAll(values);
        }
        return this;
    }

    public QueryResponseImpl withLasts(List<Extension> lasts) {
        setLasts(lasts);
        return this;
    }

    public QueryResponseImpl withReferences(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getReferences().add(value);
            }
        }
        return this;
    }

    public QueryResponseImpl withReferences(Collection<ResourceReference> values) {
        if (values!= null) {
            getReferences().addAll(values);
        }
        return this;
    }

    public QueryResponseImpl withReferences(List<ResourceReference> references) {
        setReferences(references);
        return this;
    }

    @Override
    public QueryResponseImpl withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public QueryResponseImpl withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public QueryResponseImpl withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public QueryResponseImpl withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public QueryResponseImpl withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public QueryResponseImpl withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public QueryResponseImpl withId(String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QueryResponseImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final QueryResponseImpl that = ((QueryResponseImpl) object);
        {
            Uri lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Uri rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            QueryOutcome lhsOutcome;
            lhsOutcome = this.getOutcome();
            QueryOutcome rhsOutcome;
            rhsOutcome = that.getOutcome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outcome", lhsOutcome), LocatorUtils.property(thatLocator, "outcome", rhsOutcome), lhsOutcome, rhsOutcome)) {
                return false;
            }
        }
        {
            Integer lhsTotal;
            lhsTotal = this.getTotal();
            Integer rhsTotal;
            rhsTotal = that.getTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "total", lhsTotal), LocatorUtils.property(thatLocator, "total", rhsTotal), lhsTotal, rhsTotal)) {
                return false;
            }
        }
        {
            List<Extension> lhsParameters;
            lhsParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            List<Extension> rhsParameters;
            rhsParameters = (((that.parameters!= null)&&(!that.parameters.isEmpty()))?that.getParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parameters", lhsParameters), LocatorUtils.property(thatLocator, "parameters", rhsParameters), lhsParameters, rhsParameters)) {
                return false;
            }
        }
        {
            List<Extension> lhsFirsts;
            lhsFirsts = (((this.firsts!= null)&&(!this.firsts.isEmpty()))?this.getFirsts():null);
            List<Extension> rhsFirsts;
            rhsFirsts = (((that.firsts!= null)&&(!that.firsts.isEmpty()))?that.getFirsts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firsts", lhsFirsts), LocatorUtils.property(thatLocator, "firsts", rhsFirsts), lhsFirsts, rhsFirsts)) {
                return false;
            }
        }
        {
            List<Extension> lhsPreviouses;
            lhsPreviouses = (((this.previouses!= null)&&(!this.previouses.isEmpty()))?this.getPreviouses():null);
            List<Extension> rhsPreviouses;
            rhsPreviouses = (((that.previouses!= null)&&(!that.previouses.isEmpty()))?that.getPreviouses():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previouses", lhsPreviouses), LocatorUtils.property(thatLocator, "previouses", rhsPreviouses), lhsPreviouses, rhsPreviouses)) {
                return false;
            }
        }
        {
            List<Extension> lhsNexts;
            lhsNexts = (((this.nexts!= null)&&(!this.nexts.isEmpty()))?this.getNexts():null);
            List<Extension> rhsNexts;
            rhsNexts = (((that.nexts!= null)&&(!that.nexts.isEmpty()))?that.getNexts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nexts", lhsNexts), LocatorUtils.property(thatLocator, "nexts", rhsNexts), lhsNexts, rhsNexts)) {
                return false;
            }
        }
        {
            List<Extension> lhsLasts;
            lhsLasts = (((this.lasts!= null)&&(!this.lasts.isEmpty()))?this.getLasts():null);
            List<Extension> rhsLasts;
            rhsLasts = (((that.lasts!= null)&&(!that.lasts.isEmpty()))?that.getLasts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lasts", lhsLasts), LocatorUtils.property(thatLocator, "lasts", rhsLasts), lhsLasts, rhsLasts)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsReferences;
            lhsReferences = (((this.references!= null)&&(!this.references.isEmpty()))?this.getReferences():null);
            List<ResourceReference> rhsReferences;
            rhsReferences = (((that.references!= null)&&(!that.references.isEmpty()))?that.getReferences():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "references", lhsReferences), LocatorUtils.property(thatLocator, "references", rhsReferences), lhsReferences, rhsReferences)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Uri theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            QueryOutcome theOutcome;
            theOutcome = this.getOutcome();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outcome", theOutcome), currentHashCode, theOutcome);
        }
        {
            Integer theTotal;
            theTotal = this.getTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "total", theTotal), currentHashCode, theTotal);
        }
        {
            List<Extension> theParameters;
            theParameters = (((this.parameters!= null)&&(!this.parameters.isEmpty()))?this.getParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameters", theParameters), currentHashCode, theParameters);
        }
        {
            List<Extension> theFirsts;
            theFirsts = (((this.firsts!= null)&&(!this.firsts.isEmpty()))?this.getFirsts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firsts", theFirsts), currentHashCode, theFirsts);
        }
        {
            List<Extension> thePreviouses;
            thePreviouses = (((this.previouses!= null)&&(!this.previouses.isEmpty()))?this.getPreviouses():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previouses", thePreviouses), currentHashCode, thePreviouses);
        }
        {
            List<Extension> theNexts;
            theNexts = (((this.nexts!= null)&&(!this.nexts.isEmpty()))?this.getNexts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nexts", theNexts), currentHashCode, theNexts);
        }
        {
            List<Extension> theLasts;
            theLasts = (((this.lasts!= null)&&(!this.lasts.isEmpty()))?this.getLasts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lasts", theLasts), currentHashCode, theLasts);
        }
        {
            List<ResourceReference> theReferences;
            theReferences = (((this.references!= null)&&(!this.references.isEmpty()))?this.getReferences():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "references", theReferences), currentHashCode, theReferences);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}