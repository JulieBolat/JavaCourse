package Day32_ConstructorTask_May28.ConstructorTask2;

public class MainSquare {

    public static void main(String[] args) {

        Square square1 = new Square();

        System.out.println(square1.side);

        Square square2 = new Square(10);

        System.out.println(square2.side);
    }
}
