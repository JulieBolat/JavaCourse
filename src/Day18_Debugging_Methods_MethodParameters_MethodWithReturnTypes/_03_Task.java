package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

public class _03_Task {

        //create a method that takes two numbers and prints out their sum

        public static void main(String[] args) {

            sumOfTwoNumbers(10,90);
        }

    public static void sumOfTwoNumbers (int number1, int number2) {

        int sum= number1+number2;

        System.out.println("Sum of two number:" + sum);

    }

}
