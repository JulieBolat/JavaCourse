package Day8;

import java.util.Arrays;

public class _05_BinarySearch {
    public static void main(String[] args) {

        int[] intArray = {6, 2, 7, 9, 16, 1, 20, 5};

        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        int indexOfTheElement = Arrays.binarySearch(intArray, 16);
        System.out.println(indexOfTheElement);






    }
}
