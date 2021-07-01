package Day33_AccessModifier_May31._02_InstanceModifiers.protectedModifier.Other;

import Day33_AccessModifier_May31._02_InstanceModifiers.protectedModifier.Same.Person;

public class PersonSubClass extends Person {

    public static void main(String[] args) {

        PersonSubClass person = new PersonSubClass();

        System.out.println(person.name);

        System.out.println(person.getName());

    }

}
