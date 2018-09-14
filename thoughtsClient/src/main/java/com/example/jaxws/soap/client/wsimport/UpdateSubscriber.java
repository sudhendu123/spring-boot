
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSubscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSubscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authInfo" type="{/pocprov_V1.0}authInfo" minOccurs="0"/>
 *         &lt;element name="subsProvisionInfo" type="{/pocprov_V1.0}subsProvisionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSubscriber", propOrder = {
    "authInfo",
    "subsProvisionInfo"
})
public class UpdateSubscriber {

    protected AuthInfo authInfo;
    protected SubsProvisionInfo subsProvisionInfo;

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
     * Gets the value of the subsProvisionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubsProvisionInfo }
     *     
     */
    public SubsProvisionInfo getSubsProvisionInfo() {
        return subsProvisionInfo;
    }

    /**
     * Sets the value of the subsProvisionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsProvisionInfo }
     *     
     */
    public void setSubsProvisionInfo(SubsProvisionInfo value) {
        this.subsProvisionInfo = value;
    }

}
