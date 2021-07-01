package Day10;

import java.util.Scanner;

public class _03_MultiplicationTask {

    public static void main(String[] args) {

        // create a program that takes two numbers from the user
        // and prints their product

        Scanner scanner= new Scanner(System.in);

        System.out.print("First Number:");
        int first = scanner.nextInt();

        System.out.print("Second Number:");
        int second= scanner.nextInt();

        int answer= first*second;
        System.out.print("Result:"+answer);







    }


}
