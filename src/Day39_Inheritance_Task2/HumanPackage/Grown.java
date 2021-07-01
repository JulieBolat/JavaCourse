package Day39_Inheritance_Task2.HumanPackage;

public class Grown extends Human{

    public Grown(String name, double age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Grown people can eat grasshoppers!");
    }

    @Override
    public void transport() {
        System.out.println("Grown people can walk-run but cannot fly!");
    }
}