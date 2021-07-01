package Day16_DoWhileLoops_Break_ForEachLoop;

public class _05_ForEachLoopTask {

    public static void main(String[] args) {

        //print array with for each loop
        //print the length of each element

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String element: list) {
            System.out.println(element+ " " + element.length());

        }

    }
}
