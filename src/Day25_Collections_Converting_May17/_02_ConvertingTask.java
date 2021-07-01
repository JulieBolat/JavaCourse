package Day25_Collections_Converting_May17;
import java.util.*;
public class _02_ConvertingTask {

    //May 17, Lesson 3

    // create an array of random numbers of size 10(random elements should be from 1 to 9)
    // convert that array into a list and add 5 more random elements
    // convert that list into set
    // convert that set back into list, you'll get a list without duplicates

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i++){
            array[i] = 1 + random.nextInt(9);
        }

        System.out.println("Array with 10 random items: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        for (int j = 0; j < 5; j++){
            list.add(random.nextInt(9) + 1);
        }

        System.out.println("List after adding 5 more items: " + list);

        Set<Integer> set = new HashSet<>(list);

        List<Integer> finalList = new ArrayList<>(set);

        System.out.println("Final List after get rid of duplicates: " + finalList);

    }
}
