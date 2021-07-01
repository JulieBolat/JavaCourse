package Mentoring.Project2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayContains {

    /*
        Given two arrays of ints. Say, first array is "outer" and second array is "inner".
        Both arrays are already sorted in increasing order.
        Print true if all of the numbers in the inner array also appear in the outer array.
        Otherwise print false
        (In other words, print true if first array contains second array.)

        Samples:
        [1, 2, 4, 6], [2, 4] → true
        [1, 2, 4, 6], [2, 3, 4] → false
        [1, 2, 4, 4, 6], [2, 4] → true

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");

        int[] myArr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] outer = new int[3];
        int[] inner = new int[2];

        for (int i = 0; i < 3; i++) {
            outer[i] = myArr[i];
        }
        for (int i = 3; i < 5; i++) {
            inner[i - 3] = myArr[i];
        }

//        Start coding here and ignore the above codes.Code above is necessary for the test class.
//        Use the arrays called outer and inner

        boolean isContain= true;
        boolean doesNotContain= false;

        for (int i=1;  i< outer.length; i++) {
            for (int j=0; j<inner.length; j++) {
                if (Arrays.toString(outer).contains(Arrays.toString(inner))) {
                    isContain = true;

                    System.out.println(isContain);

                    }
                    else if (!Arrays.toString(outer).contains(Arrays.toString(inner))) {
                        //System.out.println(doesNotContain);
                }

                System.out.println(doesNotContain);
            }
        }


    }
}
