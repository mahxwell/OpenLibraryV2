
package org.mahxwell.openlib.service.library;

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
@WebService(name = "LibraryService", targetNamespace = "http://library.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LibraryService {


    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.library.Library>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listlibrary", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.Listlibrary")
    @ResponseWrapper(localName = "listlibraryResponse", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.ListlibraryResponse")
    @Action(input = "http://library.service.openlib.mahxwell.org/LibraryService/listlibraryRequest", output = "http://library.service.openlib.mahxwell.org/LibraryService/listlibraryResponse")
    public List<Library> listlibrary();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addLibrary", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.AddLibrary")
    @ResponseWrapper(localName = "addLibraryResponse", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.AddLibraryResponse")
    @Action(input = "http://library.service.openlib.mahxwell.org/LibraryService/addLibraryRequest", output = "http://library.service.openlib.mahxwell.org/LibraryService/addLibraryResponse")
    public void addLibrary(
        @WebParam(name = "arg0", targetNamespace = "")
        Library arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateLibrary", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.UpdateLibrary")
    @ResponseWrapper(localName = "updateLibraryResponse", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.UpdateLibraryResponse")
    @Action(input = "http://library.service.openlib.mahxwell.org/LibraryService/updateLibraryRequest", output = "http://library.service.openlib.mahxwell.org/LibraryService/updateLibraryResponse")
    public void updateLibrary(
        @WebParam(name = "arg0", targetNamespace = "")
        Library arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Library arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteLibrary", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.DeleteLibrary")
    @ResponseWrapper(localName = "deleteLibraryResponse", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.DeleteLibraryResponse")
    @Action(input = "http://library.service.openlib.mahxwell.org/LibraryService/deleteLibraryRequest", output = "http://library.service.openlib.mahxwell.org/LibraryService/deleteLibraryResponse")
    public void deleteLibrary(
        @WebParam(name = "arg0", targetNamespace = "")
        Library arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.library.Library
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLibrary", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.GetLibrary")
    @ResponseWrapper(localName = "getLibraryResponse", targetNamespace = "http://library.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.library.GetLibraryResponse")
    @Action(input = "http://library.service.openlib.mahxwell.org/LibraryService/getLibraryRequest", output = "http://library.service.openlib.mahxwell.org/LibraryService/getLibraryResponse")
    public Library getLibrary(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
