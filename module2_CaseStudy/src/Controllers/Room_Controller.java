package Controllers;

import Commons.FunFileCsv;
import Exeption.ServiceExeption.ServiceValidate;
import Models.Services.Room;

import java.util.Scanner;

import static Controllers.MainControllers.displayMainMenu;
import static Controllers.MainControllers.roomList;

public class Room_Controller {
    //Add New Room
    public static void addNewRoom() {
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        String idCheck;
        String checkNameRoom;
        double checkAreaUsed;
        int checkPrice;

        do{
            System.out.println("Comfirm : ROVL-YYYY , YYYY [ 0 - 9 ]");
            System.out.print("ID : ");
            idCheck = sc.nextLine();
        } while (!ServiceValidate.checkIDRoom(idCheck));
        room.setId(idCheck);

        do {
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Name : ");
            checkNameRoom = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkNameRoom));
        room.setNameOfService(checkNameRoom);

        do{
            System.out.println("Input Area Used must me larger than 30m2");
            System.out.print("Area: ");
            checkAreaUsed = sc.nextDouble();
        } while (checkAreaUsed < 30);
        room.setAreaUsed(checkAreaUsed);

        do{
            System.out.print("Price: ");
            checkPrice = sc.nextInt();
        } while (checkPrice < 0);
        room.setPrice(checkPrice);

        System.out.print("Max of People : ");
        room.setMaxOfPeople(sc.nextInt());
        sc.skip("\n");
        System.out.print("Rent type : ");
        room.setRentType(sc.nextLine());
        System.out.print("Input the free Service : ");
        room.setFreeService(sc.nextLine());
        System.out.println("\nAdd new house complete ! Enter to continue...");
        sc.nextLine();
        roomList.add(room);
        FunFileCsv.writeVillaToCSV(roomList, "Room");

        displayMainMenu();
    }
}
