package Day35_DateTimeFormatter_Jun2._03_ComparingDateAndTime;

import java.time.LocalDate;

public class CompareDate {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate yesterday = now.minusDays(1);

        boolean isEqual = now.isEqual(yesterday); // false
        boolean isAfter = now.isAfter(yesterday); // true
        boolean isBefore = now.isBefore(yesterday); // false

        System.out.println(isEqual + " " + isAfter + " " + isBefore);

        boolean isLeapYear = now.isLeapYear();

        System.out.println(isLeapYear);

        LocalDate LeapYear = now.plusYears(3); // 2024 is Leap Year
        System.out.println(LeapYear.isLeapYear());

    }

}