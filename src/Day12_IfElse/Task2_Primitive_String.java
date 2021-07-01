package Day12_IfElse;

import java.util.Scanner;

public class Task2_Primitive_String {

    public static void main(String[] args) {

        // get two integers from user using nextInt()
        // concatenate them together (use concat method)

        Scanner scanner1= new Scanner(System.in);
        System.out.print("First Integer:");
        int number1= scanner1.nextInt();
        String a=Integer.toString(number1);

        Scanner scanner2= new Scanner(System.in);
        System.out.print("Second Integer:");
        int number2= scanner2.nextInt();
        String b= Integer.toString(number2);



        System.out.print(a.concat(b));


    }
}
