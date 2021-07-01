package Day34_AccessModifier_Jun1.AccessModifiersTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_FinalWithReferenceTypes {

    public static void main(String[] args) {

        final String [] MONTHS = {"January", "February", "March",
                "April", "May", "June",
                "July" , "August", "September",
                "October" , "November", "December"};

        System.out.println(Arrays.toString(MONTHS));

        //MONTHS = new String [5]; wrong

        MONTHS[0]= "First Month";
        System.out.println(Arrays.toString(MONTHS));


        //Another Task below

        final ArrayList<String> list = new ArrayList<>();

        list.add("Text1");
        list.add("Text2");



    }
}
