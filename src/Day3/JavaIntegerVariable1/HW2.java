package Day3.JavaIntegerVariable1;

public class HW2 {
    public static void main(String[] args) {

        boolean isTodayMonday = true;
        System.out.println(isTodayMonday);
        boolean isMonthMay= false;
        System.out.println(isMonthMay);

        char letter= 'a';
        char number='9';
        char symbol= '&';
        System.out.println('a');
        System.out.println(number);
        System.out.println(symbol);

        //single quote(' ').


        byte b= 5;
        byte c= -4;
        System.out.println(b);
        System.out.println(c);
        System.out.println("Max Value for a byte="+ Byte.MAX_VALUE);
        System.out.println("Min Value for a byte="+Byte.MIN_VALUE);


        short d= 750;
        short e= -100;
        System.out.println(d);
        System.out.println(e);
        System.out.println("Max Value for a short="+ Short.MAX_VALUE);
        System.out.println("Min Value for a short="+Short.MIN_VALUE);



        long f= 987654321L;
        long g= -123456789L;
        System.out.println(f);
        System.out.println(g);

        float h= 121.005F;
        float l= -3.3365F;
        float k= 7.3365765F;
        System.out.println(h);
        System.out.println(l);
        System.out.println(k);

        double m= 120.005998654;
        double n= 174;
        double j= 4.00555999;
        System.out.println(m);
        System.out.println(n);
        System.out.println(j);

        byte p= -10;
        long r= p;
        System.out.println(r);

        float s= 10054.10F;
        double t= s;
        System.out.println(t);


        int x= 5;
        double y= x;
        System.out.println(y);

        short ab= -45;
        int cd= ab;
        System.out.println(cd);

        float de= 3500000000.5F;
        double ef= de;
        System.out.println(ef);

        byte abc= -128;
        float cba= abc;
        System.out.println(cba);

        int phonePrice = 399;
        double headphonePrice = 90.99;
        double laptopPrice = 999.89;
        System.out.println( (phonePrice+headphonePrice+laptopPrice)/3);


    }
}
