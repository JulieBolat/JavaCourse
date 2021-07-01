package MortgageCalculatorProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    //May 6th, Lesson 1

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT= 100;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Principal:");
        int principal= scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        float annualInterest= scanner.nextFloat();
        float monthlyInterest= annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (Years):");

        byte years= scanner.nextByte();
        int numberOfPayments= years * MONTHS_IN_YEAR;

        double mortgage= principal *(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))
                /(Math.pow(1+monthlyInterest, numberOfPayments)-1);

        NumberFormat format= NumberFormat.getCurrencyInstance();

        String result= format.format(mortgage);
        System.out.print("Your monthly payment is:" + result);


    }
}
