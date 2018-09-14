
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for knPackageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="knPackageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tierPkgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addOnPkgId" type="{/pocprov_V1.0}knAddonPackageInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knPackageInfo", propOrder = {
    "tierPkgId",
    "addOnPkgId"
})
public class KnPackageInfo {

    protected String tierPkgId;
    protected KnAddonPackageInfo addOnPkgId;

    /**
     * Gets the value of the tierPkgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierPkgId() {
        return tierPkgId;
    }

    /**
     * Sets the value of the tierPkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierPkgId(String value) {
        this.tierPkgId = value;
    }

    /**
     * Gets the value of the addOnPkgId property.
     * 
     * @return
     *     possible object is
     *     {@link KnAddonPackageInfo }
     *     
     */
    public KnAddonPackageInfo getAddOnPkgId() {
        return addOnPkgId;
    }

    /**
     * Sets the value of the addOnPkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnAddonPackageInfo }
     *     
     */
    public void setAddOnPkgId(KnAddonPackageInfo value) {
        this.addOnPkgId = value;
    }

}
