package Day11_LogicalOperators;

import java.util.Scanner;

public class HomeworkTask {
    public static void main(String[] args) {

        // Take two numbers from the user and print the greatest number

        Scanner scanner= new Scanner(System.in);

        System.out.print("First Value:");
        int userInputOne= scanner.nextInt();

        System.out.print("Second Value:");
        int userInputTwo= scanner.nextInt();

        if (userInputOne>userInputTwo) {
            System.out.println("Greatest Number->" + (userInputOne>userInputTwo));
        }





    }
}
