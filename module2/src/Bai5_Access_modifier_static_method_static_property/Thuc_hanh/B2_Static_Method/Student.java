package Bai5_Access_modifier_static_method_static_property.Thuc_hanh.B2_Static_Method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n){
        rollno = r;
        name = "n";
    }

    static void  change() {
        college = "CODEGYM";
    }

    void displayContent() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
