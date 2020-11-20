package Bai6_KeThua.Bai_Tap.Cirle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius ,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getCapacity() {
        return Math.PI * (super.getRadius() * super.getRadius()) * getHeight();
    }

    @Override
    public String toString() {
        return "A cylinder width a radius  " + getRadius() + " and color " + getColor() + " and height " + getHeight()
                + " and the capacity is : " + getCapacity();
    }
}
