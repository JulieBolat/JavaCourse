package Day40_Polymorphism.Polymorphism.TASK1;

public class Dog extends Animal{

    public Dog(){
        name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woff woff");
    }
}