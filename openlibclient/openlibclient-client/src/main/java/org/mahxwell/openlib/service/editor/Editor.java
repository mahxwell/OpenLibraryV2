
package org.mahxwell.openlib.service.editor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour editor complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="editor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="editorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="editorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editorNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editor", propOrder = {
    "editorId",
    "editorName",
    "editorNationality"
})
public class Editor {

    protected Integer editorId;
    protected String editorName;
    protected String editorNationality;

    /**
     * Obtient la valeur de la propriété editorId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditorId() {
        return editorId;
    }

    /**
     * Définit la valeur de la propriété editorId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditorId(Integer value) {
        this.editorId = value;
    }

    /**
     * Obtient la valeur de la propriété editorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorName() {
        return editorName;
    }

    /**
     * Définit la valeur de la propriété editorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorName(String value) {
        this.editorName = value;
    }

    /**
     * Obtient la valeur de la propriété editorNationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorNationality() {
        return editorNationality;
    }

    /**
     * Définit la valeur de la propriété editorNationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorNationality(String value) {
        this.editorNationality = value;
    }

}
