package Day29_May24.ReferenceVsPrimitive;

public class _02_ReferenceVsPrimitiveInMethods {

    public static void main(String[] args) {
        //May 24, Lesson 3

        int number= 5;
        System.out.println("BEFORE NUMBER" + number);
        change(number);
        System.out.println("AFTER NUMBER:"+ number);

        Person person= new Person();
        person.age= 25;
        System.out.println("BEFORE AGE:" + person.age);
        change(person);
        System.out.println("AFTER AGE:"+ person.age);
    }

    public static void change (int parameter) {
        parameter= parameter +1;

    }

    public static void change (Person parameter) {
        parameter.age= parameter.age +1;
        //also increment person's age
    }

}
