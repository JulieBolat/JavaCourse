package Day7.JavaArrays;

import java.util.Arrays;
import java.util.Date;

public class JavaArray {
    public static void main(String[] args) {

        //reference data type
        //We use array to store list of items
        int variable; //how we declare a variable
        variable =10; //how we init a variable

        //int variable2= 10;
        int[] myArray= new int[3]; //, 3 means we will store 3 items in the array. size will not change


        myArray[0]= 1;  //by default, java will give zero for this
        myArray[1]= 2;
        myArray[2]= 3;

        //myArray[6]= 6;  //if you run this, it will exception error
        //System.out.println(myArray);  //if we use this, it will print this [I@77459877 so we will do next step

       System.out.println(Arrays.toString(myArray));

        //we use two methods to print the array


        int [] arrayOfNumbers= {15, 9, 2, 10, 7, 1, 6};
        System.out.println(arrayOfNumbers.length);
        //System.out.println(arrayOfNumbers);
        //System.out.println(Arrays.toString(arrayOfNumbers));
        //IMPORTANT: Arrays are "fixed size". Once you create an array, you cannot add or remove items.
        //15, 9, 2, 10, 7, 1, 6 you cannot change these numbers


        System.out.println(Arrays.toString(arrayOfNumbers)); // this is not sorted
        Arrays.sort(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] arrayOfCars = {"Toyota", "BMW", "Mercedes", "Tesla", "Ford"};
        System.out.println(arrayOfCars); //we use Arrays.toString method to convert array to a string
        System.out.println(Arrays.toString(arrayOfCars)); // this is not sorted
        Arrays.sort(arrayOfCars);
        System.out.println(Arrays.toString(arrayOfCars)); // this is sorted

        System.out.println(arrayOfCars.length);

        System.out.println(arrayOfCars[1]);
        
    }

}
