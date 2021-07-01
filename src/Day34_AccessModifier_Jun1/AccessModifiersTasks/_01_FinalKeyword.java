package Day34_AccessModifier_Jun1.AccessModifiersTasks;

public class _01_FinalKeyword {

    public static void main(String[] args) {

        Car car1 = new Car(2010);
        car1.name = "BMW";

        System.out.println(car1.year);
        System.out.println(car1.name);

        car1.name = "BMW 520i"; // we can change this one

        System.out.println(car1.name);

//        car1.year = 2015; this will not work because it's FINAL

        System.out.println(car1.year);

    }

}