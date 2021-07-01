package Day15_WhileLoop;

import java.util.Scanner;

public class _01_Task2 {
    public static void main(String[] args) {

        // get a number from user
        // print the sum of numbers from 0 up to number from user

        Scanner scanner= new Scanner(System.in);
        System.out.print("Number from user=");
        int numberFromUser= scanner.nextInt();

        int sum = 0;
        int count= 0;

        while (count < numberFromUser){
            count++;
            sum += count;

        }
        System.out.println (sum);
    }
}
