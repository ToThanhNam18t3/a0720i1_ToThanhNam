package Bai7_Abstract_Interface.Bai_Tap._02_Trien_Khai_Interface_Colorable;

import Bai7_Abstract_Interface.Bai_Tap._01_Trien_Khai_Resizeable_cho_hh.Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] myShape = new Shape[5];

        myShape[0] = new Circle(1.5);
        myShape[1] = new Rectangle(2,3);
        myShape[2] = new Square(2);

        for(Shape shape : myShape){
            if(shape instanceof Circle){
                System.out.println("Circle area : " + ((Circle) shape).getArea());
            } else if(shape instanceof Square){
                System.out.println("Square area : " + ((Square) shape).getArea());
                ((Colorable)shape).howToColor();
            } else if(shape instanceof Rectangle){
                System.out.println("Rectangle area : " + ((Rectangle) shape).getArea());
                ((Colorable)shape).howToColor();
            }
        }


    }

}
