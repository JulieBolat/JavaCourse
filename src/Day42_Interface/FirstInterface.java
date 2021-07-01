package Day42_Interface;

public interface FirstInterface {

    // "public" keyword is unnecessary
    // because all the methods are by default "public" in Interfaces!
    public void method();

    // "abstract" keyword is unnecessary
    // because all the methods are by default "abstract" in Interfaces!
    abstract void method2();

    // Variables in Interfaces are by default "public", "static" and "final"
    public int variable1 = 10;
    static double variable2 = 10;
    final boolean variable3 = true;

}
