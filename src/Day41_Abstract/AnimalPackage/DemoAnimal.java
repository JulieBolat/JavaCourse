package Day41_Abstract.AnimalPackage;

public class DemoAnimal {

    public static void main(String[] args) {

//        Animal animal = new Animal(); - ABSTRACT CLASS - CANNOT CREATE OBJECTS

        Animal cat = new Cat("Red", 2021);
        cat.eat();
        cat.move();
        cat.makeSound();

        Animal dog = new Dog("Snow", 2019);
        dog.eat();
        dog.move();
        dog.makeSound();


    }

}