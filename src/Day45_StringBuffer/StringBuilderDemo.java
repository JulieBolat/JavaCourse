package Day45_StringBuffer;

public class StringBuilderDemo {

    public static void main(String[] args) {

        // Not Thread-safe
        // They are mutable means changeable
        StringBuilder str = new StringBuilder("TechnoStudy");

        str.append(" - Java");

        System.out.println(str);

        String converted = str.toString();

    }

}
