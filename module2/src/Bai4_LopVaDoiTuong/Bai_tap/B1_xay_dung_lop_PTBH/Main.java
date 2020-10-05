package Bai4_LopVaDoiTuong.Bai_tap.B1_xay_dung_lop_PTBH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Input num a : ");
        a = sc.nextDouble();
        System.out.print("Input num b : ");
        b = sc.nextDouble();
        System.out.print("Input num c : ");
        c = sc.nextDouble();

        QuadraticEquation myQuadraticEquation = new QuadraticEquation(a,b,c);


        System.out.println("Delta = " + myQuadraticEquation.getDiscriminant());
        double delta = myQuadraticEquation.getDiscriminant();
        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("the first equation is :  " + myQuadraticEquation.getRoot1());
            System.out.println("The second equation is : " + myQuadraticEquation.getRoot2());
        }
        if (delta == 0) {
            System.out.println("the equation is :  " + myQuadraticEquation.getRoot1());
        }
        if (delta < 0 ) {
                System.out.println("The equation has no roots");
        }
    }
}
