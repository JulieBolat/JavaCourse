package Day5.StringMethods;

public class _01_StarsWith {

    public static void main(String[] args) {

        //String newMessage = "Hello World";
        //boolean startsWithHello = newMessage.startsWith("Hello");
        //System.out.println(startsWithHello);

        // Task
        //check whether string "Hi, world!" starts with "Hi"
        // part2: "Hi world,Hello world" check whether second part of the string starts with Hello


        String part1= "Hi, World!";
        boolean startsWithHi= part1.startsWith("Hi");
        System.out.println(startsWithHi);

        String part2= "Hi world, Hello World";
        boolean startsWithHello= part2.startsWith("Hello");
        System.out.println(startsWithHello);

        String string1= "This is just a sample";
        boolean var1= string1.startsWith("T");
        System.out.println(var1);




    }
}
