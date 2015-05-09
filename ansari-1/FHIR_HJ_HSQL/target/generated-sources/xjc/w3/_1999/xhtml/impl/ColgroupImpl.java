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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
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
import w3._1999.xhtml.Col;
import w3._1999.xhtml.Colgroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cols"
})
@XmlRootElement(name = "colgroup")
public class ColgroupImpl
    implements Serializable, Equals, HashCode, Colgroup
{

    @XmlElement(name = "col", type = ColImpl.class)
    protected List<Col> cols;
    @XmlAttribute(name = "span")
    protected BigInteger span;
    @XmlAttribute(name = "width")
    protected String width;
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

    public List<Col> getCols() {
        if (cols == null) {
            cols = new ArrayList<Col>();
        }
        return this.cols;
    }

    public void setCols(List<Col> cols) {
        this.cols = cols;
    }

    public BigInteger getSpan() {
        if (span == null) {
            return new BigInteger("1");
        } else {
            return span;
        }
    }

    public void setSpan(BigInteger value) {
        this.span = value;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String value) {
        this.width = value;
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

    public ColgroupImpl withCols(Col... values) {
        if (values!= null) {
            for (Col value: values) {
                getCols().add(value);
            }
        }
        return this;
    }

    public ColgroupImpl withCols(Collection<Col> values) {
        if (values!= null) {
            getCols().addAll(values);
        }
        return this;
    }

    public ColgroupImpl withCols(List<Col> cols) {
        setCols(cols);
        return this;
    }

    public ColgroupImpl withSpan(BigInteger value) {
        setSpan(value);
        return this;
    }

    public ColgroupImpl withWidth(String value) {
        setWidth(value);
        return this;
    }

    public ColgroupImpl withValign(String value) {
        setValign(value);
        return this;
    }

    public ColgroupImpl withAlign(String value) {
        setAlign(value);
        return this;
    }

    public ColgroupImpl withChar(String value) {
        setChar(value);
        return this;
    }

    public ColgroupImpl withCharoff(String value) {
        setCharoff(value);
        return this;
    }

    public ColgroupImpl withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public ColgroupImpl withLang(String value) {
        setLang(value);
        return this;
    }

    public ColgroupImpl withDir(String value) {
        setDir(value);
        return this;
    }

    public ColgroupImpl withId(String value) {
        setId(value);
        return this;
    }

    public ColgroupImpl withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public ColgroupImpl withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public ColgroupImpl withClazzs(List<String> clazzs) {
        setClazzs(clazzs);
        return this;
    }

    public ColgroupImpl withStyle(String value) {
        setStyle(value);
        return this;
    }

    public ColgroupImpl withTitle(String value) {
        setTitle(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ColgroupImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ColgroupImpl that = ((ColgroupImpl) object);
        {
            List<Col> lhsCols;
            lhsCols = (((this.cols!= null)&&(!this.cols.isEmpty()))?this.getCols():null);
            List<Col> rhsCols;
            rhsCols = (((that.cols!= null)&&(!that.cols.isEmpty()))?that.getCols():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cols", lhsCols), LocatorUtils.property(thatLocator, "cols", rhsCols), lhsCols, rhsCols)) {
                return false;
            }
        }
        {
            BigInteger lhsSpan;
            lhsSpan = this.getSpan();
            BigInteger rhsSpan;
            rhsSpan = that.getSpan();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "span", lhsSpan), LocatorUtils.property(thatLocator, "span", rhsSpan), lhsSpan, rhsSpan)) {
                return false;
            }
        }
        {
            String lhsWidth;
            lhsWidth = this.getWidth();
            String rhsWidth;
            rhsWidth = that.getWidth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "width", lhsWidth), LocatorUtils.property(thatLocator, "width", rhsWidth), lhsWidth, rhsWidth)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Col> theCols;
            theCols = (((this.cols!= null)&&(!this.cols.isEmpty()))?this.getCols():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cols", theCols), currentHashCode, theCols);
        }
        {
            BigInteger theSpan;
            theSpan = this.getSpan();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "span", theSpan), currentHashCode, theSpan);
        }
        {
            String theWidth;
            theWidth = this.getWidth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "width", theWidth), currentHashCode, theWidth);
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
