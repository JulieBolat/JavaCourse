package Day6.StringMethods;

public class _08_StringConcat {
    public static void main(String[] args) {

        String first= "Hello";
        String second = "TechnoStudy";
        String third= "!!";
        String concat= first.concat(second);
        String concat2= concat.concat(third);
        System.out.println(concat2);

        System.out.println(first+second+third);

        String w= "Good";
        String z= " morning!!";
        String y= w.concat(z);
        System.out.println(y);


        String string1 = "01234";
        String string2 = "56789";

        System.out.println(string1.concat(string2));
        System.out.println(string1 + string2);



    }
}
