package Day13_Switch_Nested;

import java.util.Random;
import java.util.Scanner;

public class _01_GameTask {
    public static void main(String[] args) {

        //April 23, Lesson 1
        // ask number from user between  0  and 5
        // generate a random number
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number between 0 and 5:");
        int numberFromUser= scanner.nextInt();

        Random rnd= new Random();
        int randomNumber= rnd.nextInt(5);

        //if number btw 0-5 run program else print "Invalid"

        if (numberFromUser== randomNumber) {
            System.out.println("You Win! Yay!");
        } else {
            System.out.println("You Lose:! :(");
        }




    }
}







