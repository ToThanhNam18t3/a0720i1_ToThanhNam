package dao;

import Model.Author;
import utils.DBConnection;

import javax.naming.Name;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImpl implements IAuthorDAO {
    private static final String GET_ALL_AUTHOR = "SELECT * FROM author";
    private static final String GET_NAME_AUTHOR = "SELECT AuthorName from author";
    private static final String GET_AUTHOR_BY_ID = "SELECT * from author where idAuthor = ?";

    @Override
    public List<Author> getAllAuthor() throws SQLException {
        List<Author> authorList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_AUTHOR);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            int ID = resultSet.getInt("idAuthor");
            String name = resultSet.getString("AuthorName");

            authorList.add(new Author(ID,name));
        }
        return authorList;
    }

    @Override
    public Author getAuthorByID(int id) throws SQLException {
        Author author = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_AUTHOR_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery(); // Trả về kết quả của DB

        if(resultSet.next()){
            int idAuthor = resultSet.getInt("idAuthor");
            String authorName = resultSet.getString("AuthorName");
            author = new Author();
            author.setIdAuthor(idAuthor);
            author.setAuthorName(authorName);
        }
        return author;
    }
}
