
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientInfo" type="{/pocprov_V1.0}clientInfo"/>
 *         &lt;element name="credentialInfo" type="{/pocprov_V1.0}credentialInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authInfo", propOrder = {
    "clientInfo",
    "credentialInfo"
})
public class AuthInfo {

    @XmlElement(required = true)
    protected ClientInfo clientInfo;
    protected CredentialInfo credentialInfo;

    /**
     * Gets the value of the clientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfo }
     *     
     */
    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    /**
     * Sets the value of the clientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfo }
     *     
     */
    public void setClientInfo(ClientInfo value) {
        this.clientInfo = value;
    }

    /**
     * Gets the value of the credentialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialInfo }
     *     
     */
    public CredentialInfo getCredentialInfo() {
        return credentialInfo;
    }

    /**
     * Sets the value of the credentialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialInfo }
     *     
     */
    public void setCredentialInfo(CredentialInfo value) {
        this.credentialInfo = value;
    }

}
