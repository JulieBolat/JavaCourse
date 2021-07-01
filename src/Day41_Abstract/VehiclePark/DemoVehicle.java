package Day41_Abstract.VehiclePark;

public class DemoVehicle {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();

        Vehicle car = new Car();
        car.move(50);
        car.move(100,"Miles");
        car.fuelUp(40);


        Vehicle truck = new Truck();
        truck.move(150);
        truck.move(300, "Miles");
        truck.fuelUp(85);
    }

}