package Model;

public class Author {
    private int idAuthor;
    private String authorName;

    public Author(int idAuthor, String authorName) {
        this.idAuthor = idAuthor;
        this.authorName = authorName;
    }

    public Author() {
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
