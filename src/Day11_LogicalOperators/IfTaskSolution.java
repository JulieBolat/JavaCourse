package Day11_LogicalOperators;

import java.util.Scanner;

public class IfTaskSolution {
    // get an int from user
    // if it is larger than 100, print "PASSED"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberFromUser = scanner.nextInt();

        if (numberFromUser > 100){

            System.out.println("PASSED");
        }

    }


}
