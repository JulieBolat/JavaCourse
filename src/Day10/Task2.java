package Day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // C = (F-32) * 5/9

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        double Celsius = (Fahrenheit - 32) * 5/9;

        System.out.println("Celsius: " + Celsius);

        int temp1= 212;
        int temp2= (temp1-32);
        int temp3= (temp2*5);
        int temp4= (temp3/9);
        System.out.println(temp4);


    }
}
