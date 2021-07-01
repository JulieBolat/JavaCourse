package Day35_DateTimeFormatter_Jun2._04_FormattingAndParsing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDate {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.uuuu");
        String date = "11.03.2020";

        LocalDate convertedFromString = LocalDate.parse(date, formatter);
        System.out.println(convertedFromString.format(formatter));

        String convertedFromDate = convertedFromString.toString();
        System.out.println(convertedFromDate);

    }

}