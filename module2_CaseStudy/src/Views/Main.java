package Views;

import Commons.FunFileCsv;


import static Controllers.MainControllers.*;

public class Main {
    public static void main(String[] args){
        villaList = FunFileCsv.readFileCSV("Villa");
        houseList = FunFileCsv.readFileCSV("House");
        roomList = FunFileCsv.readFileCSV("Room");
        customerList = FunFileCsv.readCustomerToCSV();
//        employeeMap = FunFileCsv.writeEmployeeToCsv();

        displayMainMenu();

    }
}
