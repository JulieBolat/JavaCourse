package Day11_LogicalOperators;

import java.util.Scanner;

public class TEST3 {
    public static void main(String[] args) {
        // get an int from user
        // if it is larger than 100, print "PASSED"

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your value here:");
        Integer yourValue= scanner.nextInt();

        if (yourValue>100) {
            System.out.println("PASSED");
        }
        if(yourValue<100) {
            System.out.println("FAILED");
        }
    }
}
