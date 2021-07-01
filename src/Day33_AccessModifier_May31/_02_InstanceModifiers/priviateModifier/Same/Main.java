package Day33_AccessModifier_May31._02_InstanceModifiers.priviateModifier.Same;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.printName();


//         !!!below this is not available because they are private!!!
//        Cat cat2 = new Cat("Kitty");
//
//        String name = cat2.name;
//        cat2.getName();

    }

}
