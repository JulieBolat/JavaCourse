package Study;

public class _02_MultipleParameters {

    public static void myMethod (String name, int age) {
        System.out.println(name+ " is " + age);

    }
    public static void main(String[] args) {
        myMethod ("Liam", 5);
        myMethod("Jenny", 10);
        myMethod("Anja", 7);


        //Note that when you are working with multiple parameters,
        // the method call must have the same number of arguments as there are parameters,
        // and the arguments must be passed in the same order.
    }
}
