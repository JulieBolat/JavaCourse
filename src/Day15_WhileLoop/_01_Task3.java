package Day15_WhileLoop;

import java.util.Scanner;

public class _01_Task3 {

    public static void main(String[] args) {
        //April 27, Lesson 3
        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 8787

        Scanner scanner = new Scanner(System.in);
        int correctPin = 8787;
        System.out.println("Please enter pin:");
        int userPin = scanner.nextInt();

        while (userPin != correctPin) {
            System.out.println("Incorrect pin, please enter your pin again:");
            userPin=scanner.nextInt();
        }

        System.out.println("You are logged in!");
    }


{




    }
}
