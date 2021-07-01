package Day18_Debugging_Methods_MethodParameters_MethodWithReturnTypes;

public class _03_MethodsParameters2 {

    public static void main(String[] args) {

        greetUser("Halit", "Kocaaga");
    }


    public static void greetUser(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
