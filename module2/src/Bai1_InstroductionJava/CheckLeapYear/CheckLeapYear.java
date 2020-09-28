package Bai1_InstroductionJava.CheckLeapYear;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Input the number you want to check: ");
            n = sc.nextInt();
        } while (n < 0);
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("This is a leap year!");
        } else {
            System.out.println("This is not a leap year!");
        }
    }
}