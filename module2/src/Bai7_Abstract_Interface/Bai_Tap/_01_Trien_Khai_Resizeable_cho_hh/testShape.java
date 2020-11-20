package Bai7_Abstract_Interface.Bai_Tap._01_Trien_Khai_Resizeable_cho_hh;

import java.util.Random;

public class testShape {
    public static void main(String[] args) {
        Shape[] myShape = new Shape[3];

        myShape[0] = new Circle(1.5);
        myShape[1] = new Rectangle(2, 3);
        myShape[2] = new Square(2);

        double persent = Math.random() * 100+1; // Ham random tu 0 - 99 ( + 1 de tranh truong hop so 0 )
        System.out.println(persent);

//        for (Shape shape : myShape) {
//            System.out.println("Pre-sorted!");
//            System.out.println(shape);
//            System.out.println("After-sorted!");
//            if(shape instanceof Resizeable){
//                ((Resizeable) shape).resize(persent);
//            }
//            System.out.println(shape);
//            System.out.println("-----------------------------");
//        }

        for(Shape shape : myShape){
            if(shape instanceof Circle){
                System.out.println("Pre-Resize Area!");
                System.out.println(((Circle) shape).getArea());
                System.out.println("After-Resize Area!");
                ((Resizeable)shape).resize(persent);
                System.out.println(((Circle) shape).getArea());
            } else if(shape instanceof Rectangle){
                System.out.println("Pre-Resize Area!");
                System.out.println(((Rectangle) shape).getArea());
                System.out.println("After-Resize Area!");
                ((Resizeable) shape).resize(persent);
                System.out.println(((Rectangle) shape).getArea());
            }
        }
    }
}
