package Day12_IfElse;

import java.util.Scanner;

public class Task2_Solution {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int integer1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int integer2 = scanner.nextInt();

        String converted1 = Integer.toString(integer1);
        String converted2 = Integer.toString(integer2);

        System.out.println(converted1.concat(converted2));
    }
}
