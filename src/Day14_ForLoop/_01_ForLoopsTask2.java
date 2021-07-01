package Day14_ForLoop;

import java.util.Scanner;

public class _01_ForLoopsTask2 {

    public static void main(String[] args) {
        //April 26, Lesson 2
        // write a java program which calculates the sum from [0 to 5];
        // using for-loop
        //get toSum number from user

        Scanner scanner= new Scanner(System.in);

        int sum= 0; //this int variable should be defined outside of the for loop to get print.
        System.out.print("Enter your number here:");

        int numberFromUser =scanner.nextInt();

        for(int i=0; i<=numberFromUser; i++) {
            sum= sum+ i; // sum += i 1=0+1
        }

        System.out.print("SUM=" +sum);


    }
}
