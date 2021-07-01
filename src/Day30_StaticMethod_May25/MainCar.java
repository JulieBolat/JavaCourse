package Day30_StaticMethod_May25;

public class MainCar {

    public static void main(String[] args) {


        Car.printNumberOfCars();

        Car car1 = new Car();
        car1.addToInventory("Mercedes", "Black");
        Car.printNumberOfCars();

        Car car2 = new Car();
        car2.addToInventory("Bmw", "Blue");
        Car.printNumberOfCars();


    }

}