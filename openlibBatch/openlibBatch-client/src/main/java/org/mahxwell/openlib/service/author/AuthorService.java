
package org.mahxwell.openlib.service.author;

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
@WebService(name = "AuthorService", targetNamespace = "http://author.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AuthorService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addAuthor", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.AddAuthor")
    @ResponseWrapper(localName = "addAuthorResponse", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.AddAuthorResponse")
    @Action(input = "http://author.service.openlib.mahxwell.org/AuthorService/addAuthorRequest", output = "http://author.service.openlib.mahxwell.org/AuthorService/addAuthorResponse")
    public void addAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        Author arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.author.Author
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuthor", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.GetAuthor")
    @ResponseWrapper(localName = "getAuthorResponse", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.GetAuthorResponse")
    @Action(input = "http://author.service.openlib.mahxwell.org/AuthorService/getAuthorRequest", output = "http://author.service.openlib.mahxwell.org/AuthorService/getAuthorResponse")
    public Author getAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateAuthor", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.UpdateAuthor")
    @ResponseWrapper(localName = "updateAuthorResponse", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.UpdateAuthorResponse")
    @Action(input = "http://author.service.openlib.mahxwell.org/AuthorService/updateAuthorRequest", output = "http://author.service.openlib.mahxwell.org/AuthorService/updateAuthorResponse")
    public void updateAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        Author arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Author arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAuthor", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.DeleteAuthor")
    @ResponseWrapper(localName = "deleteAuthorResponse", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.DeleteAuthorResponse")
    @Action(input = "http://author.service.openlib.mahxwell.org/AuthorService/deleteAuthorRequest", output = "http://author.service.openlib.mahxwell.org/AuthorService/deleteAuthorResponse")
    public void deleteAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        Author arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.author.Author>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listauthor", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.Listauthor")
    @ResponseWrapper(localName = "listauthorResponse", targetNamespace = "http://author.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.author.ListauthorResponse")
    @Action(input = "http://author.service.openlib.mahxwell.org/AuthorService/listauthorRequest", output = "http://author.service.openlib.mahxwell.org/AuthorService/listauthorResponse")
    public List<Author> listauthor();

}
