package Day12_IfElse;

import java.util.Scanner;

public class TEST2 {
    public static void main(String[] args) {
        // get two integers from user using nextInt()
        // concatenate them together (use concat method)

        Scanner scanner= new Scanner(System.in);

        System.out.print("First Number:");
        Integer numberOne= scanner.nextInt();


        System.out.print("Second Number:");
        Integer numberTwo= scanner.nextInt();

        String convertedNumberOne= Integer.toString(numberOne);
        String convertedNumberTwo= Integer.toString(numberTwo);

        String concat= convertedNumberOne.concat(convertedNumberTwo);
        System.out.print("Result=" +concat);

        System.out.println("");

        System.out.println("Addition=" + (numberOne+numberTwo));




    }
}
