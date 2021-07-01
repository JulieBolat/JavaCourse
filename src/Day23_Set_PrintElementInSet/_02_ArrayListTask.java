package Day23_Set_PrintElementInSet;

import java.util.ArrayList;
import java.util.Random;

public class _02_ArrayListTask {
    //May 11, Lesson 1

    // create an array list of 4 random integers  (Main)
    // create a method that adds element at random position
    // public static void addAtRandomPosition(ArrayList<Integers> list, Integer element)

    // create an array list of 4 random integers  (Main)
    // create a method that adds element at random position
    // public static void addAtRandomPosition(ArrayList<Integers> list, Integer element)

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Random rnd = new Random();

        for (int i = 0; i < 4; i++)
            list.add(rnd.nextInt());

        System.out.println(list);

        addAtRandomPosition(list, 0);

        System.out.println(list);

    }

    public static void addAtRandomPosition(ArrayList<Integer> list, Integer element){
        Random rnd = new Random();
        int index = rnd.nextInt(list.size()); // from 0 to list.size() - 1 | since nextInt method doesn't include the bound we can just say size
        list.add(index, element);
    }
}
