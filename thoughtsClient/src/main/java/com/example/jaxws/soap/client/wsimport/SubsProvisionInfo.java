
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subsProvisionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subsProvisionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobileInfo" type="{/pocprov_V1.0}mobileInfo"/>
 *         &lt;element name="networkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriptionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roamingType" type="{/pocprov_V1.0}roamingTypes" minOccurs="0"/>
 *         &lt;element name="pairingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscrFSInfo" type="{/pocprov_V1.0}subscriberFSInfoList" minOccurs="0"/>
 *         &lt;element name="ufmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iDenDetails" type="{/pocprov_V1.0}subIdenDetails" minOccurs="0"/>
 *         &lt;element name="addPackageInfo" type="{/pocprov_V1.0}knPackageInfo" minOccurs="0"/>
 *         &lt;element name="removePackageInfo" type="{/pocprov_V1.0}knPackageInfo" minOccurs="0"/>
 *         &lt;element name="licenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subsProvisionInfo", propOrder = {
    "mobileInfo",
    "networkName",
    "accountId",
    "subscriptionType",
    "affiliateId",
    "payType",
    "roamingType",
    "pairingInd",
    "eMailAddress",
    "subsClientType",
    "corporateName",
    "subscrFSInfo",
    "ufmi",
    "iDenDetails",
    "addPackageInfo",
    "removePackageInfo",
    "licenseType"
})
public class SubsProvisionInfo {

    @XmlElement(required = true)
    protected MobileInfo mobileInfo;
    protected String networkName;
    protected String accountId;
    protected String subscriptionType;
    protected String affiliateId;
    protected String payType;
    protected RoamingTypes roamingType;
    protected String pairingInd;
    protected String eMailAddress;
    protected String subsClientType;
    protected String corporateName;
    protected SubscriberFSInfoList subscrFSInfo;
    protected String ufmi;
    protected SubIdenDetails iDenDetails;
    protected KnPackageInfo addPackageInfo;
    protected KnPackageInfo removePackageInfo;
    protected String licenseType;

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
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the subscriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Sets the value of the subscriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionType(String value) {
        this.subscriptionType = value;
    }

    /**
     * Gets the value of the affiliateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateId() {
        return affiliateId;
    }

    /**
     * Sets the value of the affiliateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateId(String value) {
        this.affiliateId = value;
    }

    /**
     * Gets the value of the payType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * Gets the value of the roamingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoamingTypes }
     *     
     */
    public RoamingTypes getRoamingType() {
        return roamingType;
    }

    /**
     * Sets the value of the roamingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoamingTypes }
     *     
     */
    public void setRoamingType(RoamingTypes value) {
        this.roamingType = value;
    }

    /**
     * Gets the value of the pairingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPairingInd() {
        return pairingInd;
    }

    /**
     * Sets the value of the pairingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPairingInd(String value) {
        this.pairingInd = value;
    }

    /**
     * Gets the value of the eMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * Sets the value of the eMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

    /**
     * Gets the value of the subsClientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsClientType() {
        return subsClientType;
    }

    /**
     * Sets the value of the subsClientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsClientType(String value) {
        this.subsClientType = value;
    }

    /**
     * Gets the value of the corporateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Sets the value of the corporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Gets the value of the subscrFSInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberFSInfoList }
     *     
     */
    public SubscriberFSInfoList getSubscrFSInfo() {
        return subscrFSInfo;
    }

    /**
     * Sets the value of the subscrFSInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberFSInfoList }
     *     
     */
    public void setSubscrFSInfo(SubscriberFSInfoList value) {
        this.subscrFSInfo = value;
    }

    /**
     * Gets the value of the ufmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfmi() {
        return ufmi;
    }

    /**
     * Sets the value of the ufmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfmi(String value) {
        this.ufmi = value;
    }

    /**
     * Gets the value of the iDenDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubIdenDetails }
     *     
     */
    public SubIdenDetails getIDenDetails() {
        return iDenDetails;
    }

    /**
     * Sets the value of the iDenDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubIdenDetails }
     *     
     */
    public void setIDenDetails(SubIdenDetails value) {
        this.iDenDetails = value;
    }

    /**
     * Gets the value of the addPackageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KnPackageInfo }
     *     
     */
    public KnPackageInfo getAddPackageInfo() {
        return addPackageInfo;
    }

    /**
     * Sets the value of the addPackageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnPackageInfo }
     *     
     */
    public void setAddPackageInfo(KnPackageInfo value) {
        this.addPackageInfo = value;
    }

    /**
     * Gets the value of the removePackageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KnPackageInfo }
     *     
     */
    public KnPackageInfo getRemovePackageInfo() {
        return removePackageInfo;
    }

    /**
     * Sets the value of the removePackageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnPackageInfo }
     *     
     */
    public void setRemovePackageInfo(KnPackageInfo value) {
        this.removePackageInfo = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseType(String value) {
        this.licenseType = value;
    }

}
