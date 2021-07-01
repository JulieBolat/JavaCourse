package Day7.JavaArrays;

import java.util.Date;

public class Testing {

    public static void main(String[] args) {
        // Task
        // First create a Date object which is "now"
        // Then convert this 'now' variable to a String
        // Now replace all numbers with '*'
        // And check if the first Date object is equal to our strin

        Date currentDate= new Date();
        System.out.println(currentDate);

        String converted= currentDate.toString();
        System.out.println(converted);
        String converted2= converted.replaceAll("[0-9]", "*");
        System.out.println(converted2);


    }
}
