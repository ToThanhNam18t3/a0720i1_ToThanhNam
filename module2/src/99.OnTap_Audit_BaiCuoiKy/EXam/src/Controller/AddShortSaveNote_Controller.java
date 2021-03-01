package Controller;

import Common.FunFileCSV;
import Exeption.SaveNoteValiDate;
import Models.LongSaveNote;
import Models.ShortSaveNote;

import java.util.Scanner;

import static Controller.MainController.*;

public class AddShortSaveNote_Controller {
    public static void addNewShortSaveNote(){
        Scanner sc = new Scanner(System.in);
        ShortSaveNote shortSaveNote = new ShortSaveNote();

        String nameOfNote;
        do {
            System.out.println("Comfirm : STK-XXXX ");
            System.out.print("Input name of save note : ");
            nameOfNote = sc.nextLine();
        } while (!SaveNoteValiDate.checkName(nameOfNote));
        shortSaveNote.setName(nameOfNote);

        String idcheck;
        do {
            System.out.println("Comfirm : 1-9 ");
            System.out.print("ID of Customer : ");
            idcheck = (sc.nextLine());
        } while (!SaveNoteValiDate.checkID(idcheck));
        shortSaveNote.setId(nameOfNote);

        String dateCheck;
        do{
            System.out.println("Comfirm : xx/yy/zzzz ");
            System.out.print("Input day you open save note : ");
            dateCheck = sc.nextLine();
        } while (!SaveNoteValiDate.checkDate(dateCheck));
        shortSaveNote.setDateOfOpen(dateCheck);

        String timeStart;
        do{
            System.out.println("Comfirm : xx/yy/zzzz ");
            System.out.print("Input day you give money to save : ");
            timeStart = sc.nextLine();
        } while (!SaveNoteValiDate.checkDate(timeStart));
        shortSaveNote.setDateOfOpen(timeStart);

        double tiengui;
        do{
            System.out.println("Larger than 1 milion ! ");
            System.out.print("Input the money you save : ");
            tiengui = Double.parseDouble(sc.nextLine());
        } while (tiengui < 1000000);
        shortSaveNote.setMoney(tiengui);

        String percent;
        do{
            System.out.println("Comfirm : 5%... ");
            System.out.print("Input the percent of save : ");
            percent = sc.nextLine();
        } while (!SaveNoteValiDate.checkPercent(percent));
        shortSaveNote.setRentPay(percent);

        String kyhan;
        do{
            System.out.println("Comfirm : 1 , 3 , 5 , 10 year ! ");
            System.out.print("Input the year you want : ");
            kyhan = sc.nextLine();
        } while (!SaveNoteValiDate.checkKyHan(kyhan));
        shortSaveNote.setTimeRent(kyhan);
        listShort.add(shortSaveNote);

        FunFileCSV.writeShortNoteToCSV(listShort);

        System.out.println("Add new customer complete ! Enter to continue...");
        sc.nextLine();

        showMainMenu();
    }
}
