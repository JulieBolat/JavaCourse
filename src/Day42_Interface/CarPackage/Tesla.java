package Day42_Interface.CarPackage;

public class Tesla extends Car implements Electric {

    public Tesla(String model, int productionYear){
        super(model, productionYear);
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery every 100 000 miles!");
    }
}
