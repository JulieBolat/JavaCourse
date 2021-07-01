package Day35_DateTimeFormatter_Jun2._04_FormattingAndParsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDate {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        // ofLocalizedDate
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(now.format(formatter));


        // ofPattern
        formatter = DateTimeFormatter.ofPattern("dd\\MMMM\\YYYY");
        System.out.println(now.format(formatter));


    }

}