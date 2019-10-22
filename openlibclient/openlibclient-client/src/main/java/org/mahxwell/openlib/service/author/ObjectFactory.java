
package org.mahxwell.openlib.service.author;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mahxwell.openlib.service.author package. 
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

    private final static QName _DeleteAuthorResponse_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "deleteAuthorResponse");
    private final static QName _AddAuthorResponse_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "addAuthorResponse");
    private final static QName _UpdateAuthorResponse_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "updateAuthorResponse");
    private final static QName _GetAuthor_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "getAuthor");
    private final static QName _AddAuthor_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "addAuthor");
    private final static QName _UpdateAuthor_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "updateAuthor");
    private final static QName _ListauthorResponse_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "listauthorResponse");
    private final static QName _DeleteAuthor_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "deleteAuthor");
    private final static QName _Listauthor_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "listauthor");
    private final static QName _GetAuthorResponse_QNAME = new QName("http://author.service.openlib.mahxwell.org/", "getAuthorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mahxwell.openlib.service.author
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAuthorResponse }
     * 
     */
    public DeleteAuthorResponse createDeleteAuthorResponse() {
        return new DeleteAuthorResponse();
    }

    /**
     * Create an instance of {@link AddAuthorResponse }
     * 
     */
    public AddAuthorResponse createAddAuthorResponse() {
        return new AddAuthorResponse();
    }

    /**
     * Create an instance of {@link UpdateAuthorResponse }
     * 
     */
    public UpdateAuthorResponse createUpdateAuthorResponse() {
        return new UpdateAuthorResponse();
    }

    /**
     * Create an instance of {@link GetAuthor }
     * 
     */
    public GetAuthor createGetAuthor() {
        return new GetAuthor();
    }

    /**
     * Create an instance of {@link AddAuthor }
     * 
     */
    public AddAuthor createAddAuthor() {
        return new AddAuthor();
    }

    /**
     * Create an instance of {@link UpdateAuthor }
     * 
     */
    public UpdateAuthor createUpdateAuthor() {
        return new UpdateAuthor();
    }

    /**
     * Create an instance of {@link ListauthorResponse }
     * 
     */
    public ListauthorResponse createListauthorResponse() {
        return new ListauthorResponse();
    }

    /**
     * Create an instance of {@link DeleteAuthor }
     * 
     */
    public DeleteAuthor createDeleteAuthor() {
        return new DeleteAuthor();
    }

    /**
     * Create an instance of {@link Listauthor }
     * 
     */
    public Listauthor createListauthor() {
        return new Listauthor();
    }

    /**
     * Create an instance of {@link GetAuthorResponse }
     * 
     */
    public GetAuthorResponse createGetAuthorResponse() {
        return new GetAuthorResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "deleteAuthorResponse")
    public JAXBElement<DeleteAuthorResponse> createDeleteAuthorResponse(DeleteAuthorResponse value) {
        return new JAXBElement<DeleteAuthorResponse>(_DeleteAuthorResponse_QNAME, DeleteAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "addAuthorResponse")
    public JAXBElement<AddAuthorResponse> createAddAuthorResponse(AddAuthorResponse value) {
        return new JAXBElement<AddAuthorResponse>(_AddAuthorResponse_QNAME, AddAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "updateAuthorResponse")
    public JAXBElement<UpdateAuthorResponse> createUpdateAuthorResponse(UpdateAuthorResponse value) {
        return new JAXBElement<UpdateAuthorResponse>(_UpdateAuthorResponse_QNAME, UpdateAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "getAuthor")
    public JAXBElement<GetAuthor> createGetAuthor(GetAuthor value) {
        return new JAXBElement<GetAuthor>(_GetAuthor_QNAME, GetAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "addAuthor")
    public JAXBElement<AddAuthor> createAddAuthor(AddAuthor value) {
        return new JAXBElement<AddAuthor>(_AddAuthor_QNAME, AddAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "updateAuthor")
    public JAXBElement<UpdateAuthor> createUpdateAuthor(UpdateAuthor value) {
        return new JAXBElement<UpdateAuthor>(_UpdateAuthor_QNAME, UpdateAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListauthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "listauthorResponse")
    public JAXBElement<ListauthorResponse> createListauthorResponse(ListauthorResponse value) {
        return new JAXBElement<ListauthorResponse>(_ListauthorResponse_QNAME, ListauthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "deleteAuthor")
    public JAXBElement<DeleteAuthor> createDeleteAuthor(DeleteAuthor value) {
        return new JAXBElement<DeleteAuthor>(_DeleteAuthor_QNAME, DeleteAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listauthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "listauthor")
    public JAXBElement<Listauthor> createListauthor(Listauthor value) {
        return new JAXBElement<Listauthor>(_Listauthor_QNAME, Listauthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://author.service.openlib.mahxwell.org/", name = "getAuthorResponse")
    public JAXBElement<GetAuthorResponse> createGetAuthorResponse(GetAuthorResponse value) {
        return new JAXBElement<GetAuthorResponse>(_GetAuthorResponse_QNAME, GetAuthorResponse.class, null, value);
    }

}
