package Day11_LogicalOperators;

import java.util.Scanner;

public class IfTask2 {

    public static void main(String[] args) {
        // get a number from the user
        // check if it is positive or negative
        // part2: check for zero also

        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();

        if (numberFromUser > 0) {
            System.out.println("POSITIVE");
        }
        if (numberFromUser < 0) {
            System.out.println("NEGATIVE");
        }
        if (numberFromUser == 0) {
            System.out.println("ZERO");
        }

        }


}
