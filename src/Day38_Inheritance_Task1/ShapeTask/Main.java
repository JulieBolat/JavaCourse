package Day38_Inheritance_Task1.ShapeTask;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Name of shape: " + circle.name);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Diameter: " + circle.diameter);
        System.out.println("Perimeter: " + circle.perimeter);
        System.out.println("Area: " + circle.area);



        Rectangle rectangle = new Rectangle(8,6);
        System.out.println("Name of shape: " + rectangle.name);
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Perimeter: " + rectangle.perimeter);
        System.out.println("Area: " + rectangle.area);




        Square square = new Square(7);
        System.out.println("Name of shape: " + square.name);
        System.out.println("Length: " + square.length);
        System.out.println("Width: " + square.width);
        System.out.println("Perimeter: " + square.perimeter);
        System.out.println("Area: " + square.area);


    }


}