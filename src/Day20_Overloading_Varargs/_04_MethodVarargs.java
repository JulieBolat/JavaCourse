package Day20_Overloading_Varargs;

public class _04_MethodVarargs {

    public static void main(String[] args) {

        calculateStock("Pen", 300,555,100);

    }
    public static void calculateStock(String productName, int... numberOfStock){
        int stockOfProducts = 0;
        for (int i = 0; i < numberOfStock.length; i++){

            stockOfProducts += numberOfStock[i];
        }
        System.out.println("We have " + stockOfProducts + " " + productName + " in stock!" );

    }
}
