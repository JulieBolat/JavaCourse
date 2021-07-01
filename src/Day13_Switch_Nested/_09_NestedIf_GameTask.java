package Day13_Switch_Nested;

import javax.xml.namespace.QName;
import java.util.Random;
import java.util.Scanner;

public class _09_NestedIf_GameTask {

    public static void main(String[] args) {


        // ask number from user between  0  and 5
        // generate a random number
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value between 0 and 5");
        int numberFromUser = scanner.nextInt();

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(5);

        // if number between 0 - 5 run program else print "Invalid"

        if (numberFromUser < 5 && numberFromUser > 0) {
            if (numberFromUser == randomNumber) {
                System.out.println("You Win! yay!");
            } else {
                System.out.println("You Lose :(");
            }
        } else {
            System.out.println("Invalid");
        }

    }


}
