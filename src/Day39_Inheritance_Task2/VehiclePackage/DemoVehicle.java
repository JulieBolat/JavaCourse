package Day39_Inheritance_Task2.VehiclePackage;

public class DemoVehicle {

    public static void main(String[] args) {

        SportCar sportCar = new SportCar("Ford", "Mustang");
        sportCar.speedUpTo60();
        sportCar.breakDownFrom60();


        Truck truck = new Truck("Ford", "F150");
        truck.speedUpTo60();
        truck.breakDownFrom60();

    }

}