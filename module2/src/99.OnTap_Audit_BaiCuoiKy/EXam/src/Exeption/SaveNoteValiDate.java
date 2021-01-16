package Exeption;

public class SaveNoteValiDate {

    private static String regex = "";

    public static boolean checkKyHanS(String str){
        regex = "(3)|(4)|(5)|(6)";
        return str.matches(regex);
    }

    public static boolean checkName(String str) {
        regex = "^STK-[\\d]{4}$";
        return str.matches(regex);
    }

    public static boolean checkKyHan(String str){
        regex = "(1)|(3)|(5)|(10)";
        return str.matches(regex);
    }

    public static boolean checkDate(String str){
        regex = "\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|\\d{4})\\b";
        return str.matches(regex);
    }

    public static boolean checkPercent(String str){
        regex = "^[0-9]$";
        return str.matches(regex);
    }

    public static boolean checkID(String str){
        regex = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";
        return str.matches(regex);
    }

}
