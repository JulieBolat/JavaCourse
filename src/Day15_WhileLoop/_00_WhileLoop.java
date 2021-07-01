package Day15_WhileLoop;

import java.util.Scanner;

public class _00_WhileLoop {

    public static void main(String[] args) {
        //April 27, Lesson 3

        Scanner scanner= new Scanner(System.in);
        String input= " ";

        while (true) {
            System.out.print("Enter input: ");
            input =scanner.nextLine().toLowerCase();
            if (input.equals("quit")) {
                break;

            }
            System.out.println(input);

        }


    }
}