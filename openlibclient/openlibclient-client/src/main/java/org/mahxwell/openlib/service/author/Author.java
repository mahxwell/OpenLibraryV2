
package org.mahxwell.openlib.service.author;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour author complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="author">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorBirthdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="authorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "author", propOrder = {
    "authorBirthdate",
    "authorId",
    "authorName",
    "authorNationality",
    "authorSurname"
})
public class Author {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorBirthdate;
    protected Integer authorId;
    protected String authorName;
    protected String authorNationality;
    protected String authorSurname;

    /**
     * Obtient la valeur de la propriété authorBirthdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorBirthdate() {
        return authorBirthdate;
    }

    /**
     * Définit la valeur de la propriété authorBirthdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorBirthdate(XMLGregorianCalendar value) {
        this.authorBirthdate = value;
    }

    /**
     * Obtient la valeur de la propriété authorId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorId() {
        return authorId;
    }

    /**
     * Définit la valeur de la propriété authorId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorId(Integer value) {
        this.authorId = value;
    }

    /**
     * Obtient la valeur de la propriété authorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Définit la valeur de la propriété authorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorName(String value) {
        this.authorName = value;
    }

    /**
     * Obtient la valeur de la propriété authorNationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorNationality() {
        return authorNationality;
    }

    /**
     * Définit la valeur de la propriété authorNationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorNationality(String value) {
        this.authorNationality = value;
    }

    /**
     * Obtient la valeur de la propriété authorSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorSurname() {
        return authorSurname;
    }

    /**
     * Définit la valeur de la propriété authorSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorSurname(String value) {
        this.authorSurname = value;
    }

}
