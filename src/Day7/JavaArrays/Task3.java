package Day7.JavaArrays;

import java.util.Arrays;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        // Task
        // declare an array of doubles and initialize it with some values, use array = {}
        // first sort your Array
        // Print your all elements in your Array after sorting


        double [] numbers= {1.0,55.0,47.0};
        numbers[0]= 1.0;
        numbers[1]= 55.0;
        numbers[2]= 47.0;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));



        double [] a= {5.5, 67.1, 78.0, 13.00, 11.4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));



    }

}
