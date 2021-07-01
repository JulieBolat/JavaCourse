package Day4.TypeCasting;

public class CalculatingAverage {

    public static void main(String[] args) {

        int student1= 80;
        int student2= 95;
        int student3= 33;
        int student4= 71;

        //int average = (student1+ student2+ student3+ student4)/4;

        double average= (double) (student1+ student2+ student3+ student4)/4.0;

        //Java will convert (s1+s2+s3+s4) to double first and divide by 4.0)

        System.out.println(average);
        System.out.println();
    }



}
