package Controller;

import Common.FunFileCSV;
import Models.LongSaveNote;
import Models.SaveNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Controller.AddLongSaveNote_Controller.addNewLongSaveNote;
import static Controller.AddShortSaveNote_Controller.addNewShortSaveNote;

public class MainController {
    Scanner sc = new Scanner(System.in);
    public static List<SaveNote> listShort = new ArrayList<>();
    public static List<SaveNote> listLong = new ArrayList<>();

    public static void showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== MENU ======");
        System.out.println("1.\tAdd new save note \n" +
                "2.\tDelete save note \n" +
                "3.\tShow save note list \n" +
                "4.\tShow information of Customer \n" +
                "5.\tFind save note list \n" +
                "6.\tExit");
        System.out.println("Input number : ");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                System.out.println("1.\tLong save note\n" +
                        "2.\tShort save note\n");
                int choose1 = Integer.parseInt(sc.nextLine());
                switch(choose1){
                    case 1:
                        addNewLongSaveNote();
                        break;
                    case 2:
                        addNewShortSaveNote();
                        break;
                }
            case 2:
            case 3:
                System.out.println("1.\tLong save note\n" +
                        "2.\tShort save note\n");
                int choose2 = Integer.parseInt(sc.nextLine());
                switch (choose2){
                    case 1:
                        display(listLong);
                        System.out.println("Complete! ...enter ...");
                        sc.nextLine();
                        showMainMenu();
                    case 2:
                        display(listShort);
                        System.out.println("Complete! ...enter ...");
                        sc.nextLine();
                        showMainMenu();
                    default:
                        System.out.println("Try again...");
                        sc.nextLine();
                        showMainMenu();
                }
            case 4:
            case 5:
            case 6:
                exit();
        }
    }

    public static void exit() {
        System.exit(0);
    }


    public static void display(List<SaveNote> noteList){
        Scanner sc = new Scanner(System.in);
        for(SaveNote saveNote :noteList){
        saveNote.showInfo();
        }
    }

    public static void main(String[] args) {
        showMainMenu();
        listLong = FunFileCSV.readLongNote();
        listShort = FunFileCSV.readShortNote();
    }
}
