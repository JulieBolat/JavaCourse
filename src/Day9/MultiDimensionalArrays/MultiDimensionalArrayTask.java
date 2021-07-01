package Day9.MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayTask {
    public static void main(String[] args) {

        //crate a 2d array
        //store country-capital in array

        String[] [] countries= {{"USA", "DC"},{"France", "Paris"}, {"Germany", "Berlin"}};
        System.out.println(countries);
        System.out.println(Arrays.deepToString(countries));

        String [][]b = new String[3][2];
        b[0][0]= "USA";
        b[0][1]="DC";
        b[1][0]="France";
        b[1][1]="Paris";
        b[2][0]="Germany";
        b[2][1]="Berlin";
        System.out.println(Arrays.deepToString(b));








    }
}
