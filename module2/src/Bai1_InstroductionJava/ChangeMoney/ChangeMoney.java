package Bai1_InstroductionJava.ChangeMoney;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long usd;
        do {
            System.out.println("Input number of USD you want to change : ");
             usd = sc.nextLong();
        } while (usd < 0);

        long vnd;
        vnd = 23000 * usd;
        System.out.println("USD => VND : " + vnd + " vnd ");
    }
}
