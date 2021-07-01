package Day11_LogicalOperators;

public class _02_LogicalOperator {

    public static void main(String[] args) {

        //and (&&), or(||) operators

        int temp=22;
        //boolean isHot= temp > 30;
        //System.out.println(isHot);

        boolean isGood= temp > 23 && temp <30; //&& (and) operator
        System.out.println(isGood);


        boolean hasHighIncome= true;
        boolean hasGoodCredit= false;

        boolean isEligible= hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);





    }
}
