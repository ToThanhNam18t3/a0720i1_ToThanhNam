//package Bai3_Array.Bai_tap.B4_Xoa_Phan_Tu_Khoi_Mang;
//
//import java.util.Scanner;
//
//public class deleteElementInArr {
//    //check number of array
//    public static int checkNum(int array[], int size) {
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.print("Input the length of Array : ");
//            size = sc.nextInt();
//        } while (size < 0);
//        return size;
//    }
//
//    //Input element for Array
//    public static void inputElement(int array[]) {
//        Scanner sc = new Scanner(System.in);
//        int i;
//        for (i = 0; i < array.length; i++) {
//            System.out.print("Enter the element: " + (i + 1) + " ");
//            array[i] = sc.nextInt();
//        }
//    }
//
//    // Show Arr
//    public static void show(int array[]) {
//        Scanner sc = new Scanner(System.in);
//        int j;
//        for (j = 0; j < array.length; j++) {
//            System.out.print(array[j] + " ");
//        }
//    }
//
//
//    // Delete elm in Arr
//    public static int deleteElement(int array[], int num) {
//        Scanner sc = new Scanner(System.in);
////        int j;
//////        int index = array.length;
//////        for (j = 0; j < array.length; j++) {
//////            if (array[j] == num) {
//////                for (int k = 1; k < index - 1; k++) {
//////                    array[k] = array[j + 1];
//////                }
//////                index--;
//////            }
//////        }
//////        return j;
//            int j;
//            for(j = 0 ; j < array.length; j++) {
//                if(array[j] == num) {
//                    array.remove(array[j]);
//                }
//            }
//    }
//
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//
//
//}
