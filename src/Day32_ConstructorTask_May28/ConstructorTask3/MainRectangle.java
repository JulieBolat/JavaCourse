package Day32_ConstructorTask_May28.ConstructorTask3;

public class MainRectangle {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7,3);

        System.out.println("width: " + rectangle.width + "\n" + "length: " + rectangle.length);

        int area = rectangle.area();

        System.out.println("area: " + area);

    }
}
