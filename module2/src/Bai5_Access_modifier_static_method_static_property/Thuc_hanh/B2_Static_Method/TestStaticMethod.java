package Bai5_Access_modifier_static_method_static_property.Thuc_hanh.B2_Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"nam");
        Student s2 = new Student(112,"nam1");

        s1.displayContent();
        s2.displayContent();
    }
}
