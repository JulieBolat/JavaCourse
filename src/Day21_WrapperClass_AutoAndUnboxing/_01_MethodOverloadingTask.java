package Day21_WrapperClass_AutoAndUnboxing;

public class _01_MethodOverloadingTask {
    // Method Types

    public static void voidMethod(){ // void methods don't return

        System.out.println("Void Method");
    }

    public static void voidMethodWithParameters(int number){
        System.out.println(number);
    }

    public static int returnIntWithoutParameter(){
        return 1;
    }

    // overloading
    // method name should be same - they should be in same class
    public static int returnIntWithParameters(int a){
        return a;
    }

    // overloading
    public static double returnIntWithParameters(double a){
        return a;
    }
}
