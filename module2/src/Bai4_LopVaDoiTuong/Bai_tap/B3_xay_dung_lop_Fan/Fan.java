package Bai4_LopVaDoiTuong.Bai_tap.B3_xay_dung_lop_Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on;
    private double radius = 5;
    private String color = "BLUE";

    public Fan() {

    }

    public boolean getOn() {
        return this.on;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

}
