
package jamp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passangerInfo" type="{http://service.jamp/}passangerInfo" minOccurs="0"/>
 *         &lt;element name="ticketInfo" type="{http://service.jamp/}ticketInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserveRequest", propOrder = {
    "passangerInfo",
    "ticketInfo"
})
public class ReserveRequest {

    protected PassangerInfo passangerInfo;
    protected TicketInfo ticketInfo;

    /**
     * Gets the value of the passangerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassangerInfo }
     *     
     */
    public PassangerInfo getPassangerInfo() {
        return passangerInfo;
    }

    /**
     * Sets the value of the passangerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassangerInfo }
     *     
     */
    public void setPassangerInfo(PassangerInfo value) {
        this.passangerInfo = value;
    }

    /**
     * Gets the value of the ticketInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketInfo }
     *     
     */
    public TicketInfo getTicketInfo() {
        return ticketInfo;
    }

    /**
     * Sets the value of the ticketInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketInfo }
     *     
     */
    public void setTicketInfo(TicketInfo value) {
        this.ticketInfo = value;
    }

}
