package Day42_Interface.CarPackage;

public class ToyotaPrius extends Car implements Electric, Diesel {

    public ToyotaPrius(String model, int productionYear){
        super(model, productionYear);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 25 000 miles!");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery every 40 000 miles!");
    }
}
