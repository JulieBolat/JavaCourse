package Day38_Inheritance_Task1.ShapeTask;

public class Square extends Rectangle{

    public Square(double side){
        super(side, side);
        super.name = "Square: special kind of Rectangle";
    }

}