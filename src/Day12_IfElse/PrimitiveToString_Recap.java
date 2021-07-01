package Day12_IfElse;

public class PrimitiveToString_Recap {

    public static void main(String[] args) {

        int x=1;
        int y=2;

        System.out.println(x+y);
        System.out.println("My numbers are:" + x+y);

        //So the whatever the first item is, it will convert to rest to that

        String xToString = Integer.toString(x); //This is another method to convert the String
        String yToString= Integer.toString(y);
        System.out.println(xToString+yToString);







    }
}
