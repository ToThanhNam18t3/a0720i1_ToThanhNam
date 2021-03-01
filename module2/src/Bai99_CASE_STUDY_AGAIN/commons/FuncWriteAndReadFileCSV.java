package Bai99_CASE_STUDY_AGAIN.commons;

public class FuncWriteAndReadFileCSV {

    public static final String DEFAULT_SEPERATOR = ",";
    public static final String DEFAULT_QUOTE = "";

    //the line to skip for start reading
    public static final int NUM_OF_LINE_SKIP = 1;

    //Path file Villa public static final String pathVilla = "src/Data/Villa.csv";

    //Path file House
    public static final String pathHouse = "src/Data/House.csv";

    //Path file Room
    public static final String pathRoom = "src/Data/Room.csv";

    //Path file Customer
    public static final String pathCustomer = "src/Data/Customer.csv";

    //Path file booking
    public static final String pathBooking = "src/Data/Booking.csv";

    //Path file Employee
    public static final String pathEmployee = "src/Data/Employee.csv";

    //Header villa to csv
    public static String[] headerRecordVilla = new String[]{"id", "serviceName", "areaUsed", "rentCost", "numberOfPeople", "rentType"
            , "standartRoom", "otherDescription", "areaPool", "numberOfFloor" };

    //Header House to CSV
    public static String[] headerRecordHouse = new String[]{"id", "serviceName", "areaUsed", "rentCost", "numberOfPeople", "rentType"
            , "standartRoom", "OtherConvenient", "NumberOfFloor" };

    //Header Room to CSV
    public static String[] headerRecordRoom = new String[]{"id", "serviceName", "areaUsed", "rentCost", "numberOfPeople", "rentType", "freeService" };


}
