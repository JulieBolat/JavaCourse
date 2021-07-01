package Day35_DateTimeFormatter_Jun2._02_ManipulatingDateAndTime;

import java.time.LocalDate;

public class ManipulatingDate {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        currentDate.plusDays(7); // date is immutable
        System.out.println("Current Date after 7 plusDays: " + currentDate);


        LocalDate plus7Days = currentDate.plusDays(7);
        System.out.println("Updated date with plus 7 days: " + plus7Days);


        LocalDate plus4Years = currentDate.plusYears(4);
        System.out.println("Updated date with plus 4 years: " + plus4Years);


        LocalDate minus5Days = currentDate.minusDays(5);
        System.out.println("Updated date with minus 5 days: " + minus5Days);


        LocalDate futureDateCombined = currentDate.plusDays(3).plusYears(1);
        System.out.println("Updated date with plus 3 days and 1 years" + futureDateCombined);

    }

}