package Day11_LogicalOperators;

import java.util.Scanner;

public class IfTask {

    public static void main(String[] args) {
        // get an int from user
        // if it is larger than 100, print "PASSED"

        Scanner number= new Scanner(System.in);
        System.out.println("input:");
        int print= number.nextInt();
         if (print>100) {
             System.out.println("PASSED");
         }

    }
}
