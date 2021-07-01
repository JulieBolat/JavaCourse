package Day5;

import java.awt.*;

public class PrimitiveVsReference {

    public static void main(String[] args) {
        byte x = 1;
        byte y = x;

        System.out.println(x);
        System.out.println(y);

        x = 3;
        y=4;

        System.out.println("");

        System.out.println(x);
        System.out.println(y);

        System.out.println("");

        Point point1 = new Point(1,1);
        Point point2 = point1;

        System.out.println(point1);
        System.out.println(point2);

        point1.x = 2;

        System.out.println(point1);
        System.out.println(point2);

        //Reference types are copied by the references but primitive types are copied by their values!
    }
}
