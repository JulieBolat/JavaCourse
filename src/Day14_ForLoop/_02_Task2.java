package Day14_ForLoop;

import java.util.Arrays;
import java.util.Random;

public class _02_Task2 {
    public static void main(String[] args) {

        //April 26 Lesson 3
        // declare an array of bytes
        // init it with size 3
        // give each element a random value
        // print all elements

        //byteArray[0] = (byte) random.nextInt(127);
//        byteArray[1] = (byte) random.nextInt(127);
//        byteArray[2] = (byte) random.nextInt(127);
        // when you see repeat like this use for loop

//        random.nextBytes(byteArray); this will fill our array with random number [-128, 127]

        Random random= new Random();

        byte [] byteArray= new byte [3];

       //init the array
        for (int i=0; i<byteArray.length; i++) {

            byteArray [i]= (byte) random.nextInt(127); } //I want my print to be positive 0---127

        System.out.println(Arrays.toString(byteArray));

        //printing the array
        for (int j=0; j<byteArray.length; j++) {
            System.out.println(byteArray[j]);
        }










    }
}
