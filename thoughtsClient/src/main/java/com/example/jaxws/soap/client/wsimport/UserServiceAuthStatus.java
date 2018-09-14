
package com.example.jaxws.soap.client.wsimport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userServiceAuthStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userServiceAuthStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poCServiceAuthStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userServiceAuthStatus", propOrder = {
    "poCServiceAuthStatus"
})
public class UserServiceAuthStatus {

    @XmlElement(required = true)
    protected String poCServiceAuthStatus;

    /**
     * Gets the value of the poCServiceAuthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoCServiceAuthStatus() {
        return poCServiceAuthStatus;
    }

    /**
     * Sets the value of the poCServiceAuthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoCServiceAuthStatus(String value) {
        this.poCServiceAuthStatus = value;
    }

}
