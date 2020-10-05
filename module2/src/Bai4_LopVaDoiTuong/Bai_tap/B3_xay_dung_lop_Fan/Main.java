package Bai4_LopVaDoiTuong.Bai_tap.B3_xay_dung_lop_Fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fan myFan1 = new Fan(3, true, 10, "yellow");
        Fan myFan2 = new Fan(2, false, 5, "blue");

        int num;
        do{
            System.out.println("Which you want to check ?  1 or 2");
            num = sc.nextInt();
        } while (num != 1 && num != 2);
        if (num == 1) {
            if (myFan1.getOn()) {
                System.out.println("Speed of Fan : " + myFan1.getSpeed());
                System.out.println("Radius of Fan : " + myFan1.getRadius());
                System.out.println("Color of Fan : " + myFan1.getColor());
                System.out.println("Fan is on");
            }
        }
        if (num == 2) {
            if (myFan2.getOn()) {
                System.out.println("Speed of Fan : " + myFan2.getSpeed());
                System.out.println("Radius of Fan : " + myFan2.getRadius());
                System.out.println("Fan is off");
            }
        }
    }
}