package Service;

import Model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> displayAllAuthor();
    Author getAuthorById(int id);
}
