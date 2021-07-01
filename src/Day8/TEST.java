package Day8;


import javax.naming.NamingEnumeration;
import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {
        // Task
        // create an array of int with 4 elements
        // assign each element a random value from 10 to 99
        // print the array using toString method
        // Part2: swap first and last elements, print the array again

        int [] newArray= {5, 17, 39, 99};
        String convertedArray= Arrays.toString(newArray);
        System.out.println(convertedArray);

        newArray [0]= 5;
        newArray [newArray.length-1]= 99;

        newArray[0] = newArray[newArray.length-1];
        Arrays.toString(newArray);













    }
}
