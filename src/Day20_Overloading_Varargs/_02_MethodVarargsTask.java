package Day20_Overloading_Varargs;

public class _02_MethodVarargsTask {

    // Create a multiply method with double varargs

    public static void main(String[] args) {
        System.out.println(multiply(1.3,5.0,10.5));

//        Jvm stores all arguments inside an array
//        double[] array = {1, 5.9, 9.4};

    }
    public static double multiply(double... varargs){
        double product = 1;

        for (int i = 0; i < varargs.length; i++){
            product *= varargs[i];
        }
        return product;
    }
}
