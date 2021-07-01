package Day10;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // C = (F-32) * 5/9

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the Fahrenheit Value Here=");
        int Fahrenheit= scanner.nextInt();

        System.out.print("Celsius->" + (Fahrenheit-32)*5/9);








    }
}
