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
import w3._1999.xhtml.Flow;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "content"
})
@XmlSeeAlso({
    TdImpl.class,
    ThImpl.class,
    DdImpl.class,
    LiImpl.class,
    DivImpl.class
})
public class FlowImpl implements Serializable, Equals, HashCode, Flow
{

    @XmlElementRefs({
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = MapImpl.class),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = SampImpl.class),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = BigImpl.class),
        @XmlElementRef(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2Impl.class),
        @XmlElementRef(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = PImpl.class),
        @XmlElementRef(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = PreImpl.class),
        @XmlElementRef(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = UlImpl.class),
        @XmlElementRef(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = DivImpl.class),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = AImpl.class),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = SpanImpl.class),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = SmallImpl.class),
        @XmlElementRef(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6Impl.class),
        @XmlElementRef(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1Impl.class),
        @XmlElementRef(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3Impl.class),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = VarImpl.class),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = BImpl.class),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = TtImpl.class),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = CodeImpl.class),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = EmImpl.class),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = QImpl.class),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = SubImpl.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = DfnImpl.class),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = IImpl.class),
        @XmlElementRef(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = TableImpl.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = AbbrImpl.class),
        @XmlElementRef(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4Impl.class),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = StrongImpl.class),
        @XmlElementRef(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = BlockquoteImpl.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = BdoImpl.class),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = ImgImpl.class),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = SupImpl.class),
        @XmlElementRef(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5Impl.class),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = AcronymImpl.class),
        @XmlElementRef(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = OlImpl.class),
        @XmlElementRef(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = DlImpl.class),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = CiteImpl.class),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = BrImpl.class),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = KbdImpl.class),
        @XmlElementRef(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = HrImpl.class)
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

    public FlowImpl withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public FlowImpl withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

    public FlowImpl withContent(List<Object> content) {
        setContent(content);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlowImpl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FlowImpl that = ((FlowImpl) object);
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
