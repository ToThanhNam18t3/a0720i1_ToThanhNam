package Bai1_InstroductionJava.MySeftHeight;

import java.util.Scanner;

public class MySeftHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float height;
        float weight;
        do {
            System.out.println("Input your height ( cm )  : ");
            height = sc.nextInt();
        } while (height  < 0);

        do{
            System.out.println("Input your weight ( kg )  : ");
            weight = sc.nextInt();
        } while (weight < 0);

        float bmi = weight / (height * height);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
