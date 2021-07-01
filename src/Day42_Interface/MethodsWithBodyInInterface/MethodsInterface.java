package Day42_Interface.MethodsWithBodyInInterface;

public interface MethodsInterface {

    default void methodWithBody(){
        System.out.println("Default Method!");
    }

    static void staticMethod(){
        System.out.println("Static Method!");
    }

}
