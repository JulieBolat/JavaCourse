package Day39_Inheritance_Task2;

public class Main {

    public static void main(String[] args) {

        /**

         We don't have any methods in TEST class and it does not extends from anywhere
         but still we have some methods which are coming from OBJECT class

         ***Every class inherits from Object class

         */

        Test test = new Test();

        test.equals(test);
        test.hashCode();
        test.toString();

    }


}

