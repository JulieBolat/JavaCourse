package Day5.StringMethods;

import jdk.swing.interop.SwingInterOpUtils;

public class _02_EndsWith {
    public static void main(String[] args) {

        String newMessage = "Hello World!!";
        boolean endsWith= newMessage.endsWith("World!!");
        System.out.println(endsWith);

        //This system is case sensitive

        String str1= "This is ABC";
        boolean var1= str1.endsWith("ABC");
        System.out.println(var1);

        boolean var2= str1.endsWith("This");
        System.out.println(var2);


    }
}
