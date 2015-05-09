//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package w3._1999.xhtml.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
import w3._1999.xhtml.A;
import w3._1999.xhtml.Shape;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "a")
public class AImpl
    extends AContentImpl
    implements Serializable, Equals, HashCode, A
{

    @XmlAttribute(name = "charset")
    protected String charset;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlAttribute(name = "href")
    protected String href;
    @XmlAttribute(name = "hreflang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hreflang;
    @XmlAttribute(name = "rel")
    protected List<String> rels;
    @XmlAttribute(name = "rev")
    protected List<String> revs;
    @XmlAttribute(name = "shape")
    protected Shape shape;
    @XmlAttribute(name = "coords")
    protected String coords;
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
    @XmlAttribute(name = "accesskey")
    protected String accesskey;
    @XmlAttribute(name = "tabindex")
    protected Integer tabindex;

    public String getCharset() {
        return charset;
    }

    public void setCharset(String value) {
        this.charset = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String value) {
        this.href = value;
    }

    public String getHreflang() {
        return hreflang;
    }

    public void setHreflang(String value) {
        this.hreflang = value;
    }

    public List<String> getRels() {
        if (rels == null) {
            rels = new ArrayList<String>();
        }
        return this.rels;
    }

    public void setRels(List<String> rels) {
        this.rels = rels;
    }

    public List<String> getRevs() {
        if (revs == null) {
            revs = new ArrayList<String>();
        }
        return this.revs;
    }

    public void setRevs(List<String> revs) {
        this.revs = revs;
    }

    public Shape getShape() {
        if (shape == null) {
            return Shape.RECT;
        } else {
            return shape;
        }
    }

    public void setShape(Shape value) {
        this.shape = value;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String value) {
        this.coords = value;
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

    public String getAccesskey() {
        return accesskey;
    }

    public void setAccesskey(String value) {
        this.accesskey = value;
    }

    public Integer getTabindex() {
        return tabindex;
    }

    public void setTabindex(Integer value) {
        this.tabindex = value;
    }

    public AImpl withCharset(String value) {
        setCharset(value);
        return this;
    }

    public AImpl withType(String value) {
        setType(value);
        return this;
    }

    public AImpl withName(String value) {
        setName(value);
        return this;
    }

    public AImpl withHref(String value) {
        setHref(value);
        return this;
    }

    public AImpl withHreflang(String value) {
        setHreflang(value);
        return this;
    }

    public AImpl withRels(String... values) {
        if (values!= null) {
            for (String value: values) {
                getRels().add(value);
            }
        }
        return this;
    }

    public AImpl withRels(Collection<String> values) {
        if (values!= null) {
            getRels().addAll(values);
        }
        return this;
    }

    public AImpl withRels(List<String> rels) {
        setRels(rels);
        return this;
    }

    public AImpl withRevs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getRevs().add(value);
            }
        }
        return this;
    }

    public AImpl withRevs(Collection<String> values) {
        if (values!= null) {
            getRevs().addAll(values);
        }
        return this;
    }

    public AImpl withRevs(List<String> revs) {
        setRevs(revs);
        return this;
    }

    public AImpl withShape(Shape value) {
        setShape(value);
        return this;
    }

    public AImpl withCoords(String value) {
        setCoords(value);
        return this;
    }

    public AImpl withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    public AImpl withLang(String value) {
        setLang(value);
        return this;
    }

    public AImpl withDir(String value) {
        setDir(value);
        return this;
    }

    public AImpl withId(String value) {
        setId(value);
        return this;
    }

    public AImpl withClazzs(String... values) {
        if (values!= null) {
            for (String value: values) {
                getClazzs().add(value);
            }
        }
        return this;
    }

    public AImpl withClazzs(Collection<String> values) {
        if (values!= null) {
            getClazzs().addAll(values);
        }
        return this;
    }

    public AImpl withClazzs(List<String> clazzs) {
        setClazzs(clazzs);
        return this;
    }

    public AImpl withStyle(String value) {
        setStyle(value);
        return this;
    }

    public AImpl withTitle(String value) {
        setTitle(value);
        return this;
    }

    public AImpl withAccesskey(String value) {
        setAccesskey(value);
        return this;
    }

    public AImpl withTabindex(Integer value) {
        setTabindex(value);
        return this;
    }

    @Override
    public AImpl withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    @Override
    public AImpl withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    @Override
    public AImpl withContent(List<Object> content) {
        setContent(content);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AImpl that = ((AImpl) object);
        {
            String lhsCharset;
            lhsCharset = this.getCharset();
            String rhsCharset;
            rhsCharset = that.getCharset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "charset", lhsCharset), LocatorUtils.property(thatLocator, "charset", rhsCharset), lhsCharset, rhsCharset)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            String lhsHreflang;
            lhsHreflang = this.getHreflang();
            String rhsHreflang;
            rhsHreflang = that.getHreflang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hreflang", lhsHreflang), LocatorUtils.property(thatLocator, "hreflang", rhsHreflang), lhsHreflang, rhsHreflang)) {
                return false;
            }
        }
        {
            List<String> lhsRels;
            lhsRels = (((this.rels!= null)&&(!this.rels.isEmpty()))?this.getRels():null);
            List<String> rhsRels;
            rhsRels = (((that.rels!= null)&&(!that.rels.isEmpty()))?that.getRels():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rels", lhsRels), LocatorUtils.property(thatLocator, "rels", rhsRels), lhsRels, rhsRels)) {
                return false;
            }
        }
        {
            List<String> lhsRevs;
            lhsRevs = (((this.revs!= null)&&(!this.revs.isEmpty()))?this.getRevs():null);
            List<String> rhsRevs;
            rhsRevs = (((that.revs!= null)&&(!that.revs.isEmpty()))?that.getRevs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revs", lhsRevs), LocatorUtils.property(thatLocator, "revs", rhsRevs), lhsRevs, rhsRevs)) {
                return false;
            }
        }
        {
            Shape lhsShape;
            lhsShape = this.getShape();
            Shape rhsShape;
            rhsShape = that.getShape();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shape", lhsShape), LocatorUtils.property(thatLocator, "shape", rhsShape), lhsShape, rhsShape)) {
                return false;
            }
        }
        {
            String lhsCoords;
            lhsCoords = this.getCoords();
            String rhsCoords;
            rhsCoords = that.getCoords();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coords", lhsCoords), LocatorUtils.property(thatLocator, "coords", rhsCoords), lhsCoords, rhsCoords)) {
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
            String lhsAccesskey;
            lhsAccesskey = this.getAccesskey();
            String rhsAccesskey;
            rhsAccesskey = that.getAccesskey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accesskey", lhsAccesskey), LocatorUtils.property(thatLocator, "accesskey", rhsAccesskey), lhsAccesskey, rhsAccesskey)) {
                return false;
            }
        }
        {
            Integer lhsTabindex;
            lhsTabindex = this.getTabindex();
            Integer rhsTabindex;
            rhsTabindex = that.getTabindex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tabindex", lhsTabindex), LocatorUtils.property(thatLocator, "tabindex", rhsTabindex), lhsTabindex, rhsTabindex)) {
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
            String theCharset;
            theCharset = this.getCharset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "charset", theCharset), currentHashCode, theCharset);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref);
        }
        {
            String theHreflang;
            theHreflang = this.getHreflang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hreflang", theHreflang), currentHashCode, theHreflang);
        }
        {
            List<String> theRels;
            theRels = (((this.rels!= null)&&(!this.rels.isEmpty()))?this.getRels():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rels", theRels), currentHashCode, theRels);
        }
        {
            List<String> theRevs;
            theRevs = (((this.revs!= null)&&(!this.revs.isEmpty()))?this.getRevs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revs", theRevs), currentHashCode, theRevs);
        }
        {
            Shape theShape;
            theShape = this.getShape();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shape", theShape), currentHashCode, theShape);
        }
        {
            String theCoords;
            theCoords = this.getCoords();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coords", theCoords), currentHashCode, theCoords);
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
            String theAccesskey;
            theAccesskey = this.getAccesskey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accesskey", theAccesskey), currentHashCode, theAccesskey);
        }
        {
            Integer theTabindex;
            theTabindex = this.getTabindex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tabindex", theTabindex), currentHashCode, theTabindex);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
