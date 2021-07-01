package Day23_Set_PrintElementInSet;

import java.util.ArrayList;
import java.util.HashSet;

public class _03_Set {
    public static void main(String[] args) {

        //Set
        //Lists can include duplicate elements. However, sets cannot have duplicate elements.
        //Elements in lists are stored in some order.

        HashSet<Integer> set= new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(9);
        set.add(5);
        set.add(9);
        set.add(3);
        System.out.println(set);
        System.out.println("Size:" +set.size());
        System.out.println("is empty?-->" + set.isEmpty());
        System.out.println("does set contain 8?-->" + set.contains(8));
        System.out.println("does set contain 9?-->"+ set.contains(9));
        set.remove(5);
        System.out.println("Print set after removing 5:-->" + set);
        set.clear();
        System.out.println("Print set after clear method:--?" + set);

        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(9);
        list.add(3);
        System.out.println("Array will print all items-->" + list);

    }

}
