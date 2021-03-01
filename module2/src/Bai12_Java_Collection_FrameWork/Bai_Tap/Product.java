package Bai12_Java_Collection_FrameWork.Bai_Tap;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int id;
    private String nameOfProduct;
    private int price;

    public Product(){
    }

    public Product(int id, String nameOfProduct, int price) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "ID : " + getId() + "  "  + "---" + " Book Name : " + getNameOfProduct() + "---" + "Price : " + getPrice() + "VND";
    }


    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }
}
