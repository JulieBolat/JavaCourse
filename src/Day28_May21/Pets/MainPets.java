package Day28_May21.Pets;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPets {

    public static void main(String[] args) {

        Bird eagle = new Bird ();
        eagle.name= "Billy";
        eagle.color= "Brown";
        eagle.listOfNeeds = new ArrayList<>();
        eagle.listOfNeeds.add("Cage");
        eagle.listOfNeeds.add("Food");
        eagle.listOfNeeds.add("Water");
        eagle.listOfNeeds.add("Cleaning");
        eagle.owner = new Owner();
        eagle.owner.name= "Sinan";
        eagle.owner.age=25;
        eagle.owner.gender= "Male";


        //System.out.println(eagle.name);
        //System.out.println(eagle.color);

        eagle.printProperties();

        Fish fish= new Fish();
        fish.name= "Nemo";
        fish.color= "Orange";
        fish.listOfNeeds= new ArrayList<>(Arrays.asList("Food", "Water", "FishTank", "WaterFilter"));
        fish.ownerInfo= new Owner();
        fish.ownerInfo.name= "Rahima";
        fish.ownerInfo.age= 25;
        fish.ownerInfo.gender= "Female";

        fish.printProperties();
    }
}
