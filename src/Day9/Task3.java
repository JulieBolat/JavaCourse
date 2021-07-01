package Day9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Ask user for two numbers
        //sum two numbers and print the result

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number here:");
        Integer firstNumber= scanner.nextInt();
        System.out.println("First Number=" +firstNumber);

        System.out.println(" ");
        System.out.print("Enter your second number here:");
        Integer secondNumber= scanner.nextInt();
        System.out.println("Second Number=" + secondNumber);

        System.out.println("");
        System.out.println("Sum of the two number=" + (firstNumber + secondNumber));



    }
    }
