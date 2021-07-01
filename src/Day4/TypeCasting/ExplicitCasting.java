package Day4.TypeCasting;

public class ExplicitCasting {

    public static void main(String[] args) {

        //In Java, we have two types of casting:
        //Implicit: happens automatically when we store a value in a larger or more precise data type.
        //Explicit: we do it manually.

        long myLong = 289736L;
        int myInteger = (int) myLong;

        System.out.println(myInteger);

        int myInteger2 = 5555;
        short myShort = (short) myInteger2;

        System.out.println(myShort);

        double myD =123456789;
        float myF = (float) myD;
        System.out.println(myF);


        double myDouble = 2.55;
        float myFloat= (float) myDouble;
        System.out.println(myFloat);


        float toShort = 5.1F;
        short fromFloat = (short) toShort;
        System.out.println(fromFloat);


        double myDouble1 = 2.55;
        int myInt1= (int) myDouble;
        System.out.println(myInt1);

        short shortNumber = 129;
        byte byteNumber = (byte) shortNumber;
        System.out.println(byteNumber);

        //        short shortNumber = 129;
        //        byte byteNumber = (byte) shortNumber; // because short is bigger then byte, it will overflow on the other side
        //
        //        System.out.println(byteNumber); // it will overflow by 2
        //
        //
        //        -128              127
        //       <------------------->
    }
}
