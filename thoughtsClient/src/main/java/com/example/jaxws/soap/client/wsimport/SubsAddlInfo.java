
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subsAddlInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subsAddlInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispatchGrpMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalCorpID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsCreationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastActivationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingMDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roamingAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispatchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aliasMdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subsAddlInfo", propOrder = {
    "dispatchGrpMember",
    "internalCorpID",
    "userAgent",
    "subsCreationTime",
    "lastActivationTime",
    "billingMDN",
    "roamingAllowed",
    "userID",
    "vendorID",
    "dispatchType",
    "subsUserID",
    "aliasMdn"
})
public class SubsAddlInfo {

    protected String dispatchGrpMember;
    protected String internalCorpID;
    protected String userAgent;
    protected String subsCreationTime;
    protected String lastActivationTime;
    protected String billingMDN;
    protected String roamingAllowed;
    protected String userID;
    protected String vendorID;
    protected String dispatchType;
    protected String subsUserID;
    protected String aliasMdn;

    /**
     * Gets the value of the dispatchGrpMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchGrpMember() {
        return dispatchGrpMember;
    }

    /**
     * Sets the value of the dispatchGrpMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchGrpMember(String value) {
        this.dispatchGrpMember = value;
    }

    /**
     * Gets the value of the internalCorpID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCorpID() {
        return internalCorpID;
    }

    /**
     * Sets the value of the internalCorpID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCorpID(String value) {
        this.internalCorpID = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the subsCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsCreationTime() {
        return subsCreationTime;
    }

    /**
     * Sets the value of the subsCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsCreationTime(String value) {
        this.subsCreationTime = value;
    }

    /**
     * Gets the value of the lastActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivationTime() {
        return lastActivationTime;
    }

    /**
     * Sets the value of the lastActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastActivationTime(String value) {
        this.lastActivationTime = value;
    }

    /**
     * Gets the value of the billingMDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMDN() {
        return billingMDN;
    }

    /**
     * Sets the value of the billingMDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMDN(String value) {
        this.billingMDN = value;
    }

    /**
     * Gets the value of the roamingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoamingAllowed() {
        return roamingAllowed;
    }

    /**
     * Sets the value of the roamingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoamingAllowed(String value) {
        this.roamingAllowed = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the vendorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorID(String value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the dispatchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchType() {
        return dispatchType;
    }

    /**
     * Sets the value of the dispatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchType(String value) {
        this.dispatchType = value;
    }

    /**
     * Gets the value of the subsUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsUserID() {
        return subsUserID;
    }

    /**
     * Sets the value of the subsUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsUserID(String value) {
        this.subsUserID = value;
    }

    /**
     * Gets the value of the aliasMdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasMdn() {
        return aliasMdn;
    }

    /**
     * Sets the value of the aliasMdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasMdn(String value) {
        this.aliasMdn = value;
    }

}
