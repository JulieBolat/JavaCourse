package HW.Assignment3;

import java.util.Arrays;

public class String_Methods_3 {
    public static void main(String[] args) {

        //Task1
        String a=  "apple";
        String b= "Apple";
        System.out.println(a.equals(b));

        //Task2
        String city= "Orlando";
        String born= "Edirne";
        System.out.println(city.equals(born));

        //Task3
        String first= "INLINE CODE";
        String second= "inline CODE";
        System.out.println(first.equals(second));

        //Task4
        String money= "$52.00";
        System.out.println(money);
        String money2= money.replace("$", " ");
        System.out.println(money2);

        //Task5
        String test1= "                     Hi I'm from New York                           ";
        String test2= test1.trim();
        System.out.println(test2);

        //Task6
        String information= "My phone number is 123456789 and I live in 445B bakery street";
        String replace= information.replaceAll("[0-9]","*");
        System.out.println(replace);













    }
}
