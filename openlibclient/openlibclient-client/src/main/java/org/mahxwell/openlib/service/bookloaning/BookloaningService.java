
package org.mahxwell.openlib.service.bookloaning;

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
@WebService(name = "BookloaningService", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookloaningService {


    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbookloaning", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.Listbookloaning")
    @ResponseWrapper(localName = "listbookloaningResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningResponse")
    public List<Bookloaning> listbookloaning();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addBookloaning", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.AddBookloaning")
    @ResponseWrapper(localName = "addBookloaningResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.AddBookloaningResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/addBookloaningRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/addBookloaningResponse")
    public void addBookloaning(
        @WebParam(name = "arg0", targetNamespace = "")
        Bookloaning arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateBookloaning", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.UpdateBookloaning")
    @ResponseWrapper(localName = "updateBookloaningResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.UpdateBookloaningResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/updateBookloaningRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/updateBookloaningResponse")
    public void updateBookloaning(
        @WebParam(name = "arg0", targetNamespace = "")
        Bookloaning arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Bookloaning arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBookloaning", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.DeleteBookloaning")
    @ResponseWrapper(localName = "deleteBookloaningResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.DeleteBookloaningResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/deleteBookloaningRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/deleteBookloaningResponse")
    public void deleteBookloaning(
        @WebParam(name = "arg0", targetNamespace = "")
        Bookloaning arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.bookloaning.Bookloaning
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBookloaning", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.GetBookloaning")
    @ResponseWrapper(localName = "getBookloaningResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.GetBookloaningResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/getBookloaningRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/getBookloaningResponse")
    public Bookloaning getBookloaning(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbookloaningByUser", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByUser")
    @ResponseWrapper(localName = "listbookloaningByUserResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByUserResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByUserRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByUserResponse")
    public List<Bookloaning> listbookloaningByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbookloaningByCopy", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByCopy")
    @ResponseWrapper(localName = "listbookloaningByCopyResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByCopyResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByCopyRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByCopyResponse")
    public List<Bookloaning> listbookloaningByCopy(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbookloaningByBook", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByBook")
    @ResponseWrapper(localName = "listbookloaningByBookResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByBookResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByBookRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByBookResponse")
    public List<Bookloaning> listbookloaningByBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbookloaningByBookAndUser", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByBookAndUser")
    @ResponseWrapper(localName = "listbookloaningByBookAndUserResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByBookAndUserResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByBookAndUserRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByBookAndUserResponse")
    public List<Bookloaning> listbookloaningByBookAndUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookloaningslate", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.Bookloaningslate")
    @ResponseWrapper(localName = "bookloaningslateResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.BookloaningslateResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/bookloaningslateRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/bookloaningslateResponse")
    public List<Bookloaning> bookloaningslate();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.bookloaning.Bookloaning>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbookloaningByBookOrderByDateAsc", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByBookOrderByDateAsc")
    @ResponseWrapper(localName = "listbookloaningByBookOrderByDateAscResponse", targetNamespace = "http://bookloaning.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.bookloaning.ListbookloaningByBookOrderByDateAscResponse")
    @Action(input = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByBookOrderByDateAscRequest", output = "http://bookloaning.service.openlib.mahxwell.org/BookloaningService/listbookloaningByBookOrderByDateAscResponse")
    public List<Bookloaning> listbookloaningByBookOrderByDateAsc(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
