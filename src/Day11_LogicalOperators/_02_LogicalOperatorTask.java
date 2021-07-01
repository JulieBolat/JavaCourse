package Day11_LogicalOperators;

import java.util.Scanner;

public class _02_LogicalOperatorTask {

    public static void main(String[] args) {

        //Task 4/20 Lesson 1
        // get string input from the user
        // check if it contains 'a' and 'b'
        // check if it contains 'a' or 'c'
        // check if it does NOT contain 'c'
        // check if it does not contain both 'c' and 'd'

        Scanner scanner = new Scanner(System.in);

        String inputFromUser = scanner.nextLine();

        boolean containsAandB = inputFromUser.contains("a") && inputFromUser.contains("b");
        boolean containsAorC = inputFromUser.contains("a") || inputFromUser.contains("c");
        boolean doesNotContainC = !inputFromUser.contains("c");
        boolean doesNotContainCandD = !(inputFromUser.contains("c") && inputFromUser.contains("d"));

        System.out.println("My test:" + (inputFromUser.contains("a") && inputFromUser.contains("b")));


        System.out.println(containsAandB);
        System.out.println(containsAorC);
        System.out.println(doesNotContainC);
        System.out.println(doesNotContainCandD);






    }
}
