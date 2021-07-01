package Day23_Set_PrintElementInSet;

import java.util.HashSet;

public class _04_SetTask {

    //May 11, Lesson 3
    // create a method that takes set and varargs of Char and adds all elements to the set
    // create a method that takes set and Char[], method should adds all elements to the set

    public static void addElementToSet(HashSet<Character> set, Character...chars) {
        for (int i=0; i< chars.length; i++)
            set.add(chars[i]);
    }

    public static void addElementToSetAsArray(HashSet<Character> set, Character[] array) {
        for (int i=0; i<array.length; i++)
            set.add(array[i]);
        
    }

}
