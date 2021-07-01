package Day25_Collections_Converting_May17;

import java.util.*;

public class _02_Converting {

    public static void main(String[] args) {
        //May 17, Lesson 3
        // Converting an Array to List
        Integer[] integers = new Integer[] {1,2,3,4,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(integers)); // correct
        System.out.println("Converted from Array to List: " + list);

        // this will be a fixed-size list - you cannot use add method
        List<Integer> fixedSizeList = Arrays.asList(integers); // Arrays.asList will return a fixed-size list
//        fixedSizeList.add(6); | UnsupportedOperationException


        // Converting List to Array
        Integer[] convertedFromList = list.toArray(new Integer[0]);
        System.out.println("Converted from List to Array: " + Arrays.toString(convertedFromList));

        // Converting an Array to Set
        Set<Integer> set = new HashSet<>(Arrays.asList(convertedFromList));
        System.out.println("Converted from Array to Set: " + set);

        // Converting Set to Array
        Integer[] convertedFromSet = set.toArray(new Integer[0]);
        System.out.println("Converted from Set to Array: " + Arrays.toString(convertedFromSet));

        // Converting List to Set
        Set<Integer> setFromList = new HashSet<>(list);
        System.out.println("Converted List to Set: " + setFromList);

        // Converting Set to List
        List<Integer> listFromSet = new ArrayList<>(setFromList);
        listFromSet.add(9);
        System.out.println("Converted Set to List: " + listFromSet);


    }
}
