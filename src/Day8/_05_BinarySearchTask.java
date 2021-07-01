package Day8;

import java.util.Arrays;

public class _05_BinarySearchTask {
    public static void main(String[] args) {

        //Friday 4/16 3rd lesson
        // create an array of fruits
        // sort the array
        // search for index of your favorite fruit
        // print both index and your favorite fruit

        String [] a= {"lemon", "watermelon", "cherry"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int b= Arrays.binarySearch(a, "cherry");
        System.out.println("My favorite fruit is:" + a[b]);



        //String[] fruits = {"Watermelon", "Strawberry", "Grape", "Banana", "Kiwi"};
        //Arrays.sort(fruits);
        //int indexOfFruit = Arrays.binarySearch(fruits, "Kiwi");
        //System.out.println("My Favorite fruit is: " + fruits[indexOfFruit] + " and index of fruit " + indexOfFruit);


    }

}
