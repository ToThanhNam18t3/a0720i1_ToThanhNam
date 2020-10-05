package Bai3_Array.Bai_tap.B3_Tim_Gia_Tri_Nho_Nhat_Cua_Mang;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindMinInArr {
    //Input Array
    public  static  void inputArray(int array[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    //Show array
    public static  void displayArray(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0 ; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    //Find Min in Array
    public  static int findMin(int array[]){
        int min = array[0];

        for(int k = 0; k < array.length; k++) {
           if(array[k] < min){
               min = array[k];
           }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of Arr: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        inputArray(array);
        displayArray(array);
        System.out.print("\n" + "Smallest number is : " + findMin(array));





    }
}
