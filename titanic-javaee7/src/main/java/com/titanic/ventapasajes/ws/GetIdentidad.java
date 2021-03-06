
package com.titanic.ventapasajes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oIdentidad" type="{http://wshr.mtc.gob.pe/}Identidad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oIdentidad"
})
@XmlRootElement(name = "getIdentidad")
public class GetIdentidad {

    protected Identidad oIdentidad;

    /**
     * Gets the value of the oIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link Identidad }
     *     
     */
    public Identidad getOIdentidad() {
        return oIdentidad;
    }

    /**
     * Sets the value of the oIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identidad }
     *     
     */
    public void setOIdentidad(Identidad value) {
        this.oIdentidad = value;
    }

}
