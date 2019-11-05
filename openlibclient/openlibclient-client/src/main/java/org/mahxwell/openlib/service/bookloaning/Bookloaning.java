
package org.mahxwell.openlib.service.bookloaning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour bookloaning complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bookloaning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bookLoaningId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="copyIdCopy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getBookId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "bookloaning", propOrder = {
    "beginDate",
    "bookLoaningId",
    "copyIdCopy",
    "endDate",
    "extended",
    "getBookId",
    "userIdUser"
})
public class Bookloaning {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    protected Integer bookLoaningId;
    protected Integer copyIdCopy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected boolean extended;
    protected Integer getBookId;
    protected Integer userIdUser;

    /**
     * Obtient la valeur de la propriété beginDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Définit la valeur de la propriété beginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Obtient la valeur de la propriété bookLoaningId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookLoaningId() {
        return bookLoaningId;
    }

    /**
     * Définit la valeur de la propriété bookLoaningId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookLoaningId(Integer value) {
        this.bookLoaningId = value;
    }

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
     * Obtient la valeur de la propriété endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Définit la valeur de la propriété endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtient la valeur de la propriété extended.
     * 
     */
    public boolean isExtended() {
        return extended;
    }

    /**
     * Définit la valeur de la propriété extended.
     * 
     */
    public void setExtended(boolean value) {
        this.extended = value;
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
