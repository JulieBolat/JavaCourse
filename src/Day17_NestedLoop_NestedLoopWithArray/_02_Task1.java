package Day17_NestedLoop_NestedLoopWithArray;

public class _02_Task1 {

    public static void main(String[] args) {

        //print this array with "for loop"
        //i stands for each array, and j stands for any item inside of that array

        String[][] strArray = {{"abc", "def", "ghi"}, {"jkl", "mno", "prs"}};

        for (int i = 0; i < strArray.length; i++) {

            for (int j = 0; j < strArray[i].length; j++) {

                //System.out.println(strArray[i][j]);

                //this is how you can print each element inside of an array
                for (int k=0; k<strArray[i] [j].length(); k++) {
                    System.out.println(strArray[i][j].charAt(k));
                }

            }
        }
    }
}