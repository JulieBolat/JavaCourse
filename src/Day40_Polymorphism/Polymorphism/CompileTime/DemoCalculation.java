package Day40_Polymorphism.Polymorphism.CompileTime;

public class DemoCalculation {

    public static void main(String[] args) {

        // Compile Time Polymorphism
        // We achieve by using method overloading

        Calculation.add(3, 8); // accepts 2 integers

        Calculation.add(4.3, 8.9); // accepts 2 doubles

        Calculation.add(1, 75, 12); // accepts 3 integers

        Calculation.add(3.3, 14.7, 33.0); // accepts 3 doubles

    }

}