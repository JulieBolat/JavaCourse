package HW.Assignment3;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {

        // Task#1
        String [] vegetables = new String[]{"tomato", "potato", "onion", "mushroom", "lettuce"};
        //System.out.println(vegetables);
        System.out.println(Arrays.toString(vegetables));

        //Task2
        int [] years= new int [] {2010,2000, 2001, 1993, 2021, 1989};
        System.out.println(java.util.Arrays.toString(years));

        //Task3
        //Create an int array which is numberToSum
        //Values = 25, 30, 30, 35, 100  and print the sum of these numbers result should be 220
        int [] numbersToSum= {25, 30, 30, 35, 100};
        numbersToSum[0]=25;
        numbersToSum[1]=30;
        numbersToSum[2]=30;
        numbersToSum[3]=35;
        numbersToSum[4]=100;
        int [] total=  {numbersToSum[0]+numbersToSum[1]+numbersToSum[2]+numbersToSum[3]+ numbersToSum[4]};
        System.out.println(Arrays.toString(total));


        //Task4
        int [] ages= new int[] {45, 32, 19, 51, 29, 30};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        //Task5
        float [] productPrices= new float[] {19.99F, 28.09F, 9.99F, 35.9F, 17.29F, 10.79F, 20.95F, 99.9F, 1.19F};
        Arrays.sort(productPrices);
        System.out.println(Arrays.toString(productPrices));
        System.out.println(productPrices.length);

        //Task6
        char [] specialChars= new char[]{'!', '%', '*', ')', '<', '$', '+', '-', '~', '@'};
        System.out.println(Arrays.toString(specialChars));
        System.out.println(specialChars.length);


































    }
}
