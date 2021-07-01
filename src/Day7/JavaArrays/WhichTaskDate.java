package Day7.JavaArrays;

import java.util.Arrays;
import java.util.Date;

public class WhichTaskDate {
    public static void main(String[] args) {

        //Date date= new Date();
        //System.out.println(date);
       // System.out.println("Converted String:" + date);
        //String b= ("Converted String:" +date).replaceAll("[0-9]", "*");
        //System.out.println(b);

        // Task
        // First create a Date object which is "now"
        // Then convert this 'now' variable to a String
        // Now replace all numbers with '*'
        // And check if the first Date object is equal to our string

        Date a= new Date();
        System.out.println(a);
        String b= ("Converted String:" +a);
        String c= b.replaceAll("[0-9]","*" );
        System.out.println(c);


    }
}
