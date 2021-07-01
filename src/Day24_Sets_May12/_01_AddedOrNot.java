package Day24_Sets_May12;

import java.util.HashSet;

public class _01_AddedOrNot {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(98879);
        set.add(5);
        set.add(78);
        set.add(1);

        boolean isAdded = set.add(3);

        System.out.println(set);
        System.out.println(isAdded);

    }
}
