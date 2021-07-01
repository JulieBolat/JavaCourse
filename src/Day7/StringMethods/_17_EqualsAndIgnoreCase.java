package Day7.StringMethods;

public class _17_EqualsAndIgnoreCase {

    public static void main(String[] args) {

        //The java.lang.String.equalsIgnoreCase() method compares this String to another String,ignoring case considerations.
        // Two strings are considered equal ignoring case if they are of the same length

        String string1 = "TechnoStudy";
        String string2 = "TechnoStudy";
        String string3 = "technostudy";

        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3)); // considering case, they are not equal

        System.out.println(string1.equalsIgnoreCase(string2));
        System.out.println(string1.equalsIgnoreCase(string3));

        System.out.println(" ");

        String new1= "ABCD";
        String new2= "abcd";
        System.out.println(new1.equalsIgnoreCase(new2));
    }
}
