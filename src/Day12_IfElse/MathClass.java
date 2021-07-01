package Day12_IfElse;

public class MathClass {
    public static void main(String[] args) {

        //4 22 Lesson 2

        int a=1;
        int b= 2;
        int c= -3;
        // Absolute,Max, Min
        System.out.println(Math.abs(c)); //abs will print absolute value
        System.out.println(Math.max(a,b)); //max method will print the greatest number
        System.out.println(Math.min(a,b));
        System.out.println(Math.min(a,-4)); //We can use number, too

        //Round Method
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.6));

        //Ceil Method will round up always. Returns double only
        System.out.println(Math.ceil(7.4));
        System.out.println(Math.ceil(7.5));
        System.out.println(Math.ceil(7.6));

        System.out.println((int)Math.ceil(1.5));

        //Floor Method | round in direction is always. It accepts double and returns double
        System.out.println(Math.floor(7.4));
        System.out.println(Math.floor(7.5));
        System.out.println(Math.floor(7.6));

        System.out.println((int)Math.floor(5.5));

        //Square Foot and Power
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2,5));

        //Random Method (It returns double)
        //return double between 0-1
        System.out.println("");

        System.out.println(Math.random());
        System.out.println((int)Math.random()*100); //returns an integer between 0-100
        System.out.println(Math.round(Math.random() *100));

        int result= (int) Math.round(Math.random()*100);
    }
}
