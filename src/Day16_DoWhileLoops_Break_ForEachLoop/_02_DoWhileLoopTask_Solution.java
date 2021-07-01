package Day16_DoWhileLoops_Break_ForEachLoop;

import java.util.Scanner;

public class _02_DoWhileLoopTask_Solution {

    public static void main(String[] args) {

        //April 29 Lesson 1

        Scanner scanner= new Scanner(System.in);

        int correctPin= 3535;
        int userPin= 0;

        do {
            System.out.print("Please enter your pin here=");
            userPin= scanner.nextInt();

        } while (userPin!=correctPin);
        System.out.print("You are logged in!");

    }
}
