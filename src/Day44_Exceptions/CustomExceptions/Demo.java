package Day44_Exceptions.CustomExceptions;

public class Demo {

    public static void main(String[] args) {

        int[] arr = {10,11,12,13,14,15};

       printArrayElement(arr, 20);

    }

    public static void printArrayElement(int[] arr, int index){
        if (index > arr.length-1){
            throw new JavaIsEasyPeasy();
        }
        System.out.println(arr[index]);
    }


}
