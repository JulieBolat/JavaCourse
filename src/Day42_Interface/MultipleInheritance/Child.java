package Day42_Interface.MultipleInheritance;

public class Child implements Parent1, Parent2{

    @Override
    public void method1() {
        System.out.println("This method is from Parent1-Method1");
        System.out.println(variable1); // from Parent1
        System.out.println(variable3); // from Parent2
        System.out.println(Parent1.variable2); // same named variable from Parent1
        System.out.println(Parent2.variable2); // same named variable from Parent2
    }

    // We have this method in both Parent Interfaces but
    // Overriding once is enough
    @Override
    public void method2() {
        System.out.println("This method is from both Paren1 and Parent2");
    }

    @Override
    public void method3() {
        System.out.println("This method is from Parent2-Method3");
    }
}
