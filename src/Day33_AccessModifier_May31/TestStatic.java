package Day33_AccessModifier_May31;

public class TestStatic {

    public static void print(){
        System.out.println("Print");
    }

    private static void print2(){
        System.out.println("Print2");
    }

    public static void main(String[] args) {

        print2();

    }

}
