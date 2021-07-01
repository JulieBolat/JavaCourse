package Mentoring;

public class Task1_05_06 {

    // using while loop create a method which will have an int parameter as maxNumber
    // the method will print all odd numbers
    //example: int maxNumber = 10 output should 1 3 5 7 9

    public static void main(String[] args) {

        for (int i=0; i<=10; i++)

        if (!(i % 2 == 0)){
            System.out.println(i);
        }

    }
}
