package Day8;

import java.util.Arrays;

public class _03_ArraysEqualsTask2 {
    public static void main(String[] args) {

        // create a String array of {"10", "20"}
        // create a byte array of {20, 10}
        // convert String array into byte array
        // compare them together

        String [] a= {"10", "20"};
        Byte [] b= {10, 20};
        Byte [] c= new Byte [2];
        c[0]= Byte.parseByte(a[0]);
        c[1]= Byte.parseByte(a[1]);
        System.out.println(Arrays.equals(a,c));

        String[] stringArray = {"10", "20"};
        byte [] byteArray= {20,10};

        byte [] convertedArray= new byte[stringArray.length];

        convertedArray[0]=Byte.parseByte(stringArray[0]);
        convertedArray[1]=Byte.parseByte(stringArray[1]);
        System.out.println(Arrays.equals(byteArray, convertedArray));







    }

    // create a String array of {"10", "20"}
    // create a byte array of {20, 10}
    // convert String array into byte array
    // compare them together
}
