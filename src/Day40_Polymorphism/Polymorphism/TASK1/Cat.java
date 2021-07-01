package Day40_Polymorphism.Polymorphism.TASK1;

public class Cat extends Animal{

    public Cat(){
        name = "Cat";
    }


    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}