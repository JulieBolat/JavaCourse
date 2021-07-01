package Day11_LogicalOperators;

import java.util.Scanner;

public class TEST1 {
    public static void main(String[] args) {
        // get a number from the user
        // check if it is positive or negative
        // part2: check for zero also

        Scanner scanner= new Scanner(System.in);

        System.out.println("Your value here:");
        Integer yourValue= scanner.nextInt();

        if (yourValue>0){
            System.out.println("Positive");
        }
        if(yourValue<0) {
            System.out.println("Negative");
        }
        if(yourValue==0) {
            System.out.println("Your value is zero");
        }




    }
}
