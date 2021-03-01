package Bai4_LopVaDoiTuong.Thuc_hanh.B1_lop_hinh_chu_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        double height;
        System.out.print("Input width: ");
        width = sc.nextDouble();
        System.out.print("Input height: ");
        height = sc.nextDouble();

        Rectangle myRecTangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n" + myRecTangle.display());
        System.out.println("abc: " + myRecTangle.getArea());
    }
}
