package org.mahxwell.openlib.business.impl.manager;

import org.mahxwell.openlib.business.contract.manager.AuthorManager;
import org.mahxwell.openlib.service.author.Author;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Author Manager Implementation Class</h2>
 * <p>Contain Managers calling Daos</p>
 */
@Repository
public class AuthorManagerImpl extends AbstractManagerImpl implements AuthorManager {

    /**
     * Manager
     * Add a New Author Object in DataBase
     *
     * @param newAuthor New Author Object
     */
    @Override
    public void addAuthor(final Author newAuthor) {
        getDaoFactory().getAuthorDao().addAuthor(newAuthor);
        return;
    }

    /**
     * Manager
     * Update an Existing Author Object in DataBase
     *
     * @param authorToUpdate Author Object Updated
     * @param authorToFind   Author Object to update
     */
    @Override
    public void updateAuthor(final Author authorToUpdate, final Author authorToFind) {
        getDaoFactory().getAuthorDao().updateAuthor(authorToUpdate, authorToFind);
        return;
    }

    /**
     * Manager
     * Delete an Existing Author Object in DataBase
     *
     * @param authorToDelete Author Object to delete
     */
    @Override
    public void deleteAuthor(final Author authorToDelete) {
        getDaoFactory().getAuthorDao().deleteAuthor(authorToDelete);
        return;
    }

    /**
     * Manager
     * Get a Author List Object
     *
     * @return Authors -> List of Author Object
     */
    @Override
    public List<Author> authors() {
        return getDaoFactory().getAuthorDao().authors();
    }

    /**
     * Manager
     * Get a Precise Author Object by Identification Number
     *
     * @param author_id Author unique Identification number
     * @return Author Object Found
     */
    @Override
    public Author getAuthor(final Integer author_id) {
        return getDaoFactory().getAuthorDao().getAuthor(author_id);
    }

}
