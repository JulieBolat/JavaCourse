package Day12_IfElse;

public class RandomNumber2 {
    public static void main(String[] args) {

        // -50>-------------------0----------------->50
        int randomNumber= (int) (Math.random()*100-50);


        //It is how to create a range.
        //the range will be between -93 to 93????
        int min=5;
        int max= 90;
        int randomNumber1= (int) (Math.random()* (max-min) +min);
        System.out.println(randomNumber1);

        //generate random number between 25 and 390
        int min1=1;
        int max1= 100;

        int randomNumber2= (int) (Math.random()*(max1-min1) +min1); //this is the formula to use to get random ranges
        System.out.println(randomNumber2);




    }
}
