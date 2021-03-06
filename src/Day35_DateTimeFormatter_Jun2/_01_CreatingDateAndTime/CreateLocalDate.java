package Day35_DateTimeFormatter_Jun2._01_CreatingDateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class CreateLocalDate {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate electionDay = LocalDate.of(2022,10,1);
        System.out.println(electionDay);

        LocalDate foolsDay = LocalDate.of(2023, Month.APRIL, 1);
        System.out.println(foolsDay);

        LocalDate programmersDay = LocalDate.ofYearDay(2025, 256);
        System.out.println(programmersDay);

    }

}
