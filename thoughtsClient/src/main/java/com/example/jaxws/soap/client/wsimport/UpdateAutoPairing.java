
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAutoPairing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAutoPairing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authInfo" type="{/pocprov_V1.0}authInfo" minOccurs="0"/>
 *         &lt;element name="corpInfo" type="{/pocprov_V1.0}corpInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAutoPairing", propOrder = {
    "authInfo",
    "corpInfo"
})
public class UpdateAutoPairing {

    protected AuthInfo authInfo;
    protected CorpInfo corpInfo;

    /**
     * Gets the value of the authInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthInfo }
     *     
     */
    public AuthInfo getAuthInfo() {
        return authInfo;
    }

    /**
     * Sets the value of the authInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthInfo }
     *     
     */
    public void setAuthInfo(AuthInfo value) {
        this.authInfo = value;
    }

    /**
     * Gets the value of the corpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorpInfo }
     *     
     */
    public CorpInfo getCorpInfo() {
        return corpInfo;
    }

    /**
     * Sets the value of the corpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpInfo }
     *     
     */
    public void setCorpInfo(CorpInfo value) {
        this.corpInfo = value;
    }

}
