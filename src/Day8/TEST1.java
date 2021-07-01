package Day8;

import java.util.Arrays;

public class TEST1 {

    public static void main(String[] args) {

        // create a String array of {"1", "2"}
        // create an int array of {1, 2}
        // convert String array into int array
        // compare them together;

        String [] stringArray= {"1", "2"};

        int [] intArray= {1,2};
        intArray [0]= 1;
        intArray [1]= 2;

        int convertedArrayFromString = Integer.parseInt(stringArray[0]);
        System.out.println(convertedArrayFromString);




    }
}
