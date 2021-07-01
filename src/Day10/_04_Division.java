package Day10;

public class _04_Division {
    public static void main(String[] args) {

        //division using only values
        System.out.println(9/3);

        int  x= 15;
        int y= 4;
        System.out.println(x/y); //since the values are integer, the result will be 3.

        int result = x/y;
        System.out.println(result);

        //double result2= x/y;
        // still answer 3, converting one integer will be enough
        double result2=(double) x/y;
        System.out.println(result2);

        System.out.println((double)x/y);



    }
}
