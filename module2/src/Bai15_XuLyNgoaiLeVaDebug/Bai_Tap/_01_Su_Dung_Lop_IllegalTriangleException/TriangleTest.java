package Bai15_XuLyNgoaiLeVaDebug.Bai_Tap._01_Su_Dung_Lop_IllegalTriangleException;


import java.util.Scanner;

public class TriangleTest {

    public static void inputSide() throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        inputTriangle myTriangle = new inputTriangle();
        do {
            System.out.print("Input the first Side : ");
            myTriangle.setSide1(sc.nextFloat());
            System.out.print("Input the second Side : ");
            myTriangle.setSide2(sc.nextFloat());
            System.out.print("Input the third Side : ");
            myTriangle.setSide3(sc.nextFloat());
        } while (myTriangle.getSide1() < 0 || myTriangle.getSide2() < 0 || myTriangle.getSide3() < 0);
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        inputTriangle myTriangle;
        boolean flgCheck = false;
        do {
            myTriangle = new inputTriangle();
            try {
                System.out.print("Input the first Side : ");
                myTriangle.setSide1(sc.nextFloat());
                System.out.print("Input the second Side : ");
                myTriangle.setSide2(sc.nextFloat());
                System.out.print("Input the third Side : ");
                myTriangle.setSide3(sc.nextFloat());
                flgCheck = false;
            } catch (IllegalTriangleException e) {
                System.out.println("Your side must larger than 0 ! Enter to try again ...");
                myTriangle = null;
                flgCheck = true;
            }
        } while (flgCheck);
    }
}
