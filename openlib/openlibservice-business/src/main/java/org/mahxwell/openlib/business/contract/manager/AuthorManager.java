package org.mahxwell.openlib.business.contract.manager;

import org.mahxwell.openlib.model.bean.openlib.Author;

import java.util.List;

/**
 * @author Mahxwell
 * <h1>WebService</h1>
 * <h1>Author Manager Interface</h1>
 * <p>Contain methods used in Manager Implementation</p>
 */
public interface AuthorManager {

    void addAuthor(final Author newAuthor);

    void updateAuthor(final Author authorToUpdate, final Author authorIdToFind);

    void deleteAuthor(final Author authorId);

    List<Author> Authors();

    Author getAuthor(final Integer author_id);
}
