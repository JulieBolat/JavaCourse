package Day44_Exceptions.MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleException {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("Example.txt");
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exists");
        } catch (IOException e) {
            System.out.println("Not able to read");
        }

    }

}
