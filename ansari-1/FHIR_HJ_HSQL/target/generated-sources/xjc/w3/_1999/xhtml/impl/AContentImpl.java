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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import w3._1999.xhtml.AContent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a.content", propOrder = {
    "content"
})
@XmlSeeAlso({
    AImpl.class
})
public class AContentImpl implements Serializable, Equals, HashCode, AContent
{

    @XmlElementRefs({
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = QImpl.class),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = SubImpl.class),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = MapImpl.class),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = SampImpl.class),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = BigImpl.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = DfnImpl.class),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = IImpl.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = AbbrImpl.class),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = SpanImpl.class),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = SmallImpl.class),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = StrongImpl.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = BdoImpl.class),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = ImgImpl.class),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = SupImpl.class),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = VarImpl.class),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = BImpl.class),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = AcronymImpl.class),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = TtImpl.class),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = CiteImpl.class),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = CodeImpl.class),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = BrImpl.class),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = KbdImpl.class),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = EmImpl.class)
    })
    @XmlMixed
    protected List<Object> content;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public void setContent(List<Object> content) {
        this.content = content;
    }

    public AContentImpl withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public AContentImpl withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    public AContentImpl withContent(List<Object> content) {
        setContent(content);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AContentImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AContentImpl that = ((AContentImpl) object);
        {
            List<Object> lhsContent;
            lhsContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            List<Object> rhsContent;
            rhsContent = (((that.content!= null)&&(!that.content.isEmpty()))?that.getContent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
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
            List<Object> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
