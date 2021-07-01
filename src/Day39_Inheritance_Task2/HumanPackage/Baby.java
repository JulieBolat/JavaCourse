package Day39_Inheritance_Task2.HumanPackage;

public class Baby extends Human{

    public Baby(String name, double age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Babies can only drink milk");
    }

    @Override
    public void transport() {
        System.out.println("Babies are like plants they cannot move");
    }
}