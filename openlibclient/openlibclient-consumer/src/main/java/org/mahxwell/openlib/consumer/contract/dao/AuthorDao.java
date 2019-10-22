package org.mahxwell.openlib.consumer.contract.dao;

import org.mahxwell.openlib.service.author.Author;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h2>Author Dao Interface</h2>
 * <p>Contain methods used in Dao Implementation</p>
 */
public interface AuthorDao {


    void addAuthor(final Author newAuthor);

    void updateAuthor(final Author authorToUpdate, final Author authorToFind);

    void deleteAuthor(final Author authorToDelete);

    List<Author> authors();

    Author getAuthor(final Integer author_id);
}
