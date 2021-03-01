package Bai7_Abstract_Interface.Bai_Tap._02_Trien_Khai_Interface_Colorable;

import Bai7_Abstract_Interface.Bai_Tap._01_Trien_Khai_Resizeable_cho_hh.Resizeable;

public class Rectangle extends Shape implements Resizeable,Colorable {
    double width, length;


    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
        length += length *(percent/100);
        width += width *(percent/100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color from four sides");
    }
}
