package Day5.StringMethods;

public class _06_IndexOf {
    public static void main(String[] args) {

        String welcome = "Welcome to TechnoStudy!";
        int indexOfE = welcome.indexOf("e");
        System.out.println(indexOfE);

        int indexOfT = welcome.indexOf("T"); //case sensitive
        System.out.println(indexOfT);


        String testNumber= "123456789";
        int lengthOfString = testNumber.length();
        System.out.println(lengthOfString);

        String secondNumber= "01234567890";
        int lengthOfString1= secondNumber.length();
        System.out.println(lengthOfString1);

        // part1: find the index of 4 in "0.12345678"
        // part2: find the index of . in "0.12345678"

        String fourthIndex= "0.12345678";
        int indexOfFour= fourthIndex.indexOf("4");
        System.out.println(indexOfFour);

        String num2= "0.12345678";
        int indexOfTwo= num2.indexOf(".");
        System.out.println(indexOfTwo);

        String myFirstString = "0.12345678";
        int indexOf1 = myFirstString.indexOf("4");
        System.out.println(indexOf1);

        int indexOf2 = myFirstString.indexOf(".");
        System.out.println(indexOf2);

        String var1= "0123456789";
        int var2= var1.indexOf("0");
        System.out.println(var2);









    }
}
