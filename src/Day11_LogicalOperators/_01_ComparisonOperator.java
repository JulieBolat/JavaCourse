package Day11_LogicalOperators;

public class _01_ComparisonOperator {
    public static void main(String[] args) {

        int a= 1;
        int b= 1;
        int c= 2;

        System.out.println("Equal");
        System.out.println(a==b); //equality operator which will check the variables are equal or not
        System.out.println(a==c);

        System.out.println("Not Equal");
        System.out.println(a!=b);
        System.out.println(a!=c); //! used for "not" in Java

        System.out.println("Greater than");
        System.out.println(a>b);
        System.out.println(c>a);

        System.out.println("Less than");
        System.out.println(a<b);
        System.out.println(a<c);

        System.out.println("Greater than or equal");
        System.out.println(a>=b);
        System.out.println(a>=c);

        System.out.println("Less than or equal");
        System.out.println(a<=b);
        System.out.println(a<=c);

        //We can store this in boolean expression
        boolean aLessThanC= a<c;
        System.out.println(aLessThanC);





    }

}
