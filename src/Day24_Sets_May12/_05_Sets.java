package Day24_Sets_May12;

import java.util.HashSet;
import java.util.Set;

public class _05_Sets {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set); //even though output is [1,2,3]
        //that does not mean HashSets are ordered
    }
}
