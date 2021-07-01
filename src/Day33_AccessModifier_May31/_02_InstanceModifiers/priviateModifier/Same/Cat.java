package Day33_AccessModifier_May31._02_InstanceModifiers.priviateModifier.Same;

public class Cat {

    private String name;

    public Cat(){
        name = "Cat";
    }

    private Cat(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    private String getName(){
        return name;
    }

}
