package Day27_MapTask_May20;

import java.util.HashMap;

public class _01_MapTask {
    public static void main(String[] args) {

        //May 20, Lesson 1

        // check, does this map contain key "Six"
        // if not put the it as "Six" = 6

        // part 2: check does this map contain key "Three"
        // if yes, change the value of it to 33

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        // first solution
        Integer value = hashMap.get("Six");
        if (value == null){ // map doesn't contain key "Six"
            hashMap.put("Six",6);
        }
        System.out.println(hashMap);

        // second solution
        if (!hashMap.containsKey("Six")){ // if map doesn't contain key "Six"
            hashMap.put("Six", 6);
        }
        System.out.println(hashMap);

        // third solution
        hashMap.putIfAbsent("Six", 6);

        // PART 2

//        first solution
        Integer value2 = hashMap.get("Three");
        if (value2 != null){ // map contains key "Three"
            hashMap.put("Three", 33);
        }


//          second solution
        if (hashMap.containsKey("Three")){
            hashMap.put("Three", 33);
        }

        System.out.println(hashMap);

    }

    }

