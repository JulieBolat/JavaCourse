package Day41_Abstract.VehiclePark;

public class Car extends Vehicle{

    @Override
    public void move(int distance) {
        System.out.println("Car will move " + distance);
    }

    @Override
    public void move(int distance, String unit) {
        System.out.println("Car will move " + distance + " " + unit);
    }

    @Override
    public void fuelUp(int liters) {
        System.out.println("Car will fuelUp " + liters + " liters!");
    }

}