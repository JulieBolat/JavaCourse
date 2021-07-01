package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

public class _01_DebuggingJavaApp {

    public static void main(String[] args) {

        //May 3rd, Lesson 1
        //Run Time Error

        /*
        Start
        0
        1
        2
        3
        4
        Finish
         */

        System.out.println("Start");

        for (int i=0; i<6; i=i+2){
        //for(int i=0; i<=4; i++) {
            System.out.println(i);
        }
        System.out.println("Finish");
    }
}
