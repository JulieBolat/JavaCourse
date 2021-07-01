package Day26_Collections_Map_May18;

import java.util.HashMap;
import java.util.Set;

public class Task {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2

    // part 2: print all the keys of the map
    public static void main(String[] args) {

        HashMap<Integer, String> cityAndZip = new HashMap<>();
        cityAndZip.put(26343, "Cliffside Park");
        cityAndZip.put(32131, "Plainsboro");
        cityAndZip.put(12345, "London");

        Set<Integer> keys = cityAndZip.keySet();

        for (Integer key : keys){
            String value = cityAndZip.get(key);
            System.out.println(key + "=>" + value);
        }

        System.out.println(keys);
    }
}
