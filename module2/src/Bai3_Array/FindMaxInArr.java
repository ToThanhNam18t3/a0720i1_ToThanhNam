package Bai3_Array;

import java.util.Scanner;

public class FindMaxInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int[] array;

        do {
            System.out.print("Enter a Size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.print("Size must smaller than 20!" + "\n");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter Element " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.println("List: ");
        for(int j = 0 ; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\t" + "The largest property value in the list is " + max + " ,at position " + index);
    }
}
