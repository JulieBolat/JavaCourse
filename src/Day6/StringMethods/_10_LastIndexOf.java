package Day6.StringMethods;

public class _10_LastIndexOf {

    public static void main(String[] args) {

        String message = "Hello Techno Study";

        int firstIndexSpace= message.indexOf ('l');
        System.out.println(firstIndexSpace);


        int lastIndexSpace= message.lastIndexOf("l");
        System.out.println(lastIndexSpace);

        //return the last word
        // lastIndex and Substring   ("Hello Techno Study!")

        String myString= "Hello to Techno Study!";

        int lastIndexOfSpace= myString.lastIndexOf(" "); //give space here

        String result= myString.substring(lastIndexOfSpace + 1);

        System.out.println(result);






    }
}
