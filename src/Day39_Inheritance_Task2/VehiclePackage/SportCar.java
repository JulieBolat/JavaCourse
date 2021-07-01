package Day39_Inheritance_Task2.VehiclePackage;

public class SportCar extends Vehicle{

    public SportCar(String make, String model){
        super(make,model);
    }

    @Override
    public void speedUpTo60() {
        System.out.println("Sport car is speeding up to 60 mile in 3 seconds!");
    }

    @Override
    public void breakDownFrom60() {
        System.out.println("Sport car is breaking in 5 seconds!");
    }
}