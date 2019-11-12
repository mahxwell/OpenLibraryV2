
package org.mahxwell.openlib.service.copy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateCopy complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateCopy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://copy.service.openlib.mahxwell.org/}copy" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://copy.service.openlib.mahxwell.org/}copy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCopy", propOrder = {
    "arg0",
    "arg1"
})
public class UpdateCopy {

    protected Copy arg0;
    protected Copy arg1;

    /**
     * Obtient la valeur de la propriété arg0.
     * 
     * @return
     *     possible object is
     *     {@link Copy }
     *     
     */
    public Copy getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Copy }
     *     
     */
    public void setArg0(Copy value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     * 
     * @return
     *     possible object is
     *     {@link Copy }
     *     
     */
    public Copy getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Copy }
     *     
     */
    public void setArg1(Copy value) {
        this.arg1 = value;
    }

}
