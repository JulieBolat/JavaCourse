package Day11_LogicalOperators;

import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        //Task 4/20 Lesson 1
        // get string input from the user
        // check if it contains 'a' and 'b'
        // check if it contains 'a' or 'c'
        // check if it does NOT contain 'c'
        // check if it does not contain both 'c' and 'd'

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your input here:");
        String input= scanner.nextLine();

        if (input.contains("a") && input.contains("b")) {
            System.out.println("The Input contains a and b");
        }
        if (input.contains("a")||input.contains("b")) {
            System.out.println("The input contains a or b");
        }
        if (!input.contains("c")) {
            System.out.println("The input does not contain c");
        }
        if (!input.contains("c") && !input.contains("d")) {
            System.out.println("The input does not contain both 'c' and 'd'");
        }



    }
}
