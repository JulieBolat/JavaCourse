package Day9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //April 1, Lesson 2
        //1-Where are you from?
        //2-Where do you live?
        //You should print results

        //Scanner information= new Scanner(System.in);
        //String from= information.nextLine();
        //System.out.println("I am from" +" "+ from);

        //String live= information.nextLine();
        //System.out.println("I live in" + " " + live);


        Scanner scanner= new Scanner(System.in);

        String Q1= "Where are you from?";
        System.out.print(Q1);
        String born= scanner.nextLine();


        String Q2= "Where do you live?";
        System.out.print(Q2);
        String live= scanner.nextLine();

        System.out.println("");

        System.out.println("City you born->" +born);
        System.out.println("Where you live->"+ live);




    }

}
