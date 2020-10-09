package Bai6_KeThua.Bai_Tap.Triangle;

import Bai6_KeThua.Thuc_Hanh.He_Cac_Doi_Tuong_Hinh_Hoc.Shape;

public class Triangle extends Shape {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle() {
    }
    
    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }



    public double getPerimeter() {
        return getSize1() + getSize2() + getSize3();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p*(p-getSize1()) * (p-getSize2()) * (p-getSize3()));
    }

    @Override
    public String toString() {
        return "Info of Triangle !" +
                "\nSize of Edge : " + getSize1() + " " + getSize2() + " " + getSize3() +
                "\nColor : "  + super.getColor() +
                "\nFill : " + (super.isFilled()?"filled":"not fill") +
                "\nArea : " + getArea() +
                "\nPerimeter : " + getPerimeter();
    }
}
