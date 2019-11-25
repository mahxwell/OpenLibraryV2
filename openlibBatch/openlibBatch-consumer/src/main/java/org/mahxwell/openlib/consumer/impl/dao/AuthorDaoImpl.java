package org.mahxwell.openlib.consumer.impl.dao;

import org.mahxwell.openlib.consumer.contract.dao.AuthorDao;
import org.mahxwell.openlib.service.author.Author;
import org.mahxwell.openlib.service.author.AuthorService;
import org.mahxwell.openlib.service.author.Author_Service;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Author Dao Implementation Class</h2>
 * <p>Contain PostGre SQL queries in each methods</p>
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {

    private Author_Service author_service = new Author_Service();
    private AuthorService authorService = author_service.getAuthorServicePort();

    /**
     * DAO
     * Add a New Author Object in DataBase
     *
     * @param newAuthor New Author Object
     */
    @Override
    public void addAuthor(final Author newAuthor) {
        authorService.addAuthor(newAuthor);
        return;
    }

    /**
     * DAO
     * Update an Existing Author Object in DataBase
     *
     * @param authorToUpdate Author Object Updated
     * @param authorToFind   Author Object to update
     */
    @Override
    public void updateAuthor(final Author authorToUpdate, final Author authorToFind) {
        authorService.updateAuthor(authorToUpdate, authorToFind);
        return;
    }

    /**
     * DAO
     * Delete an Existing Author Object in DataBase
     *
     * @param authorToDelete Author Object to delete
     */
    @Override
    public void deleteAuthor(final Author authorToDelete) {
        authorService.deleteAuthor(authorToDelete);
        return;
    }

    /**
     * DAO
     * Get a Author List Object
     *
     * @return Users -> List of User Object
     */
    @Override
    public List<Author> authors() {
        return authorService.listauthor();
    }

    /**
     * DAO
     * Get a Precise Author Object by Identification Number
     *
     * @param author_id Author unique Identification number
     * @return Author Object Found
     */
    @Override
    public Author getAuthor(final Integer author_id) {
        return authorService.getAuthor(author_id);
    }

}
