package org.mahxwell.openlib.business.contract.manager;


import org.mahxwell.openlib.service.author.Author;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>Client</h1>
 * <h1>Author Manager Interface</h1>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface AuthorManager {

    void addAuthor(final Author newAuthor);

    void updateAuthor(final Author authorToUpdate, final Author authorToFind);

    void deleteAuthor(final Author authorToDelete);

    List<Author> authors();

    Author getAuthor(final Integer author_id);
}
