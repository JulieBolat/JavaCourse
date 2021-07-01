package Day8;

import java.util.Arrays;

public class _01_ArraysToStringTask {
    public static void main(String[] args) {

        // Task
        // create an array of int with 4 elements
        // assign each element a random value from 10 to 99
        // print the array using toString method
        // Part2: swap first and last elements, print the array again


        int [] array1= new int [4];
        array1[0]= 10;
        array1[1]= 55;
        array1[2]= 65;
        array1[3]= 76;

        System.out.println(Arrays.toString(array1));

        array1[3]= 10;
        array1[1]= 55;
        array1[2]= 65;
        array1[0]= 76;

        System.out.println(Arrays.toString(array1));
        System.out.println();

        //Task
        // create an array of int with 4 elements
        // assign each element a random value from 10 to 99
        // print the array using toString method
        // Part2: swap first and last elements, print the array again


        int[] randomNumbers = {10, 54, 25, 78};
        System.out.println(Arrays.toString(randomNumbers));

        int lastIndex1 = randomNumbers.length-1;

        int temp = randomNumbers[0];
        randomNumbers[0] = randomNumbers[lastIndex1];  // randomNumbers[0] = 78;
        randomNumbers[lastIndex1] = temp;

        System.out.println(Arrays.toString(randomNumbers));

    }


}
