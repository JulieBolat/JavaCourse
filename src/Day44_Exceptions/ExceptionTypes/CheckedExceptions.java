package Day44_Exceptions.ExceptionTypes;

import java.io.FileReader;

public class CheckedExceptions {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("ExampleFile.txt");
        } catch (Exception ex) {
            System.out.println("There is no such file!");
        }

    }

}
