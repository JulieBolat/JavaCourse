package Day37_Inheritance_Jun9.Inheritance;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        System.out.println("ZzZz..");
    }

    public void eat(){
        System.out.println("Nom Nom Nom...");
    }
}
