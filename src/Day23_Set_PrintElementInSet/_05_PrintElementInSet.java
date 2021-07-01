package Day23_Set_PrintElementInSet;

import java.util.HashSet;

public class _05_PrintElementInSet {

    public static void main(String[] args) {
        // You can use for each loop to print elements in Set

        HashSet<String> set = new HashSet<>();


        set.add("ABC");
        set.add("DEF");
        set.add("GHI");

        for (String element : set) {
            System.out.println(element);

        }

    }
}
