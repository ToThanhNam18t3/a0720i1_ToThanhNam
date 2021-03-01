package Controllers;

import Commons.FunFileCsv;
import Exeption.ServiceExeption.ServiceValidate;
import Models.Services.Villa;

import java.util.Scanner;

import static Controllers.MainControllers.displayMainMenu;
import static Controllers.MainControllers.villaList;

public class Villa_Controller {
    //ADD NEW VILLA ENCAPSUALATION
    public static void addNewVilla() {
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();
        String idVilla;
        String checkNameVilla;
        double checkAreaUsed;
        double checkPool;
        int checkPrice;
        int checkMaxOfPeople;

        do{
            System.out.println("Comfirm : SVXX-YYYY , YYYY [ 0 - 9 ]");
            System.out.print("ID: ");
            idVilla = sc.nextLine();
        } while (!ServiceValidate.checkIDVilla(idVilla));
        villa.setId(idVilla);

        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Name : ");
            checkNameVilla = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkNameVilla));

        villa.setNameOfService(checkNameVilla);

        do{
            System.out.println("Input area larger than 30m2 ");
            System.out.print("Area: ");
            checkAreaUsed = sc.nextDouble();
        } while (checkAreaUsed < 30);
        villa.setAreaUsed(checkAreaUsed);

        do{
            System.out.println("Input Price must be larger than 0");
            System.out.print("Price: ");
            checkPrice = sc.nextInt();
        } while (checkPrice < 0);
        villa.setPrice(checkPrice);

        do{
            System.out.println("Input > 0 and < 20 ");
            System.out.print("Max of People : ");
            checkMaxOfPeople = sc.nextInt();
        } while (!ServiceValidate.checkMaxOfPeople(checkMaxOfPeople));
        villa.setMaxOfPeople(checkMaxOfPeople);

        sc.skip("\n");

        String checkRentType;
        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Rent type : ");
            checkRentType = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkRentType));
        villa.setRentType(checkRentType);


        String checkTypeOfRoom;
        do{
            System.out.println("Comfirm : Axxx , UPPERCASE the first character");
            System.out.print("Input typeOfRoom : ");
            checkTypeOfRoom = sc.nextLine();
        } while (!ServiceValidate.checkNameOfService(checkTypeOfRoom));
        villa.setTypeOfRoom(checkTypeOfRoom);

        String checkConvenient;
        do{
            System.out.println("Must be : massage, karaoke, food, drink, car");
            System.out.print("Input Convenient you want : ");
            checkConvenient = sc.nextLine();
        } while (!ServiceValidate.checkConvenient(checkConvenient));
        villa.setOtherConvenient(checkConvenient);

        do {
            System.out.println("Pool Area must me larger than 30m2 ");
            System.out.print("Input poolArea ( m2 ) : ");
            checkPool = sc.nextDouble();
        } while (checkPool < 30);
        villa.setPoolArea(checkPool);

        int checkFloor;
        do{
            System.out.println("Number of Floor larger than 0");
            System.out.print("Input the number of floor : ");
            checkFloor = sc.nextInt();
        } while (checkFloor < 0);
        villa.setFloor(checkFloor);

        System.out.println("\nAdd new villa complete ! Enter to continue...");
        sc.nextLine();
        sc.nextLine();
        villaList.add(villa);
        FunFileCsv.writeVillaToCSV(villaList, "Villa");

        displayMainMenu();
    }
}
