package Day40_Polymorphism.Polymorphism.RunTime;

public class DemoShape {

    public static void main(String[] args) {

        Shape[] shapes = {new Shape(), new Circle(), new Rectangle()};

        for (Shape shape: shapes) {
            System.out.println(shape.display());
        }

    }

}