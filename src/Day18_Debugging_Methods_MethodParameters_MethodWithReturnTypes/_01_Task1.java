package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

import java.util.Scanner;

public class _01_Task1 {

    public static void main(String[] args) {

        //get text from the user, print only unique characters

        // blah blah blah -> blah
        // technostudy -> technosudy

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String uniqueCharacters = "";

            for (int i = 0; i < input.length(); i++) {

                char charAt = input.charAt(i); ////uniqueChar+= charAt;

                if (!uniqueCharacters.contains(charAt + "")) {
                    uniqueCharacters += charAt;
                }

            }
            System.out.println(uniqueCharacters);

        }
    }
