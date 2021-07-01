package Day41_Abstract.AnimalPackage;

public class Cat extends Animal{

    public Cat(String name, int DOB){
        super(name, DOB);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating 1 cup in a day");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving 5mph!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}