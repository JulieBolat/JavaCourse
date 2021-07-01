package Day26_Collections_Map_May18;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_2D_Collections {
    //May 18th, Lesson 1

    public static void main(String[] args) {

         int [][] twoArray= new int [1][1];

         ArrayList<ArrayList<String>> listOfLists= new ArrayList<>();

         ArrayList<String> cars= new ArrayList<>();

         cars.add("Ford");
         cars.add("Honda");
         cars.add("Toyota");

         ArrayList<String> cities= new ArrayList<>();
         cities.add("Paris");
         cities.add("London");
         cities.add("Berlin");

         listOfLists.add(cars);
         listOfLists.add(cities);

        System.out.println(listOfLists);

        ArrayList<HashSet<Integer>> listOfSets= new ArrayList<>();

        HashSet<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);

        HashSet<Integer> secondSet = new HashSet<>();
        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);

        listOfSets.add(firstSet);
        listOfSets.add(secondSet);

        System.out.println(firstSet);
        System.out.println(secondSet);

        System.out.println(listOfSets);


    }
}
