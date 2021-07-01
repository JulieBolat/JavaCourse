package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

public class _04_MethodsWithReturnType {

    public static void main(String[] args) {

        //May 3rd, Lesson 3
        String myMethod= greetUser();

        System.out.println(myMethod);

        int length= myMethod.length();
    }

    public static String greetUser() {

        String greetMessage= "Hello";

        return greetMessage;
    }

}
