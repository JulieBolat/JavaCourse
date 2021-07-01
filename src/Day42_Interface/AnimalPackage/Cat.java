package Day42_Interface.AnimalPackage;

public class Cat implements Animal{

    @Override
    public void animalSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }

}
