package Bai15_XuLyNgoaiLeVaDebug.Bai_Tap._01_Su_Dung_Lop_IllegalTriangleException;

import Bai6_KeThua.Bai_Tap.Triangle.Triangle;

public class inputTriangle extends Exception {
    private float side1;
    private float side2;
    private float side3;

    public inputTriangle() throws IllegalTriangleException {
        checkSumSideTriangle();
    }

    public void setSides() throws IllegalTriangleException{
        if (this.getSide1() < 0){
            throw new IllegalTriangleException("Side must be larger than 0");
        } else if(this.getSide2() < 0) {
            throw new IllegalTriangleException("Side must be larger than 0 !");
        } else if(this.getSide3() < 0){
            throw new IllegalTriangleException("Side must be larger than 0 !");
        }
    }

    public void checkSumSideTriangle() throws IllegalTriangleException {
        if(this.getSide1() + this.getSide2() < this.getSide3()) {
            throw new IllegalTriangleException("Wrong side of Triangle ! Can't create...");
        }
    }


//    public static void setSides(float side1, float side2, float side3) throws IllegalTriangleException {
//        if (side1 < 0 ) {
//            throw new IllegalTriangleException("Side must be larger than 0 !");
//        } else  if(side2 < 0) {
//            throw new IllegalTriangleException("Side must be larger than 0 !");
//        } else if(side3 < 0 ) {
//            throw new IllegalTriangleException("Side must be larger than 0 !");
//        } else if(side1 + side2 < side3 | side1 + side3 < side2 | side2 + side3 < side1) {
//            throw new IllegalTriangleException("Wrong side of Triangle ! Can't create...");
//        }
//    }


    public inputTriangle(String message, float side1, float side2, float side3) {
        super(message);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) throws IllegalTriangleException {
        this.side1 = side1;
        setSides();
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) throws IllegalTriangleException {
        this.side2 = side2;
        setSides();
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) throws IllegalTriangleException {
        this.side3 = side3;
        setSides();
    }

    @Override
    public String toString(){
        return "Side 1 : " + getSide1() + "\nSide 2 :" + getSide2() + "\nSide 3: " + getSide3();
    }
}
