package Day8;


import java.util.Arrays;

public class _02_ArraysFillInTask {

    public static void main(String[] args) {

        // create an array of strings of size 10
        // print the array
        // fill in with value "*"
        // print the array
        // Lesson 2 Friday 4/16


        String[] stringArray = new String[10];
        System.out.println(Arrays.toString(stringArray));

        Arrays.fill(stringArray, "*");

        System.out.println(Arrays.toString(stringArray));

//        String emptyString = ""; // empty String
//        String nullString = null; // null String
//
//        System.out.println(emptyString);
//        System.out.println(nullString);



    }
}
