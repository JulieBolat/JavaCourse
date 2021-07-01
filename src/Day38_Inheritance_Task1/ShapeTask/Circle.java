package Day38_Inheritance_Task1.ShapeTask;

public class Circle extends Shape {

    double radius;
    double diameter;

    public Circle (double radius){
        super("Circle");
        this.radius = radius;
        super.area= 3.14 * radius * radius;
        super.perimeter = 2* 3.14 * radius;
        this.diameter= 2*radius;

    }
}
