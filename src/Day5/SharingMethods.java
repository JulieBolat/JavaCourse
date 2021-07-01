package Day5;

import java.util.Locale;

public class SharingMethods {

    public static void main(String[] args) {
        String myString = "IntelliJ is cool!!";

        System.out.println(myString.toLowerCase());

        System.out.println(myString.toUpperCase());

        System.out.println(myString.startsWith("Int"));

        System.out.println(myString.endsWith("cool!!"));

        System.out.println(myString.length());

        System.out.println(myString.indexOf("i"));

        //Task

        System.out.println(myString.toLowerCase().indexOf("i"));
        System.out.println(myString.toUpperCase().endsWith("COOL!!"));
    }
}
