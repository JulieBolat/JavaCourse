package Day28_May21.Pets;

import java.util.List;

public class Bird {

    String name;
    String color;
    List<String> listOfNeeds;
    Owner owner;

    void printProperties() {
        System.out.println("Name:" + name + " Color:" + color +
                               ", List of needs:" + listOfNeeds);


        owner.printProperties();
    }
}
