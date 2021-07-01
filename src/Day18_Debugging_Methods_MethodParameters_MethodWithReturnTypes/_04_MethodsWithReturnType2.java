package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

public class _04_MethodsWithReturnType2 {
    public static void main(String[] args) {

        int sum = sumOfTwoNumbers(6,7);  // = 13

        System.out.println(sum);
    }

    public static int sumOfTwoNumbers(int number1, int number2) {

        int sum = number1 + number2;

        return sum;

    }

}
