package Model;

public class ThuVienDTO {
    private int ID;
    private String nameProduct;
    private double price;
    private String image;
    private String authorName;
    private int idAuthor;

    public ThuVienDTO(int ID, String nameProduct, double price, String image, String authorName, int idAuthor) {
        this.ID = ID;
        this.nameProduct = nameProduct;
        this.price = price;
        this.image = image;
        this.authorName = authorName;
        this.idAuthor = idAuthor;
    }

    public ThuVienDTO() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}
