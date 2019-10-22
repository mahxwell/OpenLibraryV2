
package org.mahxwell.openlib.service.library;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.library package. 
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

    private final static QName _Listlibrary_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "listlibrary");
    private final static QName _UpdateLibraryResponse_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "updateLibraryResponse");
    private final static QName _GetLibrary_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "getLibrary");
    private final static QName _DeleteLibrary_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "deleteLibrary");
    private final static QName _DeleteLibraryResponse_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "deleteLibraryResponse");
    private final static QName _GetLibraryResponse_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "getLibraryResponse");
    private final static QName _AddLibrary_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "addLibrary");
    private final static QName _UpdateLibrary_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "updateLibrary");
    private final static QName _ListlibraryResponse_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "listlibraryResponse");
    private final static QName _AddLibraryResponse_QNAME = new QName("http://library.service.openlib.mahxwell.org/", "addLibraryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.library
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLibrary }
     * 
     */
    public GetLibrary createGetLibrary() {
        return new GetLibrary();
    }

    /**
     * Create an instance of {@link DeleteLibraryResponse }
     * 
     */
    public DeleteLibraryResponse createDeleteLibraryResponse() {
        return new DeleteLibraryResponse();
    }

    /**
     * Create an instance of {@link GetLibraryResponse }
     * 
     */
    public GetLibraryResponse createGetLibraryResponse() {
        return new GetLibraryResponse();
    }

    /**
     * Create an instance of {@link DeleteLibrary }
     * 
     */
    public DeleteLibrary createDeleteLibrary() {
        return new DeleteLibrary();
    }

    /**
     * Create an instance of {@link Listlibrary }
     * 
     */
    public Listlibrary createListlibrary() {
        return new Listlibrary();
    }

    /**
     * Create an instance of {@link UpdateLibraryResponse }
     * 
     */
    public UpdateLibraryResponse createUpdateLibraryResponse() {
        return new UpdateLibraryResponse();
    }

    /**
     * Create an instance of {@link AddLibraryResponse }
     * 
     */
    public AddLibraryResponse createAddLibraryResponse() {
        return new AddLibraryResponse();
    }

    /**
     * Create an instance of {@link ListlibraryResponse }
     * 
     */
    public ListlibraryResponse createListlibraryResponse() {
        return new ListlibraryResponse();
    }

    /**
     * Create an instance of {@link AddLibrary }
     * 
     */
    public AddLibrary createAddLibrary() {
        return new AddLibrary();
    }

    /**
     * Create an instance of {@link UpdateLibrary }
     * 
     */
    public UpdateLibrary createUpdateLibrary() {
        return new UpdateLibrary();
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listlibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "listlibrary")
    public JAXBElement<Listlibrary> createListlibrary(Listlibrary value) {
        return new JAXBElement<Listlibrary>(_Listlibrary_QNAME, Listlibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "updateLibraryResponse")
    public JAXBElement<UpdateLibraryResponse> createUpdateLibraryResponse(UpdateLibraryResponse value) {
        return new JAXBElement<UpdateLibraryResponse>(_UpdateLibraryResponse_QNAME, UpdateLibraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "getLibrary")
    public JAXBElement<GetLibrary> createGetLibrary(GetLibrary value) {
        return new JAXBElement<GetLibrary>(_GetLibrary_QNAME, GetLibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "deleteLibrary")
    public JAXBElement<DeleteLibrary> createDeleteLibrary(DeleteLibrary value) {
        return new JAXBElement<DeleteLibrary>(_DeleteLibrary_QNAME, DeleteLibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "deleteLibraryResponse")
    public JAXBElement<DeleteLibraryResponse> createDeleteLibraryResponse(DeleteLibraryResponse value) {
        return new JAXBElement<DeleteLibraryResponse>(_DeleteLibraryResponse_QNAME, DeleteLibraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "getLibraryResponse")
    public JAXBElement<GetLibraryResponse> createGetLibraryResponse(GetLibraryResponse value) {
        return new JAXBElement<GetLibraryResponse>(_GetLibraryResponse_QNAME, GetLibraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "addLibrary")
    public JAXBElement<AddLibrary> createAddLibrary(AddLibrary value) {
        return new JAXBElement<AddLibrary>(_AddLibrary_QNAME, AddLibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLibrary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "updateLibrary")
    public JAXBElement<UpdateLibrary> createUpdateLibrary(UpdateLibrary value) {
        return new JAXBElement<UpdateLibrary>(_UpdateLibrary_QNAME, UpdateLibrary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListlibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "listlibraryResponse")
    public JAXBElement<ListlibraryResponse> createListlibraryResponse(ListlibraryResponse value) {
        return new JAXBElement<ListlibraryResponse>(_ListlibraryResponse_QNAME, ListlibraryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLibraryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://library.service.openlib.mahxwell.org/", name = "addLibraryResponse")
    public JAXBElement<AddLibraryResponse> createAddLibraryResponse(AddLibraryResponse value) {
        return new JAXBElement<AddLibraryResponse>(_AddLibraryResponse_QNAME, AddLibraryResponse.class, null, value);
    }

}
