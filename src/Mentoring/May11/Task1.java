package Mentoring.May11;

public class Task1 {

    public static void main(String[] args) {
        // Create a method with int [] return ,
        // the array should consist of inner arrays of original.

        // {{2,4,6,8},{1,3,5,7,9},{0,1,2,3,4,5},{9,8,7,5,6,4,3},{4,5,6,7,8,9} };
        // {20, 26, 15 .. }

        int [][] array= {{2,4,6,8},{1,3,5,7,9},{0,1,2,3,4,5},{9,8,7,5,6,4,3},{4,5,6,7,8,9} };


    }

    public static int[] getTotalInnerArray (int[][] twoDArray) {

        int[] result= new int [twoDArray.length];

        for( int i= 0; i<twoDArray.length; i++) {
            int total= 0;
            for (int i1=0; i1<twoDArray[i].length; i1++) {
                total+=twoDArray[i][i1];

            }
            result[i]= total;
        }

        return null;

    }
}
