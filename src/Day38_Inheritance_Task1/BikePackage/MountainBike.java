package Day38_Inheritance_Task1.BikePackage;

public class MountainBike extends Bicycle {

    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

}