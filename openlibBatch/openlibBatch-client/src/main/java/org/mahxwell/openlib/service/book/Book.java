
package org.mahxwell.openlib.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour book complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorIdAuthor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bookTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="editorIdEditor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="genreIdGenre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="libraryIdLibrary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "authorIdAuthor",
    "bookId",
    "bookTitle",
    "bookYear",
    "editorIdEditor",
    "genreIdGenre",
    "libraryIdLibrary"
})
public class Book {

    protected Integer authorIdAuthor;
    protected Integer bookId;
    protected String bookTitle;
    protected Integer bookYear;
    protected Integer editorIdEditor;
    protected Integer genreIdGenre;
    protected Integer libraryIdLibrary;

    /**
     * Obtient la valeur de la propriété authorIdAuthor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorIdAuthor() {
        return authorIdAuthor;
    }

    /**
     * Définit la valeur de la propriété authorIdAuthor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorIdAuthor(Integer value) {
        this.authorIdAuthor = value;
    }

    /**
     * Obtient la valeur de la propriété bookId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * Définit la valeur de la propriété bookId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookId(Integer value) {
        this.bookId = value;
    }

    /**
     * Obtient la valeur de la propriété bookTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Définit la valeur de la propriété bookTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Obtient la valeur de la propriété bookYear.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookYear() {
        return bookYear;
    }

    /**
     * Définit la valeur de la propriété bookYear.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookYear(Integer value) {
        this.bookYear = value;
    }

    /**
     * Obtient la valeur de la propriété editorIdEditor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditorIdEditor() {
        return editorIdEditor;
    }

    /**
     * Définit la valeur de la propriété editorIdEditor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditorIdEditor(Integer value) {
        this.editorIdEditor = value;
    }

    /**
     * Obtient la valeur de la propriété genreIdGenre.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGenreIdGenre() {
        return genreIdGenre;
    }

    /**
     * Définit la valeur de la propriété genreIdGenre.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGenreIdGenre(Integer value) {
        this.genreIdGenre = value;
    }

    /**
     * Obtient la valeur de la propriété libraryIdLibrary.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLibraryIdLibrary() {
        return libraryIdLibrary;
    }

    /**
     * Définit la valeur de la propriété libraryIdLibrary.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLibraryIdLibrary(Integer value) {
        this.libraryIdLibrary = value;
    }

}
