package Day25_Collections_Converting_May17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _01_CollectionsTask {

    // create list of 5 numbers from user input
    // sort the list in reverse order(!= reversing) and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<5; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("This is reverse ordered list:" + list);

        Collections.shuffle(list);
        System.out.println("Shuffled list:" + list);

        Collections.rotate(list, 3);
        System.out.println("Rotated to right by 3 places:" + list);

        //Part2

        Integer max= Collections.max(list);
        Integer min= Collections.min(list);

        System.out.println("Max Number:" + max);
        System.out.println("Min Number:" +min);

        Collections.replaceAll(list, max, min);
        System.out.println("Replace with new value:"+ list);
    }

}
