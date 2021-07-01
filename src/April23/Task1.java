package April23;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        //Create an array of chars. {%, f, F, @, 5, a, 7, T, #} and sort starting from char F up to char 7

        char [] charArrays= {'%', 'f', 'F', '@', '5', 'a', '7', 'T', '#'};
        Arrays.sort(charArrays);
        System.out.println(charArrays);

        Arrays.sort(charArrays, 2, charArrays.length-3);
        System.out.println(Arrays.toString(charArrays));

    }
}
