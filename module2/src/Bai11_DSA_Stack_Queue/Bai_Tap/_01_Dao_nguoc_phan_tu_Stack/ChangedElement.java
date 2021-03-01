package Bai11_DSA_Stack_Queue.Bai_Tap._01_Dao_nguoc_phan_tu_Stack;

import java.util.Scanner;
import java.util.Stack;

public class ChangedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> intStack = new Stack<>();
        int[] intArray = {1, 2, 3, 4};

        //Them cac phan tu cua intArr vao Stack
        for (int i = 0; i < intArray.length; i++) {
            intStack.push(intArray[i]);
        }

        //Lay cac phan tu cua inArr ra bang Pop FILO
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intStack.pop();
        }

        //Tra ve mang da duoc sap xep
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        //--------------------------------

        Stack<String> stringStack = new Stack<>();
        String inputString;
        System.out.print("Input String you want to changed : ");
        inputString = sc.nextLine();
        String[] afterSplitString = inputString.split("\\s");

        System.out.print("Before change : ");
        for (String arr : afterSplitString) {
            System.out.print(arr);
        }

        for (int i = 0; i < afterSplitString.length; i++) {
            stringStack.push(afterSplitString[i]);
        }

        System.out.println("\n"+stringStack);

        for (int i = 0; i < afterSplitString.length; i++) {
            afterSplitString[i] = stringStack.pop();
        }

        System.out.print("After changed : ");
        for (int i = 0; i < afterSplitString.length; i++) {
            System.out.print(afterSplitString[i]);
        }
    }
}
