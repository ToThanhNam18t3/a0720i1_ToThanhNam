package dao;

import Model.Author;

import java.sql.SQLException;
import java.util.List;

public interface IAuthorDAO {
    List<Author> getAllAuthor() throws SQLException;
    Author getAuthorByID(int id) throws SQLException;

}
