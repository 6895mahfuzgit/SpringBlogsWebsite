
package com.blog.start.rss;

import org.w3c.dom.Element;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for tRssChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRssChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/>
 *         &lt;element name="copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pubDate" type="{}tRfc822FormatDate" minOccurs="0"/>
 *         &lt;element name="lastBuildDate" type="{}tRfc822FormatDate" minOccurs="0"/>
 *         &lt;element name="category" type="{}tCategory" minOccurs="0"/>
 *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docs" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="cloud" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="image" type="{}tImage" minOccurs="0"/>
 *         &lt;element name="textInput" type="{}tTextInput" minOccurs="0"/>
 *         &lt;element name="skipHours" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="skipDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="item" type="{}tRssItem" maxOccurs="unbounded"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRssChannel", propOrder = {
    "title",
    "link",
    "description",
    "language",
    "copyright",
    "pubDate",
    "lastBuildDate",
    "category",
    "generator",
    "docs",
    "cloud",
    "ttl",
    "image",
    "textInput",
    "skipHours",
    "skipDays",
    "item",
    "any"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TRssChannel {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String link;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String description;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String language;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String copyright;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pubDate;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lastBuildDate;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TCategory category;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String generator;
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String docs;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Object cloud;
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger ttl;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TImage image;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TTextInput textInput;
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger skipHours;
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger skipDays;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<TRssItem> item;
    @XmlAnyElement(lax = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> any;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the pubDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Sets the value of the pubDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPubDate(String value) {
        this.pubDate = value;
    }

    /**
     * Gets the value of the lastBuildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * Sets the value of the lastBuildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLastBuildDate(String value) {
        this.lastBuildDate = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TCategory }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCategory }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCategory(TCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the docs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDocs() {
        return docs;
    }

    /**
     * Sets the value of the docs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocs(String value) {
        this.docs = value;
    }

    /**
     * Gets the value of the cloud property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Object getCloud() {
        return cloud;
    }

    /**
     * Sets the value of the cloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCloud(Object value) {
        this.cloud = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTtl(BigInteger value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link TImage }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TImage getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImage }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setImage(TImage value) {
        this.image = value;
    }

    /**
     * Gets the value of the textInput property.
     * 
     * @return
     *     possible object is
     *     {@link TTextInput }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TTextInput getTextInput() {
        return textInput;
    }

    /**
     * Sets the value of the textInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTextInput }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTextInput(TTextInput value) {
        this.textInput = value;
    }

    /**
     * Gets the value of the skipHours property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getSkipHours() {
        return skipHours;
    }

    /**
     * Sets the value of the skipHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSkipHours(BigInteger value) {
        this.skipHours = value;
    }

    /**
     * Gets the value of the skipDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getSkipDays() {
        return skipDays;
    }

    /**
     * Sets the value of the skipDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSkipDays(BigInteger value) {
        this.skipDays = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRssItem }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<TRssItem> getItem() {
        if (item == null) {
            item = new ArrayList<TRssItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
