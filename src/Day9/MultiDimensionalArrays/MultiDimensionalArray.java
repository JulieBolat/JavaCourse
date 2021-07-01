package Day9.MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        //we can store one dimensional array into another array

        String[] list1 = {"1", "2", "7"};
        String[] list2 = {"3", "4", "8"};
        String[] list3 = {"5", "6", "9"};

        String[][] listOfLists = {{"1", "2", "7"}, {"3", "4", "8"}, {"5", "6", "9"}};

        System.out.println(listOfLists);
        System.out.println("");
        System.out.println(Arrays.deepToString(listOfLists));


        int[][] ageAndGrad = new int[4][2];
        ageAndGrad[0][0] = 35;
        ageAndGrad[0][1] = 2010;
        ageAndGrad[1][0] = 40;
        ageAndGrad[1][1] = 2003;
        ageAndGrad[2][0] = 60;
        ageAndGrad[2][1] = 1985;
        ageAndGrad[3][0] = 25;
        ageAndGrad[3][1] = 2020;

        System.out.println(Arrays.deepToString(ageAndGrad));


    }
}
