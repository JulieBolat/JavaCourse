package Day32_ConstructorTask_May28.ConstructorTask1;

public class MainCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        System.out.println(circle1.radius);


        Circle circle2 = new Circle(9);

        System.out.println(circle2.radius);

    }

}
