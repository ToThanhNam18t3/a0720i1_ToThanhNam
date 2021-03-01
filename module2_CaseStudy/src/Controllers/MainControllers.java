package Controllers;

import Commons.FunFileCsv;
import Exeption.ServiceExeption.ServiceValidate;
import Exeption.UserExeption.CustomerValidate;
import Models.Customer.Customer;
import Models.Employee.Employee;
import Models.Services.House;
import Models.Services.Room;
import Models.Services.Services;
import javafx.concurrent.Service;

import java.util.*;

import static Controllers.Customer_Controller.addNewCustomer;
import static Controllers.Customer_Controller.showCustomerInfo;
import static Controllers.House_Controller.addNewHouse;
import static Controllers.Room_Controller.addNewRoom;
import static Controllers.Villa_Controller.addNewVilla;

public class MainControllers {
    static Scanner input = new Scanner(System.in);
    public static List<Services> villaList = new ArrayList<>();
    public static List<Services> houseList = new ArrayList<>();
    public static List<Services> roomList = new ArrayList<>();
    public static List<Customer> customerList = new ArrayList<>();

    public static Map<String,Employee> employeeMap = new LinkedHashMap<>();

    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);

        int choose;
        System.out.println("========== MENU ==========");
        System.out.println("1. Add New Service");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        System.out.print("HEY BRO ? WHAT'S UP ? WHAT DO YOU WANT TO CHOOSE ?");
        String yourchoose = sc.nextLine();
        switch (yourchoose) {
            case "1":
                addNewService();
                break;
            case "2":
                showService();
                System.out.println("What service do you want to see ?");
                int serviceNum = sc.nextInt();
                switch (serviceNum) {
                    case 1:
                        displayService(villaList);
                        break;
                    case 2:
                        displayService(houseList);
                        break;
                    case 3:
                        displayService(roomList);
                        break;
                    case 4:
                        displayServiceNotDuplicate(villaList);
                        break;
                    case 5:
                        displayServiceNotDuplicate(houseList);
                        break;
                    case 6:
                        displayServiceNotDuplicate(roomList);
                        break;
                    case 7:
                        displayMainMenu();
                        break;
                    case 8:
                        exit();
                        break;
                    default:
                        System.out.println("!!! Input Wrong number ! Enter to try...");
                        sc.nextLine();
                        showService();
                }
            case "3":
                    addNewCustomer();
                    break;
            case "4":
                showCustomerInfo();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showAllEmployee();
                break;
            case "7":
                exit();
                break;
            default:
                System.out.println("!!! Input Wrong number ! Enter to try...");
                sc.nextLine();
                displayMainMenu();
        }
    }

    //Add New Service
    public static void addNewService() {
        Scanner sc = new Scanner(System.in);
        int choose;
        System.out.println("======ADD======");
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back To Menu");
        System.out.println("5. Exit !");
        System.out.println("What number of menu do you want to choose ?");
        choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("!!! Input Wrong number ! Enter to try...");
                sc.nextLine();
                displayMainMenu();
        }
    }

    // Child Menu of 2 ( Show Service );
    public static void showService() {
        System.out.println("======= SERVICE ========");
        System.out.println("1.Show all Villa");
        System.out.println("2.Show all House");
        System.out.println("3.Show all Room");
        System.out.println("4.Show all name villa not duplicate");
        System.out.println("5.Show all name house not duplicate");
        System.out.println("6.Show all name name not duplicate");
        System.out.println("7.Back To Menu");
        System.out.println("8.Exit");
    }
    //  1.2.3  Show Service
    public static void displayService(List<Services> servicesList) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (Services services : servicesList) {
            count++;
            System.out.print(count + ". ");
            services.showInfo();
            System.out.println("------------------");
        }
        System.out.println("\nShow info complete ! Enter to continue...");
        sc.nextLine();

        addNewBooking();
    }

    //4.5.6
    public static void displayServiceNotDuplicate(List<Services> servicesList){
        Scanner sc = new Scanner(System.in);
        Set<String> serviceName = new LinkedHashSet<>();
        for (Services services : servicesList){
            serviceName.add(services.getNameOfService());
        }
        System.out.println(serviceName);
        System.out.println("\nShow info complete ! Enter to continue...");
        sc.nextLine();
        displayMainMenu();
    }

    //Exit
    public static void exit() {
        System.exit(0);
    }
    // TASK 7 ADD NEW BOOKING
    public static void addNewBooking(){
        Scanner sc = new Scanner(System.in);
        for(Customer customerInfo:customerList){
            System.out.println(customerList.indexOf(customerInfo) + 1  + ". " + customerInfo.showInfo());
        }
        System.out.print("What is customer do you choose to book ?");
        String choose = input.nextLine();
        int index = Integer.parseInt(choose) - 1;
        Customer customer = customerList.get(index);
        System.out.println(customer);

        System.out.println("1. Booking Villa" +
                            "\n2. Booking House" +
                            "\n3. Booking Room");
        System.out.println("What service do you want to choose ?");
        String chooseBooking = input.nextLine();

        switch (chooseBooking){
            case "1":
                displayService(villaList);
                System.out.println("What villa do you want to choose ?");
                String chooseAddVilla = sc.nextLine();

                break;
            case "2":
                displayService(houseList);
                break;
            case "3":
                displayService(roomList);
                break;
            default:
                System.out.println("Wrong !Enter to try again...");
                sc.nextLine();
        }
    }

    //Task 9 - EMPLOYEE
    public static void showAllEmployee(){
            for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            displayMainMenu();
    }

    //Clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
