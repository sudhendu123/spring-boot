
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subsDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subsDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{/pocprov_V1.0}statusInfo">
 *       &lt;sequence>
 *         &lt;element name="subsProvisionInfo" type="{/pocprov_V1.0}subsProvisionInfo" minOccurs="0"/>
 *         &lt;element name="serverConfigInfo" type="{/pocprov_V1.0}serverConfigInfo" minOccurs="0"/>
 *         &lt;element name="subStatusInfo" type="{/pocprov_V1.0}subStatusInfo" minOccurs="0"/>
 *         &lt;element name="subsAddlInfo" type="{/pocprov_V1.0}subsAddlInfo" minOccurs="0"/>
 *         &lt;element name="featureBitInfo" type="{/pocprov_V1.0}featureBitInfo" minOccurs="0"/>
 *         &lt;element name="clientFSInfo" type="{/pocprov_V1.0}featureBitInfo" minOccurs="0"/>
 *         &lt;element name="corpAdminFSInfo" type="{/pocprov_V1.0}featureBitInfo" minOccurs="0"/>
 *         &lt;element name="customInfo" type="{/pocprov_V1.0}customInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subsDetailsResponse", propOrder = {
    "subsProvisionInfo",
    "serverConfigInfo",
    "subStatusInfo",
    "subsAddlInfo",
    "featureBitInfo",
    "clientFSInfo",
    "corpAdminFSInfo",
    "customInfo"
})
public class SubsDetailsResponse
    extends StatusInfo
{

    protected SubsProvisionInfo subsProvisionInfo;
    protected ServerConfigInfo serverConfigInfo;
    protected SubStatusInfo subStatusInfo;
    protected SubsAddlInfo subsAddlInfo;
    protected FeatureBitInfo featureBitInfo;
    protected FeatureBitInfo clientFSInfo;
    protected FeatureBitInfo corpAdminFSInfo;
    protected CustomInfo customInfo;

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

    /**
     * Gets the value of the serverConfigInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServerConfigInfo }
     *     
     */
    public ServerConfigInfo getServerConfigInfo() {
        return serverConfigInfo;
    }

    /**
     * Sets the value of the serverConfigInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerConfigInfo }
     *     
     */
    public void setServerConfigInfo(ServerConfigInfo value) {
        this.serverConfigInfo = value;
    }

    /**
     * Gets the value of the subStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubStatusInfo }
     *     
     */
    public SubStatusInfo getSubStatusInfo() {
        return subStatusInfo;
    }

    /**
     * Sets the value of the subStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubStatusInfo }
     *     
     */
    public void setSubStatusInfo(SubStatusInfo value) {
        this.subStatusInfo = value;
    }

    /**
     * Gets the value of the subsAddlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubsAddlInfo }
     *     
     */
    public SubsAddlInfo getSubsAddlInfo() {
        return subsAddlInfo;
    }

    /**
     * Sets the value of the subsAddlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsAddlInfo }
     *     
     */
    public void setSubsAddlInfo(SubsAddlInfo value) {
        this.subsAddlInfo = value;
    }

    /**
     * Gets the value of the featureBitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureBitInfo }
     *     
     */
    public FeatureBitInfo getFeatureBitInfo() {
        return featureBitInfo;
    }

    /**
     * Sets the value of the featureBitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureBitInfo }
     *     
     */
    public void setFeatureBitInfo(FeatureBitInfo value) {
        this.featureBitInfo = value;
    }

    /**
     * Gets the value of the clientFSInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureBitInfo }
     *     
     */
    public FeatureBitInfo getClientFSInfo() {
        return clientFSInfo;
    }

    /**
     * Sets the value of the clientFSInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureBitInfo }
     *     
     */
    public void setClientFSInfo(FeatureBitInfo value) {
        this.clientFSInfo = value;
    }

    /**
     * Gets the value of the corpAdminFSInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureBitInfo }
     *     
     */
    public FeatureBitInfo getCorpAdminFSInfo() {
        return corpAdminFSInfo;
    }

    /**
     * Sets the value of the corpAdminFSInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureBitInfo }
     *     
     */
    public void setCorpAdminFSInfo(FeatureBitInfo value) {
        this.corpAdminFSInfo = value;
    }

    /**
     * Gets the value of the customInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomInfo }
     *     
     */
    public CustomInfo getCustomInfo() {
        return customInfo;
    }

    /**
     * Sets the value of the customInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomInfo }
     *     
     */
    public void setCustomInfo(CustomInfo value) {
        this.customInfo = value;
    }

}
