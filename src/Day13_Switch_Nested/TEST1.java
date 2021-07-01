package Day13_Switch_Nested;

import java.util.Scanner;

public class TEST1 {
    public static void main(String[] args) {

        // get 2 numbers from user
        // if first number is larger than zero, check second number, if second number is larger than 5 print "ok" else print "not ok"
        // if first number is less than or equal to zero, print "too cold to check"

        Scanner scanner= new Scanner(System.in);
        System.out.print("What is the temperature?=");
        int temperature= scanner.nextInt();

        Scanner scanner1= new Scanner(System.in);
        System.out.print("What is the pressure?=");
        int pressure= scanner.nextInt();

        if (temperature>0) {
            if (pressure > 5) {
                System.out.print("OK");
            } else {
                System.out.print("NOT OK");
            }

        } if (temperature<=0) {
            System.out.print("TOO COLD");

        }



    }

}