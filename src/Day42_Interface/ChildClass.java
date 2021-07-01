package Day42_Interface;

/**
    If a class needs to inherit from an Interface it should use "implements" keyword
    If a class implements from an Interface, should override all methods

 */

public class ChildClass implements ParentInterface{

    @Override
    public void method() {
        System.out.println("Method");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }
}
