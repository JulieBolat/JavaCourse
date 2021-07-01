package Mentoring.May24;

import java.util.ArrayList;

public class PracticeIterator {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        list.add("I");
        list.add("love");
        list.add("to");
        list.add("study");
        list.add("in");
        list.add("TechnoStudy");

        System.out.println(list);

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }


}
