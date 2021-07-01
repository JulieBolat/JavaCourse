package Day15_WhileLoop;

import java.util.Scanner;

public class _02_WhileLoopWithScanner {

    public static void main(String[] args) {

        //April 27, Lesson 2
        Scanner scanner= new Scanner(System.in);

        String input= "";

        while (!input.equals("quit")) {

            //Scanner scanner= new Scanner(System.in); (If we put Scanner here, it will print Scanner each each
            System.out.print("Enter input=");
            input= scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println(input);
        }

    }
}
