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
 * 				"Inline" covers inline or "text-level" elements
 * 			
 * 
 * <p>Java class for Inline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Inline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}a"/>
 *             &lt;choice>
 *               &lt;choice>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}br"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}span"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/>
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}map"/>
 *               &lt;/choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}img"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}i"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}b"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}big"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}small"/>
 *             &lt;/choice>
 *             &lt;choice>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}em"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}code"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}q"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}var"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/>
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/>
 *             &lt;/choice>
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
public interface Inline {


    /**
     * 
     * 				"Inline" covers inline or "text-level" elements
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
     * {@link Map }
     * {@link Samp }
     * {@link Big }
     * {@link A }
     * {@link Span }
     * {@link Small }
     * {@link String }
     * {@link Var }
     * {@link B }
     * {@link Tt }
     * {@link Code }
     * {@link Em }
     * {@link Q }
     * {@link Sub }
     * {@link Dfn }
     * {@link I }
     * {@link Abbr }
     * {@link Strong }
     * {@link Bdo }
     * {@link Img }
     * {@link Sup }
     * {@link Acronym }
     * {@link Cite }
     * {@link Br }
     * {@link Kbd }
     * 
     * 
     */
    List<Object> getContent();

    /**
     * 
     * 				"Inline" covers inline or "text-level" elements
     * 			
     * 
     */
    void setContent(List<Object> content);

}
