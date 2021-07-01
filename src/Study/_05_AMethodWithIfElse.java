package Study;

public class _05_AMethodWithIfElse {

    // Create a checkAge() method with an integer variable called age
    // If age is less than 18, print "access denied"
    // If age is greater than, or equal to, 18, print "access granted"

    public static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Access denied-You are not old enough!");
        } else {
            System.out.println("Access granted-You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(35);

    }

    }

