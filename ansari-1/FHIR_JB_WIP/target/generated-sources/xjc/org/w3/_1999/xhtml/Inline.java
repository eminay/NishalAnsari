//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 06:17:33 PM MST 
//


package org.w3._1999.xhtml;

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
 * &lt;complexType name="Inline"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{http://www.w3.org/1999/xhtml}a"/&gt;
 *             &lt;choice&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}br"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}span"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}bdo"/&gt;
 *                 &lt;element ref="{http://www.w3.org/1999/xhtml}map"/&gt;
 *               &lt;/choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}img"/&gt;
 *             &lt;/choice&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}tt"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}i"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}b"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}big"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}small"/&gt;
 *             &lt;/choice&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}em"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}strong"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}dfn"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}code"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}q"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}samp"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}kbd"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}var"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}cite"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}abbr"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}acronym"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sub"/&gt;
 *               &lt;element ref="{http://www.w3.org/1999/xhtml}sup"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/choice&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * {@link A }
     * {@link Kbd }
     * {@link Span }
     * {@link I }
     * {@link Samp }
     * {@link Tt }
     * {@link Small }
     * {@link Code }
     * {@link Bdo }
     * {@link B }
     * {@link Em }
     * {@link Cite }
     * {@link Sup }
     * {@link Sub }
     * {@link Img }
     * {@link String }
     * {@link Br }
     * {@link Var }
     * {@link Dfn }
     * {@link Abbr }
     * {@link Map }
     * {@link Q }
     * {@link Big }
     * {@link Acronym }
     * {@link Strong }
     * 
     * 
     */
    List<Object> getContent();

}
