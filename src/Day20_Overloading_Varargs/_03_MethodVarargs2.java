package Day20_Overloading_Varargs;

public class _03_MethodVarargs2 {

    public static void main(String[] args) {

        System.out.println(sum(5.6,6,7,3,2,1));

    }

    // varargs always should be last parameter
    public static double sum(double a, int... varargs){

        double sum = a;

        for (int i = 0; i < varargs.length; i++){
            sum += varargs[i];
        }
        return sum;
    }
}
