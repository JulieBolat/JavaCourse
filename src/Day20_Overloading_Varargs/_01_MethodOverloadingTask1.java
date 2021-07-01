package Day20_Overloading_Varargs;

public class _01_MethodOverloadingTask1 {
    public static void main(String[] args) {
        //May 6th, Lesson 2

        // 1.create a multiply method, that takes two integers and returns their product as integer
        // 2.create a multiply method, that takes three integers and returns their product as integer
        // 3.create a multiply method, that takes two doubles and returns their product as double
        // 4.create a multiply method, that takes three doubles and returns their product as double
        // 5.create a multiply method, that takes one double and one integer and returns their product as double
        // 6.create a multiply method, that takes one integer and one double and returns their product as integer

        System.out.println(multiply(5,9));
        multiply(5, 9);
        multiply(5, 7,3);
        multiply(5.3, 7.1);
        multiply(6.4, 8.2, 3.7);
        multiply(5.8, 4);
        multiply(7, 1.3);
    }


    public static int multiply (int a, int b) {
        return a*b;
    }

    public static int multiply (int a, int b, int c) {
        return a*b*c;
    }

    public static double multiply (double a, double b) {
        return a*b;
    }

    public static double multiply (double a, double b, double c) {
        return a*b*c;
    }

    public static double multiply (double a, int b) {
        return a*b;
    }

    public static int multiply (int a, double b) {
        return (int) (a*b);
    }
}
