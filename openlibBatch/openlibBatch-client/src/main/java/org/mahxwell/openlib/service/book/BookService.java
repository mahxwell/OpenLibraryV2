
package org.mahxwell.openlib.service.book;

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
@WebService(name = "BookService", targetNamespace = "http://book.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookService {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.book.Book
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.GetBookResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/getBookRequest", output = "http://book.service.openlib.mahxwell.org/BookService/getBookResponse")
    public Book getBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addBook", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.AddBook")
    @ResponseWrapper(localName = "addBookResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.AddBookResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/addBookRequest", output = "http://book.service.openlib.mahxwell.org/BookService/addBookResponse")
    public void addBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBook", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.DeleteBook")
    @ResponseWrapper(localName = "deleteBookResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.DeleteBookResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/deleteBookRequest", output = "http://book.service.openlib.mahxwell.org/BookService/deleteBookResponse")
    public void deleteBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.book.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quicksearch", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.Quicksearch")
    @ResponseWrapper(localName = "quicksearchResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.QuicksearchResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/quicksearchRequest", output = "http://book.service.openlib.mahxwell.org/BookService/quicksearchResponse")
    public List<Book> quicksearch(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.book.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listbook", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.Listbook")
    @ResponseWrapper(localName = "listbookResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.ListbookResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/listbookRequest", output = "http://book.service.openlib.mahxwell.org/BookService/listbookResponse")
    public List<Book> listbook();

    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.book.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "booksMail", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.BooksMail")
    @ResponseWrapper(localName = "booksMailResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.BooksMailResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/booksMailRequest", output = "http://book.service.openlib.mahxwell.org/BookService/booksMailResponse")
    public List<Book> booksMail();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.book.Book>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "advancedsearch", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.Advancedsearch")
    @ResponseWrapper(localName = "advancedsearchResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.AdvancedsearchResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/advancedsearchRequest", output = "http://book.service.openlib.mahxwell.org/BookService/advancedsearchResponse")
    public List<Book> advancedsearch(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateBook", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.UpdateBook")
    @ResponseWrapper(localName = "updateBookResponse", targetNamespace = "http://book.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.book.UpdateBookResponse")
    @Action(input = "http://book.service.openlib.mahxwell.org/BookService/updateBookRequest", output = "http://book.service.openlib.mahxwell.org/BookService/updateBookResponse")
    public void updateBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Book arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Book arg1);

}
