package Bai3_Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindMinInArr {
    //Check number of Arr

    public static int checkNumArr(int []array){
        Scanner sc = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter a size of Arr: ");
            size = sc.nextInt();
        } while (size < 0);
        return size;
    }

    //Input Array
    public  static  void inputArray(int array[]){
        Scanner sc = new Scanner(System.in);
        array = new int[checkNumArr(array)];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element: " + (i+1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
    }

    public static  void displayArray(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0 ; i < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        checkNumArr(array[]);

    }
}
