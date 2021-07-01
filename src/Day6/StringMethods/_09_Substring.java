package Day6.StringMethods;

public class _09_Substring {

    public static void main(String[] args) {
        String welcome = "Hello TechnoStudy!";
        String substring = welcome.substring(6);
        System.out.println(substring);

        String substring2= welcome.substring (0,6);
        System.out.println(substring2);

        // return the last word from "Hello Techno Study!"

        String lastWord= "Hello Techno Study!";
        String substring3 = lastWord.substring (13,18);
        System.out.println(substring3);

    }


}
