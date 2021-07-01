package Day10;

public class _09_Assignment {

    public static void main(String[] args) {

        int x= 1; //simple assignment of value
        int y= x; //assignment of variable x's value to y
        System.out.println(y);

        x= x+4; //assigning a new value to x, old value of x plus 4
        System.out.println(x);

        y+=4; //y=y+4; (shortcut)
        System.out.println(y);

        y-=3;
        System.out.println(y);

        y*=5; //y=y*5;
        System.out.println(y);

        y/=2; //y=y/2; divided value of y by 2
        System.out.println(y);

        y%=2; //y=y%2; take the modulus of y and assign it to y
        System.out.println(y);

        int z= 5;
        z/= 3;
        System.out.println(z);


    }
}
