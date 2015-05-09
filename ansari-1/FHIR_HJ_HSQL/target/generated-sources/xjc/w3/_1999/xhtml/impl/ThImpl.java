//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package w3._1999.xhtml.impl;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import w3._1999.xhtml.Scope;
import w3._1999.xhtml.Th;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "th")
public class ThImpl
    extends FlowImpl
    implements Serializable, Equals, HashCode, Th
{

    @XmlAttribute(name = "abbr")
    protected String abbr;
    @XmlAttribute(name = "axis")
    @XmlSchemaType(name = "anySimpleType")
    protected String axis;
    @XmlAttribute
    @XmlIDREF
    protected List<Object> headers;
    @XmlAttribute(name = "scope")
    protected Scope scope;
    @XmlAttribute(name = "rowspan")
    protected BigInteger rowspan;
    @XmlAttribute(name = "colspan")
    protected BigInteger colspan;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected List<String> clazzs;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "valign")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valign;
    @XmlAttribute(name = "align")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(name = "char")
    protected String _char;
    @XmlAttribute(name = "charoff")
    protected String charoff;

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String value) {
        this.abbr = value;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String value) {
        this.axis = value;
    }

    public List<Object> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<Object>();
        }
        return this.headers;
    }

    public void setHeaders(List<Object> headers) {
        this.headers = headers;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope value) {
        this.scope = value;
    }

    public BigInteger getRowspan() {
        if (rowspan == null) {
            return new BigInteger("1");
        } else {
            return rowspan;
        }
    }

    public void setRowspan(BigInteger value) {
        this.rowspan = value;
    }

    public BigInteger getColspan() {
        if (colspan == null) {
            return new BigInteger("1");
        } else {
            return colspan;
        }
    }

    public void setColspan(BigInteger value) {
        this.colspan = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String value) {
        this.dir = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
    }

    public void setClazzs(List<String> clazzs) {
        this.clazzs = clazzs;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String value) {
        this.style = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getValign() {
        return valign;
    }

    public void setValign(String value) {
        this.valign = value;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }

    public String getChar() {
        return _char;
    }

    public void setChar(String value) {
        this._char = value;
    }

    public String getCharoff() {
        return charoff;
    }

    public void setCharoff(String value) {
        this.charoff = value;
    }

    public ThImpl withAbbr(String value) {
        setAbbr(value);
        return this;
    }

    public ThImpl withAxis(String value) {
        setAxis(value);
        return this;
    }

    public ThImpl withHeaders(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getHeaders().add(value);
            }
        }
        return this;
    }

    public ThImpl withHeaders(Collection<Object> values) {
        if (values!= null) {
            getHeaders().addAll(values);
        }
        return this;
    }

    public ThImpl withHeaders(List<Object> headers) {
        setHeaders(headers);
        return this;
    }

    public ThImpl withScope(Scope value) {
        setScope(value);
        return this;
    }

    public ThImpl withRowspan(BigInteger value) {
        setRowspan(value);
        return this;
    }

    public ThImpl withColspan(BigInteger value) {
        setColspan(value);
        return this;
    }

    public ThImpl withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public ThImpl withLang(String value) {
        setLang(value);
        return this;
    }

    public ThImpl withDir(String value) {
        setDir(value);
        return this;
    }

    public ThImpl withId(String value) {
        setId(value);
        return this;
    }

    public ThImpl withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public ThImpl withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public ThImpl withClazzs(List<String> clazzs) {
        setClazzs(clazzs);
        return this;
    }

    public ThImpl withStyle(String value) {
        setStyle(value);
        return this;
    }

    public ThImpl withTitle(String value) {
        setTitle(value);
        return this;
    }

    public ThImpl withValign(String value) {
        setValign(value);
        return this;
    }

    public ThImpl withAlign(String value) {
        setAlign(value);
        return this;
    }

    public ThImpl withChar(String value) {
        setChar(value);
        return this;
    }

    public ThImpl withCharoff(String value) {
        setCharoff(value);
        return this;
    }

    @Override
    public ThImpl withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    @Override
    public ThImpl withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    @Override
    public ThImpl withContent(List<Object> content) {
        setContent(content);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ThImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ThImpl that = ((ThImpl) object);
        {
            String lhsAbbr;
            lhsAbbr = this.getAbbr();
            String rhsAbbr;
            rhsAbbr = that.getAbbr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbr", lhsAbbr), LocatorUtils.property(thatLocator, "abbr", rhsAbbr), lhsAbbr, rhsAbbr)) {
                return false;
            }
        }
        {
            String lhsAxis;
            lhsAxis = this.getAxis();
            String rhsAxis;
            rhsAxis = that.getAxis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axis", lhsAxis), LocatorUtils.property(thatLocator, "axis", rhsAxis), lhsAxis, rhsAxis)) {
                return false;
            }
        }
        {
            List<Object> lhsHeaders;
            lhsHeaders = (((this.headers!= null)&&(!this.headers.isEmpty()))?this.getHeaders():null);
            List<Object> rhsHeaders;
            rhsHeaders = (((that.headers!= null)&&(!that.headers.isEmpty()))?that.getHeaders():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headers", lhsHeaders), LocatorUtils.property(thatLocator, "headers", rhsHeaders), lhsHeaders, rhsHeaders)) {
                return false;
            }
        }
        {
            Scope lhsScope;
            lhsScope = this.getScope();
            Scope rhsScope;
            rhsScope = that.getScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scope", lhsScope), LocatorUtils.property(thatLocator, "scope", rhsScope), lhsScope, rhsScope)) {
                return false;
            }
        }
        {
            BigInteger lhsRowspan;
            lhsRowspan = this.getRowspan();
            BigInteger rhsRowspan;
            rhsRowspan = that.getRowspan();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rowspan", lhsRowspan), LocatorUtils.property(thatLocator, "rowspan", rhsRowspan), lhsRowspan, rhsRowspan)) {
                return false;
            }
        }
        {
            BigInteger lhsColspan;
            lhsColspan = this.getColspan();
            BigInteger rhsColspan;
            rhsColspan = that.getColspan();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colspan", lhsColspan), LocatorUtils.property(thatLocator, "colspan", rhsColspan), lhsColspan, rhsColspan)) {
                return false;
            }
        }
        {
            String lhsLanguage;
            lhsLanguage = this.getLanguage();
            String rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage)) {
                return false;
            }
        }
        {
            String lhsLang;
            lhsLang = this.getLang();
            String rhsLang;
            rhsLang = that.getLang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lang", lhsLang), LocatorUtils.property(thatLocator, "lang", rhsLang), lhsLang, rhsLang)) {
                return false;
            }
        }
        {
            String lhsDir;
            lhsDir = this.getDir();
            String rhsDir;
            rhsDir = that.getDir();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dir", lhsDir), LocatorUtils.property(thatLocator, "dir", rhsDir), lhsDir, rhsDir)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            List<String> lhsClazzs;
            lhsClazzs = (((this.clazzs!= null)&&(!this.clazzs.isEmpty()))?this.getClazzs():null);
            List<String> rhsClazzs;
            rhsClazzs = (((that.clazzs!= null)&&(!that.clazzs.isEmpty()))?that.getClazzs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazzs", lhsClazzs), LocatorUtils.property(thatLocator, "clazzs", rhsClazzs), lhsClazzs, rhsClazzs)) {
                return false;
            }
        }
        {
            String lhsStyle;
            lhsStyle = this.getStyle();
            String rhsStyle;
            rhsStyle = that.getStyle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "style", lhsStyle), LocatorUtils.property(thatLocator, "style", rhsStyle), lhsStyle, rhsStyle)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            String lhsValign;
            lhsValign = this.getValign();
            String rhsValign;
            rhsValign = that.getValign();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valign", lhsValign), LocatorUtils.property(thatLocator, "valign", rhsValign), lhsValign, rhsValign)) {
                return false;
            }
        }
        {
            String lhsAlign;
            lhsAlign = this.getAlign();
            String rhsAlign;
            rhsAlign = that.getAlign();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "align", lhsAlign), LocatorUtils.property(thatLocator, "align", rhsAlign), lhsAlign, rhsAlign)) {
                return false;
            }
        }
        {
            String lhsChar;
            lhsChar = this.getChar();
            String rhsChar;
            rhsChar = that.getChar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_char", lhsChar), LocatorUtils.property(thatLocator, "_char", rhsChar), lhsChar, rhsChar)) {
                return false;
            }
        }
        {
            String lhsCharoff;
            lhsCharoff = this.getCharoff();
            String rhsCharoff;
            rhsCharoff = that.getCharoff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "charoff", lhsCharoff), LocatorUtils.property(thatLocator, "charoff", rhsCharoff), lhsCharoff, rhsCharoff)) {
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
            String theAbbr;
            theAbbr = this.getAbbr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbr", theAbbr), currentHashCode, theAbbr);
        }
        {
            String theAxis;
            theAxis = this.getAxis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axis", theAxis), currentHashCode, theAxis);
        }
        {
            List<Object> theHeaders;
            theHeaders = (((this.headers!= null)&&(!this.headers.isEmpty()))?this.getHeaders():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headers", theHeaders), currentHashCode, theHeaders);
        }
        {
            Scope theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
        }
        {
            BigInteger theRowspan;
            theRowspan = this.getRowspan();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rowspan", theRowspan), currentHashCode, theRowspan);
        }
        {
            BigInteger theColspan;
            theColspan = this.getColspan();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colspan", theColspan), currentHashCode, theColspan);
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage);
        }
        {
            String theLang;
            theLang = this.getLang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lang", theLang), currentHashCode, theLang);
        }
        {
            String theDir;
            theDir = this.getDir();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dir", theDir), currentHashCode, theDir);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            List<String> theClazzs;
            theClazzs = (((this.clazzs!= null)&&(!this.clazzs.isEmpty()))?this.getClazzs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clazzs", theClazzs), currentHashCode, theClazzs);
        }
        {
            String theStyle;
            theStyle = this.getStyle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "style", theStyle), currentHashCode, theStyle);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            String theValign;
            theValign = this.getValign();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valign", theValign), currentHashCode, theValign);
        }
        {
            String theAlign;
            theAlign = this.getAlign();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "align", theAlign), currentHashCode, theAlign);
        }
        {
            String theChar;
            theChar = this.getChar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_char", theChar), currentHashCode, theChar);
        }
        {
            String theCharoff;
            theCharoff = this.getCharoff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "charoff", theCharoff), currentHashCode, theCharoff);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
