package Bai1_InstroductionJava.CountNumOfMonth;

import java.util.Scanner;

public class CountNumOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year you want to check: ");
        int year = sc.nextInt();
        System.out.println("Input number of month you want to check: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Please input the number larger than 0");
        }

        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 11:
                System.out.println("This" + num + " have 31 days");
                break;
            case (2):
                if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("The second month have 29 days");
                } else {
                    System.out.println("The second month have 28 days");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 10:
            case 12:
                System.out.println("The " + num + "have 30 days");
                break;
        }
    }
}
