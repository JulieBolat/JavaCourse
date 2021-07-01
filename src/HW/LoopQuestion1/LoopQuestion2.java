package HW.LoopQuestion1;

import java.util.Scanner;

public class LoopQuestion2 {
    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720
       */

        Scanner scanner = new Scanner(System.in);

        int numberFromUser = scanner.nextInt();

        int factorialValue = 1;

        for (int i = 2; i <= numberFromUser; i++){

            factorialValue *= i;

        }
        System.out.println(factorialValue);

    }
}
