package Day16_DoWhileLoops_Break_ForEachLoop;

public class _04_ContinueInsideLoop {

    public static void main(String[] args) {

        for (int i= 0; i<10; i++) {

            if (i==5) {
                continue;
            }
                    System.out.println(i);
            //continue will move to next iteration
            // when i= 5 this part of code is skipped

        }

    }
}
