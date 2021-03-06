package Day10;

public class _07_Increment {
    public static void main(String[] args) {

        // increment: increase the value by 1

        int x = 1;
        x++; // x = x + 1; (They are equal to each other)

        //x++  post increment
        //++x pre increment


        System.out.println(x);

        int y = 1;
        int z = y++;

        System.out.println("");
        System.out.println(z);
        System.out.println(y);


        int a = 1;
        int b = ++a;

        System.out.println("");
        System.out.println(b);
        System.out.println(a);


        int f = 5;

        System.out.println("");
        System.out.println(f); // the value of f is 1
        System.out.println(f++); // will print 1, then increase value of f
        System.out.println(f); // will print 2, value of f is 2


        int n = 2;
        System.out.println("");
        System.out.println(n); // int n = 1;
        System.out.println(++n); // n = n + 1;
        System.out.println(n); // n = 2;

        System.out.println("");

        int m = 3;
        System.out.println(m); // int m = 1;
        System.out.println(m++); // m = 1; -> m = m + 1;
        System.out.println(m); // m = 2;



    }
}
