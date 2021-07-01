package Day38_Inheritance_Task1.BikePackage;

public class DemoBicycle {

    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(24, 20, 10);

        mountainBike.speedUp(4);
        System.out.println("Speed after speedUp: " + mountainBike.speed);

        mountainBike.applyBreak(12);
        System.out.println("Speed after break: " + mountainBike.speed);

        System.out.println("Gear for Mountain Bike: " + mountainBike.gear);
        System.out.println("SeatHeight for Mountain Bike: " + mountainBike.seatHeight);



        RaceBike raceBike = new RaceBike(32, 30, 8);

        raceBike.speedUp(7);
        System.out.println("Speed after speedUp: " + raceBike.speed);

        raceBike.applyBreak(3);
        System.out.println("Speed after break: " + raceBike.speed);

        System.out.println("Gear for Race Bike: " + raceBike.gear);
        System.out.println("WheelSize for Race Bike: " + raceBike.wheelSize);



        KidsBike kidsBike = new KidsBike(1, 5, 4);

        kidsBike.speedUp(3);
        System.out.println("Speed after speedUp: " + kidsBike.speed);

        kidsBike.applyBreak(6);
        System.out.println("Speed after break: " + kidsBike.speed);

        System.out.println("Gear for kids bike: " + kidsBike.gear);
        System.out.println("Number of Wheels for kids bike: " + kidsBike.numberOfWheels);

    }

}