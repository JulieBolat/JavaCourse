package Day7.StringMethods;

public class _15_ReplaceAll {
    public static void main(String[] args) {

        String s1= "My name is Khan. My name is Bob. My name is Sonoo";
        String s2= s1.replaceAll("is", "was");
        System.out.println(s2);

        //Replace all is the same to replace but it does more. It can replace selected range.
        //regex regular expression

        String s3= "javatpoint is a very good website";
        String s4= s3.replaceAll("a", "e");
        System.out.println(s4);

        //replaces all occurrences of "a" to "e"

    }

}
