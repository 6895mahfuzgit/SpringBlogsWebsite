
package com.blog.start.rss;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for tCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCategory">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCategory", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TCategory {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "domain")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String domain;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDomain(String value) {
        this.domain = value;
    }

}
