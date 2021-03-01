package Controllers;

import Commons.FunFileCsv;
import Exeption.UserExeption.CustomerValidate;
import Models.Customer.Customer;

import java.util.Collections;
import java.util.Scanner;

import static Controllers.MainControllers.customerList;
import static Controllers.MainControllers.displayMainMenu;

public class Customer_Controller {
    /* CUSTOMER ---------- CUSTOMER ------------ CUSTOMER */
    //String nameOfCustomer, String dateOfBirth, String gender, String idCard, String phoneNumber,
    // String typeOfCustomer, String address, Service useService
    public static void addNewCustomer(){
        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Name of customer: ");
        customer.setNameOfCustomer(sc.nextLine());

        String checkMail;
        do {
            System.out.println("Comfirm : xxx@gmail.com");
            System.out.print("Mail : ");
            checkMail = sc.nextLine();
        } while (!CustomerValidate.regexMail(checkMail));
        customer.setEmail(checkMail);

        String checkDobCustomer;
        do{
            System.out.println("Comfirm : xx/yy/zzzz");
            System.out.print("Date of birth : ");
            checkDobCustomer = sc.nextLine();
        } while (!CustomerValidate.checkDobCustomer(checkDobCustomer));
        customer.setDateOfBirth(checkDobCustomer);

        String checkGender;
        do{
            System.out.println("Male / Female / Unknow");
            System.out.print("Gender : ");
            checkGender = sc.nextLine();

        } while (!CustomerValidate.genderCheck(checkGender));
        customer.setGender(checkGender);

        System.out.print("Phone number : ");
        customer.setPhoneNumber(sc.nextLine());

        String checkIDCard;
        do{
            System.out.println("Input 9 number !");
            System.out.print("ID CARD : ");
            checkIDCard = sc.nextLine();
        } while (!CustomerValidate.idCardCheck(checkIDCard));
        customer.setIdCard(checkIDCard);


        System.out.print("Type of customer : ");
        customer.setTypeOfCustomer(sc.nextLine());

        System.out.print("Address : ");
        customer.setAddress(sc.nextLine());

        System.out.print("Use Service : ");
//        customer.setUseService();

        System.out.println("\nAdd new customer complete ! Enter to continue...");
        sc.nextLine();

        customerList.add(customer);
        FunFileCsv.writeCustomerToCSV(customerList);

        displayMainMenu();
    }

    // Show CUSTOMER INFO
    public static void showCustomerInfo(){
        Scanner sc = new Scanner(System.in);
        Collections.sort(customerList);
        for(Customer customer:customerList){
            System.out.println(customer.showInfo());
        }
        System.out.println("\nShow Customer infomation complete! Enter to continue...");
        sc.nextLine();

        displayMainMenu();
    }

    /* CUSTOMER ---------- CUSTOMER ------------ CUSTOMER */
}
