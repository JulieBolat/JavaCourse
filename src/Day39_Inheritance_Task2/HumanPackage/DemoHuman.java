package Day39_Inheritance_Task2.HumanPackage;

public class DemoHuman {

    public static void main(String[] args) {

        Grown grownMan = new Grown("John", 28);
        grownMan.eat();
        grownMan.transport();


        Baby babyGirl = new Baby("Emily", 0.5);
        babyGirl.eat();
        babyGirl.transport();


    }

}