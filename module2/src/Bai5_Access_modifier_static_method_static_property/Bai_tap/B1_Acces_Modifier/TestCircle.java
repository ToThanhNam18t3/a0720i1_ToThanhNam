package Bai5_Access_modifier_static_method_static_property.Bai_tap.B1_Acces_Modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle testCircle1 = new Circle(2);
        Circle testCircle2 = new Circle();

        System.out.println("Area of Circle1: " + testCircle1.getAria());
        System.out.println("Area of Circle2: " + testCircle2.getAria());
    }
}
