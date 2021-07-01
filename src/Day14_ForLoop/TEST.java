package Day14_ForLoop;

import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {

        //April 26, Lesson 2
        // write a java program which calculates the sum from [0 to 5];
        // using for-loop
        //get toSum number from user

        Scanner scanner= new Scanner(System.in);
        int sum=0;
        System.out.print("Your number here=");
        int number= scanner.nextInt();

        for (int w=0; w<=number; w++) {
            sum= sum+w;

        }

        System.out.println("SUM=" + sum);

    }
}
