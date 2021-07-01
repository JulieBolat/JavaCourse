package Day17_NestedLoop_NestedLoopWithArray;

public class _01_Task3 {

    public static void main(String[] args) {

        //print the multiplication table for all numbers from 1 to 10

        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++)
                System.out.println(i+ "X" + j +"=" + (i*j));
        }

        System.out.println();
    }
}