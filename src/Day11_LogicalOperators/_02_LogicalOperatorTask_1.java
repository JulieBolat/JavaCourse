package Day11_LogicalOperators;

public class _02_LogicalOperatorTask_1 {

    public static void main(String[] args) {

        String str= "abcdefg";
        System.out.println(str.contains("a") && str.contains("z"));
        System.out.println(!(str.contains("a")) || str.contains("z"));
        System.out.println(str.contains("a") && str.contains("b"));

        System.out.println("");
        boolean b= ! (true&&true); // It will turn to false||false
        System.out.println(b);


    }
}
