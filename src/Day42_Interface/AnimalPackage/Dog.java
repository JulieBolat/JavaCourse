package Day42_Interface.AnimalPackage;

public class Dog implements Animal{

    @Override
    public void animalSound() {
        System.out.println("Woff Woff");
    }

    @Override
    public void sleep() {
        System.out.println("ZzZzZz");
    }
}
