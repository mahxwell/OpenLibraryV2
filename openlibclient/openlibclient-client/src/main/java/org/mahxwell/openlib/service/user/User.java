
package org.mahxwell.openlib.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour user complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPseudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "userEmail",
    "userId",
    "userName",
    "userPassword",
    "userPhone",
    "userPseudo",
    "userSurname"
})
public class User {

    protected String userEmail;
    protected Integer userId;
    protected String userName;
    protected String userPassword;
    protected String userPhone;
    protected String userPseudo;
    protected String userSurname;

    /**
     * Obtient la valeur de la propriété userEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Définit la valeur de la propriété userEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Obtient la valeur de la propriété userId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Définit la valeur de la propriété userId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Obtient la valeur de la propriété userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Définit la valeur de la propriété userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Obtient la valeur de la propriété userPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Définit la valeur de la propriété userPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Obtient la valeur de la propriété userPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * Définit la valeur de la propriété userPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPhone(String value) {
        this.userPhone = value;
    }

    /**
     * Obtient la valeur de la propriété userPseudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPseudo() {
        return userPseudo;
    }

    /**
     * Définit la valeur de la propriété userPseudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPseudo(String value) {
        this.userPseudo = value;
    }

    /**
     * Obtient la valeur de la propriété userSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSurname() {
        return userSurname;
    }

    /**
     * Définit la valeur de la propriété userSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSurname(String value) {
        this.userSurname = value;
    }

}
