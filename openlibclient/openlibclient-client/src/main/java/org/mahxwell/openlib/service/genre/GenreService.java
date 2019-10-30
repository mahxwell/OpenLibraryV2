
package org.mahxwell.openlib.service.genre;

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
@WebService(name = "GenreService", targetNamespace = "http://genre.service.openlib.mahxwell.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GenreService {


    /**
     * 
     * @return
     *     returns java.util.List<org.mahxwell.openlib.service.genre.Genre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listgenre", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.Listgenre")
    @ResponseWrapper(localName = "listgenreResponse", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.ListgenreResponse")
    @Action(input = "http://genre.service.openlib.mahxwell.org/GenreService/listgenreRequest", output = "http://genre.service.openlib.mahxwell.org/GenreService/listgenreResponse")
    public List<Genre> listgenre();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateGenre", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.UpdateGenre")
    @ResponseWrapper(localName = "updateGenreResponse", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.UpdateGenreResponse")
    @Action(input = "http://genre.service.openlib.mahxwell.org/GenreService/updateGenreRequest", output = "http://genre.service.openlib.mahxwell.org/GenreService/updateGenreResponse")
    public void updateGenre(
        @WebParam(name = "arg0", targetNamespace = "")
        Genre arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Genre arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGenre", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.DeleteGenre")
    @ResponseWrapper(localName = "deleteGenreResponse", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.DeleteGenreResponse")
    @Action(input = "http://genre.service.openlib.mahxwell.org/GenreService/deleteGenreRequest", output = "http://genre.service.openlib.mahxwell.org/GenreService/deleteGenreResponse")
    public void deleteGenre(
        @WebParam(name = "arg0", targetNamespace = "")
        Genre arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addGenre", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.AddGenre")
    @ResponseWrapper(localName = "addGenreResponse", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.AddGenreResponse")
    @Action(input = "http://genre.service.openlib.mahxwell.org/GenreService/addGenreRequest", output = "http://genre.service.openlib.mahxwell.org/GenreService/addGenreResponse")
    public void addGenre(
        @WebParam(name = "arg0", targetNamespace = "")
        Genre arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.mahxwell.openlib.service.genre.Genre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getGenre", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.GetGenre")
    @ResponseWrapper(localName = "getGenreResponse", targetNamespace = "http://genre.service.openlib.mahxwell.org/", className = "org.mahxwell.openlib.service.genre.GetGenreResponse")
    @Action(input = "http://genre.service.openlib.mahxwell.org/GenreService/getGenreRequest", output = "http://genre.service.openlib.mahxwell.org/GenreService/getGenreResponse")
    public Genre getGenre(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
