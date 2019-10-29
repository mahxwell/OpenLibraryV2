
package org.mahxwell.openlib.service.copy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour copy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="copy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookIdBook" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="copyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copy", propOrder = {
    "bookIdBook",
    "copyId"
})
public class Copy {

    protected Integer bookIdBook;
    protected Integer copyId;

    /**
     * Obtient la valeur de la propriété bookIdBook.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookIdBook() {
        return bookIdBook;
    }

    /**
     * Définit la valeur de la propriété bookIdBook.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookIdBook(Integer value) {
        this.bookIdBook = value;
    }

    /**
     * Obtient la valeur de la propriété copyId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCopyId() {
        return copyId;
    }

    /**
     * Définit la valeur de la propriété copyId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCopyId(Integer value) {
        this.copyId = value;
    }

}
