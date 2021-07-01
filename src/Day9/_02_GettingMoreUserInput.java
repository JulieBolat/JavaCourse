package Day9;

import java.util.Scanner;

public class _02_GettingMoreUserInput {
    public static void main(String[] args) {

        //Scanner scanner= new Scanner(System.in);
        //System.out.println("What is your name:");
       // String name=scanner.nextLine();
        //System.out.println("My name:"+name);

        //System.out.println("What is your age:");
       // String age= scanner.nextLine();
        //System.out.println("My age:" + age);

        Scanner scanner= new Scanner(System.in);

        String name= scanner.next();
        System.out.println("What is your name:" +name);

        String age= scanner.next();
        System.out.println("What is your age?:" +age);






    }
}
