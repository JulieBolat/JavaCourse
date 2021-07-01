package Day14_ForLoop;

import java.util.Arrays;

public class TASK2 {
    public static void main(String[] args) {

        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements
        // part2: make a copy of that array

        String [] veggies= {"tomato" , "eggplant", "pepper"};

        System.out.println(Arrays.toString(veggies));

        for (int i=0; i<veggies.length; i++){

            System.out.println(veggies[i]);
        }

    }



}
