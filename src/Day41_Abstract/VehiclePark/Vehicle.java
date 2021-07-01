package Day41_Abstract.VehiclePark;

public abstract class Vehicle {

//    abstract int productionDate; // not allowed here - abstract keyword only for methods and classes

//    Abstract classes can have both abstract and non-abstract methods
//    public void test(){
//        System.out.println("Test");
//    }

    public abstract void move(int distance);
    public abstract void move(int distance, String unit);
    public abstract void fuelUp(int liters);


}