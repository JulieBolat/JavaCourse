package Day6.StringMethods;

public class _07_CharacterAt {

    public static void main(String[] args) {

        String welcome= "Hello TechnoStudy";


        char index0= welcome.charAt(0);
        char index1= welcome.charAt(1);
        char index2= welcome.charAt(2);
        char index3= welcome.charAt(3);
        char index4= welcome.charAt(4);
        char t= welcome.charAt(6);
        System.out.println(welcome.charAt(0));
        System.out.println(welcome.charAt(1));
        System.out.println(welcome.charAt(2));
        System.out.println(welcome.charAt(3));
        System.out.println(welcome.charAt(4));
        System.out.println(t);


        // Part1: find out the character at 5th index of String "123456789"
        // Part2: find out the character at 5th index of String "0123456789"

        String Test= "123456789";
        char index5th= Test.charAt(5);
        System.out.println(Test.charAt(5));

        String Test1= "0123456789";
        char index5thTwo= Test1.charAt(5);
        System.out.println(Test1.charAt(5));



    }
}
