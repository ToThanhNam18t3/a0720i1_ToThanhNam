package Bai7_Abstract_Interface.Bai_Tap._02_Trien_Khai_Interface_Colorable;

import Bai7_Abstract_Interface.Bai_Tap._01_Trien_Khai_Resizeable_cho_hh.Resizeable;

public class Circle extends Shape implements Resizeable,Colorable {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * (radius*radius);
    }



    @Override
    public String toString(){
        return "A shape with radius " + getRadius() + " and the color is : " + getColor();
    }

    @Override
    public void resize(double percent) {
        radius += radius * (percent/100);
    }

    @Override
    public void howToColor() {
    }
}

