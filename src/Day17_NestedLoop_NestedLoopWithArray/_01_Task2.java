package Day17_NestedLoop_NestedLoopWithArray;

public class _01_Task2 {

    public static void main(String[] args) {

        //April 30, Lesson 1
        //print the following pattern
        //*
        //**
        //***
        //****

        for (int i= 0; i<4; i++) {

            for (int j=0; j<=i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }



    }
}
