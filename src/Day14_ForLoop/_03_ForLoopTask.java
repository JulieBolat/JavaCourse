package Day14_ForLoop;

import java.util.Scanner;

public class _03_ForLoopTask {

    public static void main(String[] args) {
        // write a java program which will show
        // multiplication table of 2
        //ex:
        //    2 x 1 = 2
        //    2 x 2 = 4
        //    2 x 3 = 6
        //    2 x 4 = 8
        //    2 x 5 = 10
        //    2 x 6 = 12
        //    2 x 7 = 14
        //    2 x 8 = 16
        //    2 x 9 = 18
        //    2 x 10 = 20
        // using for-loop

        //get multiplicand from user

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your value here:");

        int num2 = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num2+ "*" + i +"=" + (num2 *i));

        }
    }

}