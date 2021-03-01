package Bai5_Access_modifier_static_method_static_property.Bai_tap.B1_Acces_Modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public double getAria() {
        final double PI = 3.14;
        return PI * (this.radius * this.radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius() {
        this.radius = radius;
    }
}
