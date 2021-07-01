package Day24_Sets_May12;

import java.util.HashSet;
import java.util.Random;

public class _02_AddedOrNot {

    public static void main(String[] args) {

        HashSet<Integer> set= new HashSet<>();
        Random rnd= new Random();

        for (int i=0; i<5; i++) {
            int random =rnd.nextInt(5);
            boolean isAdded = set.add(random);
            System.out.println(random+ "is added" + isAdded);
        }

        System.out.println(set);

    }
}
