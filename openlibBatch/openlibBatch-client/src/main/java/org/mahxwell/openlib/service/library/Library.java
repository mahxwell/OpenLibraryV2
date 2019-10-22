
package org.mahxwell.openlib.service.library;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour library complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="library">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="libraryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="libraryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="libraryPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "library", propOrder = {
    "libraryId",
    "libraryName",
    "libraryPostCode"
})
public class Library {

    protected Integer libraryId;
    protected String libraryName;
    protected String libraryPostCode;

    /**
     * Obtient la valeur de la propriété libraryId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLibraryId() {
        return libraryId;
    }

    /**
     * Définit la valeur de la propriété libraryId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLibraryId(Integer value) {
        this.libraryId = value;
    }

    /**
     * Obtient la valeur de la propriété libraryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Définit la valeur de la propriété libraryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Obtient la valeur de la propriété libraryPostCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryPostCode() {
        return libraryPostCode;
    }

    /**
     * Définit la valeur de la propriété libraryPostCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryPostCode(String value) {
        this.libraryPostCode = value;
    }

}
