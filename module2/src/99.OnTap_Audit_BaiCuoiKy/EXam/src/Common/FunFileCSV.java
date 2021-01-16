package Common;

import Models.LongSaveNote;
import Models.SaveNote;
import Models.ShortSaveNote;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FunFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER_LONG = "Name,ID,Date Open,Time Start,Money,RentPay,TimeRent,getGift";
    private static final String FILE_HEADER_SHORT = "Name,ID,Date Open,Time Start,Money,RentPay,TimeRent";

    private static final String FILENAMELONG = "src/Data/longnote.csv";
    private static final String FILENAMESHORT = "src/Data/shortnote.csv";

    public static void writeLongNoteToCSV(List<SaveNote> listLong) {
        File file = new File(FILENAMELONG);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(FILE_HEADER_LONG);
            bufferedWriter.append(NEW_LINE_SEPARATOR);

            for (SaveNote temp : listLong) {
                bufferedWriter.append(temp.toString());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SaveNote> readLongNote() {
        List<SaveNote> listLong = new ArrayList<>();
        File file = new File(FILENAMELONG);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                LongSaveNote longSaveNote = new LongSaveNote();
                longSaveNote.setName(splitData[0]);
                longSaveNote.setId(splitData[1]);
                longSaveNote.setDateOfOpen(splitData[2]);
                longSaveNote.setTimeStartOpen(splitData[3]);
                longSaveNote.setMoney(Double.parseDouble(splitData[4]));
                longSaveNote.setRentPay(splitData[5]);
                longSaveNote.setTimeRentL(splitData[6]);
                longSaveNote.setGift(splitData[7]);
            }
        } catch (FileNotFoundException e) {
//            System.out.println("Error when find File CSV!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
//            System.out.println("Error when read file CSV!");
        }
        return listLong;
    }

    public static void writeShortNoteToCSV(List<SaveNote> shortList) {
        File file = new File(FILENAMESHORT);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(FILE_HEADER_SHORT);
            bufferedWriter.append(NEW_LINE_SEPARATOR);

            for (SaveNote temp : shortList) {
                bufferedWriter.append(temp.toString());
                bufferedWriter.append(NEW_LINE_SEPARATOR);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SaveNote> readShortNote() {
        List<SaveNote> listLong = new ArrayList<>();
        File file = new File(FILENAMELONG);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("Name")) {
                    continue;
                }
                ShortSaveNote shortSaveNote = new ShortSaveNote();
                shortSaveNote.setName(splitData[0]);
                shortSaveNote.setId(splitData[1]);
                shortSaveNote.setDateOfOpen(splitData[2]);
                shortSaveNote.setTimeStartOpen(splitData[3]);
                shortSaveNote.setMoney(Double.parseDouble(splitData[4]));
                shortSaveNote.setRentPay(splitData[5]);
                shortSaveNote.setTimeRent(splitData[6]);
            }
        } catch (FileNotFoundException e) {
//            System.out.println("Error when find File CSV!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
//            System.out.println("Error when read file CSV!");
        }
        return listLong;
    }


}
