
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeMdn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeMdn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authInfo" type="{/pocprov_V1.0}authInfo" minOccurs="0"/>
 *         &lt;element name="oldMobileInfo" type="{/pocprov_V1.0}mobileInfo" minOccurs="0"/>
 *         &lt;element name="newMobileInfo" type="{/pocprov_V1.0}mobileInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeMdn", propOrder = {
    "authInfo",
    "oldMobileInfo",
    "newMobileInfo"
})
public class ChangeMdn {

    protected AuthInfo authInfo;
    protected MobileInfo oldMobileInfo;
    protected MobileInfo newMobileInfo;

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
     * Gets the value of the oldMobileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobileInfo }
     *     
     */
    public MobileInfo getOldMobileInfo() {
        return oldMobileInfo;
    }

    /**
     * Sets the value of the oldMobileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileInfo }
     *     
     */
    public void setOldMobileInfo(MobileInfo value) {
        this.oldMobileInfo = value;
    }

    /**
     * Gets the value of the newMobileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MobileInfo }
     *     
     */
    public MobileInfo getNewMobileInfo() {
        return newMobileInfo;
    }

    /**
     * Sets the value of the newMobileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileInfo }
     *     
     */
    public void setNewMobileInfo(MobileInfo value) {
        this.newMobileInfo = value;
    }

}
