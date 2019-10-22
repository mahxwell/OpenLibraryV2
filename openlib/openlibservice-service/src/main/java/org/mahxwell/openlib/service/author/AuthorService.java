package org.mahxwell.openlib.service.author;


import org.apache.log4j.Logger;
import org.mahxwell.openlib.AbstractManagerService;
import org.mahxwell.openlib.ContextLoader;
import org.mahxwell.openlib.business.contract.manager.AuthorManager;
import org.mahxwell.openlib.model.bean.openlib.Author;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h2>Author Service Class</h2>
 * <p>Create WebMethod for SOAP System</p>
 */
@WebService(serviceName = "author")
public class AuthorService extends AbstractManagerService {

    private static final Logger logger = Logger.getLogger(AuthorService.class);

    /* Get AuthorManager bean from Enum Contextloader */

    AuthorManager authorManager = ContextLoader.INSTANCE.getAuthorManager();


    /**
     * WebService
     * Get a Author List Object
     *
     * @return Authors -> List of Author Object
     */
    @WebMethod(operationName = "listauthor")
    public List<Author> getAuthorListService() {

        try {
            List<Author> authors = authorManager.Authors();
            if (authors != null) {
                return authors;
            } else {
                return null;
            }
        } catch (Exception e) {
            logger.error("Error listauthor method = " + e);
        }
        return null;
    }

    /**
     * WebService
     * Add a New Author Object in DataBase
     *
     * @param newAuthor New Author Object
     */
    @WebMethod(operationName = "addAuthor")
    public void addAuthorService(final Author newAuthor) {
        try {
            authorManager.addAuthor(newAuthor);
        } catch (Exception e) {
            logger.error("Error addLibraries method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Update an Existing Author Object in DataBase
     *
     * @param authorToUpdate Author Object Updated
     * @param authorToFind   Author Object to update
     */
    @WebMethod(operationName = "updateAuthor")
    public void updateAuthorService(final Author authorToUpdate, final Author authorToFind) {
        try {
            authorManager.updateAuthor(authorToUpdate, authorToFind);
        } catch (Exception e) {
            logger.error("Error updateAuthor method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Delete an Existing Author Object in DataBase
     *
     * @param authorToDelete Author Object to delete
     */
    @WebMethod(operationName = "deleteAuthor")
    public void deleteAuthorService(final Author authorToDelete) {
        try {
            authorManager.deleteAuthor(authorToDelete);
        } catch (Exception e) {
            logger.error("Error deleteAuthor method = " + e);
        }
        return;
    }

    /**
     * WebService
     * Get a Precise Author Object by Identification Number
     *
     * @param author_id Author unique Identification number
     * @return Author Object Found
     */
    @WebMethod(operationName = "getAuthor")
    public Author getAuthor(final Integer author_id) {
        try {
            Author author = authorManager.getAuthor(author_id);
            if (author != null)
                return author;
            else
                return null;
        } catch (Exception e) {
            logger.error("Error getAuthor method = " + e);
        }
        return null;
    }
}
