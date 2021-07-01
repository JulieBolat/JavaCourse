package Day28_May21.TaskPackage;

import java.util.ArrayList;
import java.util.List;

public class MainCat {

    public static void main(String[] args) {

        Cat cat1= new Cat ();
        cat1.name= "Arya";
        cat1.age= 1;

        cat1.meowSound();

        Cat cat2 = new Cat();
        cat2.name= "Red";
        cat2.age= 1;

        cat2.meowSound();

        //PART 2
        List<Cat> cats= new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);

        int sumOfAge= 0;
        for (Cat catAge : cats)
            sumOfAge+=catAge.age;

        System.out.println(sumOfAge);

        //PART 3- Create printAllProperties method in MAIN class
        printProperties(cat1);
        printProperties(cat2);

        //PART 4-Create printAllProperties method in Cat class
        cat1.printAllProperties();
        cat2.printAllProperties();
    }

    public static void printProperties(Cat cat) {
        System.out.println("Name" + cat.name + "/n Age:" + cat.age);

    }
}
