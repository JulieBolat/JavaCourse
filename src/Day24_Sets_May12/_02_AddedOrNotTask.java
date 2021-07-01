package Day24_Sets_May12;

import java.util.ArrayList;
import java.util.HashSet;

public class _02_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have

    // find out what are the duplicated values

    public static void main(String[] args) {

        int[] numbers = {1, 3, 1, 2, 4, 5, 3};

        HashSet<Integer> uniqueValues = new HashSet<>();
        ArrayList<Integer> duplicatedValues = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            boolean isAdded = uniqueValues.add(numbers[i]);
            if (!isAdded){
                count++; // to find how many elements are duplicated
                duplicatedValues.add(numbers[i]); // to find duplicated values
            }
        }

        System.out.println("We have " + count + " duplicated values!");
        System.out.println("Duplicated values are: " + duplicatedValues);

    }
}
