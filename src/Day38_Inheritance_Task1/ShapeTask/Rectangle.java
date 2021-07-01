package Day38_Inheritance_Task1.ShapeTask;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
        super.area = this.length * this.width;
        super.perimeter = 2 * (length + width);
    }

}