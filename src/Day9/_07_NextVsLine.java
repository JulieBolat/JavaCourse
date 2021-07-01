package Day9;

import java.util.Scanner;

public class _07_NextVsLine {
    public static void main(String[] args) {

        // difference between next vs nextLine
        // next() only reads next word (until space)
        // nextLine() reads all line

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter here:");

        System.out.println("Using next=" + scanner.next());
        System.out.println("Using nextline=" +scanner.nextLine());

        //System.out.print("Name: ");
        //String name = scanner.next();
        //System.out.println("");
        //System.out.println("Your Name: " + name);

        System.out.print("Name: ");
        String name2 = scanner.nextLine().trim(); // we remove spaces with trim method
        System.out.println("");
        System.out.println("Your Name: " + name2);

    }
}
