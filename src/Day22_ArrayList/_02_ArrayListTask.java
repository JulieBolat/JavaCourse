package Day22_ArrayList;

import java.util.ArrayList;

public class _02_ArrayListTask {

    public static void main(String[] args) {
        // create an arraylist of Strings
        // add Red, Green and Blue inside
        // print out all the elements, each element on new line

        ArrayList<String> colors= new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println(colors);

        for (int i=0; i<colors.size(); i++) {
            System.out.println(colors.get(i));
            //System.out.println(colors[i]);

        }

        //if you don't need index, you can use this method
        for (String color: colors) {
            System.out.println(color);
        }

        addElementAtFirstPosition(colors, "Black");
        System.out.println(colors);

        addElementBeforeLast(colors, "Purple");
        System.out.println(colors);

    }

         // Part2: create a method that accepts an arraylist and element
         // it should add the element at the first position to arraylist
         public static void addElementAtFirstPosition(ArrayList<String> list, String element) {
         list.add(0, element);

    }

         // Part3: create a method that accepts an arraylist and element
         // it should add element before last  [1, 2, 3]  -> [1, 2, 4, 3]

         public static void addElementBeforeLast (ArrayList<String>list, String element) {
         list.add(list.size()-1, element);
         }

}
