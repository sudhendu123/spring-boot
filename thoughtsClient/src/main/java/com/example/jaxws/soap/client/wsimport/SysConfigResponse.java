
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sysConfigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sysConfigResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{/pocprov_V1.0}statusInfo">
 *       &lt;sequence>
 *         &lt;element name="configInfo" type="{/pocprov_V1.0}configInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sysConfigResponse", propOrder = {
    "configInfo"
})
public class SysConfigResponse
    extends StatusInfo
{

    protected ConfigInfo configInfo;

    /**
     * Gets the value of the configInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigInfo }
     *     
     */
    public ConfigInfo getConfigInfo() {
        return configInfo;
    }

    /**
     * Sets the value of the configInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigInfo }
     *     
     */
    public void setConfigInfo(ConfigInfo value) {
        this.configInfo = value;
    }

}
