package Day38_Inheritance_Task1.BikePackage;

public class KidsBike extends Bicycle {

    int numberOfWheels;

    public KidsBike(int gear, int speed, int numberOfWheels){
        super(gear, speed);
        this.numberOfWheels = numberOfWheels;
    }

}