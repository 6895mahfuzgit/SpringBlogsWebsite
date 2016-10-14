
package com.blog.start.rss;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * Specifies a web service that supports the rssCloud interface which can be implemented in HTTP-POST, XML-RPC or SOAP 1.1. 
 * Its purpose is to allow processes to register with a cloud to be notified of updates to the channel, implementing a lightweight publish-subscribe protocol for RSS feeds.
 * 
 * <p>Java class for tCloud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCloud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="domain" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="port" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registerProcedure" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protocol" use="required" type="{}tCloudProtocol" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCloud")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TCloud {

    @XmlAttribute(name = "domain", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String domain;
    @XmlAttribute(name = "port", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger port;
    @XmlAttribute(name = "path", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String path;
    @XmlAttribute(name = "registerProcedure", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String registerProcedure;
    @XmlAttribute(name = "protocol", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TCloudProtocol protocol;

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

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPort(BigInteger value) {
        this.port = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the registerProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getRegisterProcedure() {
        return registerProcedure;
    }

    /**
     * Sets the value of the registerProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRegisterProcedure(String value) {
        this.registerProcedure = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link TCloudProtocol }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TCloudProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCloudProtocol }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setProtocol(TCloudProtocol value) {
        this.protocol = value;
    }

}
