package Day10;

import java.util.Arrays;

public class _02_Subtraction {

    public static void main(String[] args) {

        //subtraction using only values
        System.out.println(5-3);

        int first= 55;
        int second= 33;

       //Subtraction using variables
        System.out.println(first-second);

        int result= first-second;
        System.out.println(result);

        //Subtraction using variables and values
        System.out.println(result-5);

        //Negative result
        System.out.println(-result);

        result= -result;  //if you want to update another variable, the result will change to negative
        System.out.println(result);

        System.out.println("Result->" +first+second);
        //math will not happen here. Java will convert integers to a String


    }
}
