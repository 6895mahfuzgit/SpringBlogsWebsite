
package com.blog.start.rss;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCloudProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tCloudProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xml-rpc"/>
 *     &lt;enumeration value="http-post"/>
 *     &lt;enumeration value="soap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tCloudProtocol")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-10-14T05:29:25+06:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum TCloudProtocol {

    @XmlEnumValue("xml-rpc")
    XML_RPC("xml-rpc"),
    @XmlEnumValue("http-post")
    HTTP_POST("http-post"),
    @XmlEnumValue("soap")
    SOAP("soap");
    private final String value;

    TCloudProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TCloudProtocol fromValue(String v) {
        for (TCloudProtocol c: TCloudProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
