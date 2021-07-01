package Day15_WhileLoop;

public class TEST2 {
    public static void main(String[] args) {

        // Task 2: Write a program to calculate the sum of first 10 natural number.

        int value = 0;

        for (int i = 0; i <= 10; i++) {

            value += i;  //sum=sum +i
        }
        {
            System.out.println("SUM=" + value);

        }
    }
}
