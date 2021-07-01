package Day10;

import java.util.Scanner;

public class _02_SubtractionTask {

    public static void main(String[] args) {
        //Monday Lesson 1
        // create a program that subtracts a number from 100
        // this number must come from user input

        int theHundred = 100;
        System.out.print("Enter a number to subtract from 100: ");

        Scanner scanner = new Scanner(System.in);
        int numberFromUser = scanner.nextInt();
        System.out.println(theHundred - numberFromUser);



    }
}