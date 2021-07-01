package Day16_DoWhileLoops_Break_ForEachLoop;

import java.util.Scanner;

public class _04_ContinueInsideLoopTask2 {

    public static void main(String[] args) {

        // get text from the user, print each letter in a new line
        // skip space or semi-column characters

        Scanner scanner= new Scanner(System.in);
        String userInput= scanner.nextLine();
        char letter;

        for (int i=0; i<userInput.length(); i++) {
            letter= userInput.charAt(i);

            if (letter== ' ' || letter== ';'){
                continue;
            }
            System.out.print(letter);
        }

    }
}
