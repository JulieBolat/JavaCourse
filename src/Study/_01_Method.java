package Study;

public class _01_Method {

    public static void myMethod (String names) {
        System.out.println(names);

    }
        public static void main(String[] args) {
            //When a parameter is passed to the method, it is called an argument.
            // So, from the example above: names is a parameter, while Liam, Jenny and Anja are arguments.

            myMethod ("Liam");
            myMethod("Jenny");
            myMethod("Anja");
    }
}
