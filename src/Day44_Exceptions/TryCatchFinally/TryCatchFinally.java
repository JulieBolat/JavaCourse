package Day44_Exceptions.TryCatchFinally;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {

    public static void main(String[] args) {

        FileReader reader = null;

        try {
            reader = new FileReader("Example.txt");
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exists");
        } catch (IOException e) {
            System.out.println("Not able to read");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("IOException");
            } catch (NullPointerException e){
                System.out.println("There is no reader!");
            }
        }
    }

}
