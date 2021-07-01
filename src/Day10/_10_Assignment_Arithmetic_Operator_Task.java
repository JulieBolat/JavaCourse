package Day10;

import java.util.Scanner;

public class _10_Assignment_Arithmetic_Operator_Task {
    public static void main(String[] args) {

        // take a number from user and increment it twice

            Scanner scanner= new Scanner(System.in);

            System.out.println("Enter your number here=");

            int inputFromUser= scanner.nextInt();

            ++inputFromUser;
            ++inputFromUser;

        System.out.println(inputFromUser);



    }


}
