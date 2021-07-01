package Day24_Sets_May12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _04_TypesOfSet {

    public static void main(String[] args) {

        //HashSet
        //HashSet <String> set= new HashSet<>();

        Set<String> myHashSet= new HashSet<>();

        myHashSet.add("USA");
        myHashSet.add("France");
        myHashSet.add("Turkey");
        myHashSet.add("China");
        myHashSet.add("Germany");
        myHashSet.add("Mexico");

        System.out.println("This is HashSet:" + myHashSet);

        //Linked HashSet - it stores elements in insertion order

        Set<String> myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("USA");
        myLinkedHashSet.add("France");
        myLinkedHashSet.add("Turkey");
        myLinkedHashSet.add("China");
        myLinkedHashSet.add("Germany");
        myLinkedHashSet.add("Mexico");
        //myLinkedHashSet.add("Mexico"); not allowed duplicated values

        System.out.println("This is LinkedHashSet:" + myLinkedHashSet);


        //TreeSet- sorted - it stores elements in ascending order

        Set<String> myTreeSet= new TreeSet<>();

        myTreeSet.add("USA");
        myTreeSet.add("France");
        myTreeSet.add("Turkey");
        myTreeSet.add("China");
        myTreeSet.add("Germany");
        myTreeSet.add("Mexico");
        // myTreeSet.add("Mexico");  not allowed duplicated values

        System.out.println("This is TreeSet:" + myTreeSet);

    }
}
