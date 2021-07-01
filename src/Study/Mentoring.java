package Study;

public class Mentoring {

    public static void main(String[] args) {

        String phn = "678.571.5657";
        int numb = phn.lastIndexOf("7");
        System.out.println(numb);
        System.out.println(phn.replace(".","-" ).replace(phn.charAt(numb), '8'));
    }
}
