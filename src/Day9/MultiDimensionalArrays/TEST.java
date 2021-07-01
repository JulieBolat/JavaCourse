package Day9.MultiDimensionalArrays;

import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {

        String [] listOne= {"I", "love", "Java"};
        String [] listTwo= {"My", "name", "is", "Julie"};

        String [] [] listOfOneAndTwo= {{"I", "love", "Java"}, {"My", "name", "is", "Julie"}};
        System.out.println(listOfOneAndTwo);
        System.out.println(Arrays.deepToString(listOfOneAndTwo));

    }


}
