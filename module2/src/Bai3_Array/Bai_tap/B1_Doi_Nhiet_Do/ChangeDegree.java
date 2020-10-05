package Bai3_Array.Bai_tap.B1_Doi_Nhiet_Do;

import java.util.Scanner;

public class ChangeDegree {

    //Change C to F
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }

    //Change F to C
    public static double faraheritToCelcius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
        System.out.println("Menu !");
        System.out.println("1. C to F");
        System.out.println("2. F to C");
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the Celcius : ");
                    celsius = sc.nextDouble();
                    System.out.println("Celcius to F: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter the Faraherit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("F to C : " + faraheritToCelcius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice < 0 | choice < 3);
    }
}
