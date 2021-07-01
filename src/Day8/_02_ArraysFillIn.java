package Day8;

import java.util.Arrays;

public class _02_ArraysFillIn {
    public static void main(String[] args) {

        int[] numbers= new int [15];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 9);
        System.out.println(Arrays.toString(numbers));

        numbers[1]= 10;
        System.out.println(Arrays.toString(numbers));

        String [] test= {"My", "name", "is", "Julie"};
        Arrays.fill(test,"What");
        System.out.println(Arrays.toString(test));



    }
}
