
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeServiceAuthStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeServiceAuthStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authInfo" type="{/pocprov_V1.0}authInfo" minOccurs="0"/>
 *         &lt;element name="mobileInfo" type="{/pocprov_V1.0}mobileInfo" minOccurs="0"/>
 *         &lt;element name="userServiceAuthStatus" type="{/pocprov_V1.0}userServiceAuthStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeServiceAuthStatus", propOrder = {
    "authInfo",
    "mobileInfo",
    "userServiceAuthStatus"
})
public class ChangeServiceAuthStatus {

    protected AuthInfo authInfo;
    protected MobileInfo mobileInfo;
    protected UserServiceAuthStatus userServiceAuthStatus;

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

    /**
     * Gets the value of the userServiceAuthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserServiceAuthStatus }
     *     
     */
    public UserServiceAuthStatus getUserServiceAuthStatus() {
        return userServiceAuthStatus;
    }

    /**
     * Sets the value of the userServiceAuthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserServiceAuthStatus }
     *     
     */
    public void setUserServiceAuthStatus(UserServiceAuthStatus value) {
        this.userServiceAuthStatus = value;
    }

}
