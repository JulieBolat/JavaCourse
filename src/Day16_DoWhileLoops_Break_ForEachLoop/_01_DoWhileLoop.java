package Day16_DoWhileLoops_Break_ForEachLoop;

public class _01_DoWhileLoop {

    public static void main(String[] args) {

        int number= 4;

        while (number<0) { //checks condition first, it is correct, it will print. If not, it will move to the next part.
            ++number;
            System.out.println("While=" + number);
        }

        do { //the block is guaranteed to execute at least once
            ++number;
            System.out.println("Do While=" + number);

        } while (number<0); //do while loop will get executed at least one time.

    }
}
