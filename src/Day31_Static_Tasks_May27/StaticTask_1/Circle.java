package Day31_Static_Tasks_May27.StaticTask_1;

public class Circle {

    int radius;
    final double PI = 3.14;
    static int countOfArea;
    static int countOfCirc;

    public double area(){
        countOfArea++;
        return radius * radius * PI; // area = radius square times PI
    }

    public double circumstance() {
        countOfCirc++;
        return 2 * radius * PI; // circumstance = 2 times radius times PI
    }

    public static int allCount(){
        return countOfArea + countOfCirc;
    }

}