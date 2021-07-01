package Day12_IfElse;

import java.util.Random;

public class TEST3_Random {
    public static void main(String[] args) {
        //generate random number between -100 and 100
        //Use Math.random method

        Random random= new Random();
        //int randomNumber= random.nextInt(200)-100;
        //System.out.println(randomNumber);

        //generate random number between 25 and 390

        int min= 25;
        int max= 390;
        int randomNumberBetween25and390= (int) (Math.random()* (max-min) +min);
        System.out.println(randomNumberBetween25and390);



    }
}
