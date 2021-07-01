package Day13_Switch_Nested;

public class _04_TernaryOperator {

    public static void main(String[] args) {

        boolean condition= true;
        String result;

        if (condition) {
            result= "result1";
        }
        else {
            result="result2";
        }

        String result3= condition? "result1" : "result2";
        System.out.println(result3);

        int year=2021;
        int age;

        if (year==2021) {
            age=30;
        } else {
            age=29;
        }

        int age1= year==2021? 30:29;











    }
}
