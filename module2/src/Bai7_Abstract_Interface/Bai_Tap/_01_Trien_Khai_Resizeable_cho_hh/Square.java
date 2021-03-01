package Bai7_Abstract_Interface.Bai_Tap._01_Trien_Khai_Resizeable_cho_hh;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public final String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
