package HW.LoopQuestion1;

import java.util.Scanner;

public class LoopQuestion1 {
    public static void main(String[] args) {
         /*
        Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1

         */

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        int bCount = 0;
        char b = 'b';

        for (int i = 0; i < input.length(); i++){

            if (input.charAt(i) == b){
                bCount++;
            }

        }

        System.out.println(bCount);
    }


}
