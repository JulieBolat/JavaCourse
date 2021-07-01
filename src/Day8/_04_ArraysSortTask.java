package Day8;

import java.util.Arrays;

public class _04_ArraysSortTask {
    public static void main(String[] args) {

        int[]a= {1, 25, 7, 11, 19};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));

        System.out.println("min:" + a[0]);
        System.out.println("max:"+ a[a.length-1]);
        System.out.println("middle:"+ a.length/2);


        // create an int array of random numbers of size 5
        // sort the array
        // print the first element as min
        // print the last element as max
        // print the middle element as middle


        int [] newArray= new int [5];
        newArray[0]=5;
        newArray[1]=7;
        newArray[2]=79;
        newArray[3]=13;
        newArray[4]=1;
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        System.out.println("min:" + newArray[0]);
        System.out.println("max:" + newArray[newArray.length-1]);
        System.out.println("middle:"+ newArray[newArray.length/2]);



    }

}
