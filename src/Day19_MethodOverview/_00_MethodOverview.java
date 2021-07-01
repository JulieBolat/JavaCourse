package Day19_MethodOverview;

public class _00_MethodOverview {

    public static void main(String[] args) {

        String str= "TechnoStudy";

        //str.charAt(0);
        //this is below how we can write it, too
        //If it is a character, I can store it inside of char

        // char chr= 'T'; (It is same with below)

        char chr= str.charAt(0);

        printNumbers();

        printNumbers2(9);
        printNumbers2(1);

       int number= returnInteger(5);

    }

    public static void printNumbers () { //don't have parameter
        System.out.println(5);

    }

    public static void printNumbers2(int number) { //we have int number as a parameter
        System.out.println(number);

    }
    public static int returnInteger(int number) { //this number takes int number as parameter and return number

        return number;
    }

}

