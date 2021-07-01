package Day6;

public class Task3 {
    public static void main(String[] args) {
        //                      Task
        // part1: check whether string "Hi, world!" starts with "Hi"
        // part2: String "Hi world,Hello world" check whether second part of the string starts with Hello

        String part1 = "Hi, World!";
        boolean startsWithHi = part1.startsWith("Hi");
        System.out.println(startsWithHi);

        //boolean startsWithHello = part2.startsWith("Hello" , 9);
        // System.out.println(startsWithHello);

        String part2 = "Hi world,Hello world";
        int indexOfComma = part2.indexOf(',');
        System.out.println(indexOfComma);
        System.out.println(part2.startsWith("Hello" , indexOfComma + 1)); // start to search after comma

        String new1= "I would love to learn about Java";
        int new2= new1.indexOf("to");
        System.out.println(new1.startsWith("to",  14));
        System.out.println(new1.startsWith("I", 0));

    }
}
