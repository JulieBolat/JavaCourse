package Day13_Switch_Nested;

import java.util.Scanner;

public class _02_Task {

    public static void main(String[] args) {

        // get string input from the user
        // if it contains 'a' and 'b', print "The input contains both a and b"
        // else print "The input does not contains both a and b"

        Scanner scanner= new Scanner(System.in);
        String myInput= scanner.nextLine();

        if(myInput.contains("a") && myInput.contains("b")) {
            System.out.println("The input contains both a and b:");

        }else {
            System.out.println("The input does not contain both a and b");

        }






    }
}
