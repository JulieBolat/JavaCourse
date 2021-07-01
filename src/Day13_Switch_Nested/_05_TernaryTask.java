package Day13_Switch_Nested;

public class _05_TernaryTask {
    public static void main(String[] args) {

        //If income is more than 100k than set className to a "First" else "Economy"

        int income= 100_00;
        String className= income>100 ? "First" : "Economy";
        System.out.println(className);

        //or this way
        System.out.println("");

        if (income>100) {
            className= "First";
        } else {
            className = "Economy";
        }
        System.out.println(className);
    }

}
