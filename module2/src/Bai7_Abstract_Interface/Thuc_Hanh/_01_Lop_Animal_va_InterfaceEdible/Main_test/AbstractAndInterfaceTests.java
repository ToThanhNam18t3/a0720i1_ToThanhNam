package Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Main_test;

import Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Animals.Animal;
import Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Animals.Chicken;
import Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Animals.Tiger;
import Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for(Animal animal : animals) {
            System.out.println(animal.makeSound());


            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
