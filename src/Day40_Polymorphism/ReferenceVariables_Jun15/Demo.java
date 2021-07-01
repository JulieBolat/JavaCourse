package Day40_Polymorphism.ReferenceVariables_Jun15;

public class Demo {

    public static void main(String[] args) {

        Square square = new Square();
        Rectangle square2 = new Square(); // every square is rectangle
        Shape square3 = new Square(); // every square is shape
        Object square4 = new Square(); // every square is Object

//        Square shape = new Shape(); | every shape is not square!

        square.getName();
        square.getSide();
        square.getLength();

        square2.getName(); // able to access parent method
        square2.getLength(); // able to access own method
//        square2.getside(); - Cannot use child methods!

    }

}