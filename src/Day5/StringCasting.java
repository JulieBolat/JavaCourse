package Day5;

public class StringCasting {

    public static void main(String[] args) {

      String number = "3";
      int myInteger = Integer.parseInt(number) +3;
      System.out.println(myInteger);

      //parseLong

        String number2 = "6";
        int sum = Integer.parseInt(number2) + 1;
        System.out.println(sum);


        String num= "8";
        short sum1 = (short) (Integer.parseInt(num)+4);
        System.out.println(num);

        short x= 3;
        short y= 2;
        //short sum1= (short) (x+y);




    }
}
