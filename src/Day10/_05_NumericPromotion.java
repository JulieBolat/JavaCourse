package Day10;

public class _05_NumericPromotion {
    public static void main(String[] args) {
        int intNumber = 5;
        long longNumber = 5;

        int result = (int) (intNumber + longNumber); //needs to convert long to int
        long result2 = intNumber + longNumber; //int directly converts
        byte result3 = (byte) (intNumber + longNumber); //needs to convert long to byte

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }


}
