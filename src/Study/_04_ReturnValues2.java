package Study;

public class _04_ReturnValues2 {

    //This example returns the sum of a method's two parameters:

    public static int myMethod (int x, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        int z=myMethod(5,3);
        System.out.println(myMethod(5,3));
        System.out.println(z);
        //You can also store the result in a variable (recommended, as it is easier to read and maintain):
    }
}
