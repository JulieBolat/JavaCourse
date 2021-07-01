package Day8;

import java.net.Inet4Address;
import java.sql.SQLOutput;
import java.util.Arrays;

public class _03_ArraysEqualsTask {
    public static void main(String[] args) {

        // create a String array of {"1", "2"}
        // create an int array of {1, 2}
        // convert String array into int array
        // compare them together

        String[] stringArray = {"1", "2"};
        int[] integerArray = {1, 2};

        int [] convertedArray= new int [2];

        convertedArray[0]=Integer.parseInt(stringArray[0]);
        convertedArray[1]= Integer.parseInt(stringArray[1]);

       System.out.println(Arrays.toString(convertedArray));
       System.out.println(Arrays.equals(integerArray, convertedArray));




    }
}
