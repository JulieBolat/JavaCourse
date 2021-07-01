package Day49_Terminal;

public class Task {

    /**

     June 29, Lesson 1
     Pass arguments "1", "10", "100" from terminal to main method

     Convert these String to Integers and sum and print the result

     */

    public static void main(String[] args) {

        int total= 0;

        for (String arg : args) {
            int number= Integer.parseInt(arg);
            total+=number;

        }

        System.out.println("Total is->" + total);
    }
}
