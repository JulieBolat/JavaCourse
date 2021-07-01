package Day30_StaticMethod_May25;

public class Car {
    //May 25, Lesson 2

    String name;
    String color;
    static int numberOfCars;

    public void addToInventory(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfCars++;
    }

    public static void printNumberOfCars() {
        System.out.println("Number Of Cars: " + numberOfCars);
        /*
        To access instance variables and methods
        we should create an object
        Car car = new Car();
        car.name;
        car.color;
        car.addToInventory();
        */
    }
}
