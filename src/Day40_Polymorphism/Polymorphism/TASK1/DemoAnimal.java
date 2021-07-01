package Day40_Polymorphism.Polymorphism.TASK1;

import java.util.ArrayList;

public class DemoAnimal {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Horse());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.run(5, "Mile");
        }

    }

}