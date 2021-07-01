package Day10;

public class _08_Decrement {

    public static void main(String[] args) {
        // decrement: decrease the value by 1

        int x = 5;
        --x; // x = x - 1;

        System.out.println(x);

        int y = 10;

        // post-increment, value is returned first, then it is decreased by 1
        System.out.println(y--);
        System.out.println(y);

        int z= 11;
        System.out.println("");
        System.out.println(--z);
        System.out.println(z);

    }
}
