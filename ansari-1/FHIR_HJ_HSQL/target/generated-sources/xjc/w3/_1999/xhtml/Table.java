//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:05:24 PM MST 
//


package w3._1999.xhtml;

import java.math.BigInteger;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}caption" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}col" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}colgroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}thead" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}tfoot" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}tbody" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.w3.org/1999/xhtml}tr" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xhtml}attrs"/>
 *       &lt;attribute name="summary" type="{http://www.w3.org/1999/xhtml}Text" />
 *       &lt;attribute name="width" type="{http://www.w3.org/1999/xhtml}Length" />
 *       &lt;attribute name="border" type="{http://www.w3.org/1999/xhtml}Pixels" />
 *       &lt;attribute name="frame" type="{http://www.w3.org/1999/xhtml}TFrame" />
 *       &lt;attribute name="rules" type="{http://www.w3.org/1999/xhtml}TRules" />
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/1999/xhtml}Length" />
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/1999/xhtml}Length" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Table {


    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    Caption getCaption();

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    void setCaption(Caption value);

    /**
     * Gets the value of the colgroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colgroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColgroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Colgroup }
     * 
     * 
     */
    List<Colgroup> getColgroups();

    /**
     * 
     * 
     */
    void setColgroups(List<Colgroup> colgroups);

    /**
     * Gets the value of the cols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Col }
     * 
     * 
     */
    List<Col> getCols();

    /**
     * 
     * 
     */
    void setCols(List<Col> cols);

    /**
     * Gets the value of the thead property.
     * 
     * @return
     *     possible object is
     *     {@link Thead }
     *     
     */
    Thead getThead();

    /**
     * Sets the value of the thead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thead }
     *     
     */
    void setThead(Thead value);

    /**
     * Gets the value of the tfoot property.
     * 
     * @return
     *     possible object is
     *     {@link Tfoot }
     *     
     */
    Tfoot getTfoot();

    /**
     * Sets the value of the tfoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tfoot }
     *     
     */
    void setTfoot(Tfoot value);

    /**
     * Gets the value of the trs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tr }
     * 
     * 
     */
    List<Tr> getTrs();

    /**
     * 
     * 
     */
    void setTrs(List<Tr> trs);

    /**
     * Gets the value of the tbodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tbodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTbodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tbody }
     * 
     * 
     */
    List<Tbody> getTbodies();

    /**
     * 
     * 
     */
    void setTbodies(List<Tbody> tbodies);

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSummary();

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSummary(String value);

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getWidth();

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setWidth(String value);

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getBorder();

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setBorder(BigInteger value);

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link TFrame }
     *     
     */
    TFrame getFrame();

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFrame }
     *     
     */
    void setFrame(TFrame value);

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link TRules }
     *     
     */
    TRules getRules();

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRules }
     *     
     */
    void setRules(TRules value);

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCellspacing();

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCellspacing(String value);

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCellpadding();

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCellpadding(String value);

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLanguage();

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLanguage(String value);

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLang();

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLang(String value);

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDir();

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDir(String value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getClazzs();

    /**
     * 
     * 
     */
    void setClazzs(List<String> clazzs);

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getStyle();

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStyle(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

}
