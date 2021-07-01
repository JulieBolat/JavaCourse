package HW.LoopQuestion1;

import java.util.Scanner;

public class LoopQuestion3 {

    public static void main(String[] args) {

        //April 30, Lesson 3

        /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25

        Example 3:
        Input: 14
        Output: false

     */

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPerfectSquare = false;
        for (int i = 0; i*i <= num; i++){

            if (i*i == num){
                isPerfectSquare = true;
            }

        }
        System.out.println(isPerfectSquare);

    }
}
