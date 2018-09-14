
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowedSubsType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="roamingTypes" type="{/pocprov_V1.0}roamingTypes" minOccurs="0"/>
 *         &lt;element name="configFeatureSet" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="corpHierarchy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idmServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configInfo", propOrder = {
    "allowedSubsType",
    "roamingTypes",
    "configFeatureSet",
    "corpHierarchy",
    "idmServiceFlag",
    "catUrl"
})
public class ConfigInfo {

    protected Long allowedSubsType;
    protected RoamingTypes roamingTypes;
    protected Long configFeatureSet;
    protected String corpHierarchy;
    protected String idmServiceFlag;
    protected String catUrl;

    /**
     * Gets the value of the allowedSubsType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAllowedSubsType() {
        return allowedSubsType;
    }

    /**
     * Sets the value of the allowedSubsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllowedSubsType(Long value) {
        this.allowedSubsType = value;
    }

    /**
     * Gets the value of the roamingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RoamingTypes }
     *     
     */
    public RoamingTypes getRoamingTypes() {
        return roamingTypes;
    }

    /**
     * Sets the value of the roamingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoamingTypes }
     *     
     */
    public void setRoamingTypes(RoamingTypes value) {
        this.roamingTypes = value;
    }

    /**
     * Gets the value of the configFeatureSet property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfigFeatureSet() {
        return configFeatureSet;
    }

    /**
     * Sets the value of the configFeatureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfigFeatureSet(Long value) {
        this.configFeatureSet = value;
    }

    /**
     * Gets the value of the corpHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpHierarchy() {
        return corpHierarchy;
    }

    /**
     * Sets the value of the corpHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpHierarchy(String value) {
        this.corpHierarchy = value;
    }

    /**
     * Gets the value of the idmServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdmServiceFlag() {
        return idmServiceFlag;
    }

    /**
     * Sets the value of the idmServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdmServiceFlag(String value) {
        this.idmServiceFlag = value;
    }

    /**
     * Gets the value of the catUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatUrl() {
        return catUrl;
    }

    /**
     * Sets the value of the catUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatUrl(String value) {
        this.catUrl = value;
    }

}
