package Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Animals;

import Bai7_Abstract_Interface.Thuc_Hanh._01_Lop_Animal_va_InterfaceEdible.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken : Cluck Cluck";
    }

    @Override
    public String howToEat() {
        return "coud be fried";
    }
}
