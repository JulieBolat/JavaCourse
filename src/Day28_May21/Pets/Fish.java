package Day28_May21.Pets;

import java.util.List;

public class Fish {

    String name;
    String color;
    List<String> listOfNeeds;
    Owner ownerInfo;

    void printProperties() {
        System.out.println("Name:" + name + " Color:" + color +
                ", List of needs:" + listOfNeeds);

        ownerInfo.printProperties();

    }
}
