package Day4.TypeCasting;

public class ImplicitCasting {

    public static void main(String[] args) {

        //Implicit Casting (Automatically) - Widening Casting

        //// byte > short > integer > long > float > double

        byte  byteNumber = 50;
        short shortNumber = byteNumber;
        System.out.println(shortNumber);
       // Java will convert byte to short

        short shortNumber2 = 2222;
        int integerNumber = shortNumber2;

        System.out.println(integerNumber);

        int integerNumber1 = 100;
        long longNumber = integerNumber1;

        System.out.println(integerNumber1);

        short x= 1;
        //int anonymous = 1; //Java creates an anonymous variable, we do not know where that variable is stored in our memory. And Java copies our short value to that integer.
        int y = x+3;
        System.out.println(y);

        float floatNumber = 1.354F;
        double doubleNumber= floatNumber;

       System.out.println(doubleNumber);


        double a = 1.5;
       // int b= (a + 3);
        //System.out.println(b);

        //Java converts 3 to 3.0 to make it decimal for "double"
        //int b= 1.5 + 3.0;
        //int b= 4.5;


        double a1 = 2.1;
        double b1= a + 1;
        //System.out.println(b1);


        short toFloat = 1;
        float fromShort = toFloat;
        System.out.println(fromShort);


        short A2 = 345;
        long B2 = A2;
        System.out.println(B2);

        float C2 = 34.55F;
        double D2= C2;
        System.out.println(D2);

        byte E2 = 10;
        float F2 = E2;
        System.out.println(F2);

        //Task
        double a5= 1.5;
        int b= (int) a +3;
        System.out.println(b);




    }
}
