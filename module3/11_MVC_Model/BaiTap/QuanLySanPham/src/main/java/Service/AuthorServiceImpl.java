package Service;

import Model.Author;
import dao.AuthorDaoImpl;
import dao.IAuthorDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorServiceImpl implements AuthorService {
    public static Map<Integer,Author> authorMap = new HashMap<>();
    private IAuthorDAO authorDao = new AuthorDaoImpl();

    @Override
    public List<Author> displayAllAuthor() {
        List<Author> authorList = new ArrayList<>();

        try {
            authorList = authorDao.getAllAuthor();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return authorList;
    }

    @Override
    public Author getAuthorById(int id) {
        Author author = null;
        try {
            author = this.authorDao.getAuthorByID(id); // Truyền giá trị vào cho Author , bản thân là 1 hàm
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return author;
    }
}
