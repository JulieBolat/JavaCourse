package Day17_NestedLoop_NestedLoopWithArray;

public class _01_NestedLoops {
    public static void main(String[] args) {

        //loop inside the for loop

        for (int i=0; i<5; i++) {
            System.out.println("i=" + i);

            for (int j=0; j<5; j++) {
                System.out.println("            " +j);
            }
        }

    }
}
