package Day20_Overloading_Varargs;

public class _02_MethodVarargs {

    //Variable Arguments
    public static void main(String[] args) {

        System.out.println("The sum1:" + sum(1,4,78,3,6,10,4));
        System.out.println("The sum2:" + sum(1, 6));

    }
    // A variable-length arguments is specified by 3 dots (...)
    public static int sum(int... varargs){
        int sum = 0;

        for (int i = 0; i < varargs.length; i++){
            sum += varargs[i];
        }

        return sum;
    }

    // instead of using the code below we can use varargs

//    public static int sum(int a, int b){
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c){
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
}
