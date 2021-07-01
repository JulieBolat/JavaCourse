package Day27_MapTask_May20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class _01_MapTask2 {

    //May 20, Lesson 2

    // PART 1
    // create a map groups and members of group
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]

    // PART 2
    // count how many members each group has

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> groupsAndMembers = new HashMap<>();

        ArrayList<String> sales = new ArrayList<>(Arrays.asList("James", "Joe", "Mark"));
        ArrayList<String> dev = new ArrayList<>(Arrays.asList("Kemal", "Gulsum", "Liping", "Rahima"));

        groupsAndMembers.put("Sales", sales);
        groupsAndMembers.put("Development", dev);

        System.out.println(groupsAndMembers);

        /*
        Set<String> set = groupsAndMembers.keySet(); // -> ["Sales", "Development"]
        groupsAndMembers.get("Sales"); // -> ["James", "Joe", "Mark"]
        */

        //Part 2
        // count how many members each group has

        Set<String> keys = groupsAndMembers.keySet();
        for (String key : keys){
            ArrayList<String> memberOfGroups = groupsAndMembers.get(key);                      // -> ["James", "Joe", "Mark"]
            System.out.println("Number of members in " + key + " " + memberOfGroups.size());  // -> ["Kemal", "Gulsum", "Liping", "Rahima"]
        }


    }

    }

