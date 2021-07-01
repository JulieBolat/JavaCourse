package Day6.StringMethods;

public class _12_Contains {

    public static void main(String[] args) {

        String hello= "Hello World";
        boolean b= hello.contains("H");
        System.out.println(b);
        System.out.println(" ");
        System.out.println(hello.contains("H"));
        System.out.println(hello.contains("h"));
        System.out.println(hello.contains("Hello"));
        System.out.println(hello.contains(" "));
        System.out.println(hello.contains("Z"));


    }
}
