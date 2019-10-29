
package org.mahxwell.openlib.service.bookloaning;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.bookloaning package. 
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

    private final static QName _ListbookloaningByCopy_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByCopy");
    private final static QName _ListbookloaningByUser_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByUser");
    private final static QName _ListbookloaningByCopyResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByCopyResponse");
    private final static QName _ListbookloaningByUserResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByUserResponse");
    private final static QName _ListbookloaningResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningResponse");
    private final static QName _AddBookloaningResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "addBookloaningResponse");
    private final static QName _UpdateBookloaning_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "updateBookloaning");
    private final static QName _DeleteBookloaningResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "deleteBookloaningResponse");
    private final static QName _ListbookloaningByBookAndUser_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByBookAndUser");
    private final static QName _Listbookloaning_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaning");
    private final static QName _UpdateBookloaningResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "updateBookloaningResponse");
    private final static QName _GetBookloaning_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "getBookloaning");
    private final static QName _BookloaningslateResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "bookloaningslateResponse");
    private final static QName _ListbookloaningByBookAndUserResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByBookAndUserResponse");
    private final static QName _DeleteBookloaning_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "deleteBookloaning");
    private final static QName _AddBookloaning_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "addBookloaning");
    private final static QName _GetBookloaningResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "getBookloaningResponse");
    private final static QName _ListbookloaningByBook_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByBook");
    private final static QName _Bookloaningslate_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "bookloaningslate");
    private final static QName _ListbookloaningByBookResponse_QNAME = new QName("http://bookloaning.service.openlib.mahxwell.org/", "listbookloaningByBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.bookloaning
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBookloaning }
     * 
     */
    public AddBookloaning createAddBookloaning() {
        return new AddBookloaning();
    }

    /**
     * Create an instance of {@link GetBookloaningResponse }
     * 
     */
    public GetBookloaningResponse createGetBookloaningResponse() {
        return new GetBookloaningResponse();
    }

    /**
     * Create an instance of {@link ListbookloaningByBook }
     * 
     */
    public ListbookloaningByBook createListbookloaningByBook() {
        return new ListbookloaningByBook();
    }

    /**
     * Create an instance of {@link Bookloaningslate }
     * 
     */
    public Bookloaningslate createBookloaningslate() {
        return new Bookloaningslate();
    }

    /**
     * Create an instance of {@link ListbookloaningByBookResponse }
     * 
     */
    public ListbookloaningByBookResponse createListbookloaningByBookResponse() {
        return new ListbookloaningByBookResponse();
    }

    /**
     * Create an instance of {@link BookloaningslateResponse }
     * 
     */
    public BookloaningslateResponse createBookloaningslateResponse() {
        return new BookloaningslateResponse();
    }

    /**
     * Create an instance of {@link ListbookloaningByBookAndUserResponse }
     * 
     */
    public ListbookloaningByBookAndUserResponse createListbookloaningByBookAndUserResponse() {
        return new ListbookloaningByBookAndUserResponse();
    }

    /**
     * Create an instance of {@link DeleteBookloaning }
     * 
     */
    public DeleteBookloaning createDeleteBookloaning() {
        return new DeleteBookloaning();
    }

    /**
     * Create an instance of {@link GetBookloaning }
     * 
     */
    public GetBookloaning createGetBookloaning() {
        return new GetBookloaning();
    }

    /**
     * Create an instance of {@link Listbookloaning }
     * 
     */
    public Listbookloaning createListbookloaning() {
        return new Listbookloaning();
    }

    /**
     * Create an instance of {@link UpdateBookloaningResponse }
     * 
     */
    public UpdateBookloaningResponse createUpdateBookloaningResponse() {
        return new UpdateBookloaningResponse();
    }

    /**
     * Create an instance of {@link DeleteBookloaningResponse }
     * 
     */
    public DeleteBookloaningResponse createDeleteBookloaningResponse() {
        return new DeleteBookloaningResponse();
    }

    /**
     * Create an instance of {@link ListbookloaningByBookAndUser }
     * 
     */
    public ListbookloaningByBookAndUser createListbookloaningByBookAndUser() {
        return new ListbookloaningByBookAndUser();
    }

    /**
     * Create an instance of {@link AddBookloaningResponse }
     * 
     */
    public AddBookloaningResponse createAddBookloaningResponse() {
        return new AddBookloaningResponse();
    }

    /**
     * Create an instance of {@link UpdateBookloaning }
     * 
     */
    public UpdateBookloaning createUpdateBookloaning() {
        return new UpdateBookloaning();
    }

    /**
     * Create an instance of {@link ListbookloaningResponse }
     * 
     */
    public ListbookloaningResponse createListbookloaningResponse() {
        return new ListbookloaningResponse();
    }

    /**
     * Create an instance of {@link ListbookloaningByCopy }
     * 
     */
    public ListbookloaningByCopy createListbookloaningByCopy() {
        return new ListbookloaningByCopy();
    }

    /**
     * Create an instance of {@link ListbookloaningByUser }
     * 
     */
    public ListbookloaningByUser createListbookloaningByUser() {
        return new ListbookloaningByUser();
    }

    /**
     * Create an instance of {@link ListbookloaningByCopyResponse }
     * 
     */
    public ListbookloaningByCopyResponse createListbookloaningByCopyResponse() {
        return new ListbookloaningByCopyResponse();
    }

    /**
     * Create an instance of {@link ListbookloaningByUserResponse }
     * 
     */
    public ListbookloaningByUserResponse createListbookloaningByUserResponse() {
        return new ListbookloaningByUserResponse();
    }

    /**
     * Create an instance of {@link Bookloaning }
     * 
     */
    public Bookloaning createBookloaning() {
        return new Bookloaning();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByCopy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByCopy")
    public JAXBElement<ListbookloaningByCopy> createListbookloaningByCopy(ListbookloaningByCopy value) {
        return new JAXBElement<ListbookloaningByCopy>(_ListbookloaningByCopy_QNAME, ListbookloaningByCopy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByUser")
    public JAXBElement<ListbookloaningByUser> createListbookloaningByUser(ListbookloaningByUser value) {
        return new JAXBElement<ListbookloaningByUser>(_ListbookloaningByUser_QNAME, ListbookloaningByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByCopyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByCopyResponse")
    public JAXBElement<ListbookloaningByCopyResponse> createListbookloaningByCopyResponse(ListbookloaningByCopyResponse value) {
        return new JAXBElement<ListbookloaningByCopyResponse>(_ListbookloaningByCopyResponse_QNAME, ListbookloaningByCopyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByUserResponse")
    public JAXBElement<ListbookloaningByUserResponse> createListbookloaningByUserResponse(ListbookloaningByUserResponse value) {
        return new JAXBElement<ListbookloaningByUserResponse>(_ListbookloaningByUserResponse_QNAME, ListbookloaningByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningResponse")
    public JAXBElement<ListbookloaningResponse> createListbookloaningResponse(ListbookloaningResponse value) {
        return new JAXBElement<ListbookloaningResponse>(_ListbookloaningResponse_QNAME, ListbookloaningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookloaningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "addBookloaningResponse")
    public JAXBElement<AddBookloaningResponse> createAddBookloaningResponse(AddBookloaningResponse value) {
        return new JAXBElement<AddBookloaningResponse>(_AddBookloaningResponse_QNAME, AddBookloaningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookloaning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "updateBookloaning")
    public JAXBElement<UpdateBookloaning> createUpdateBookloaning(UpdateBookloaning value) {
        return new JAXBElement<UpdateBookloaning>(_UpdateBookloaning_QNAME, UpdateBookloaning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookloaningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "deleteBookloaningResponse")
    public JAXBElement<DeleteBookloaningResponse> createDeleteBookloaningResponse(DeleteBookloaningResponse value) {
        return new JAXBElement<DeleteBookloaningResponse>(_DeleteBookloaningResponse_QNAME, DeleteBookloaningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByBookAndUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByBookAndUser")
    public JAXBElement<ListbookloaningByBookAndUser> createListbookloaningByBookAndUser(ListbookloaningByBookAndUser value) {
        return new JAXBElement<ListbookloaningByBookAndUser>(_ListbookloaningByBookAndUser_QNAME, ListbookloaningByBookAndUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listbookloaning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaning")
    public JAXBElement<Listbookloaning> createListbookloaning(Listbookloaning value) {
        return new JAXBElement<Listbookloaning>(_Listbookloaning_QNAME, Listbookloaning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookloaningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "updateBookloaningResponse")
    public JAXBElement<UpdateBookloaningResponse> createUpdateBookloaningResponse(UpdateBookloaningResponse value) {
        return new JAXBElement<UpdateBookloaningResponse>(_UpdateBookloaningResponse_QNAME, UpdateBookloaningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookloaning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "getBookloaning")
    public JAXBElement<GetBookloaning> createGetBookloaning(GetBookloaning value) {
        return new JAXBElement<GetBookloaning>(_GetBookloaning_QNAME, GetBookloaning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookloaningslateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "bookloaningslateResponse")
    public JAXBElement<BookloaningslateResponse> createBookloaningslateResponse(BookloaningslateResponse value) {
        return new JAXBElement<BookloaningslateResponse>(_BookloaningslateResponse_QNAME, BookloaningslateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByBookAndUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByBookAndUserResponse")
    public JAXBElement<ListbookloaningByBookAndUserResponse> createListbookloaningByBookAndUserResponse(ListbookloaningByBookAndUserResponse value) {
        return new JAXBElement<ListbookloaningByBookAndUserResponse>(_ListbookloaningByBookAndUserResponse_QNAME, ListbookloaningByBookAndUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookloaning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "deleteBookloaning")
    public JAXBElement<DeleteBookloaning> createDeleteBookloaning(DeleteBookloaning value) {
        return new JAXBElement<DeleteBookloaning>(_DeleteBookloaning_QNAME, DeleteBookloaning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookloaning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "addBookloaning")
    public JAXBElement<AddBookloaning> createAddBookloaning(AddBookloaning value) {
        return new JAXBElement<AddBookloaning>(_AddBookloaning_QNAME, AddBookloaning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookloaningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "getBookloaningResponse")
    public JAXBElement<GetBookloaningResponse> createGetBookloaningResponse(GetBookloaningResponse value) {
        return new JAXBElement<GetBookloaningResponse>(_GetBookloaningResponse_QNAME, GetBookloaningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByBook")
    public JAXBElement<ListbookloaningByBook> createListbookloaningByBook(ListbookloaningByBook value) {
        return new JAXBElement<ListbookloaningByBook>(_ListbookloaningByBook_QNAME, ListbookloaningByBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookloaningslate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "bookloaningslate")
    public JAXBElement<Bookloaningslate> createBookloaningslate(Bookloaningslate value) {
        return new JAXBElement<Bookloaningslate>(_Bookloaningslate_QNAME, Bookloaningslate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListbookloaningByBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bookloaning.service.openlib.mahxwell.org/", name = "listbookloaningByBookResponse")
    public JAXBElement<ListbookloaningByBookResponse> createListbookloaningByBookResponse(ListbookloaningByBookResponse value) {
        return new JAXBElement<ListbookloaningByBookResponse>(_ListbookloaningByBookResponse_QNAME, ListbookloaningByBookResponse.class, null, value);
    }

}
