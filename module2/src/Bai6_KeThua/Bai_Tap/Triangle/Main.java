package Bai6_KeThua.Bai_Tap.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edge1;
        double edge2;
        double edge3;
        String color;
        boolean fill;
        String fillInput;


        System.out.print("Input the color of this Triangle : ");
        color = sc.nextLine();
        System.out.print("Was you filled? ");
        do{
            System.out.println("If filled input TRUE , the other way input FALSE");
            fillInput = sc.nextLine();
        } while (!fillInput.equals("true") && !fillInput.equals("false"));

        fill= Boolean.parseBoolean(fillInput);
        System.out.print("Input first edge : ");
        edge1 = sc.nextDouble();
        System.out.print("Input second edge : ");
        edge2 = sc.nextDouble();
        System.out.print("Input third edge : ");
        edge3 = sc.nextDouble();

        if(edge1 + edge2 > edge3 || edge2 + edge3 > edge1 || edge3 + edge1 > edge2) {
            System.out.println("three edge cannot connect to triangle !");
        } else {
            Triangle testTriangle = new Triangle(color,fill,edge1,edge2,edge3);
            System.out.println(testTriangle);
        }
    }
}
