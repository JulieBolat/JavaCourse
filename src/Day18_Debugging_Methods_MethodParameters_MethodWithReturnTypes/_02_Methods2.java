package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

public class _02_Methods2 {

    public static void main(String[] args) {

        greetUser(); // System.out.println("Hello!")
        greetUser();
        greetUser();
        printHelloWorld();
        printHelloWorld();
    }
    public static void greetUser(){

        System.out.println("Hello!");

    }
    public static void printHelloWorld(){

        System.out.println("Hello World!");
    }

}
