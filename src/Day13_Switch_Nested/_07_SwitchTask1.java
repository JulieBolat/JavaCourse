package Day13_Switch_Nested;

import java.util.Scanner;

public class _07_SwitchTask1 {
    public static void main(String[] args) {

        // get number from the user
        // print "ok" if number is 5
        // print "maybe" if number is 3
        // print "no" if number is 1
        // print "dunno" if anything else
        // use switch case

        Scanner scanner= new Scanner(System.in);
        System.out.println("Your number: ");
        int number= scanner.nextInt();

        switch (number) {
            case 5:
                System.out.println("OK");
                break;
            case 3:
                System.out.println("MAYBE");
                break;
            case 1:
                System.out.println("NO");
            default:
                System.out.println("DUNNO");
        }




    }



}
