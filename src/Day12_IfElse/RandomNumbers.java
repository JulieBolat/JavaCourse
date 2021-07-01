package Day12_IfElse;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        System.out.println(Math.random()*100);

        Random random= new Random();

        int randomNumber= random.nextInt(100); //We can put bound to narrow down the range 0-100
        System.out.println(randomNumber);

        int numberBetween5and100= random.nextInt(95)-5; //-5 to 90
        System.out.println(numberBetween5and100);

        //generate random number between -100 and 100
        //Use Math.random method

        int randomInteger= (int) (Math.random() *200) -100; //-100 to 100
        System.out.println("Between -100 and 100-->" + randomInteger);







    }
}
