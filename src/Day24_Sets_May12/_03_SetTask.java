package Day24_Sets_May12;

import java.util.ArrayList;
import java.util.HashSet;

public class _03_SetTask {

    // create a method that accepts ArrayList<Integer> and Set<Integer>
    // and add elements inside ArrayList to Set

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(9);
        myList.add(3);

        System.out.println("Elements in ArrayList: " + myList);

        HashSet<Integer> mySet = new HashSet<>();
        System.out.println("My set before using addToSet method: " + mySet); // this will be empty
        addElementsToSet(myList,mySet);
        System.out.println("My set after using addToSet method: " + mySet); // this will include only unique values from myList

    }

    public static void addElementsToSet(ArrayList<Integer> list, HashSet<Integer> set){
        for (Integer element : list)
            set.add(element);
    }
}
