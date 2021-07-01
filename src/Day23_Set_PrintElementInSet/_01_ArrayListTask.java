package Day23_Set_PrintElementInSet;

import java.util.ArrayList;
import java.util.Random;

public class _01_ArrayListTask {

    // create a method that will generate arrayList of 5 doubles with random double values (0 - 100)
    // create a method that takes a list and returns it's total sum
    // create a method that takes a list and returns it's average

    // part 2:
    // create a method that return index of the biggest number
    // public static int max(ArrayList<Double> list)

    public static ArrayList<Double> randomListGenerator(){
        ArrayList<Double> newArrayList = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 5; i++)
            newArrayList.add(rnd.nextDouble() * 100);

        return newArrayList;
    }

    public static double sumOfList(ArrayList<Double> list){
        double sum = 0.0;

        for (double number : list){
            sum += number;
        }
        return sum;
    }

    public static double averageOfList(ArrayList<Double> list){
        double average = sumOfList(list) / list.size();

        return average;
    }

    public static int maxElementInList(ArrayList<Double> list){
        double maxNumber = list.get(0);

        for (Double element : list){
            if (element > maxNumber){
                maxNumber = element;
            }
        }
        return list.indexOf(maxNumber);
    }



    public static void main(String[] args) {

        ArrayList<Double> list = randomListGenerator();
        System.out.println(list);

        double sum = sumOfList(list);
        System.out.println("Sum: " + sum);

        double average = averageOfList(list);
        System.out.println("Average: " + average);

        int maxNumberIndex = maxElementInList(list);
        System.out.println("Index of max number: " + maxNumberIndex);


    }
}
