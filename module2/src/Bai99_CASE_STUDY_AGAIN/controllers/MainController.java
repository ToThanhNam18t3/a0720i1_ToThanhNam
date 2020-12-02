package Bai99_CASE_STUDY_AGAIN.controllers;

import java.util.Scanner;

import static Bai99_CASE_STUDY_AGAIN.controllers.BookingController.addNewBooking;
import static Bai99_CASE_STUDY_AGAIN.controllers.BookingController.bookingMovieTicket4d;
import static Bai99_CASE_STUDY_AGAIN.controllers.CustomerController.addNewCustomer;
import static Bai99_CASE_STUDY_AGAIN.controllers.CustomerController.showInfomationCustomer;
import static Bai99_CASE_STUDY_AGAIN.controllers.EmployeeController.findEmployeeFromResume;
import static Bai99_CASE_STUDY_AGAIN.controllers.EmployeeController.showInfomationEmployee;
import static Bai99_CASE_STUDY_AGAIN.controllers.ServiceController.addNewServices;
import static Bai99_CASE_STUDY_AGAIN.controllers.ServiceController.showServices;

public class MainController {
    public static void displayMenuMain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tBooking\n"+
                "8.\tFind Employee\n" +
                "9.\tBack to menu !\n" +
                "10.\tExit !\n");

        System.out.print("What services do you want to choose ? ");
        String chooseMain = sc.nextLine();
        switch (chooseMain) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInfomationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInfomationEmployee();
                break;
            case "7":
                bookingMovieTicket4d();
                break;
            case "8":
                findEmployeeFromResume();
                break;
            case "9":
                displayMenuMain();
                break;
            case "10":
                exit();
                break;

            default:
                System.out.println("Error ! Enter to try again ... ");
                sc.nextLine();
                displayMenuMain();
        }
    }

    //Exit
    public static void exit(){
        System.exit(0);
    }

    public static void main(String[] args) {
        displayMenuMain();
    }
}
