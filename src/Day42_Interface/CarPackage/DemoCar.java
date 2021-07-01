package Day42_Interface.CarPackage;

public class DemoCar {

    public static void main(String[] args) {

        Day42_Interface.CarPackage.Mercedes mercedes = new Mercedes("E350", 2012);
        System.out.println(mercedes.getModel());
        System.out.println(mercedes.getProductionYear());
        mercedes.changeOil();


        Day42_Interface.CarPackage.Tesla tesla = new Tesla("S", 2020);
        System.out.println(tesla.getModel());
        System.out.println(tesla.getProductionYear());
        tesla.changeBattery();


        Day42_Interface.CarPackage.ToyotaPrius prius = new ToyotaPrius("PriusV", 2021);
        System.out.println(prius.getModel());
        System.out.println(prius.getProductionYear());
        prius.changeBattery();
        prius.changeOil();

    }

}
