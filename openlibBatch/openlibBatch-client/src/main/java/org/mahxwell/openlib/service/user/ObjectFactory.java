
package org.mahxwell.openlib.service.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.user package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "getUserResponse");
    private final static QName _Loginuser_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "loginuser");
    private final static QName _UserstosendmailResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "userstosendmailResponse");
    private final static QName _GetUser_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "getUser");
    private final static QName _Userstosendmail_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "userstosendmail");
    private final static QName _AdduserResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "adduserResponse");
    private final static QName _UpdateuserResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "updateuserResponse");
    private final static QName _Deleteuser_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "deleteuser");
    private final static QName _DeleteuserResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "deleteuserResponse");
    private final static QName _ListusersResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "listusersResponse");
    private final static QName _LoginuserResponse_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "loginuserResponse");
    private final static QName _Adduser_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "adduser");
    private final static QName _Listusers_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "listusers");
    private final static QName _Updateuser_QNAME = new QName("http://user.service.openlib.mahxwell.org/", "updateuser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Loginuser }
     * 
     */
    public Loginuser createLoginuser() {
        return new Loginuser();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link UserstosendmailResponse }
     * 
     */
    public UserstosendmailResponse createUserstosendmailResponse() {
        return new UserstosendmailResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link AdduserResponse }
     * 
     */
    public AdduserResponse createAdduserResponse() {
        return new AdduserResponse();
    }

    /**
     * Create an instance of {@link UpdateuserResponse }
     * 
     */
    public UpdateuserResponse createUpdateuserResponse() {
        return new UpdateuserResponse();
    }

    /**
     * Create an instance of {@link Userstosendmail }
     * 
     */
    public Userstosendmail createUserstosendmail() {
        return new Userstosendmail();
    }

    /**
     * Create an instance of {@link Deleteuser }
     * 
     */
    public Deleteuser createDeleteuser() {
        return new Deleteuser();
    }

    /**
     * Create an instance of {@link DeleteuserResponse }
     * 
     */
    public DeleteuserResponse createDeleteuserResponse() {
        return new DeleteuserResponse();
    }

    /**
     * Create an instance of {@link ListusersResponse }
     * 
     */
    public ListusersResponse createListusersResponse() {
        return new ListusersResponse();
    }

    /**
     * Create an instance of {@link LoginuserResponse }
     * 
     */
    public LoginuserResponse createLoginuserResponse() {
        return new LoginuserResponse();
    }

    /**
     * Create an instance of {@link Adduser }
     * 
     */
    public Adduser createAdduser() {
        return new Adduser();
    }

    /**
     * Create an instance of {@link Listusers }
     * 
     */
    public Listusers createListusers() {
        return new Listusers();
    }

    /**
     * Create an instance of {@link Updateuser }
     * 
     */
    public Updateuser createUpdateuser() {
        return new Updateuser();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loginuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "loginuser")
    public JAXBElement<Loginuser> createLoginuser(Loginuser value) {
        return new JAXBElement<Loginuser>(_Loginuser_QNAME, Loginuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserstosendmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "userstosendmailResponse")
    public JAXBElement<UserstosendmailResponse> createUserstosendmailResponse(UserstosendmailResponse value) {
        return new JAXBElement<UserstosendmailResponse>(_UserstosendmailResponse_QNAME, UserstosendmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userstosendmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "userstosendmail")
    public JAXBElement<Userstosendmail> createUserstosendmail(Userstosendmail value) {
        return new JAXBElement<Userstosendmail>(_Userstosendmail_QNAME, Userstosendmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdduserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "adduserResponse")
    public JAXBElement<AdduserResponse> createAdduserResponse(AdduserResponse value) {
        return new JAXBElement<AdduserResponse>(_AdduserResponse_QNAME, AdduserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "updateuserResponse")
    public JAXBElement<UpdateuserResponse> createUpdateuserResponse(UpdateuserResponse value) {
        return new JAXBElement<UpdateuserResponse>(_UpdateuserResponse_QNAME, UpdateuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deleteuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "deleteuser")
    public JAXBElement<Deleteuser> createDeleteuser(Deleteuser value) {
        return new JAXBElement<Deleteuser>(_Deleteuser_QNAME, Deleteuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "deleteuserResponse")
    public JAXBElement<DeleteuserResponse> createDeleteuserResponse(DeleteuserResponse value) {
        return new JAXBElement<DeleteuserResponse>(_DeleteuserResponse_QNAME, DeleteuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListusersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "listusersResponse")
    public JAXBElement<ListusersResponse> createListusersResponse(ListusersResponse value) {
        return new JAXBElement<ListusersResponse>(_ListusersResponse_QNAME, ListusersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginuserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "loginuserResponse")
    public JAXBElement<LoginuserResponse> createLoginuserResponse(LoginuserResponse value) {
        return new JAXBElement<LoginuserResponse>(_LoginuserResponse_QNAME, LoginuserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adduser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "adduser")
    public JAXBElement<Adduser> createAdduser(Adduser value) {
        return new JAXBElement<Adduser>(_Adduser_QNAME, Adduser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listusers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "listusers")
    public JAXBElement<Listusers> createListusers(Listusers value) {
        return new JAXBElement<Listusers>(_Listusers_QNAME, Listusers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updateuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.service.openlib.mahxwell.org/", name = "updateuser")
    public JAXBElement<Updateuser> createUpdateuser(Updateuser value) {
        return new JAXBElement<Updateuser>(_Updateuser_QNAME, Updateuser.class, null, value);
    }

}
