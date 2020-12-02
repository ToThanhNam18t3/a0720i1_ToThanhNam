package Controllers;

import Commons.FunFileCsv;
import Exeption.ServiceExeption.ServiceValidate;
import Models.Services.House;

import java.util.Scanner;

import static Controllers.MainControllers.displayMainMenu;
import static Controllers.MainControllers.houseList;

public class House_Controller {
    //Add New House
    public static void addNewHouse() {
        //String typeOfRoom, String otherConvenient, int floor
        House house = new House();
        Scanner sc = new Scanner(System.in);
        String name;
        String checkNameHouse;
        double checkAreaUsed;
        double checkPool;
        int checkMaxOfPeople;

        int checkPrice;
        do {
            System.out.println("Comfirm : HOVL-YYYY , YYYY [ 0 - 9 ]");
            System.out.print("ID : ");
            name = sc.nextLine();
        } while (!ServiceValidate.checkIDHouse(name));
        house.setId(name);

        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Name : ");
            checkNameHouse = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkNameHouse));
        house.setNameOfService(checkNameHouse);

        do{
            System.out.println("Input Area Used must be larger than 30m2");
            System.out.print("Area: ");
            checkAreaUsed = sc.nextDouble();
        } while (checkAreaUsed < 30);
        house.setAreaUsed(checkAreaUsed);

        do{
            System.out.println("Price must me larger than 0");
            System.out.print("Price: ");
            checkPrice = sc.nextInt();
        } while (checkPrice < 0);
        house.setPrice(checkPrice);

        do {
            System.out.println("Input > 0 and < 20 ");
            System.out.print("Max of People : ");
            checkMaxOfPeople = sc.nextInt();
        } while (checkMaxOfPeople < 0 && checkMaxOfPeople > 20);
        house.setMaxOfPeople(checkMaxOfPeople);

        sc.skip("\n");
        System.out.print("Rent type : ");
        house.setRentType(sc.nextLine());
        System.out.print("Input typeOfRoom : ");
        house.setTypeOfRoom(sc.nextLine());
        System.out.print("Input Convenient you want : ");
        house.setOtherConvenient(sc.nextLine());
        System.out.print("Input the number of floor : ");
        house.setFloor(sc.nextInt());
        System.out.println("\nAdd new house complete ! Enter to continue...");
        sc.nextLine();
        sc.nextLine();

        houseList.add(house);
        FunFileCsv.writeVillaToCSV(houseList, "House");

        displayMainMenu();
    }
}
