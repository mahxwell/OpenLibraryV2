
package org.mahxwell.openlib.service.book;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.book package. 
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

    private final static QName _AdvancedsearchResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "advancedsearchResponse");
    private final static QName _ListbookResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "listbookResponse");
    private final static QName _BooksMailResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "booksMailResponse");
    private final static QName _Listbook_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "listbook");
    private final static QName _QuicksearchResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "quicksearchResponse");
    private final static QName _BooksMail_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "booksMail");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "updateBookResponse");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "deleteBookResponse");
    private final static QName _DeleteBook_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "deleteBook");
    private final static QName _Advancedsearch_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "advancedsearch");
    private final static QName _AddBook_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "addBook");
    private final static QName _Quicksearch_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "quicksearch");
    private final static QName _UpdateBook_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "updateBook");
    private final static QName _AddBookResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "addBookResponse");
    private final static QName _GetBook_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "getBook");
    private final static QName _GetBookResponse_QNAME = new QName("http://book.service.openlib.mahxwell.org/", "getBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.book
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link GetBook }
     * 
     */
    public GetBook createGetBook() {
        return new GetBook();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link Quicksearch }
     * 
     */
    public Quicksearch createQuicksearch() {
        return new Quicksearch();
    }

    /**
     * Create an instance of {@link Advancedsearch }
     * 
     */
    public Advancedsearch createAdvancedsearch() {
        return new Advancedsearch();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link BooksMail }
     * 
     */
    public BooksMail createBooksMail() {
        return new BooksMail();
    }

    /**
     * Create an instance of {@link BooksMailResponse }
     * 
     */
    public BooksMailResponse createBooksMailResponse() {
        return new BooksMailResponse();
    }

    /**
     * Create an instance of {@link Listbook }
     * 
     */
    public Listbook createListbook() {
        return new Listbook();
    }

    /**
     * Create an instance of {@link QuicksearchResponse }
     * 
     */
    public QuicksearchResponse createQuicksearchResponse() {
        return new QuicksearchResponse();
    }

    /**
     * Create an instance of {@link AdvancedsearchResponse }
     * 
     */
    public AdvancedsearchResponse createAdvancedsearchResponse() {
        return new AdvancedsearchResponse();
    }

    /**
     * Create an instance of {@link ListbookResponse }
     * 
     */
    public ListbookResponse createListbookResponse() {
        return new ListbookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvancedsearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "advancedsearchResponse")
    public JAXBElement<AdvancedsearchResponse> createAdvancedsearchResponse(AdvancedsearchResponse value) {
        return new JAXBElement<AdvancedsearchResponse>(_AdvancedsearchResponse_QNAME, AdvancedsearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "listbookResponse")
    public JAXBElement<ListbookResponse> createListbookResponse(ListbookResponse value) {
        return new JAXBElement<ListbookResponse>(_ListbookResponse_QNAME, ListbookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooksMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "booksMailResponse")
    public JAXBElement<BooksMailResponse> createBooksMailResponse(BooksMailResponse value) {
        return new JAXBElement<BooksMailResponse>(_BooksMailResponse_QNAME, BooksMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listbook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "listbook")
    public JAXBElement<Listbook> createListbook(Listbook value) {
        return new JAXBElement<Listbook>(_Listbook_QNAME, Listbook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuicksearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "quicksearchResponse")
    public JAXBElement<QuicksearchResponse> createQuicksearchResponse(QuicksearchResponse value) {
        return new JAXBElement<QuicksearchResponse>(_QuicksearchResponse_QNAME, QuicksearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooksMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "booksMail")
    public JAXBElement<BooksMail> createBooksMail(BooksMail value) {
        return new JAXBElement<BooksMail>(_BooksMail_QNAME, BooksMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<UpdateBookResponse>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Advancedsearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "advancedsearch")
    public JAXBElement<Advancedsearch> createAdvancedsearch(Advancedsearch value) {
        return new JAXBElement<Advancedsearch>(_Advancedsearch_QNAME, Advancedsearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quicksearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "quicksearch")
    public JAXBElement<Quicksearch> createQuicksearch(Quicksearch value) {
        return new JAXBElement<Quicksearch>(_Quicksearch_QNAME, Quicksearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<UpdateBook>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "getBook")
    public JAXBElement<GetBook> createGetBook(GetBook value) {
        return new JAXBElement<GetBook>(_GetBook_QNAME, GetBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://book.service.openlib.mahxwell.org/", name = "getBookResponse")
    public JAXBElement<GetBookResponse> createGetBookResponse(GetBookResponse value) {
        return new JAXBElement<GetBookResponse>(_GetBookResponse_QNAME, GetBookResponse.class, null, value);
    }

}
