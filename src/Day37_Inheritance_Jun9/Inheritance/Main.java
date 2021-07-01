package Day37_Inheritance_Jun9.Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Dog", 5);

        System.out.println(animal.age);
        System.out.println(animal.name);

        animal.eat();
        animal.sleep();



        Animal animal1 = new Cat("Cotton", 3);

        System.out.println(animal1.name);
        System.out.println(animal1.age);

        animal1.eat();
        animal1.sleep();


        Animal animal2 = new Bird("Eagle",15);

        System.out.println(animal2.name);
        System.out.println(animal2.age);

        animal2.eat();
        animal2.sleep();

        Animal animal3= new LadyBug("Gaston", 7);
        System.out.println(animal3.name);
        System.out.println(animal3.age);

        animal3.eat();
        animal3.sleep();
    }

}

