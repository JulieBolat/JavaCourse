package Day16_DoWhileLoops_Break_ForEachLoop;

import java.util.Scanner;

public class _01_DoWhileLoop_Task {

    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 3535
        // do this task with do-while

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your value here=");

        int numberFromUser = scanner.nextInt();

        while (numberFromUser == 3535) {
            ++numberFromUser;
            System.out.println(numberFromUser);
        }

        do {
            ++numberFromUser;
            System.out.println("You are logged in" + numberFromUser);
        } while (numberFromUser< 3535);
        numberFromUser++;


    }
}
