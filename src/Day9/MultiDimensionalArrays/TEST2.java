package Day9.MultiDimensionalArrays;

import java.util.Arrays;

public class TEST2 {
    public static void main(String[] args) {

        //crate a 2d array
        //store country-capital in array

        String [] firstArray= {" Turkey, Ankara"};
        String [] secondArray= {"Germany, Berlin"};
        String [] thirdArray= {"USA, DC"};

        String [][] countryCapital= {{"Turkey, Ankara"}, {"Germany, Berlin"}, {"USA, DC"}};
        System.out.println(Arrays.deepToString(countryCapital));

        System.out.println("");

        String [][] newString= new String[3][2];
        newString [0][0]= "USA";
        newString [0][1]= "DC";
        newString [1][0]="France";
        newString [1][1]= "Paris";
        newString [2][0]= "Germany";
        newString [2][1] ="Berlin";

        System.out.println(Arrays.deepToString(newString));





    }
}
