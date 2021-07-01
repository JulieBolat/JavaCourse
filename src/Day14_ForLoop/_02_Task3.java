package Day14_ForLoop;

import java.util.Arrays;

public class _02_Task3 {
    public static void main(String[] args) {

        //April 26, Lesson 3
        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements
        // part2: make a copy of that array

        //my original array
        String[] veggies = {"pepper", "lettuce", "cucumber", "tomato"};

        //printing original array
        for (int i = 0; i < veggies.length; i++){

            System.out.println(veggies[i]);
    }
        //my copy array init by the length of original array
        String [] copyOfVeggies= new String[veggies.length];

        //copyOfVeggies[0]= veggies[1];
        //copyOfVeggies[1]= veggies[1];
        //copyOfVeggies[2]= veggies[2];
        //copyOfVeggies[3]= veggies[3];
        //copyOfVeggies[4]= veggies[4];

        //we iterate over original array and copy values
        for (int j=0; j<veggies.length; j++) {
            copyOfVeggies[j] = veggies [j];
        }

        veggies[0]= "Potato"; //we copied a value here, not from reference.
        // This will not change the value of first element in copyOfVeggies array.

        System.out.println(Arrays.toString(copyOfVeggies));


        String[] copyByReference= veggies;  //we copied reference of Array
        veggies [0]="null";
        System.out.println(copyByReference[0]);



    }
}
