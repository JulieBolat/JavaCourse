package Day10;

public class _05_NumericPromotionDefault {
    public static void main(String[] args) {

        byte x= 2;
        byte y= 4;

        int result= x+y;
        System.out.println(result);
        //all values by default are integers

        byte results2= (byte) (x+y);
        System.out.println(results2);
    }
}
