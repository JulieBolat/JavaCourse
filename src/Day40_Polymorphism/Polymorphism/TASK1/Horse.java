package Day40_Polymorphism.Polymorphism.TASK1;

public class Horse extends Animal{

    public Horse(){
        name = "Horse";
    }


    @Override
    public void makeSound() {
        System.out.println("Neigh neigh");
    }
}