package Day45_StringBuffer.ExceptionTasks;

import java.util.ArrayList;
import java.util.Collections;

public class ExceptionTask3 {

    public static void main(String[] args) {
        // 1) where does exception occur
        // 2) catch and handle specific exception
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,null);
        try {
            arrayList.get(4);
        } catch (IndexOutOfBoundsException ex){
            System.out.println("The index does not exist!");
        }

        try {
            Collections.max(arrayList);
        } catch (NullPointerException ex){
            System.out.println("Cannot get max if there is a null value!");
        }
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(0,null);
        System.out.println(arrayList);
    }

}
