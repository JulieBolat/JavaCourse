package Day17_NestedLoop_NestedLoopWithArray;

public class _01_Task1 {

    public static void main(String[] args) {

        //print a square 4x4 wide out of '*' character
        //****
        //****
        //****
        //****

        for (int i=0; i<4; i++) {
            //i=0, then check the next condition, it will print ****
            //i=1, then check the condition, it will print another ****

            for (int j=0; j<4; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
