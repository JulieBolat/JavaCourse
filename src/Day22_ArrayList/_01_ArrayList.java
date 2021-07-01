package Day22_ArrayList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        //Array: simple fixed sized array
        //ArrayList: Dynamic sized array (also called list)
        //Java ArrayList:
        //can contain duplicate elements
        //can maintain insertion order
        //allows random access because array works at the index basis

        //ArrayList<Integer>arrayList= new ArrayList<>();
        //We need to use wrapper class (Integer), not primitive data types (int)


        int [] array= new int[5]; //this is fixed-size array

        //System.out.println(array[0]);

        ArrayList<Integer> list= new ArrayList<>(); //create an ArrayList

        //adding element (we will need to use "add" element
        //list.add(1);
        list.add(5);
        list.add(2);
        list.add(9);

        //getting element at specific index
        list.get(1);  //result is 2

        //we can store in variable
        Integer elementAtIndex= list.get(1);
        System.out.println(elementAtIndex);

        //add element to specific index (int and Integer: overloaded)
        //list.add(1);
        list.add(0, 1);
        Integer element= list.get(0);
        System.out.println(element);

        //print the ArrayList
        System.out.println(list);


        //it will add the element at the end of the list
        list.add(11);
        System.out.println(list);


        //remove an element at specific index
        list.remove(0);
        System.out.println(list);

        //remove first occurrence of an element. If there was another 11, it would remove only first 11
        Integer elementToRemove= 11;
        list.remove(elementToRemove);
        System.out.println(list);

        //set element at specific index
        //first item was 5 [5,2,9], this method will change first element to 15. ---> [15,2,9]
        list.set(0,15);
        System.out.println(list);

        //get the number of elements in our list---> size method for ArrayList
        int sizeOfList = list.size();
        System.out.println(sizeOfList);

        //remove all elements in ArrayList
        list.clear();
        System.out.println(list);

        //check if ArrayList is empty
        boolean isListEmpty= list.isEmpty();
        System.out.println(isListEmpty);


    }

}
