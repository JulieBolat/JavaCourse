package Day9;

import java.util.Scanner;

public class _01_UserInput {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String myString= userInput.nextLine();
        System.out.println(myString);

        //this method will help to scan the result in terminal when you type something
        //nextLine used for Strings

    }
}
