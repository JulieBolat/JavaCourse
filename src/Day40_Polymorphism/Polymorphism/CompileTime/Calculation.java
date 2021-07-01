package Day40_Polymorphism.Polymorphism.CompileTime;

public class Calculation {

    public static void add(int a, int b){
        System.out.println("This is sum of 2 integers: " + a+b);
    }

    // Overloading
    public static void add(double a, double b){
        System.out.println("This is sum of 2 doubles: " + a+b);
    }

    // Overloading
    public static void add(int a, int b, int c){
        System.out.println("This is sum of 3 integers: " + a+b+c);
    }

    // Overloading
    public static void add(double a, double b, double c){
        System.out.println("This is sum of 3 doubles: " + a+b+c);
    }

}