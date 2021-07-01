package Day20_Overloading_Varargs;

public class _03_MethodVarargs {

    public static void main(String[] args) {

        System.out.println(allStringInSameLine("Java", "Python", "C++"));

    }

    public static String allStringInSameLine (String...varargs) {
        String allString= "";

        for (int i= 0; i<varargs.length; i++) {
            allString+= varargs[i];
        }
        return allString;
    }
}
