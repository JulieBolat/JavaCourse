package HW.Methods;

import java.util.Random;
import java.util.Scanner;

public class _01_01 {
    public static void main(String[] args) {
        /*
         1-Create one method name is -->> randomNum
    this method will take one parameter which is called int max
    method will create a random number between 0 to max
    return random number.
         */

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // takes input from the keyboard
        int max = input.nextInt();

        int randomResult = randomNum(max);
        System.out.println("Random Number between 0 and " + max + " is :" + randomResult);
    }

        public static int randomNum(Integer range){
            Random random = new Random();
            return random.nextInt(range);
        }

    }