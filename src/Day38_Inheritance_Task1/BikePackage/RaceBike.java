package Day38_Inheritance_Task1.BikePackage;

public class RaceBike extends Bicycle {

    int wheelSize;

    public RaceBike(int gear, int speed, int wheelSize){
        super(gear, speed); // call constructor from parent
//        super.gear; // call field from parent
//        super.speedUp(); // call method from parent class
        this.wheelSize = wheelSize;
    }

}