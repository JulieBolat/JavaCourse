package Day33_AccessModifier_May31._02_InstanceModifiers.publicModifier.Same;

public class Main {


    public static void main(String[] args) {

        Car car = new Car("Toyota");

        String nameOfCar = car.name;

        car.getName();

    }
}
