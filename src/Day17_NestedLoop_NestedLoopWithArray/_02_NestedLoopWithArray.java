package Day17_NestedLoop_NestedLoopWithArray;

import java.util.Arrays;

public class _02_NestedLoopWithArray {

    public static void main(String[] args) {

        int [][] numbers= { {1,2,3} , {4,5,6}, {7,8,9}};

        // int [] [] numbers= new int[][] if you do not initialize it, empty rows/columns will print as zero

        //number[0]= {1,2,3}
        //number[i]= length of the array
        //number [][]= 9;

        OUTER:LOOP:
        for (int i= 0; i< numbers.length; i++) {

            INNER_LOOP:
            for (int j = 0; j < numbers[i].length; j++) {

                System.out.println(numbers[i][j]);

                if (true) {
                    break; //this will break the inner loop and
                    //break OUTER_LOOP; this will break outer loop
                }
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
