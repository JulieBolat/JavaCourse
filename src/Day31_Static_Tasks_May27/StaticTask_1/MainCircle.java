package Day31_Static_Tasks_May27.StaticTask_1;

public class MainCircle {


    public static void main(String[] args) {

        System.out.println("Count of Area before: " + Circle.countOfArea);
        System.out.println("Count of Circumference before: " + Circle.countOfCirc);

        Circle circle1 = new Circle();
        double areaOfCircle1 = circle1.area();
        System.out.println("Area of Circle1: " + areaOfCircle1); // 0.0 because radius is not initialized
        double circOfCircle1 = circle1.circumstance();
        System.out.println("Circumstance of Circle1: " + circOfCircle1);

        Circle circle2 = new Circle();
        circle2.radius = 10; // initializing radius for the circle
        double areaOfCircle2 = circle2.area();
        System.out.println("Area of Circle2: " + areaOfCircle2); // 314.0 will be the result
        double circOfCircle2 = circle2.circumstance();
        System.out.println("Circumstance of Circle2: " + circOfCircle2);

        System.out.println("Count of Area after: " + Circle.countOfArea);
        System.out.println("Count of Circumference after: " + Circle.countOfCirc);

        System.out.println("All Count: " + Circle.allCount());

    }

}

