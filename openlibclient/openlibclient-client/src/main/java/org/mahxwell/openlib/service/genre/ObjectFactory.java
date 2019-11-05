
package org.mahxwell.openlib.service.genre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.genre package. 
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

    private final static QName _UpdateGenre_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "updateGenre");
    private final static QName _ListgenreResponse_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "listgenreResponse");
    private final static QName _DeleteGenre_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "deleteGenre");
    private final static QName _Listgenre_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "listgenre");
    private final static QName _GetGenreResponse_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "getGenreResponse");
    private final static QName _AddGenreResponse_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "addGenreResponse");
    private final static QName _GetGenre_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "getGenre");
    private final static QName _UpdateGenreResponse_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "updateGenreResponse");
    private final static QName _AddGenre_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "addGenre");
    private final static QName _DeleteGenreResponse_QNAME = new QName("http://genre.service.openlib.mahxwell.org/", "deleteGenreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.genre
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListgenreResponse }
     * 
     */
    public ListgenreResponse createListgenreResponse() {
        return new ListgenreResponse();
    }

    /**
     * Create an instance of {@link DeleteGenre }
     * 
     */
    public DeleteGenre createDeleteGenre() {
        return new DeleteGenre();
    }

    /**
     * Create an instance of {@link Listgenre }
     * 
     */
    public Listgenre createListgenre() {
        return new Listgenre();
    }

    /**
     * Create an instance of {@link UpdateGenre }
     * 
     */
    public UpdateGenre createUpdateGenre() {
        return new UpdateGenre();
    }

    /**
     * Create an instance of {@link GetGenre }
     * 
     */
    public GetGenre createGetGenre() {
        return new GetGenre();
    }

    /**
     * Create an instance of {@link GetGenreResponse }
     * 
     */
    public GetGenreResponse createGetGenreResponse() {
        return new GetGenreResponse();
    }

    /**
     * Create an instance of {@link AddGenreResponse }
     * 
     */
    public AddGenreResponse createAddGenreResponse() {
        return new AddGenreResponse();
    }

    /**
     * Create an instance of {@link UpdateGenreResponse }
     * 
     */
    public UpdateGenreResponse createUpdateGenreResponse() {
        return new UpdateGenreResponse();
    }

    /**
     * Create an instance of {@link AddGenre }
     * 
     */
    public AddGenre createAddGenre() {
        return new AddGenre();
    }

    /**
     * Create an instance of {@link DeleteGenreResponse }
     * 
     */
    public DeleteGenreResponse createDeleteGenreResponse() {
        return new DeleteGenreResponse();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "updateGenre")
    public JAXBElement<UpdateGenre> createUpdateGenre(UpdateGenre value) {
        return new JAXBElement<UpdateGenre>(_UpdateGenre_QNAME, UpdateGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListgenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "listgenreResponse")
    public JAXBElement<ListgenreResponse> createListgenreResponse(ListgenreResponse value) {
        return new JAXBElement<ListgenreResponse>(_ListgenreResponse_QNAME, ListgenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "deleteGenre")
    public JAXBElement<DeleteGenre> createDeleteGenre(DeleteGenre value) {
        return new JAXBElement<DeleteGenre>(_DeleteGenre_QNAME, DeleteGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listgenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "listgenre")
    public JAXBElement<Listgenre> createListgenre(Listgenre value) {
        return new JAXBElement<Listgenre>(_Listgenre_QNAME, Listgenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "getGenreResponse")
    public JAXBElement<GetGenreResponse> createGetGenreResponse(GetGenreResponse value) {
        return new JAXBElement<GetGenreResponse>(_GetGenreResponse_QNAME, GetGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "addGenreResponse")
    public JAXBElement<AddGenreResponse> createAddGenreResponse(AddGenreResponse value) {
        return new JAXBElement<AddGenreResponse>(_AddGenreResponse_QNAME, AddGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "getGenre")
    public JAXBElement<GetGenre> createGetGenre(GetGenre value) {
        return new JAXBElement<GetGenre>(_GetGenre_QNAME, GetGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "updateGenreResponse")
    public JAXBElement<UpdateGenreResponse> createUpdateGenreResponse(UpdateGenreResponse value) {
        return new JAXBElement<UpdateGenreResponse>(_UpdateGenreResponse_QNAME, UpdateGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "addGenre")
    public JAXBElement<AddGenre> createAddGenre(AddGenre value) {
        return new JAXBElement<AddGenre>(_AddGenre_QNAME, AddGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genre.service.openlib.mahxwell.org/", name = "deleteGenreResponse")
    public JAXBElement<DeleteGenreResponse> createDeleteGenreResponse(DeleteGenreResponse value) {
        return new JAXBElement<DeleteGenreResponse>(_DeleteGenreResponse_QNAME, DeleteGenreResponse.class, null, value);
    }

}
