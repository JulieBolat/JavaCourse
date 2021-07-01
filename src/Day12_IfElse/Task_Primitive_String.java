package Day12_IfElse;

import java.util.Scanner;

public class Task_Primitive_String {

    public static void main(String[] args) {
        //Task 4 22 Lesson 1
        //Get number from user as a String
        //check if the number is bigger than 100
        //if it is bigger than 100, print "It's bigger than 100"

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter a number:");
        String numberString= scanner.nextLine();

        Integer converted= Integer.parseInt(numberString);

        if (converted>100){
            System.out.print("It is bigger than 100");
        }

        if(converted<100) {
            System.out.print("It is not bigger than 100");
        }


        }


}
