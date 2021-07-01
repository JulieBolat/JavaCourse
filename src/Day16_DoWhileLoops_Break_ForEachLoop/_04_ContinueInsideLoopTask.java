package Day16_DoWhileLoops_Break_ForEachLoop;

import java.util.Scanner;

public class _04_ContinueInsideLoopTask {

    public static void main(String[] args) {

        // get number from the user, print all the numbers from 0 to the number from user
        // skip even numbers using continue

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your value here=");

        int numberFromUser= scanner.nextInt();

        for (int i=0; i<=numberFromUser; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
