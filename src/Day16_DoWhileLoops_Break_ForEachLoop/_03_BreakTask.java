package Day16_DoWhileLoops_Break_ForEachLoop;

import java.util.Scanner;

public class _03_BreakTask {

    public static void main(String[] args) {

        // get number from user
        // count from 0 until the number
        // if the count is larger than 10, stop

        Scanner scanner= new Scanner(System.in);
        System.out.println("While Loop=");
        int numberFromUser= scanner.nextInt();

        int num=0;

        while (num<numberFromUser){
            num++;
            System.out.println(num);

            if (num>=10) {
                break;
            }
        }



    }
}
