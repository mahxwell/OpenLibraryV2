
package org.mahxwell.openlib.service.user;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://user.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "adduser", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.Adduser")
    @ResponseWrapper(localName = "adduserResponse", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.AdduserResponse")
    @Action(input = "http://user.service.openlib.mahxwell.org/UserService/adduserRequest", output = "http://user.service.openlib.mahxwell.org/UserService/adduserResponse")
    public void adduser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.user.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginuser", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.Loginuser")
    @ResponseWrapper(localName = "loginuserResponse", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.LoginuserResponse")
    @Action(input = "http://user.service.openlib.mahxwell.org/UserService/loginuserRequest", output = "http://user.service.openlib.mahxwell.org/UserService/loginuserResponse")
    public User loginuser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listusers", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.Listusers")
    @ResponseWrapper(localName = "listusersResponse", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.ListusersResponse")
    @Action(input = "http://user.service.openlib.mahxwell.org/UserService/listusersRequest", output = "http://user.service.openlib.mahxwell.org/UserService/listusersResponse")
    public List<User> listusers();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateuser", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.Updateuser")
    @ResponseWrapper(localName = "updateuserResponse", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.UpdateuserResponse")
    @Action(input = "http://user.service.openlib.mahxwell.org/UserService/updateuserRequest", output = "http://user.service.openlib.mahxwell.org/UserService/updateuserResponse")
    public void updateuser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        User arg1);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.user.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userstosendmail", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.Userstosendmail")
    @ResponseWrapper(localName = "userstosendmailResponse", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.UserstosendmailResponse")
    @Action(input = "http://user.service.openlib.mahxwell.org/UserService/userstosendmailRequest", output = "http://user.service.openlib.mahxwell.org/UserService/userstosendmailResponse")
    public List<User> userstosendmail();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteuser", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.Deleteuser")
    @ResponseWrapper(localName = "deleteuserResponse", targetNamespace = "http://user.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.user.DeleteuserResponse")
    @Action(input = "http://user.service.openlib.mahxwell.org/UserService/deleteuserRequest", output = "http://user.service.openlib.mahxwell.org/UserService/deleteuserResponse")
    public void deleteuser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}
