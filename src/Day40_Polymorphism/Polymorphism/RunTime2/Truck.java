package Day40_Polymorphism.Polymorphism.RunTime2;

public class Truck extends Vehicle{

    @Override
    String speedUpTo60() {
        return "Truck is speeding up to 60 mph in 15 seconds!";
    }
}