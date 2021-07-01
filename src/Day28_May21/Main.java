package Day28_May21;
public class Main {

    public static void main(String[] args) {

        //May 21, Lesson 1

        Dog lucy = new Dog();
        lucy.breed = "Neapolitan Mastiff";
        lucy.size = "Large";
        lucy.age = 5;
        lucy.color = "Black";
        lucy.isSleeping = false;

        //System.out.println("Is Lucy sleeping ->" + lucy.isSleeping);
        //lucy.setSleeping();
        //System.out.println("Is Lucy sleeping?->" + lucy.isSleeping);


        Dog max = new Dog();
        max.breed = "Maltese";
        max.size = "Medium";
        max.age = 2;
        max.color = "White";
        max.isSleeping = true;

        lucy.snoring();

    }

}