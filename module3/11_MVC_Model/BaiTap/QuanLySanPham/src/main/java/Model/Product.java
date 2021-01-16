package Model;

import java.sql.Blob;

public class Product {
    private int ID;
    private String nameProduct;
    private double price;
    private String image;

    public Product() {
    }

    public Product(int ID, String nameProduct, double price, String image) {
        this.ID = ID;
        this.nameProduct = nameProduct;
        this.price = price;
        this.image = image;
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

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
