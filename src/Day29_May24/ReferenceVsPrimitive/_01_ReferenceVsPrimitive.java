package Day29_May24.ReferenceVsPrimitive;

public class _01_ReferenceVsPrimitive {

    public static void main(String[] args) {

        //May 24 Lesson 2
        //Primitive
        int a= 77;
        int b= a;

        System.out.println("b before:" + b);
        a=75;
        System.out.println("b after:" + b);

        //Reference: holding reference to their memory locations
        Person person1= new Person();
        person1.firstName= "Techno";
        person1.lastName= "Study";
        person1.age=2;

        Person person2= person1;
        System.out.println("person2.age BEFORE:" + person2.age);
        person1.age= 5;
        System.out.println("person2.age AFTER:" + person2.age);


    }
}
