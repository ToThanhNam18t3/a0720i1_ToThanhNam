package Bai1_InstroductionJava.PTBN;

import java.util.Scanner;

public class PTBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A number: ");
        float a = sc.nextInt();
        System.out.println("Input B number");
        float b = sc.nextInt();
        float x;

        if (a == 0) {
            if(b == 0 ){
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình vô số nghiệm!");
            }
        } else {
            x = -b/a;
            System.out.println("Nghiệm của phương trình là : " + x);
        }
    }
}
