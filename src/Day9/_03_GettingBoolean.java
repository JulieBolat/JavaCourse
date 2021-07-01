package Day9;

import java.util.Scanner;

public class _03_GettingBoolean {
    public static void main(String[] args) {

        // only accepts true and false

        Scanner scanner= new Scanner(System.in);

        System.out.print("Are you a cat person?");

        boolean catPerson= scanner.nextBoolean();

        System.out.print("You are a cat person->" + catPerson);


    }

}
