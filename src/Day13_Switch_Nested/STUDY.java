package Day13_Switch_Nested;

import java.util.Scanner;

public class STUDY {

    public static void main(String[] args) {

        // get number from the user
        // print "ok" if number is 5
        // print "maybe" if number is 3
        // print "no" if number is 1
        // print "dunno" if anything else
        // use switch case

        Scanner myNumber= new Scanner(System.in);
        System.out.println("Enter your number here--->");
        int num= myNumber.nextInt();

        switch (num) {
            case 5:
                System.out.println("OK");
                break;
            case 3:
                System.out.println("No");
                break;
            case 1:
                System.out.println("Dunno");
                break;

            default:
                System.out.println("Hellooo");
                break;
        }




    }


}

