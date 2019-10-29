
package org.mahxwell.openlib.service.bookloaning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateBookloaning complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateBookloaning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://bookloaning.service.openlib.mahxwell.org/}bookloaning" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://bookloaning.service.openlib.mahxwell.org/}bookloaning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBookloaning", propOrder = {
    "arg0",
    "arg1"
})
public class UpdateBookloaning {

    protected Bookloaning arg0;
    protected Bookloaning arg1;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link Bookloaning }
     *     
     */
    public Bookloaning getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Bookloaning }
     *     
     */
    public void setArg0(Bookloaning value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link Bookloaning }
     *     
     */
    public Bookloaning getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Bookloaning }
     *     
     */
    public void setArg1(Bookloaning value) {
        this.arg1 = value;
    }

}
