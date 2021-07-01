package Day28_May21.Pets;

import java.util.List;

public class Owner {

    String name;
    int age;
    String gender;

    void printProperties() {
        System.out.println("Name of the owner:" + name + " age:" + age +
                ", List of needs:" + gender);
    }
}