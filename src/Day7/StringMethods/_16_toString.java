package Day7.StringMethods;

import java.awt.*;

public class _16_toString {

    public static void main(String[] args) {
        String myString = "Hello World!";
        String newString = myString.toString();
        System.out.println(newString);

        Point a= new Point(1, 2);
        System.out.println(a);
        String b= a.toString(); //need to convert the point to a string(toString) and use isEmpty method to see the result
        System.out.println(b);
        System.out.println(b.isEmpty());
        System.out.println(b.replaceAll("[0-9]","*"));


        //System.out.println(point);
        // String toString = point.toString();
        //System.out.println(toString);
        //System.out.println(toString.isEmpty());
        //System.out.println(toString.replaceAll("[0-9]", "*"));
    }
}
