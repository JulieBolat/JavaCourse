package Day41_Abstract.AnimalPackage;

public abstract class Animal {

    private String name;
    private int DOB;

    public Animal(String name, int DOB){
        this.name = name;
        this.DOB = DOB;
    }

    public abstract void eat();

    public abstract void makeSound();

    public abstract void move();

}