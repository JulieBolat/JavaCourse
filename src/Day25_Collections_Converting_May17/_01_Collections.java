package Day25_Collections_Converting_May17;

import java.util.*;

public class _01_Collections {

    public static void main(String[] args) {
        //May 17th Lesson 1

        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 7; i++){
            list.add(rnd.nextInt(10));
            set.add(rnd.nextInt(10));
        }

        System.out.println("This is LIST: " + list);

        Integer[] arr = {99, 44, 55, 22};

        Collections.addAll(list, arr); // to add multiple elements to list/set

        Collections.sort(list); // sorts list in ascending order (natural order)
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // sorts elements in descending order
        System.out.println(list);

        Collections.shuffle(list); // shuffles list randomly
        System.out.println(list);

        Collections.rotate(list, -2); // negative numbers will rotate to left
        System.out.println(list);

        Collections.replaceAll(list, 2, 99); // all the values that we provide updated to new value
        System.out.println(list);

        // [7, 3, 5, 4, 8, 9, 3] -> [3, 9, 8, 4, 5, 3, 7] reverse list
        // [7, 3, 5, 4, 8, 9, 3] -> [9, 8, 7, 5, 4, 3, 3] descending order

        Integer max = Collections.max(list); // to find max number in list
        Integer min = Collections.min(list); // to find min number in List

        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);

        System.out.println("This is SET: " + set);

        Integer maxOfSet = Collections.max(set);
        Integer minOfSet = Collections.min(set);

        System.out.println("Max number for SET: " + maxOfSet);
        System.out.println("Min number for SET: " + minOfSet);


        Collections.sort(list);
        int search = Collections.binarySearch(list, 5); // to do binary search you should sort the list first
        System.out.println(search);
    }
}
