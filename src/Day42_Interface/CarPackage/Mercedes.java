package Day42_Interface.CarPackage;

public class Mercedes extends Car implements Diesel {

    public Mercedes(String model, int productionYear){
        super(model, productionYear);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 20 000 miles!");
    }
}
