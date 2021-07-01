package Day29_May24.Task1;

public class MainRectangle {

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        rectangle.length= 12;
        rectangle.width= 10;

        int perimeterOfRectangle= rectangle.perimeter();
        int areaOfRectangle = rectangle.area();

        System.out.println("Perimeter: +" + perimeterOfRectangle);
        System.out.println("Area");
    }
}
