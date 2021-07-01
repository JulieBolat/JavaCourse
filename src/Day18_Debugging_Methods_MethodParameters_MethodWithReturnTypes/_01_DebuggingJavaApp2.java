package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

import java.util.Scanner;

public class _01_DebuggingJavaApp2 {

    public static void main(String[] args) {

        //May 3, Lesson 1

        // Debug the whole code

        int number = 1;
        System.out.println(number);
        number++;
        System.out.println(number);

        if (number > 1)
            System.out.println("Larger than 1");
        else
            System.out.println("Less than 1");

        System.out.println("After If Else Statement");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input);

    }

}
