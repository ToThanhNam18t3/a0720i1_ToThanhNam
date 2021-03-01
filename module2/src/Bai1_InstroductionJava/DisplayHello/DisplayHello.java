package Bai1_InstroductionJava.DisplayHello;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
