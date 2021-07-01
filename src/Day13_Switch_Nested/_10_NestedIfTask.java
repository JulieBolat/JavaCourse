package Day13_Switch_Nested;

import java.util.Scanner;

public class _10_NestedIfTask {

    public static void main(String[] args) {

        // get 2 numbers from user
        // if first number is larger than zero, check second number, if second number is larger than 5 print "ok" else print "not ok"
        // if first number is less than or equal to zero, print "too cold to check"

        //think of first number as temperature
        //second number is atmospheric pressure
        //and your code is doing diagnostics

        Scanner scanner= new Scanner(System.in);

        System.out.print("Temperature:");
        int temperature= scanner.nextInt();

        System.out.print("Pressure:");
        int pressure= scanner.nextInt();

        //If we input temperature as -10, it will skip (pressure) ifs and will print "too cold"
        if (temperature> 0) {
            //System.out.println("Pressure:"); it will print pressure if temperature is 10
            if (pressure > 5) {
                System.out.println("OK");
            } else {
                System.out.println("NOT OK");
            }
        } else {
            System.out.println("TOO COLD");
        }



    }


}
