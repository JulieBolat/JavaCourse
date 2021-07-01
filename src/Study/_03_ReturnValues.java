package Study;

public class _03_ReturnValues {

    //The void keyword, used in the examples above, indicates that the method should not return a value.
    // If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    // instead of void, and use the return keyword inside the method:

    public static int myMethod (int x) {
        return 5+x;

    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}
