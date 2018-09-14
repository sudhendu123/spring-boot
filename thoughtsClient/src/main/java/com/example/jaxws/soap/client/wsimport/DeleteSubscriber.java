
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteSubscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSubscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authInfo" type="{/pocprov_V1.0}authInfo" minOccurs="0"/>
 *         &lt;element name="mobileInfo" type="{/pocprov_V1.0}mobileInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSubscriber", propOrder = {
    "authInfo",
    "mobileInfo"
})
public class DeleteSubscriber {

    protected AuthInfo authInfo;
    protected MobileInfo mobileInfo;

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
     * Gets the value of the mobileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobileInfo }
     *     
     */
    public MobileInfo getMobileInfo() {
        return mobileInfo;
    }

    /**
     * Sets the value of the mobileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileInfo }
     *     
     */
    public void setMobileInfo(MobileInfo value) {
        this.mobileInfo = value;
    }

}
