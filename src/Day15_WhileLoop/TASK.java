package Day15_WhileLoop;

import java.util.Scanner;

public class TASK {

    public static void main(String[] args) {

        //get a number from user
        // print the sum of numbers from 0 up to number from user
        //0+1+2+3+4+5 length-1=

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your value here:");
        int numberFromUser= scanner.nextInt();


        int number= 0;
        while (number<numberFromUser);
        System.out.println(number);
        number++;

        number= numberFromUser+1;
    }
}
