package Day16_DoWhileLoops_Break_ForEachLoop;

public class _05_ForEachLoop { //Enhanced For Loop

    public static void main(String[] args) {

        //This is short cut for printing arrays
        //Disadvantages:
        //downside is you cannot print it in reverse order
        //we do not know the indexes

        String [] cars= {"BMW", "Toyota", "Ford" , "Mercedes"};

        //for (int i= 0; i<cars.length; i++) {
          //  System.out.println(cars[i]);}

        //Here is the short cut:
        //index and length are handled by Java. No need to provide cars.length

        for (String car: cars) {

            // 1-String car = BMW
            // 2-String car= "Toyota"

            System.out.println(car);
        }

    }
}
