package ss7_abstract_interface.practice.animal.model;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "cục tác";
    }

    @Override
    public String howToEat() {
        return "Kho tỏi";
    }
}
