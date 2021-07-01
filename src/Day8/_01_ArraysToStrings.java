package Day8;

import java.util.Arrays;

public class _01_ArraysToStrings {

    public static void main(String[] args) {

        int[] array = new int[4];
        array [0]=1;
        array [1]=2;
        array [2]=3;
        array [3]=4;

        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array[3]);


        int lastIndex = array.length - 1;
        array[lastIndex] = 5;
        System.out.println(Arrays.toString(array));




    }
}

