
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverConfigInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverConfigInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poCServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="XDMServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="presenceServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverConfigInfo", propOrder = {
    "poCServerName",
    "xdmServerName",
    "presenceServerName"
})
public class ServerConfigInfo {

    @XmlElement(required = true)
    protected String poCServerName;
    @XmlElement(name = "XDMServerName", required = true)
    protected String xdmServerName;
    @XmlElement(required = true)
    protected String presenceServerName;

    /**
     * Gets the value of the poCServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoCServerName() {
        return poCServerName;
    }

    /**
     * Sets the value of the poCServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoCServerName(String value) {
        this.poCServerName = value;
    }

    /**
     * Gets the value of the xdmServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDMServerName() {
        return xdmServerName;
    }

    /**
     * Sets the value of the xdmServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDMServerName(String value) {
        this.xdmServerName = value;
    }

    /**
     * Gets the value of the presenceServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresenceServerName() {
        return presenceServerName;
    }

    /**
     * Sets the value of the presenceServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresenceServerName(String value) {
        this.presenceServerName = value;
    }

}
