package Day15_WhileLoop;

import java.util.Scanner;

public class _01_Task3_SecondSolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correctPin = 8787;
        System.out.print("Please enter pin: ");
        int userPin = scanner.nextInt();

//        while (userPin != correctPin){
//            System.out.println("Incorrect pin, please enter again: ");
//            userPin = scanner.nextInt();
//        }
//
//        System.out.println("You are logged in!");


        while (true){
            if (userPin == correctPin){
                System.out.println("You are logged in!");
                break;
            }else {
                System.out.println("Incorrect pin, please enter again: ");
                userPin = scanner.nextInt();
            }
        }
    }

}
