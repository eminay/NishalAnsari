//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package w3._1999.xhtml;

import java.util.List;


/**
 * 
 * 				pre uses "Inline" excluding big, small, sup or sup
 * 			
 * 
 * <p>Java class for pre.content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pre.content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}a"/>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}i"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}b"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}big"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}small"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}em"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}code"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}q"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}var"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}br"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}span"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}map"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface PreContent {


    /**
     * 
     * 				pre uses "Inline" excluding big, small, sup or sup
     * 			Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Q }
     * {@link Sub }
     * {@link Map }
     * {@link Samp }
     * {@link Big }
     * {@link Dfn }
     * {@link I }
     * {@link A }
     * {@link Abbr }
     * {@link Span }
     * {@link Strong }
     * {@link Small }
     * {@link Bdo }
     * {@link String }
     * {@link Sup }
     * {@link Var }
     * {@link B }
     * {@link Acronym }
     * {@link Tt }
     * {@link Code }
     * {@link Cite }
     * {@link Br }
     * {@link Kbd }
     * {@link Em }
     * 
     * 
     */
    List<Object> getContent();

    /**
     * 
     * 				pre uses "Inline" excluding big, small, sup or sup
     * 			
     * 
     */
    void setContent(List<Object> content);

}
