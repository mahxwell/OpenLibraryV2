
package org.mahxwell.openlib.service.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="copyIdCopy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="getBookId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reservationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userIdUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "copyIdCopy",
    "getBookId",
    "reservationDate",
    "reservationId",
    "userIdUser"
})
public class Reservation {

    protected Integer copyIdCopy;
    protected Integer getBookId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDate;
    protected Integer reservationId;
    protected Integer userIdUser;

    /**
     * Obtient la valeur de la propriété copyIdCopy.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCopyIdCopy() {
        return copyIdCopy;
    }

    /**
     * Définit la valeur de la propriété copyIdCopy.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCopyIdCopy(Integer value) {
        this.copyIdCopy = value;
    }

    /**
     * Obtient la valeur de la propriété getBookId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetBookId() {
        return getBookId;
    }

    /**
     * Définit la valeur de la propriété getBookId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetBookId(Integer value) {
        this.getBookId = value;
    }

    /**
     * Obtient la valeur de la propriété reservationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationDate() {
        return reservationDate;
    }

    /**
     * Définit la valeur de la propriété reservationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationDate(XMLGregorianCalendar value) {
        this.reservationDate = value;
    }

    /**
     * Obtient la valeur de la propriété reservationId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * Définit la valeur de la propriété reservationId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReservationId(Integer value) {
        this.reservationId = value;
    }

    /**
     * Obtient la valeur de la propriété userIdUser.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserIdUser() {
        return userIdUser;
    }

    /**
     * Définit la valeur de la propriété userIdUser.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserIdUser(Integer value) {
        this.userIdUser = value;
    }

}
