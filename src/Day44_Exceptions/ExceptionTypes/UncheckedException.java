package Day44_Exceptions.ExceptionTypes;

public class UncheckedException {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        try {
            System.out.println(arr[20]);
        } catch (Exception ex) {
            System.out.println("This index is invalid!");
        }

    }

}
