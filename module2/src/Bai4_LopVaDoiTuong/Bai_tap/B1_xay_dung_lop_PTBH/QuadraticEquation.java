package Bai4_LopVaDoiTuong.Bai_tap.B1_xay_dung_lop_PTBH;

import Bai4_LopVaDoiTuong.Thuc_hanh.B1_lop_hinh_chu_nhat.Rectangle;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){

    }


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Phuong thuc
    public double getA(){
        return this.a;
    }
    public void setA(double a){
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta;
        delta = (this.b * b) -  4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double equation1;
        equation1 = (-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c))/2*this.a;
        return equation1;
    }

    public double getRoot2() {
        double equation2;
        equation2 = (-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c))/2*this.a;
        return  equation2;
    }
}
