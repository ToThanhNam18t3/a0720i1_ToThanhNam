package Bai1_InstroductionJava.CheckPrimeNum;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number you want to check : ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("Input Wrong Number , please Input again ! More than 2");
        } else {
            int total = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    total = total + 1;
                }
            }
            if (total == 0) {
                System.out.println("This number is Prime Number!");
            } else {
                System.out.println("This number isn't Prime Number!");
            }
        }
    }
}
